import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { BehaviorSubject, Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AuthService {
  private apiUrl = 'http://localhost:8080/api/auth/login';

  private isLoggedInSubject = new BehaviorSubject<boolean>(this.hasToken());
  isLoggedIn$ = this.isLoggedInSubject.asObservable();

  constructor(private http: HttpClient) {}

  login(email: string, password: string): Observable<any> {
    const headers = new HttpHeaders({ 'Content-Type': 'application/json' });
    return this.http.post<any>(this.apiUrl, { email, password }, { headers });
  }

  setLoginStatus(user: any, token?: string): void {
    if (!user || !user.role) {
      console.error("Invalid user object:", user);
      return;
    }

    const fakeJWT = token || `mock-jwt-token-${Math.random().toString(36).substr(2, 10)}`;

    // Store the token, user details, role, and login status in sessionStorage
    sessionStorage.setItem('authToken', fakeJWT);
    sessionStorage.setItem('user', JSON.stringify(user));
    sessionStorage.setItem('isLoggedIn', 'true');
    sessionStorage.setItem('role', user.role);

    // Store the customerId only if the role is 'customer'
    if (user.role === 'customer' && user.customerId) {
      sessionStorage.setItem('customerId', user.customerId);
    } else {
      // Clear the customerId if not a customer
      sessionStorage.removeItem('customerId');
    }

    this.isLoggedInSubject.next(true);
  }

  logout(): void {
    sessionStorage.clear();
    this.isLoggedInSubject.next(false);
  }

  getUser(): any {
    const user = sessionStorage.getItem('user');
    return user ? JSON.parse(user) : null;
  }

  getToken(): string | null {
    return sessionStorage.getItem('authToken');
  }

  private hasToken(): boolean {
    return !!sessionStorage.getItem('authToken');
  }
}

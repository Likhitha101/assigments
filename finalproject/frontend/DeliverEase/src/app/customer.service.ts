import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CustomerService {
  private apiUrl = 'http://localhost:8080/api/customers'; // Adjust according to your backend API

  constructor(private http: HttpClient) {}

  registerCustomer(customerData: any): Observable<any> {
    console.log('Sending request to backend:', customerData); // Debugging log
    return this.http.post<any>(`${this.apiUrl}/register`, customerData, {  // No need to stringify
      headers: { 'Content-Type': 'application/json' }
    });
  }
}

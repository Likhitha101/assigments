import { Injectable } from '@angular/core';
import { CanActivate, Router } from '@angular/router';

@Injectable({
  providedIn: 'root'
})
export class AuthGuard implements CanActivate {
  constructor(private router: Router) {}

  canActivate(): boolean {
    const loggedIn = sessionStorage.getItem('isLoggedIn') === 'true';
    const token = sessionStorage.getItem('authToken'); // Check for JWT

    if (loggedIn && token) {
      return true; // Allow access
    } else {
      this.router.navigate(['/login']); // Redirect if not logged in
      return false;
    }
  }
}

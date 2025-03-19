import { Injectable } from '@angular/core';
import { CanActivate, Router, UrlTree } from '@angular/router';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AlreadyLoggedInGuard implements CanActivate {
  constructor(private router: Router) {}

  canActivate(): boolean | UrlTree | Observable<boolean | UrlTree> | Promise<boolean | UrlTree> {
    const isLoggedIn = sessionStorage.getItem('isLoggedIn') === 'true';
    const role = sessionStorage.getItem('role');
    const token = sessionStorage.getItem('authToken'); // Check for JWT existence

    if (isLoggedIn && token) {
      switch (role) {
        case 'CUSTOMER':
          return this.router.createUrlTree(['/app/customer-navbar']);
        case 'DRIVER':
          return this.router.createUrlTree(['/app/driver-navbar']);
        case 'ADMIN':
          return this.router.createUrlTree(['/app/admin-navbar']);
        default:
          return this.router.createUrlTree(['/']); // Redirect to home if role is invalid
      }
    }

    return true; // Allow access to public routes if not logged in
  }
}

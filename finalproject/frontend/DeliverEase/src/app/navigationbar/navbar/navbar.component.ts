import { Component, OnInit, OnDestroy, ElementRef, Renderer2 } from '@angular/core';
import { Router } from '@angular/router';
import { AuthService } from '../../auth.service';
import { Subscription } from 'rxjs';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent implements OnInit, OnDestroy {
  isLoggedIn = false;
  user: any = null;
  isCustomer = false;
  isDriver = false;
  isAdmin = false;
  private authSubscription!: Subscription;

  constructor(
    private authService: AuthService,
    private router: Router,
    private el: ElementRef,
    private renderer: Renderer2
  ) {}

  ngOnInit(): void {
    // Subscribe to the login status updates from the AuthService.
    this.authSubscription = this.authService.isLoggedIn$.subscribe(status => {
      this.isLoggedIn = status;
      if (status) {
        // If logged in, set user details
        this.user = this.authService.getUser();
        if (this.user && this.user.role) {
          const role = this.user.role.toUpperCase();
          this.isCustomer = role === 'CUSTOMER';
          this.isDriver = role === 'DRIVER';
          this.isAdmin = role === 'ADMIN';
        }
      } else {
        // Clear user details if logged out
        this.user = null;
        this.isCustomer = false;
        this.isDriver = false;
        this.isAdmin = false;
      }

      this.updateNavBar();
    });
  }

  updateNavBar(): void {
    // Get the elements to manipulate
    const loginLink = this.el.nativeElement.querySelector('#login-link');
    const registerLink = this.el.nativeElement.querySelector('#register-link');
    const logoutButton = this.el.nativeElement.querySelector('#logout-btn');
    const customerLink = this.el.nativeElement.querySelector('#customer-dashboard-link');
    const driverLink = this.el.nativeElement.querySelector('#driver-dashboard-link');
    const adminLink = this.el.nativeElement.querySelector('#admin-dashboard-link');

    if (this.isLoggedIn) {
      // Hide login and register links
      this.renderer.setStyle(loginLink, 'display', 'none');
      this.renderer.setStyle(registerLink, 'display', 'none');
      this.renderer.setStyle(logoutButton, 'display', 'block');

      // Show appropriate dashboard links
      if (this.isCustomer) {
        this.renderer.setStyle(customerLink, 'display', 'block');
        this.renderer.setStyle(driverLink, 'display', 'none');
        this.renderer.setStyle(adminLink, 'display', 'none');
      } else if (this.isDriver) {
        this.renderer.setStyle(driverLink, 'display', 'block');
        this.renderer.setStyle(customerLink, 'display', 'none');
        this.renderer.setStyle(adminLink, 'display', 'none');
      } else if (this.isAdmin) {
        this.renderer.setStyle(adminLink, 'display', 'block');
        this.renderer.setStyle(customerLink, 'display', 'none');
        this.renderer.setStyle(driverLink, 'display', 'none');
      }
    } else {
      // Show login and register links
      this.renderer.setStyle(loginLink, 'display', 'block');
      this.renderer.setStyle(registerLink, 'display', 'block');
      this.renderer.setStyle(logoutButton, 'display', 'none');

      // Hide all dashboard links
      this.renderer.setStyle(customerLink, 'display', 'none');
      this.renderer.setStyle(driverLink, 'display', 'none');
      this.renderer.setStyle(adminLink, 'display', 'none');
    }
  }

  logout(): void {
    this.authService.logout();
    this.router.navigate(['/login']);
  }

  ngOnDestroy(): void {
    // Clean up subscription
    this.authSubscription.unsubscribe();
  }
}

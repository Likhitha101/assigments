import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-auth-layout',
  templateUrl: './auth-layout.component.html',
  styleUrls: ['./auth-layout.component.css']
})
export class AuthLayoutComponent implements OnInit {
  userRole: string | null = null;

  constructor(private router: Router) {}

  ngOnInit() {
    // Delay to ensure Angular change detection picks up the correct value.
    setTimeout(() => {
      // Use sessionStorage so that the role doesn't persist across sessions.
      this.userRole = sessionStorage.getItem('role'); 
      console.log('User Role on Load:', this.userRole);

      if (!this.userRole) {
        console.warn('No role found, redirecting to login');
        this.router.navigate(['/login']); // Redirect if role is missing
      }
    }, 100);
  }
}

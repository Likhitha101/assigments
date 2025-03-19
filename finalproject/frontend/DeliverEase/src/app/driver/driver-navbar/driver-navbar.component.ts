import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AuthService } from '../../auth.service';

@Component({
  selector: 'app-driver-navbar',
  templateUrl: './driver-navbar.component.html',
  styleUrls: ['./driver-navbar.component.css']
})
export class DriverNavbarComponent implements OnInit {
  isLoggedIn = false;
  availabilityStatus = false; 

  constructor(private authService: AuthService, private router: Router) {}

  toggleAvailability() {
    this.availabilityStatus = !this.availabilityStatus; // Toggle availability status
    console.log(this.availabilityStatus ? 'Driver is Available' : 'Driver is Unavailable');
    // You can call a service here to save/update availability status on the backend
  }

  goToProfile() {
    console.log("Navigating to profile");
    // Navigate to the profile page
    this.router.navigate(['/driver/profile']);
  }

  openNotifications() {
    console.log("Opening notifications");
    // Implement notification logic here
  }

  ngOnInit(): void {
    this.authService.isLoggedIn$.subscribe(status => {
      this.isLoggedIn = status;
    });
  }

  logout() {
    console.log("Logging out...");
    this.authService.logout(); // Make sure to implement logout functionality
    this.router.navigate(['/login']); // Redirect to login page after logging out
  }
}
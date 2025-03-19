import { Component } from '@angular/core';
import { DriverService } from '../../../driver.service';

@Component({
  selector: 'app-driver-register',
  templateUrl: './driver-register.component.html',
  styleUrls: ['./driver-register.component.css']
})
export class DriverRegisterComponent {
  driverData = {
    firstName: '',
    lastName: '',
    email: '',
    password: '',
    phone: '',
    vehicleNumber: '',
    vehicleType: '',
    licenseNumber: '',
    street: '',
    city: '',
    state: '',
    country: '',
    pincode: '',
    licensePhotoPath: '',
  };

  isSubmitting = false; // To prevent multiple submissions

  constructor(private driverService: DriverService) {}

  register() {
    if (!this.validateForm()) {
      return;
    }

    console.log('Submitting driver data:', this.driverData);
    this.isSubmitting = true;

    this.driverService.registerDriver(this.driverData).subscribe({
      next: (response) => {
        console.log('Driver registration successful', response);
        alert('Driver registered successfully!');
        this.resetForm();
      },
      error: (error) => {
        console.error('Error registering driver', error);
        alert('Error: ' + (error.error?.message || error.message));
      },
      complete: () => {
        this.isSubmitting = false;
      }
    });
  }

  validateForm(): boolean {
    if (this.driverData.password.length < 8) {
      alert('Password must be at least 8 characters long');
      return false;
    }
    if (!/^[0-9]{10}$/.test(this.driverData.phone)) {
      alert('Phone number must be exactly 10 digits');
      return false;
    }
    if (!/^[0-9]{6}$/.test(this.driverData.pincode)) {
      alert('Pincode must be exactly 6 digits');
      return false;
    }
    return true;
  }

  resetForm() {
    this.driverData = {
      firstName: '',
      lastName: '',
      email: '',
      password: '',
      phone: '',
      vehicleNumber: '',
      vehicleType: '',
      licenseNumber: '',
      street: '',
      city: '',
      state: '',
      country: '',
      pincode: '',
      licensePhotoPath: '',
    };
  }
}
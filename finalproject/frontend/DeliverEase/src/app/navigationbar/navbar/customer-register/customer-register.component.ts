import { Component } from '@angular/core';
import { CustomerService } from '../../../customer.service';

@Component({
  selector: 'app-customer-register',
  templateUrl: './customer-register.component.html',
  styleUrls: ['./customer-register.component.css']
})
export class CustomerRegisterComponent {
  customerData = {
    firstName: '',
    lastName: '',
    email: '',
    username: '',
    password: '',
    phone: ''
  };

  passwordVisible: boolean = false;

  constructor(private customerService: CustomerService) {}

  togglePasswordVisibility(): void {
    this.passwordVisible = !this.passwordVisible;
  }

  register() {
    // Send registration data to the backend
    console.log('Sending registration data:', this.customerData);
    
    this.customerService.registerCustomer(this.customerData).subscribe(
      (response) => {
        console.log('Registration successful:', response);
        // Handle successful registration, maybe navigate to a different page or show a success message
      },
      (error) => {
        console.error('Registration failed:', error);
        // Handle error (display a message to the user)
      }
    );
  }
}

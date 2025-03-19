import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { AuthService } from '../../auth.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {
  email: string = '';
  password: string = '';
  errorMessage: string = '';

  constructor(private authService: AuthService, private router: Router) {}

  login() {
    this.authService.login(this.email, this.password).subscribe(
      (res) => {
        this.authService.setLoginStatus(res); // Store user data & fake JWT

        // 🔥 Redirect user based on role
        if (res.role === 'CUSTOMER') {
          this.router.navigate(['/app/customer-navbar'], { replaceUrl: true });
        } else if (res.role === 'DRIVER') {
          this.router.navigate(['/app/driver-navbar']);
        } else if (res.role === 'ADMIN') {
          this.router.navigate(['/app/admin-navbar']);
        } else {
          this.errorMessage = "Invalid role";
        }
      },
      (err) => {
        this.errorMessage = "Invalid email or password";
      }
    );
  }
}


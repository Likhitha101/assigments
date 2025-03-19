import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavbarComponent } from './navigationbar/navbar/navbar.component';
import { HomeComponent } from './navigationbar/home/home.component';
import { ContactComponent } from './navigationbar/contact/contact.component';
import { AboutComponent } from './navigationbar/about/about.component';
import { CustomerRegisterComponent } from './navigationbar/navbar/customer-register/customer-register.component';
import { DriverRegisterComponent } from './navigationbar/navbar/driver-register/driver-register.component';
import { RouterModule } from '@angular/router';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { CustomerService } from './customer.service';
import { DriverService } from './driver.service';
import { LoginComponent } from './navigationbar/login/login.component';
import { AuthService } from './auth.service';
import { CustomerNavbarComponent } from './customer/customer-navbar/customer-navbar.component';
import { PublicLayoutComponent } from './public-layout/public-layout.component';
import { AuthLayoutComponent } from './auth-layout/auth-layout.component';
import { ReactiveFormsModule } from '@angular/forms';
import { PlaceOrderComponent } from './customer/place-order/place-order.component';
import { DriverNavbarComponent } from './driver/driver-navbar/driver-navbar.component';
import { AdminNavbarComponent } from './admin/admin-navbar/admin-navbar.component';
import { CustomerHomeComponent } from './customer/customer-home/customer-home.component';
import { CustomerTrackorderComponent } from './customer/customer-trackorder/customer-trackorder.component';
import { ApproveDriversComponent } from './admin/approve-drivers/approve-drivers.component';
import { OrderComponent } from './admin/order/order.component';
import { OrderService } from './order.service';
import { DriverOrderComponent } from './driver/driver-order/driver-order.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    NavbarComponent,
    ContactComponent,
    AboutComponent,
    CustomerRegisterComponent,
    DriverRegisterComponent,
    LoginComponent,
   DriverNavbarComponent,
    CustomerNavbarComponent,
    AuthLayoutComponent,
    PlaceOrderComponent,
    PublicLayoutComponent,
    DriverNavbarComponent,
    AdminNavbarComponent,
    CustomerHomeComponent,
    CustomerTrackorderComponent,
    ApproveDriversComponent,
    OrderComponent,
    DriverOrderComponent,
  ],
  imports: [
    FormsModule, 
    HttpClientModule,
    RouterModule,
    ReactiveFormsModule,
    BrowserModule,
    AppRoutingModule
  ],
  providers: [CustomerService, AuthService,DriverService,OrderService],
  bootstrap: [AppComponent]
})
export class AppModule { }

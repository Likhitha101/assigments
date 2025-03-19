import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { HomeComponent } from './navigationbar/home/home.component';
import { ContactComponent } from './navigationbar/contact/contact.component';
import { AboutComponent } from './navigationbar/about/about.component';
import { CustomerRegisterComponent } from './navigationbar/navbar/customer-register/customer-register.component';
import { DriverRegisterComponent } from './navigationbar/navbar/driver-register/driver-register.component';
import { LoginComponent } from './navigationbar/login/login.component';
import { CustomerNavbarComponent } from './customer/customer-navbar/customer-navbar.component';
import { AuthGuard } from './auth.guard';
import { DriverNavbarComponent } from './driver/driver-navbar/driver-navbar.component';
import { PublicLayoutComponent } from './public-layout/public-layout.component';
import { AuthLayoutComponent } from './auth-layout/auth-layout.component';
import { PlaceOrderComponent } from './customer/place-order/place-order.component';
import { AdminNavbarComponent } from './admin/admin-navbar/admin-navbar.component';
import { AlreadyLoggedInGuard } from './already-logged-in.guard';
import { CustomerHomeComponent } from './customer/customer-home/customer-home.component';
import { CustomerTrackorderComponent } from './customer/customer-trackorder/customer-trackorder.component';
import { PreviousordersComponent } from './customer/previousorders/previousorders.component';
import { FeedbackComponent } from './customer/feedback/feedback.component';
import { HelpComponent } from './customer/help/help.component';
import { ApproveDriversComponent } from './admin/approve-drivers/approve-drivers.component';
import {OrderComponent} from './admin/order/order.component';
import {DriverOrderComponent} from './driver/driver-order/driver-order.component';
const routes: Routes = [
  {
    path: '',
    component: PublicLayoutComponent,
    canActivate: [AlreadyLoggedInGuard], 
    children: [
      { path: '', component: HomeComponent },
      { path: 'contact', component: ContactComponent },
      { path: 'about', component: AboutComponent },
      { path: 'customer-register', component: CustomerRegisterComponent },
      { path: 'driver-register', component: DriverRegisterComponent },
      { path: 'login', component: LoginComponent }
    ]
  },
  {
    path: 'app',
    component: AuthLayoutComponent,
    canActivate: [AuthGuard],
    children: [
      { path: 'customer/place-order', component: PlaceOrderComponent },
      { path: 'driver-navbar', component: DriverNavbarComponent },
      { path: 'admin-navbar', component: AdminNavbarComponent },
      { path: 'customer-navbar', component: CustomerNavbarComponent },
      { path: 'customer-home', component: CustomerHomeComponent },
      {path: 'customer-trackorder', component: CustomerTrackorderComponent},
      {path: 'previousorders', component: PreviousordersComponent},
      {path: 'feedback', component: FeedbackComponent},
      {path:'help',component:HelpComponent},
      {path:'approve-drivers',component:ApproveDriversComponent},
      {path:'order',component:OrderComponent},
      {path:'driver-order',component:DriverOrderComponent}
    ]
  },
  { path: '**', redirectTo: '' }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {}

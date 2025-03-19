import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-customer-trackorder',
  templateUrl: './customer-trackorder.component.html',
  styleUrls: ['./customer-trackorder.component.css']
})
export class CustomerTrackorderComponent implements OnInit {
  orders: any[] = [];
  customerId: string | null = null; // Get from sessionStorage

  constructor(private http: HttpClient) {}

  ngOnInit(): void {
    // Fetch customer ID from sessionStorage
    this.customerId = sessionStorage.getItem('customerId');

    console.log('Customer ID fetched from sessionStorage:', this.customerId);  // Debugging line

    if (this.customerId) {
      this.fetchOrders();
    } else {
      console.error('No customer ID found in session storage!');
    }
  }

  fetchOrders() {
    this.http.get<any[]>(`http://localhost:8080/orders/customer/${this.customerId}`)
      .subscribe(
        (response) => {
          this.orders = response;
          console.log('Orders fetched:', this.orders);
        },
        (error) => console.error('Error fetching orders:', error)
      );
  }
}

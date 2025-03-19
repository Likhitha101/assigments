import { Component } from '@angular/core';
import { OrderService } from '../../order.service';

@Component({
  selector: 'app-place-order',
  templateUrl: './place-order.component.html',
  styleUrls: ['./place-order.component.css']
})
export class PlaceOrderComponent {
  orderData = {
    customer: {
      email: 'deepthisri12@gmail.com'
    },
    pickupStreet: '',
    pickupCity: '',
    pickupState: '',
    pickupCountry: '',
    pickupPincode: '',
    destinationStreet: '',
    destinationCity: '',
    destinationState: '',
    destinationCountry: '',
    destinationPincode: '',
    itemName: '',
    itemWeight: '1',
    pickupDate: '',
    startTime: '',
    endTime: '',
    instructions: ''
  };

  constructor(private orderService: OrderService) {}

  placeOrder() {
    console.log('Sending order:', this.orderData);  // Debugging the request
    this.orderService.placeOrder(this.orderData).subscribe(
      response => {
        console.log('Order placed successfully:', response);
        alert('Order placed successfully!');
      },
      error => {
        console.error('Error placing order:', error);
        alert('Failed to place order.');
      }
    );
  }
  
}

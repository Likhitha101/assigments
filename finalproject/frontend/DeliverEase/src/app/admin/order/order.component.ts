import { Component, OnInit } from '@angular/core';
import { OrderService } from '../../order.service';
import { FormGroup } from '@angular/forms';
@Component({
  selector: 'app-order',
  templateUrl: './order.component.html',
  styleUrls: ['./order.component.css']
})
export class OrderComponent implements OnInit {
orderForm!: FormGroup<any>;
onSubmit() {
throw new Error('Method not implemented.');
}
  pendingOrders: any[] = [];

  constructor(private orderService: OrderService) {}

  ngOnInit(): void {
    this.fetchPendingOrders();
  }

  fetchPendingOrders(): void {
    this.orderService.getPendingOrders().subscribe(data => {
      this.pendingOrders = data;
    });
  }

  assignOrder(id: number): void {
    this.orderService.updateOrderStatus(id, 'ASSIGNED').subscribe(() => {
      this.fetchPendingOrders(); // Refresh list after update
    }, error => {
      console.error('Error updating status:', error);
    });
  }
}

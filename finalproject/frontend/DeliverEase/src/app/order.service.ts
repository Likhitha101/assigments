import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class OrderService {
  private apiUrl = 'http://localhost:8080/api/orders';

  constructor(private http: HttpClient) {}

  placeOrder(order: any): Observable<any> {
    return this.http.post(this.apiUrl, order, {
      headers: new HttpHeaders({ 'Content-Type': 'application/json' }),
      responseType: 'text'  // 👈 Fix: Handle text response
    });
  }
 // Get Assigned Orders for a driver
 getAssignedOrdersForDriver(driverId: number): Observable<any[]> {
  return this.http.get<any[]>(`${this.apiUrl}/driver/${driverId}/assigned-orders`);
}

  getPendingOrders(): Observable<any[]> {
    return this.http.get<any[]>(`${this.apiUrl}/pending`);
  }

  updateOrderStatus(id: number, status: string): Observable<any> {
    return this.http.patch(`${this.apiUrl}/${id}/status`, { status });
  }
}

import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable, throwError } from 'rxjs';
import { catchError, map } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class DriverService {
  private apiUrl = 'http://localhost:8080/api/drivers'; // Ensure this URL is correct

  constructor(private http: HttpClient) {}

  // Register a driver
  registerDriver(driverData: any): Observable<any> {
    const headers = new HttpHeaders({ 'Content-Type': 'application/json' });

    return this.http.post<any>(`${this.apiUrl}/register`, driverData, { headers }).pipe(
      map(response => {
        // Handle successful registration here if needed
        return response;
      }),
      catchError(err => {
        console.error('Error registering driver:', err);
        return throwError(err); // Propagate the error for handling in components
      })
    );
  }



    // Fetch all drivers
    getAllDrivers(): Observable<any[]> {
      return this.http.get<any[]>(`${this.apiUrl}/all`).pipe(
        catchError(err => {
          console.error('Error fetching drivers:', err);
          return throwError(err);
        })
      );
    }
  
    // Approve a driver
    approveDriver(driverId: number, approved: boolean): Observable<any> {
      if (!driverId) {
        console.error('Error: Driver ID is undefined!');
        return throwError('Driver ID is undefined!');
      }
  
      const headers = new HttpHeaders({ 'Content-Type': 'application/json' });
  
      return this.http.put<any>(`${this.apiUrl}/approve/${driverId}`, { approved }, { headers }).pipe(
        map(response => response),
        catchError(err => {
          console.error('Error approving driver:', err);
          return throwError(err);
        })
      );
    }
  }
  
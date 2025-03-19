import { Component, OnInit } from '@angular/core';
import { DriverService } from '../../driver.service';

@Component({
  selector: 'app-approve-drivers',
  templateUrl: './approve-drivers.component.html',
  styleUrls: ['./approve-drivers.component.css']
})
export class ApproveDriversComponent implements OnInit {
  drivers: any[] = [];

  constructor(private driverService: DriverService) {}

  ngOnInit(): void {
    this.getAllDrivers();
  }

  // Fetch all drivers
  getAllDrivers(): void {
    this.driverService.getAllDrivers().subscribe(
      (drivers) => {
        console.log('Drivers received:', drivers); // Debugging
        this.drivers = drivers.map(driver => ({
          ...driver,
          id: driver.driverId,  // Ensure driverId is mapped correctly
          status: driver.approved ? 'Approved' : 'Pending'
        }));
      },
      (error) => {
        console.error('Error fetching drivers:', error);
      }
    );
  }

  // Approve driver function
  approveDriver(driverId: number): void {
    if (!driverId) {
      console.error('Error: Driver ID is undefined!');
      return;
    }

    this.driverService.approveDriver(driverId, true).subscribe(
      (response) => {
        console.log('Driver approved successfully', response);
        this.updateDriverStatus(driverId, 'Approved');
      },
      (error) => {
        console.error('Error approving driver:', error);
      }
    );
  }

  // Update local driver status after approval
  updateDriverStatus(driverId: number, newStatus: string): void {
    const driverIndex = this.drivers.findIndex(driver => driver.id === driverId);
    if (driverIndex !== -1) {
      this.drivers[driverIndex].status = newStatus;
    }
  }
}

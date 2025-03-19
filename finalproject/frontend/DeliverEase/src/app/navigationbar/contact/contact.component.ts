import { Component } from '@angular/core';

@Component({
  selector: 'app-contact',
  templateUrl: './contact.component.html',
  styleUrls: ['./contact.component.css']
})
export class ContactComponent {
  cities = [
    { name: 'Ahmedabad', address: 'SHALIMAR CO-OP HSG SOC, NEAR EMBASSY MARKET, OFF ASHRAM ROAD.', location: 'Ahmedabad', pincode: '380009', email: 'customerservice@bluedart.com' },
    { name: 'Bangalore', address: 'GROUND FLOOR, CONNECTION POINT, AIRPORT EXIT ROAD.', location: 'Bengaluru', pincode: '569999', email: 'customerservice@bluedart.com' },
    { name: 'Kolkata', address: 'BENGAL INTELLIGENT PARK, BUILDING ALPHA, SECTOR-V, SALT LAKE ELECTRONICS COMPLEX.', location: 'Kolkata', pincode: '700091', email: 'customerservice@bluedart.com' },
    { name: 'Chennai', address: '11(OLD NO.38), STATUS QUO, STERLING ROAD, NUNGAMBAKKAM.', location: 'Chennai', pincode: '600034', email: 'customerservice@bluedart.com' },
    { name: 'Coimbatore', address: 'PAGA TOWERS, 8/128 TO 132, KATTOOR STREET, P.N.PALAYAM.', location: 'Coimbatore', pincode: '641037', email: 'customerservice@bluedart.com' },
    { name: 'Delhi', address: '4TH FLOOR, ELEGANCE TOWER, NON HIERARCHICAL COMMERCIAL CENTRE, JASOLA DISTRICT CENTRE.', location: 'New Delhi', pincode: '110076', email: 'customerservice@bluedart.com' },
    { name: 'Hyderabad', address: 'H NO. 8-2-248/1/7/71 & 71A, PLOT NO.71, SARADA CHAMBERS, NAGARJUNA HILLS.', location: 'Hyderabad', pincode: '500082', email: 'customerservice@bluedart.com' },
    { name: 'Mumbai', address: 'BLUE DART CENTRE, SAHAR AIRPORT ROAD, ANDHERI EAST.', location: 'Mumbai', pincode: '400099', email: 'customerservice@bluedart.com' }
  ];
}

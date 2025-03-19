import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CustomerTrackorderComponent } from './customer-trackorder.component';

describe('CustomerTrackorderComponent', () => {
  let component: CustomerTrackorderComponent;
  let fixture: ComponentFixture<CustomerTrackorderComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CustomerTrackorderComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CustomerTrackorderComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

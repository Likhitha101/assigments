import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ApproveDriversComponent } from './approve-drivers.component';

describe('ApproveDriversComponent', () => {
  let component: ApproveDriversComponent;
  let fixture: ComponentFixture<ApproveDriversComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ApproveDriversComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ApproveDriversComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

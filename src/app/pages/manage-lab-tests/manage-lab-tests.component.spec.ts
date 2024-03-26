import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ManageLabTestsComponent } from './manage-lab-tests.component';

describe('ManageLabTestsComponent', () => {
  let component: ManageLabTestsComponent;
  let fixture: ComponentFixture<ManageLabTestsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ManageLabTestsComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(ManageLabTestsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

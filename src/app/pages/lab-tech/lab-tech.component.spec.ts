import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LabTechComponent } from './lab-tech.component';

describe('LabTechComponent', () => {
  let component: LabTechComponent;
  let fixture: ComponentFixture<LabTechComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [LabTechComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(LabTechComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

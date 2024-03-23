import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SignUpLabTechComponent } from './sign-up-lab-tech.component';

describe('SignUpLabTechComponent', () => {
  let component: SignUpLabTechComponent;
  let fixture: ComponentFixture<SignUpLabTechComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [SignUpLabTechComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(SignUpLabTechComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

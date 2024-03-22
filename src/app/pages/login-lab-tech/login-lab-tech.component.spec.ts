import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LoginLabTechComponent } from './login-lab-tech.component';

describe('LoginLabTechComponent', () => {
  let component: LoginLabTechComponent;
  let fixture: ComponentFixture<LoginLabTechComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [LoginLabTechComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(LoginLabTechComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});


import { NgModule } from '@angular/core';
import { BrowserModule, provideClientHydration } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './common/header/header.component';
import { HomeComponent } from './pages/home/home.component';
import { FooterComponent } from './common/footer/footer.component';
import { LabTestsComponent } from './pages/lab-tests/lab-tests.component';
import { BookAppointmentComponent } from './pages/book-appointment/book-appointment.component';
import { HttpClientModule } from '@angular/common/http';
import { provideHttpClient, withFetch } from '@angular/common/http';
import { ContactUsComponent } from './pages/contact-us/contact-us.component';
import { AboutComponent } from './pages/about/about.component';
import { FormsModule } from '@angular/forms';
import {MatDatepickerModule} from '@angular/material/datepicker';
import {MatInputModule} from '@angular/material/input';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatNativeDateModule } from '@angular/material/core';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import {MatButtonModule} from '@angular/material/button';
import { LoginPageComponent } from './pages/login-page/login-page.component';
import { PayementComponent } from './pages/payement/payement.component';
import { PayByCardComponent } from './pages/pay-by-card/pay-by-card.component';
import { LabTechComponent } from './pages/lab-tech/lab-tech.component';
import { LoginLabTechComponent } from './pages/login-lab-tech/login-lab-tech.component';
import { SignUpComponent } from './pages/sign-up/sign-up.component';
import { ReportGenerateComponent } from './pages/report-generate/report-generate.component';
import { PrivacyPolicyComponent } from './pages/privacy-policy/privacy-policy.component';
import { TermsAndConditionsComponent } from './pages/terms-and-conditions/terms-and-conditions.component';
import { LoginDoctorComponent } from './pages/login-doctor/login-doctor.component';
import { LoginAdminComponent } from './pages/login-admin/login-admin.component';
import { LoginPatientComponent } from './pages/login-patient/login-patient.component';
import { SignUpPatientComponent } from './pages/sign-up-patient/sign-up-patient.component';
import { SignUpDoctorComponent } from './pages/sign-up-doctor/sign-up-doctor.component';
import { SignUpLabTechComponent } from './pages/sign-up-lab-tech/sign-up-lab-tech.component';
import { SignUpAdminComponent } from './pages/sign-up-admin/sign-up-admin.component';
import { AdminDashboardComponent } from './pages/admin-dashboard/admin-dashboard.component';


@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    HomeComponent,
    FooterComponent,
    LabTestsComponent,
    BookAppointmentComponent,
    ContactUsComponent,
    AboutComponent,
    LoginPageComponent,
    PayementComponent,
    PayByCardComponent,
    LabTechComponent,
    LoginLabTechComponent,
    SignUpComponent,
    ReportGenerateComponent,
    PrivacyPolicyComponent,
    TermsAndConditionsComponent,
    LoginDoctorComponent,
    LoginAdminComponent,
    LoginPatientComponent,
    SignUpPatientComponent,
    SignUpDoctorComponent,
    SignUpLabTechComponent,
    SignUpAdminComponent,
    AdminDashboardComponent
  ],
  
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    MatDatepickerModule,
    MatInputModule,
    MatFormFieldModule,
    MatNativeDateModule,
    BrowserAnimationsModule,
    MatButtonModule

    
  ],
  providers: [
    provideClientHydration(),provideHttpClient(withFetch())
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }

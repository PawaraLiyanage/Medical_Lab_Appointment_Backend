import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './pages/home/home.component';
import { LabTestsComponent } from './pages/lab-tests/lab-tests.component';
import { BookAppointmentComponent } from './pages/book-appointment/book-appointment.component';
import { ContactUsComponent } from './pages/contact-us/contact-us.component';
import { AboutComponent } from './pages/about/about.component';
import { LoginPageComponent } from './pages/login-page/login-page.component';
import { PayementComponent } from './pages/payement/payement.component';
import { PayByCardComponent } from './pages/pay-by-card/pay-by-card.component';
import { LabTechComponent } from './pages/lab-tech/lab-tech.component';
import { LoginLabTechComponent } from './pages/login-lab-tech/login-lab-tech.component';
import { SignUpComponent } from './pages/sign-up/sign-up.component';
import { ReportGenerateComponent } from './pages/report-generate/report-generate.component';
import { PrivacyPolicyComponent } from './pages/privacy-policy/privacy-policy.component';
import { TermsAndConditionsComponent } from './pages/terms-and-conditions/terms-and-conditions.component';
import { LoginAdminComponent } from './pages/login-admin/login-admin.component';
import { LoginDoctorComponent } from './pages/login-doctor/login-doctor.component';
import { LoginPatientComponent } from './pages/login-patient/login-patient.component';
import { SignUpAdminComponent } from './pages/sign-up-admin/sign-up-admin.component';
import { SignUpDoctorComponent } from './pages/sign-up-doctor/sign-up-doctor.component';
import { SignUpLabTechComponent } from './pages/sign-up-lab-tech/sign-up-lab-tech.component';
import { AdminDashboardComponent } from './pages/admin-dashboard/admin-dashboard.component';

const routes: Routes = [
  {
    path: '',
    component: HomeComponent
  },
  {
    path: "lab-tests",
    component: LabTestsComponent
  },
  {
    path: "book-appointment",
    component: BookAppointmentComponent
  },
  {
    path: "Contact-Us",
    component: ContactUsComponent
  },
  {
    path: "about",
    component: AboutComponent
  },
  {
    path: "login-page",
    component: LoginPageComponent
  },
  {
    path: "payment",
    component: PayementComponent
  },
  {
    path: "pay-by-card",
    component: PayByCardComponent
  },
  {
    path: "lab-tech",
    component: LabTechComponent
  },
  {
    path: "login-lab-tech",
    component: LoginLabTechComponent
  },
  {
    path: "sign-up",
    component: SignUpComponent
  },
  {
    path: "report-generate",
    component: ReportGenerateComponent
  },
  {
    path: "privacy-policy",
    component: PrivacyPolicyComponent
  },
  {
    path: "terms-and-conditions",
    component: TermsAndConditionsComponent
  },
  {
    path: "login-admin",
    component: LoginAdminComponent
  },
  {
    path: "login-doctor",
    component: LoginDoctorComponent
  },
  {
    path: "login-patient",
    component: LoginPatientComponent
  },
  {
    path: "sign-up-admin",
    component: SignUpAdminComponent
  },
  {
    path: "sign-up-doctor",
    component: SignUpDoctorComponent
  },
  {
    path: "sign-up-lab-tech",
    component: SignUpLabTechComponent
  },
  {
    path: "sign-up-patient",
    component: SignUpLabTechComponent
  },
  {
    path: "admin-dashboard",
    component: AdminDashboardComponent
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

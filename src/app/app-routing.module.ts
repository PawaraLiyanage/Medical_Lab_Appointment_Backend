import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './pages/home/home.component';
import { LabTestsComponent } from './pages/lab-tests/lab-tests.component';
import { BookAppointmentComponent } from './pages/book-appointment/book-appointment.component';

const routes: Routes = [
  {
    path:"home",
    component:HomeComponent
  },
  {
    path:"lab-tests",
    component:LabTestsComponent
  },
  {
    path:"book-appointment",
    component:BookAppointmentComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

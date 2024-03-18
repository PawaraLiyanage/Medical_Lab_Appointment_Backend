import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';


@Component({
  selector: 'app-book-appointment',
  templateUrl: './book-appointment.component.html',
  styleUrl: './book-appointment.component.css'
})
export class BookAppointmentComponent implements OnInit {
  

    private http;
    public labTest:any;
  
  
    constructor(private httpClient:HttpClient){
      this.http=httpClient;
    }
    ngOnInit(): void {
      this.createPatient();
      this.viewLabTest();
    }
  
  
    viewLabTest(){
      this.http.get('http://localhost:8080/labtest/get').subscribe((data)=>{
      this.labTest=data;
        });
    }
    public patient = {
      name:null,
      contactNumber:null,
      email:null
    };

    createPatient(){
      this.http.post("http://localhost:8080/patient/add",this.patient).subscribe((data)=>{
      console.log(data);
        });

        
    }
    dateChanged($event:any){
      console.log($event.target.value);
    }
  }


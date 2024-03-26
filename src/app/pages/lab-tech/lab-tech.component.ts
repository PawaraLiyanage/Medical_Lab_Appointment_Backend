import { HttpClient, HttpClientModule } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';




@Component({
  selector: 'app-lab-tech',
  templateUrl: './lab-tech.component.html',
  styleUrl: './lab-tech.component.css'
})
export class LabTechComponent implements OnInit {

  private http;
  public labTest:any;


  constructor(private httpClient:HttpClient){
    this.http=httpClient;
  }
  ngOnInit(): void {
    
    this.viewLabTest();
    //this.sendEmail();
  }
  viewLabTest(){
    this.http.get('http://localhost:8080/labtest/get').subscribe((data)=>{
    this.labTest=data;
      });
  }
  public email = {
    labTechnicianName: null,
    patientName: null,
    doctorName: null,
    labTestName: null,
    testResult: null,
    patientEmail: null
  };
  // sendEmail(){
  //   this.http.post("http://localhost:8080/mail/send",this.email).subscribe((data)=>{
  //   console.log(data);
  //     });
  // }


}

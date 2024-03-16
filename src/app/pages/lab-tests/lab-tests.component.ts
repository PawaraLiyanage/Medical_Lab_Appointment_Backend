import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';


@Component({
  selector: 'app-lab-tests',
  templateUrl: './lab-tests.component.html',
  styleUrl: './lab-tests.component.css'
})
export class LabTestsComponent implements OnInit {

  private http;
  public labTest:any;

  constructor(private httpClient:HttpClient){
    this.http=httpClient;
  }
  ngOnInit(): void {
    this.viewLabTest();
  }


  viewLabTest(){
    this.http.get('http://localhost:8080/labtest/get').subscribe((data)=>{
    this.labTest=data;
      });
  }

}

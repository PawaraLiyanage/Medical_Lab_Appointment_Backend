import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';


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
  }
  viewLabTest(){
    this.http.get('http://localhost:8080/labtest/get').subscribe((data)=>{
    this.labTest=data;
      });
  }

}

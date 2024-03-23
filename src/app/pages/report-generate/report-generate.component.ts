import { Component , OnInit} from '@angular/core';
import { HttpClient } from '@angular/common/http';


@Component({
  selector: 'app-report-generate',
  templateUrl: './report-generate.component.html',
  styleUrl: './report-generate.component.css'
})
export class ReportGenerateComponent implements OnInit {
  

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

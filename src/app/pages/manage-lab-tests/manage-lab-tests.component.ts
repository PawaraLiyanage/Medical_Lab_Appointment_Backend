import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import Swal from 'sweetalert2';
@Component({
  selector: 'app-manage-lab-tests',
  templateUrl: './manage-lab-tests.component.html',
  styleUrl: './manage-lab-tests.component.css'
})
export class ManageLabTestsComponent implements OnInit{

  private http;
  public labTest:any={};
  public selectedTest:any;

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

  deleteTest(){
    let api = "http://localhost:8080/labtest/"+this.selectedTest.id;
    this.http.delete(api,{responseType:'text'}).subscribe((Response:string) =>{
      console.log(Response);
      this.viewLabTest();
      Swal.fire({
        title: "Deleted Successfully!",
        text: " ",
        icon: "success"
      });
      this.selectedTest = null;
    });
  }



  setSelectedTest(labTest:any){
    this.selectedTest = labTest;
    console.log("setSelectedTest"+labTest.id);
  }

  saveTest(){
    let postApi = "http://localhost:8080/labtest/add";
    this.http.post(postApi,this.selectedTest).subscribe(data=>{
      console.log("Saved!");
      this.viewLabTest();
      Swal.fire({
        title: "Updated Successfully!",
        text: " ",
        icon: "success"
      });
      this.selectedTest={};
    })
}
}


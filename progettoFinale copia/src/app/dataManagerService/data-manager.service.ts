import { Injectable } from '@angular/core';
import {HttpClient, HttpClientModule, HttpHeaderResponse, HttpHeaders} from '@angular/common/http'
import { EMPTY, Observable } from 'rxjs';

const URL = "http://192.168.1.115:8080/api/";

@Injectable({
  providedIn: 'root'
})
export class DataManagerService {

 
  headers = new HttpHeaders()
  .append(
    'content-Type',
    'application/json'
  )



  constructor(private http : HttpClient) { }

  getAll() : Observable<any> {
    try {
      return this.http.get(URL + "getall", {responseType : "json"})
    } catch (error) {
      
      console.log(error);
      return EMPTY;
    }
     
  }

  deleteNotaByid(id : number) : Observable<any> {
    try {
      return this.http.delete(URL + 'deletebyid?id=' + id )
    } catch (error) {
      console.log(error)
      return EMPTY;
    }
  }

  getNotaByid(id : number) : Observable<any> {
    try {
      return this.http.get(URL + 'getbyid?id=' + id )
    } catch (error) {
      console.log(error)
      return EMPTY;
    }
  }




}

import { HttpClient, HttpClientModule, HttpParams } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root',
})
export class AuthService {
  url: any = 'http://localhost:8080/';
  constructor(private http: HttpClient) {}

  signin(): any {
    this.http.post(this.url + '/signin', ['email', 'password']);
    return true;
  }
}

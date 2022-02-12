import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root',
})
export class UserServiceService {
  url: any = 'http://localhost:8080/user';

  constructor(private http: HttpClient) {}

  getAllUser(): any {
    return this.http.get(this.url);
  }
  getUser(id: number): any {
    return this.http.get(this.url + '/' + id);
  }
}

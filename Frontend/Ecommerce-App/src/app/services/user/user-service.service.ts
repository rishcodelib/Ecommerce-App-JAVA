import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root',
})
export class UserServiceService {
  api: 'localhost:8080/user/login';

  constructor(public http: HttpClient) {}

  getallusers(): any {
    return this.http.get(this.api);
  }
}

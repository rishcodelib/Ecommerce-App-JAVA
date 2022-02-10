import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root',
})
export class ProductServiceService {
  url: any = 'http://localhost:8080/product';
  constructor(private http: HttpClient) {}

  getAllProduct(): any {
    return this.http.get(this.url);
  }
  getProduct(id: number): any {
    return this.http.get(this.url + '/' + id);
  }
}

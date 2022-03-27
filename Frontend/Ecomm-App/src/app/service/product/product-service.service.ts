import {
  HttpClient,
  HttpEventType,
  HttpStatusCode,
} from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Product } from 'src/app/entity/product/product';
// import { Product } from 'src/app/entity/product/product';

@Injectable({
  providedIn: 'root',
})
export class ProductServiceService {
  url: any = 'http://localhost:8080/product';
  header = { 'Content-Type': 'application/json' };
  constructor(private http: HttpClient) {}

  getAllProduct(): any {
    return this.http.get(this.url);
  }
  getProduct(id: number): any {
    return this.http.get(this.url + '/' + id);
  }

  addProduct(prod: Product) {
 
      const body = JSON.stringify(prod);
      console.log(body);

      this.http.post(this.url, prod).subscribe((res)=>{
        console.log(res);
        
      })
  }
}

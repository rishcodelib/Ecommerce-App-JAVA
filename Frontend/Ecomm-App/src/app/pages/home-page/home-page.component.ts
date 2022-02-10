import { Component, OnInit } from '@angular/core';
import { ProductServiceService } from 'src/app/service/product/product-service.service';
@Component({
  selector: 'app-home-page',
  templateUrl: './home-page.component.html',
  styleUrls: ['./home-page.component.css'],
})
export class HomePageComponent implements OnInit {
  productList: any;
  constructor(private service: ProductServiceService) {}

  ngOnInit(): void {
    this.service.getAllProduct().subscribe((res: any) => {
      this.productList = res;
      console.log(res);
    });
  }
}

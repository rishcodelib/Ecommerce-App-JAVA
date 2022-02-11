import { Component, OnInit } from '@angular/core';
import { ProductServiceService } from 'src/app/service/product/product-service.service';
@Component({
  selector: 'app-all-product-page',
  templateUrl: './all-product-page.component.html',
  styleUrls: ['./all-product-page.component.css'],
})
export class AllProductPageComponent implements OnInit {
  productListArr: any;
  productImagesArr: any;
  private _productsizeArr: any;
  // productId:any;
  breadcrumb: any = [{ name: 'Dashboard',url:'/dashboard' }, { name: 'Products',url:'/products' }];

  public get productsizeArr(): any {
    return this._productsizeArr;
  }
  public set productsizeArr(value: any) {
    this._productsizeArr = value;
  }

  constructor(private pServe: ProductServiceService) {}

  ngOnInit(): void {
    this.pServe.getAllProduct().subscribe((res: any) => {
      this.productListArr = res;
      console.log(JSON.stringify(this.productListArr));
    });
  }
}

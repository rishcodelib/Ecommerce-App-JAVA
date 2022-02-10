import { Component, OnInit } from '@angular/core';
import { ProductServiceService } from 'src/app/service/product/product-service.service';
@Component({
  selector: 'app-product-detail',
  templateUrl: './product-detail.component.html',
  styleUrls: ['./product-detail.component.css'],
})
export class ProductDetailComponent implements OnInit {
  productName: any = 'Rishabh';
  description: any =
    'Product Description Product Description Product Description Product Description';
  size: any = ['S', 'M', 'L', 'XL'];
  imagePath: any | null;
  imageName: any | null;
  fullimage: any | null ="../../../assets/products/tshirt.jpeg";
  inStock: any = false;
  Stockclass: any;

  constructor(private pServe: ProductServiceService) {}

  ngOnInit(): void {
    console.log(this.pServe.getProduct(1));
  }
}

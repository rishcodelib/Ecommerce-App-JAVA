import { Component, OnInit } from '@angular/core';
import { Product } from 'src/app/entity/product/product';
import { ProductServiceService } from 'src/app/service/product/product-service.service';

@Component({
  selector: 'app-cart',
  templateUrl: './cart.component.html',
  styleUrls: ['./cart.component.css'],
})
export class CartComponent implements OnInit {
  breadcrumb: any = [
    { name: 'Dashboard', url: '/dashboard' },
    { name: 'Products', url: '/products' },
    { name: 'Product Detail', url: '/product-detail' },
    { name: 'Cart', url: '/cart' },
  ];
  productCart: any | undefined;
  cartStatus: any | undefined;
  name: any;
  desc: any;
  quantity: any;
  color: any;
  productDetail: any;
  cartItems: Array<String> | undefined;
  constructor(private pserve: ProductServiceService) {}

  ngOnInit(): void {
    this.productCart = localStorage.getItem('products');

    if (this.productCart == undefined) {
      this.cartStatus = 'Cart is Empty';
    } else {
      var cart = JSON.parse(this.productCart);
      cart.forEach((e: { productId: string; size: string }) => {
        this.productDetail = this.getCartProduct(e.productId, e.size);
        // console.log(this.productDetail);
      });
      // console.log(this.cartItems);
    }
  }

  getCartProduct(id: string, size: string) {
    var productId = JSON.parse(id);
    this.pserve.getProduct(productId).subscribe((res: any) => {
      return res;
      // this.productDetail = { productId: res };
      // console.log(this.productDetail);
    });
  }
}

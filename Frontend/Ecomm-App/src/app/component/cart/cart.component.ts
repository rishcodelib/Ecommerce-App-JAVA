import { JsonpClientBackend } from '@angular/common/http';
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
  stock: boolean = true;
  constructor(private pserve: ProductServiceService) {}

  ngOnInit(): void {
    this.productCart = localStorage.getItem('products');

    if (this.productCart == undefined) {
      this.cartStatus = 'Cart is Empty';
    }

    this.productCart = JSON.parse(this.productCart);
    // this.deleteFromCart(3);
  }
  emptyCart() {
    localStorage.removeItem('products')
  }

  getCartProduct(id: string, size: string) {
    var productId = JSON.parse(id);
    this.pserve.getProduct(productId).subscribe((res: any) => {
      return res;
    });
  }

  deleteFromCart(id: number) {
    var cart: any = localStorage.getItem('products');
    var cart_obj = JSON.parse(cart);
    console.log(cart_obj);

    cart_obj.forEach((e: any, index: number) => {
      if (e.productId === id) {
        console.log('ProductId Found' + id);
        // delete cart_obj[0];
        console.log('Deleted');
      }
    });
    
    localStorage.setItem('products', JSON.stringify(cart_obj));
    JSON.stringify(cart_obj);
  }
}

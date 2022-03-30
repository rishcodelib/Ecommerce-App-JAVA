import { Injectable } from '@angular/core';
import { ProductServiceService } from '../product/product-service.service';
@Injectable({
  providedIn: 'root'
})
export class CartService {

  constructor(private pserve: ProductServiceService) { }
  
  
  
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
  emptyCart() {
    localStorage.removeItem('products')
  }

}

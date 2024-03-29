import { Component, OnInit } from '@angular/core';
import { ProductServiceService } from 'src/app/service/product/product-service.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-product-detail',
  templateUrl: './product-detail.component.html',
  styleUrls: ['./product-detail.component.css'],
})
export class ProductDetailComponent implements OnInit {
  breadcrumb: any = [
    { name: 'Dashboard', url: '/dashboard' },
    { name: 'Products', url: '/products' },
    { name: 'Product Detail', url: '/product-detail' },
  ];

  // productName: any = 'Rishabh';
  // description: any =
  //   'Product Description Product Description Product Description Product Description';
  // size: any = ['S', 'M', 'L', 'XL'];
  // imagePath: any | null;
  // imageName: any | null;
  // fullimage: any | null = '../../../assets/products/tshirt.jpeg';
  inStock: any = false;
  Stockclass: any;
  productDetail: any;
  Id!: number;
  productCart: any;
  NewalertName: any | undefined;
  NewalerDesc: any | undefined;

  constructor(
    private pServe: ProductServiceService,
    private act: ActivatedRoute
  ) {}

  ngOnInit(): void {
    this.act.params.subscribe((params) => {
      this.Id = params['id'];
      console.log(this.Id);
    });

    this.pServe.getProduct(this.Id).subscribe((res: any) => {
      this.productDetail = res;
      console.log(this.productDetail);
    });
  }

  cart(id: number, selectedSize: String = 'S', description = this.productDetail.description, quantity = 1, amount =this.productDetail.price ) {
    if (localStorage.getItem('products')) {
      this.productCart = localStorage.getItem('products');
      var cart = JSON.parse(this.productCart);
      var totalItems = cart.length;
     
      cart[totalItems] = { productId: id, size: selectedSize,desc: this.productDetail.description,qty:quantity ,amt: amount };
      localStorage.setItem('products', JSON.stringify(cart));
      cart.forEach((e: { productId: string; }) => {
        console.log(e.productId);
        
      });
    } else {
      this.productCart = [{ productId: id, size: selectedSize, desc: description, qty: quantity ,amt:amount }];
      localStorage.setItem('products', JSON.stringify(this.productCart));
    }
    this.Newalert();
  }

  Newalert() {
    this.NewalertName = 'Success';
    this.NewalerDesc = 'Order Added to Cart';
  }
}

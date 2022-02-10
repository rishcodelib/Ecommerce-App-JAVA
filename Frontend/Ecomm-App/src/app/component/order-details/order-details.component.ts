import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-order-details',
  templateUrl: './order-details.component.html',
  styleUrls: ['./order-details.component.css'],
})
export class OrderDetailsComponent implements OnInit {
  productName: any = 'This is the Product Name';
  productSize: any = 'M';
  productDesc: any = 'This is the Product description';
  address: any = 'This is the Product Name';
  state: any = 'Haryana';
  city: any = 'Kurukshetra';

  breadcrumb: any = [
    { name: 'Dashboard', url: '/dashboard' },
    { name: 'Products', url: '/products' },
    { name: 'Product Detail', url: '/product-detail' },
    { name: 'Delivery Address', url: '/checkout' },
    { name: 'Order Details', url: '/Order-Details' },
 ];
  constructor() {}

  ngOnInit(): void {}
}

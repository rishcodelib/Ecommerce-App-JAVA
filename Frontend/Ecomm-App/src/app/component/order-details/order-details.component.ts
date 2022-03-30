import { Component, OnInit } from '@angular/core';
import { LocaldataService } from 'src/app/service/localdata/localdata.service';

@Component({
  selector: 'app-order-details',
  templateUrl: './order-details.component.html',
  styleUrls: ['./order-details.component.css'],
})
export class OrderDetailsComponent implements OnInit {
  productName: any;
  productDesc: any;
  productSize: any;
  data: any = localStorage.getItem('address');
  jsonData: any = JSON.parse(this.data);
  custName: any = this.jsonData.custName;
  custAddress: any = this.jsonData.custAddress;
  custContact: any = this.jsonData.custContact;
  breadcrumb: any = [
    { name: 'Dashboard', url: '/dashboard' },
    { name: 'Products', url: '/products' },
    { name: 'Product Detail', url: '/product-detail' },
    { name: 'Delivery Address', url: '/checkout' },
    { name: 'Order Details', url: '/Order-Details' },
  ];
  constructor(private localData: LocaldataService) {}

  ngOnInit(): void {}

  getAddress() {
    console.log(localStorage.getItem('address'));
    localStorage.getItem('address');
  }

  
}

import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';

@Component({
  selector: 'app-add-product',
  templateUrl: './add-product.component.html',
  styleUrls: ['./add-product.component.css'],
})
export class AddProductComponent implements OnInit {
  breadcrumb: any = [
    { name: 'Dashboard', url: '/dashboard' },
    { name: 'Products', url: '/products' },
    { name: 'Add Products', url: '/addProducts' },
  ];

  productForm = new FormGroup({
    productName: new FormControl(''),
    productDesc: new FormControl(''),
    productAmount: new FormControl(''),
    amount: new FormControl(''),
    size: new FormControl(''),
    quantity: new FormControl(''),
    userId: new FormControl(''),
  });
  onSubmit() {
    console.log(this.productForm.value);
  }

  constructor() {}

  ngOnInit(): void {}
}

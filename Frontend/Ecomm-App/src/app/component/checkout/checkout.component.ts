import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-checkout',
  templateUrl: './checkout.component.html',
  styleUrls: ['./checkout.component.css'],
})
export class CheckoutComponent implements OnInit {
  breadcrumb: any = [
    { name: 'Dashboard', url: '/dashboard' },
    { name: 'Products', url: '/products' },
    { name: 'Product Detail', url: '/product-detail' },
    { name: 'Checkout', url: '/checkout' },
  ];
  constructor(private router:Router) {}

  ngOnInit(): void {}

  checkoutForm = new FormGroup({
    custName: new FormControl(''),
    custAddress: new FormControl(''),
    city: new FormControl(''),
    State: new FormControl(''),
    custType: new FormControl(''),
    userId: new FormControl(''),
    custContact: new FormControl(''),
  });

  onSubmit() {
    // this.productServ.addProduct(this.productForm.value);
    // console.log(this.checkoutForm.value);
    localStorage.setItem('address', JSON.stringify(this.checkoutForm.value));
    this.router.navigate(['/order-detail'])
  }
}

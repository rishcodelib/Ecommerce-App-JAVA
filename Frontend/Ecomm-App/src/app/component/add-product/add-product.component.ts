import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { Observable } from 'rxjs';
import { ProductServiceService } from 'src/app/service/product/product-service.service';

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
  constructor(private productServ: ProductServiceService) {}

  ngOnInit(): void {}

  productForm = new FormGroup({
    imagePath: new FormControl(''),
    name: new FormControl(''),
    description: new FormControl(''),
    price: new FormControl(''),
    size: new FormControl(''),
    quantity: new FormControl(''),
    UserId: new FormControl(''),
  });

  onSubmit() {
    this.productServ.addProduct(this.productForm.value);

    // console.log(this.productForm.value);
  }
}

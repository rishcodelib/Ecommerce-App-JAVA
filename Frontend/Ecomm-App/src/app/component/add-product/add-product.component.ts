import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-add-product',
  templateUrl: './add-product.component.html',
  styleUrls: ['./add-product.component.css'],
})
export class AddProductComponent implements OnInit {
  breadcrumb: any = ['Product','Add Products'];
  activeItem: any = 'Add Products';
  constructor() {}

  ngOnInit(): void {}
}

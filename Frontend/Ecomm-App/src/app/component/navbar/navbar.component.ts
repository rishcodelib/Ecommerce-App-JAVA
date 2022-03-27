import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css'],
})
export class NavbarComponent implements OnInit {
  cartItems: number | undefined;
  constructor() {}

  ngOnInit(): void {
    if (localStorage.getItem('products')) {
      var cart: any = localStorage.getItem('products');
      this.cartItems = JSON.parse(cart).length;
    }
  }
}

import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-all-orders',
  templateUrl: './all-orders.component.html',
  styleUrls: ['./all-orders.component.css'],
})
export class AllOrdersComponent implements OnInit {
  breadcrumb: any = [{ name: 'Dashboard',url:'/dashboard' }, { name: 'All Orders', url:'/orders' }];
  constructor() {}

  ngOnInit(): void {}
}

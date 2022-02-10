import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-transactions',
  templateUrl: './transactions.component.html',
  styleUrls: ['./transactions.component.css'],
})
export class TransactionsComponent implements OnInit {
  breadcrumb: any = [
    {
      name: 'Dashboard',
      url: '/dashboard',
    },
    {
      name: 'Transactions',
      url: '/transactions',
    },
  ];
  constructor() {}

  ngOnInit(): void {}
}

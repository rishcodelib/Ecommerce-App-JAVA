import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-item-card',
  templateUrl: './item-card.component.html',
  styleUrls: ['./item-card.component.css'],
})
export class ItemCardComponent implements OnInit {
  @Input() productName: String | undefined;
  @Input() productPrice: number | undefined;
  @Input() productId: number | undefined;

  constructor() {}

  ngOnInit(): void {}
}

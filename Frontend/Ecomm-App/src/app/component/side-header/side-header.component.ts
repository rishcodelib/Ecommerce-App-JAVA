import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-side-header',
  templateUrl: './side-header.component.html',
  styleUrls: ['./side-header.component.css'],
})
export class SideHeaderComponent implements OnInit {
  @Input() header: any;
  @Input() breadcrumb: any;
  constructor() {}

  ngOnInit(): void {}
}

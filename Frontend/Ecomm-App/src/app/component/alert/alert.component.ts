import { NgSwitchCase } from '@angular/common';
import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-alert',
  templateUrl: './alert.component.html',
  styleUrls: ['./alert.component.css'],
})
export class AlertComponent implements OnInit {
  @Input() alertName: string = 'none';
  @Input() alertDesc: string | undefined;
  alertClass: string | undefined;
  constructor() {}

  ngOnInit(): void {
    switch (this.alertName) {
      case 'Success': {
        this.alertClass = 'alert-success show';
        break;
      }
      case 'Error': {
        this.alertClass = 'alert-danger show';
        break;
      }
      case 'Info': {
        this.alertClass = 'alert-info show';
        break;
      }
      case 'Warning': {
        this.alertClass = 'alert-warning show';
        break;
      }
      case 'primary': {
        this.alertClass = 'alert-primary show';
        break;
      }
          default: {
        this.alertClass = 'alert-secondary show';
        break;
      }
    }
  }
}

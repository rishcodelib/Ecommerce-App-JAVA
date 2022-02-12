import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { UserServiceService } from 'src/app/service/user/user-service.service';

@Component({
  selector: 'app-user-detail',
  templateUrl: './user-detail.component.html',
  styleUrls: ['./user-detail.component.css'],
})
export class UserDetailComponent implements OnInit {
  breadcrumb: any = [
    { name: 'Dashboard', url: '/dashboard' },
    { name: 'Users', url: '/all-users' },
    { name: 'User Detail', url: '/user-detail' },
  ];
  id!: number;
  userDetail: any;
  constructor(private user: UserServiceService, private act: ActivatedRoute) {}

  ngOnInit(): void {
    this.act.params.subscribe((params) => {
      this.id = params['id'];
    });

    this.user.getUser(this.id).subscribe((res: any) => {
      this.userDetail = res;
      console.log(this.userDetail);
    });

  }
}

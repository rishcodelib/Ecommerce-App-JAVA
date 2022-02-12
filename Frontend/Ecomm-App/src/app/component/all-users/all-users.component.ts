import { Component, OnInit } from '@angular/core';
import { UserServiceService } from 'src/app/service/user/user-service.service';

@Component({
  selector: 'app-all-users',
  templateUrl: './all-users.component.html',
  styleUrls: ['./all-users.component.css'],
})
export class AllUsersComponent implements OnInit {
  breadcrumb: any = [
    { name: 'Dashboard', url: '/dashboard' },
    { name: 'All Users', url: '/all-users' },
  ];
  userList: any;
  constructor(private user: UserServiceService) {}

  ngOnInit(): void {
    this.user.getAllUser().subscribe((res: any) => {
      this.userList =res;
      console.log(this.userList);
      
    });
  }
}

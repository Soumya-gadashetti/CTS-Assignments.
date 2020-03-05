import { Component, OnInit } from '@angular/core';
import { User } from '../models/user';
import { UserService } from '../services/user.service';

@Component({
  selector: 'app-user-list',
  templateUrl: './user-list.component.html',
  styleUrls: ['./user-list.component.css']
})
export class UserListComponent implements OnInit {
  user:User[];
  errMsg:string;
  constructor(private userService :UserService) { }

  ngOnInit() {
    this.loadData();
  }
  loadData(){
    this.user=null;
    this.errMsg=null;

    this.userService.getAll().subscribe(
      (data) =>{ this.user=data; },
      (err) => {this.errMsg="Sorry Server not reachable!";}
    );

  }
  delete(id:number){
    if(confirm(`Are you sure you want to delete emp#${id}`)){
      this.userService.delete(id).subscribe(
      ()=>{this.loadData();},
      (err)=>{this.errMsg=err;}
    );
    }

  }
}

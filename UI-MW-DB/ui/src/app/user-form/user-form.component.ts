import { Component, OnInit } from '@angular/core';

import { User } from '../models/user';
import { UserService } from '../services/user.service';
import { ActivatedRoute, Router } from '@angular/router';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-user-form',
  templateUrl: './user-form.component.html',
  styleUrls: ['./user-form.component.css']
})
export class UserFormComponent implements OnInit {
  user:User;
  msg:string;
  isNew:boolean;
  constructor(
    private userService:UserService,
    private actRoute:ActivatedRoute,
    private router:Router
    
    ) { }

  ngOnInit() {
    let id=this.actRoute.snapshot.params.id;
    if(id){
      this.isNew=false;
      this.userService.getAllById(id).subscribe(
        (data) =>{
          this.user=data;
        }
      );

    }
    else{
      this.isNew=true;
      this.user={
      id:0,
      username:'',
      password:''
      };
    }
  }
  save(){
    let ob:Observable<User>;
    if(this.isNew){
      ob=this.userService.addUser(this.user);
    }else{
      ob=this.userService.updateUser(this.user);
    }
    ob.subscribe(
      (Data) =>{
        this.router.navigateByUrl("");
      },
      (errResponse)=> {
        this.msg=errResponse.error;
        
      }
    );
  }
}



import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
 private frstNum:number=null;
 private scndNum:number=null;
 private result:number=null;
//  public constructor(){
//    this.frstNum=this.frstNum;
//    this.scndNum=this.scndNum;
//    this.result=result;
//  }
 public add():number{
   this.result=this.frstNum + this.scndNum;
   return this.result;
 }
 public sub():number{
   this.result=this.frstNum - this.scndNum;
   return this.result;
 }
 public mul():number{
   this.result=this.frstNum*this.scndNum;
   return this.result;

 }
 public div():number{
   this.result=this.frstNum/this.scndNum;
    return this.result;
 }

}

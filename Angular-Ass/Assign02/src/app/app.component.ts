import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  private message:string=null;
  private version:number=null;
  private topics:string[]=null;
  public constructor(){
    this.message="Welcome";
    this.version=8;
    this.topics=['dataBinding','forms','Http','Routing'];
  }
  public addTopic(currentTopic:string):boolean{
    if(currentTopic.length==0){
      alert("Please enter title name ");
      return false;
    }
    for(var topic of this.topics){
      if(currentTopic===topic)
      {
        alert("Title already exists");
         return false;
      }
    }
    this.topics.push(currentTopic);
  }
  public deleteTopic(idx:number):void{
    this.topics.splice(idx,1);

  }
  public deleteTopic1(currentTopic:string):void{
    alert("you want to delete item");
    this.topics.splice(this.topics.indexOf(currentTopic),1);
  }
 /* public isNull(currentTopic:string):boolean{
    if(currentTopic=="")
      return true;
    else{
      return false;
    }
  }
  public isExists(currentTopic:string):boolean{
    for(var i=this.topics.length-1;i--;){
      if(this.topics[i]===currentTopic){
        alert("the item "+currentTopic+" is already exists");
        return true;
      }
      else{
        return false;
      }
    }
  } */
  public searchTopic(currentTopic:string):void{
    for(var i=this.topics.length-1;i--;){
      if(this.topics[i]===currentTopic){
        alert("the index of "+currentTopic+" is "+this.topics.indexOf(currentTopic));
      }
    }
    
  }

}
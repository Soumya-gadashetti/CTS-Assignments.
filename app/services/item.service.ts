import { Injectable } from '@angular/core';
import { Item } from '../models/item';
@Injectable({
  providedIn: 'root'
})
export class ItemService {

  // items:Item[]; 
    constructor() {
      // this.items=[
      // {itemId:101,itemName:"top",quantity:10,price:300},
      // {itemId:102,itemName:"dress",quantity:10,price:300},
      // {itemId:103,itemName:"shoe",quantity:10,price:300},
      // ];
     }
  
    //  getAll():Item[]{
    //    return this.items;
    //  }
  
    //  get(Id:number){
    //    return this.items.find((c)=>(c.itemId==Id));
    //  }
  
    //  add(item:Item){
    //    this.items.push(item);
    //  }
  
  //    update(itemId:Items){
  //      let index=this.items.findIndex((c)=>(c.itemId===itemId.itemId));
  //      if(index>-1){
  //        this.items[index]=itemId;
  //      }
  //    }
  
    //  delete(Id:number){
    //    let index=this.items.findIndex((item)=>(item.itemId==Id));
    //    if(index>-1){
    //      this.items.splice(index,1);
    //    }
     }


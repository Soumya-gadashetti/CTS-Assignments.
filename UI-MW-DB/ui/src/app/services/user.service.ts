import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { User } from '../models/user';

@Injectable({
  providedIn: 'root'
})
export class UserService {
  baseUrl:string;

  constructor(private httpClient:HttpClient) {
    this.baseUrl="http://localhost:8085/users";
   }

   getAll() :Observable<User[]>{
     return this.httpClient.get<User[]>(this.baseUrl);
   }

   getAllById(id:number) :Observable<User>{
     return this.httpClient.get<User>(`${this.baseUrl}/${id}`);
   }

   addUser(user:User) : Observable<User>{
     return this.httpClient.post<User>(this.baseUrl + "/users",user);

   }

   updateUser(user:User) : Observable<User>{
      return this.httpClient.put<User>(this.baseUrl,user);
   }

   delete(id:number) :Observable<User>{
     return this.httpClient.delete<User>(`${this.baseUrl + "/users"}/${id}`);
   }
}

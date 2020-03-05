import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { UserListComponent } from './user-list/user-list.component';
import { UserFormComponent } from './user-form/user-form.component';
import { RegisterFormComponent } from './register-form/register-form.component';
import { RegisterListComponent } from './register-list/register-list.component';

const routes: Routes = [
  {path:'',component:UserListComponent},
  {path:'addUser',component:UserFormComponent},
  {path:'editUser/:id',component:UserFormComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

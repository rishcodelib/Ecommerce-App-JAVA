import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AllOrdersComponent } from './component/all-orders/all-orders.component';
import { ContactComponent } from './component/contact/contact.component';
import { ItemCardComponent } from './component/item-card/item-card.component';
import { OrderDetailsComponent } from './component/order-details/order-details.component';
import { SigninComponent } from './component/signin/signin.component';
import { DashboardPageComponent } from './pages/dashboard-page/dashboard-page.component';
import { ErrorPageComponent } from './pages/error-page/error-page.component';
import { HomePageComponent } from './pages/home-page/home-page.component';

const routes: Routes = [
  {
    path: '',
    pathMatch: 'full',
    redirectTo: '/home',
  },
  {
    path: 'home',
    component: HomePageComponent,
  },
  {
    path: 'contact',
    component: ContactComponent,
  },
  {
    path: 'dashboard',
    component: DashboardPageComponent,
  },
  {
    path: 'error',
    component: ErrorPageComponent
  },
  {
    path: 'orders',
    component: OrderDetailsComponent
  },
  {
    path: 'products',
    component: ItemCardComponent
  },
  {
    path: 'transactions',
    component: AllOrdersComponent
  },
  {
    path: 'signin',
    component: SigninComponent
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}

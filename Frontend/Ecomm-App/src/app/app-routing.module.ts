import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AllOrdersComponent } from './component/all-orders/all-orders.component';
import { ContactComponent } from './component/contact/contact.component';
import { ItemCardComponent } from './component/item-card/item-card.component';
import { MessagesComponent } from './component/messages/messages.component';
import { OrderDetailsComponent } from './component/order-details/order-details.component';
import { SettingsComponent } from './component/settings/settings.component';
import { SigninComponent } from './component/signin/signin.component';
import { AllProductPageComponent } from './pages/all-product-page/all-product-page.component';
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
    component: ErrorPageComponent,
  },
  {
    path: 'orders',
    component: OrderDetailsComponent,
  },
  {
    path: 'products',
    component: AllProductPageComponent,
  },
  {
    path: 'transactions',
    component: AllOrdersComponent,
  },
  {
    path: 'signin',
    component: SigninComponent,
  },
  {
    path: 'settings',
    component: SettingsComponent,
  },
  {
    path: 'messages',
    component: MessagesComponent,
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}

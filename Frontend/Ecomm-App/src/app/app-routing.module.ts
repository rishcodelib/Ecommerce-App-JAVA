import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddProductComponent } from './component/add-product/add-product.component';
import { AllOrdersComponent } from './component/all-orders/all-orders.component';
import { AllUsersComponent } from './component/all-users/all-users.component';
import { CartComponent } from './component/cart/cart.component';
import { CheckoutComponent } from './component/checkout/checkout.component';
import { ContactComponent } from './component/contact/contact.component';
import { ItemCardComponent } from './component/item-card/item-card.component';
import { MessagesComponent } from './component/messages/messages.component';
import { OrderDetailsComponent } from './component/order-details/order-details.component';
import { ProductDetailComponent } from './component/product-detail/product-detail.component';
import { SettingsComponent } from './component/settings/settings.component';
import { SigninComponent } from './component/signin/signin.component';
import { TransactionsComponent } from './component/transactions/transactions.component';
import { UserDetailComponent } from './component/user-detail/user-detail.component';
import { WalletComponent } from './component/wallet/wallet.component';
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
    component: AllOrdersComponent,
  },
  {
    path: 'products',
    component: AllProductPageComponent,
  },
  {
    path: 'transactions',
    component: TransactionsComponent,
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
  {
    path: 'addProducts',
    component: AddProductComponent,
  },
  {
    path: 'wallet',
    component: WalletComponent,
  },
  {
    path: 'product-detail/:id',
    component: ProductDetailComponent,
  },
  {
    path: 'checkout',
    component: CheckoutComponent,
  },
  {
    path: 'cart',
    component: CartComponent,
  },
  {
    path: 'order-detail',
    component: OrderDetailsComponent,
  },
  {
    path: 'all-users',
    component: AllUsersComponent,
  },
  {
    path: 'user-detail/:id',
    component: UserDetailComponent,
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}

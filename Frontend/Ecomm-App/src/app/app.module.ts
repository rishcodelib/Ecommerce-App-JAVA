import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavbarComponent } from './component/navbar/navbar.component';
import { HomePageComponent } from './pages/home-page/home-page.component';
import { ErrorPageComponent } from './pages/error-page/error-page.component';
import { DashboardPageComponent } from './pages/dashboard-page/dashboard-page.component';
import { FooterComponent } from './component/footer/footer.component';
import { ItemCardComponent } from './component/item-card/item-card.component';
import { SigninComponent } from './component/signin/signin.component';
import { SignupComponent } from './component/signup/signup.component';
import { OrderDetailsComponent } from './component/order-details/order-details.component';
import { AllOrdersComponent } from './component/all-orders/all-orders.component';
import { AlertComponent } from './component/alert/alert.component';
import { PageinationComponent } from './component/pageination/pageination.component';
import { NavbarSideComponent } from './component/navbar-side/navbar-side.component';
import { ImageRoundComponent } from './component/image-round/image-round.component';
import { ContactComponent } from './component/contact/contact.component';
import { ProductDetailComponent } from './component/product-detail/product-detail.component';
import { CheckoutComponent } from './component/checkout/checkout.component';
import { BreadcrumbComponent } from './component/breadcrumb/breadcrumb.component';
import { SettingsComponent } from './component/settings/settings.component';
import { MessagesComponent } from './component/messages/messages.component';
import { AddProductComponent } from './component/add-product/add-product.component';
import { CartComponent } from './component/cart/cart.component';

import { HttpClientModule } from '@angular/common/http';
import { AllProductPageComponent } from './pages/all-product-page/all-product-page.component';

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    HomePageComponent,
    ErrorPageComponent,
    DashboardPageComponent,
    FooterComponent,
    ItemCardComponent,
    SigninComponent,
    SignupComponent,
    OrderDetailsComponent,
    AllOrdersComponent,
    AlertComponent,
    PageinationComponent,
    NavbarSideComponent,
    ImageRoundComponent,
    ContactComponent,
    ProductDetailComponent,
    CheckoutComponent,
    BreadcrumbComponent,
    SettingsComponent,
    MessagesComponent,
    AddProductComponent,
    CartComponent,
    AllProductPageComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

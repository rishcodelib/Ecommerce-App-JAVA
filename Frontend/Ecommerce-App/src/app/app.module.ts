import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { HomeComponent } from './components/home/home.component';
import { AboutComponent } from './components/about/about.component';
import { FooterComponent } from './components/footer/footer.component';
import { SigninComponent } from './components/signin/signin.component';
import { CartComponent } from './components/cart/cart.component';
import { ProductComponent } from './components/product/product.component';
import { UserComponent } from './components/user/user.component';
import { OrderComponent } from './components/order/order.component';
import { ConfirmComponent } from './components/confirm/confirm.component';
import { CheckoutComponent } from './components/checkout/checkout.component';
import { ProductDetailComponent } from './components/product-detail/product-detail.component';
import { ErrorComponent } from './components/error/error.component';
import { RegisterComponent } from './components/register/register.component';


@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    AboutComponent,
    FooterComponent,
    SigninComponent,
    CartComponent,
    ProductComponent,
    UserComponent,
    OrderComponent,
    ConfirmComponent,
    CheckoutComponent,
    ProductDetailComponent,
    ErrorComponent,
    RegisterComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    NgbModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

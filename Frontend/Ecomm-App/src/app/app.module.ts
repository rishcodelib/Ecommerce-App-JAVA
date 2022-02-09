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
    PageinationComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

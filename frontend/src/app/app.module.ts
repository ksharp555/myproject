import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule} from '@angular/common/http';

import { AppComponent } from './app.component';
import { RestaurantEntryComponent } from './restaurant-entry/restaurant-entry.component';

import { StarRatingModule } from 'angular-star-rating';
import {HttpModule} from '@angular/http';
import {RestaurantService} from './restaurant-entry/restaurant.service';

@NgModule({
  declarations: [
    AppComponent,
    RestaurantEntryComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    HttpModule,
    StarRatingModule.forRoot()
  ],
  providers: [RestaurantService],
  bootstrap: [AppComponent]
})
export class AppModule { }

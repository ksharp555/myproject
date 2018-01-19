import { Injectable } from '@angular/core';
import {environment } from '../../environments/environment';
import 'rxjs/add/operator/toPromise';
import { Restaurant } from '../../shared/restaurant';
// import { Restaurants } from './mock-restaruants';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import {reject} from 'q';
import { Http } from '@angular/http';

@Injectable()
export class RestaurantService {
  restaurants: Restaurant[];

  constructor(private http: Http) {}

  getRestaurants(): Promise<Restaurant[]> {
      return this.http.get(environment.apiUrl + '/rest/restaurants/all')
        .toPromise()
        .then(res => res.json() as Restaurant[])
        .catch(this.handleError);
  }

  private handleError(error: any): Promise<any> {
    console.error('An error occurred', error); // for demo purposes only
    return Promise.reject(error.message || error);
  }
}

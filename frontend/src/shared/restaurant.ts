import { Address } from './address';
import { Grade } from './grade';


export class Restaurant {
  address: Address;
  borought: string;
  cuisine: string;
  grades: Grade[];
  name: string;
  restaurant_id: number;
}

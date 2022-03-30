import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root',
})
export class LocaldataService {
  constructor() {}

  getLocalCustDetail() {
    const data: any = localStorage.getItem('address');
    const jsonData: any = JSON.parse(data);
    // console.log(jsonData)
    return jsonData;
  }
  removeLocalCustDetail() {
    localStorage.removeItem('address');
  }
}

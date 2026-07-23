import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class StudentService {
  getStudents() {
    return [
      { id: 1, name: 'Alex', course: 'Java FSE' },
      { id: 2, name: 'Sam', course: 'Angular' }
    ];
  }
}

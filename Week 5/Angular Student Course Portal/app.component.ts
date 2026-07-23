import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  template: `
    <h1>Student Course Portal</h1>
    <app-student-list></app-student-list>
  `
})
export class AppComponent {
  title = 'Student Portal';
}

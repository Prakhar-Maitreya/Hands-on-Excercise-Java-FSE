import { Component, OnInit } from '@angular/core';
import { StudentService } from './student.service';

@Component({
  selector: 'app-student-list',
  template: `
    <h2>Students</h2>
    <ul>
      <li *ngFor="let s of students">{{ s.id }} - {{ s.name }} ({{ s.course }})</li>
    </ul>
  `
})
export class StudentListComponent implements OnInit {
  students: any[] = [];

  constructor(private service: StudentService) {}

  ngOnInit() {
    this.students = this.service.getStudents();
  }
}

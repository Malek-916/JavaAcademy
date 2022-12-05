import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AllNotaComponent } from './all-nota.component';

describe('AllNotaComponent', () => {
  let component: AllNotaComponent;
  let fixture: ComponentFixture<AllNotaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AllNotaComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AllNotaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ImageRoundComponent } from './image-round.component';

describe('ImageRoundComponent', () => {
  let component: ImageRoundComponent;
  let fixture: ComponentFixture<ImageRoundComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ImageRoundComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ImageRoundComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

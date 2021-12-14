import processing.core.PApplet;

public class Sketch extends PApplet {

  public void settings() {
    // put your size call here.
    size(500, 500);
  }

  public void setup() {
    background(70, 255, 240);

  }
  public void draw() {

    //house
    fill(201, 242, 53);
    strokeWeight(2);
    rect(100, 300, 230, 100);
    //grass
    fill(58, 235, 52);
    rect(0,400,500, 100);

    //roof
    fill(79, 1, 1);
    strokeWeight(2);
    stroke(0, 0, 0);
    fill(222, 158, 113);
    triangle(200, 100, 375, 300, 25, 300);

    //sun
    fill(237, 215, 12);
    ellipse(400, 100, 100, 100);

  }

  // define other methods down here.
}
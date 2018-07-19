PImage catPic;
int xPos=354;
int yPos=458;
int accel=5;
void setup() {
  size(800, 800);
  catPic = loadImage("cat.jpg");
  catPic.resize(800, 800);
  background(catPic);
}
void draw() {
  if (mousePressed) {
    println("Mouse’s x-position: " + mouseX + "\n" + "Mouse’s y-position: " + mouseY + "\n");
  }
  noStroke();
  ellipse(xPos, yPos, 70, 80);

  ellipse(xPos+153, yPos-29, 70, 80);
  fill(#FC0505);
}
void keyPressed() {

  yPos+=accel;
  xPos+=accel;
  accel+=2;
  if (yPos>800) {
    background(catPic);
    xPos=354;
    yPos=458;
    accel=5;
  }
  
 
}
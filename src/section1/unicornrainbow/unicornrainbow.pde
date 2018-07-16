PImage rainbow;
PImage unicorn;

void setup() {
  size(1000,500);  
  // 1. Find an image of a rainbow, save it, and drop it onto this sketch.
  rainbow = loadImage("4645.png");  // 2. Change this to match your file name.
  rainbow.resize(1000,500);
  // 3. Set the rainbow as the background. Behold the rainbow!
background(rainbow);
  // 4. Find an image of a unicorn, save it, and drop it onto this sketch.  
  unicorn = loadImage("unicorn.png"); // 5. Change this to match your file name.
  unicorn.resize (100,99);
}

void draw() {
  // 6. Draw the unicorn using: image(PImage image, int xPosition, int yPosition)
 background(rainbow);
 image(unicorn,mouseX,mouseY);
  // 7. Change the line above so that the unicorn moves with the mouse.
  // 8. You may want to make your unicorn transparent. See these instructions: bit.ly/pretty-unicorn
  // 9. When the mouse is pressed, reload the rainbow background

 
}
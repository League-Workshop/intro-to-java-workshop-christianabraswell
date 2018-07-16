PImage mustache;
PImage friends;
void setup(){
  friends=loadImage("image.png");
size(700,700);
friends.resize(700,700);
background(friends);
mustache=loadImage("mustache.png");
mustache.resize(30,10);
}
void draw(){
  background(friends);
  if(mousePressed){
  image(mustache,mouseX,mouseY);
  }
}
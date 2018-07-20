int foodX = 100;
int foodY = 20;
void setup(){
size(800,800);
}


void draw(){
background(141,233,237);
fill(#FA0303, #7AFC97, #90C3FF);
noStroke();
ellipse(foodX, foodY, 20, 20);
foodY+=10;
if (foodY==height){
foodY=0;
foodX = (int) random(width-20);
}
}
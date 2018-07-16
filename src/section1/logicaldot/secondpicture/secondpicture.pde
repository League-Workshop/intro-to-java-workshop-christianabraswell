void setup (){
  size(1000,1000);
}
void draw(){
  fill(#FFEF76);
  if(mousePressed){
    fill(#7FA2FC);
  }
  ellipse(mouseY,mouseX,100,100);
}
  
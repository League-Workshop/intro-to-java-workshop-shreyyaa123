PImage rainbow;
PImage unicorn;
void setup(){
rainbow=loadImage("rainbow.png");
unicorn=loadImage("unicorn.jpeg");
size(1000,500);
background(rainbow);
}
void draw(){
  if(mousePressed){
    background(255,255,255);
    background(rainbow);
    image(unicorn,mouseX,mouseY);
  }
}
 
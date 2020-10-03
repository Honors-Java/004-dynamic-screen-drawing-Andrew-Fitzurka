//Variable used to change the shape drawn
var x = 1;

void setup() {
	size(300, 300);
  background(200);
}

void draw(){
    
}

void mousePressed() {
//Randomizes line stroke color
  stroke(random(0, 255), random(0, 255), random(0, 255));
  if(stroke == 200, 200, 200){
    stroke(random(0, 255), random(0, 255), random(0, 255));
  }
  fill(random(0, 255), random(0, 255), random(0, 255));
  if(fill == 200, 200, 200){
    fill(random(0, 255), random(0, 255), random(0, 255));
  }
}
void mouseMoved() {
//Draws shape that follows the mouse as it moves (shape drawn depends on value of x)
if(x == 1){
  line(pmouseX, pmouseY, mouseX, mouseY);
}else if(x == 2){
  rectMode(CENTER);
  rect(pmouseX, pmouseY, 10, 10);
}else if(x == 3){
  ellipseMode(CENTER);
  ellipse(pmouseX, pmouseY, 10, 10);
}else if(x == 4){
  triangle(pmouseX, pmouseY - 5, pmouseX - 5, pmouseY + 5, pmouseX + 5, pmouseY + 5);
}
}

void mouseReleased() {
//Resets line width to default
    strokeWeight(1);
    stroke(random(0, 255), random(0, 255), random(0, 255));
}

void keyPressed() {
//Resets canvas & changes value of the variable 
  background(200, 200, 200);

if(x == 1) {
  x = 2;
}else if(x == 2){
  x = 3;
}else if(x == 3){
  x = 4;
}else if(x == 4){
  x = 1;
}
}

void mouseDragged() {
//Makeshift eraser 
  stroke(200);
  strokeWeight(10);
  line(pmouseX, pmouseY, mouseX, mouseY);
}
//dont forget to add mouse and keypressed interaction functions
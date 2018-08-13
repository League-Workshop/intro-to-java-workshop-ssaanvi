PImage cat;
int var=15;
int speed=3;
int vary=250;
int speedy=3;
void setup() {
  print("HI!");
  print(var);
  size(500, 500);
cat=loadImage("kitty.jpg");
}

void draw() {
  background(#6407E0);
  print("draw");
  image(cat,var, vary, 110, 65);
  var=var+speed;
  vary=vary+speedy;
  if (vary<0){
    speedy=-speedy;
    
  }
  if (var>=width-110) {
    speed=-speed;
  }
  if (var<0) {
    speed=-speed;
  }
  if (vary>height-65){
    speedy =-speedy;
  }




  
  }

int intensidad;
int led1 = 12;
int led2 = 11;
int led3 = 10;
int led4 = 9;
int led5 = 8;
int led6 = 7;
int led7= 6;
int entrada1=2;
int entrada=0;
void setup() {
  // put your setup code here, to run once:

pinMode(led1, OUTPUT);
pinMode(led2, OUTPUT);
pinMode(led3, OUTPUT);
pinMode(led4, OUTPUT);
pinMode(led5, OUTPUT);
pinMode(led6, OUTPUT);
pinMode(entrada1,INPUT);
pinMode(led7, OUTPUT);
Serial.begin(9600);

}

void loop() {
  // put your main code here, to run repeatedly:
digitalWrite(led1, LOW);
digitalWrite(led2, LOW);
digitalWrite(led3, LOW);
digitalWrite(led4, LOW);
digitalWrite(led5, LOW);
digitalWrite(led6, LOW);


entrada= digitalRead(entrada1);
//Serial.println(entrada);
if (entrada==HIGH){
  digitalWrite(led7, HIGH);
   
}

else {
  digitalWrite(led7, LOW);
}


intensidad = analogRead(A0);
Serial.println(intensidad);
if(intensidad > 60){
digitalWrite(led1, HIGH);
}
if(intensidad > 170){
digitalWrite(led2, HIGH);
}
if(intensidad > 340){
digitalWrite(led3, HIGH);
}
if(intensidad > 510){
digitalWrite(led4, HIGH);
}
if(intensidad > 680){
digitalWrite(led5, HIGH);
}
if(intensidad > 850){
digitalWrite(led6, HIGH);
}


}

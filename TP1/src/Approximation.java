class Approximation {
void principal () {
double x;
double f;
x = 4;
f = x * x * x + x * x;
while (f < 100) {
x = x + 0.01;
f = x * x * x + x * x;
}
System.out.println ("f(" + x + ") = " + f);
}
}

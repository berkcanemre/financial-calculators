Financial Calculators

Screenshots:
*Home screen: [img.png](Screenshots/home.png)
*Calculator-1-Mortgage Calculator:[img.png](Screenshots/clc1.png)
*Calculator-2-Future Value Calculator:[img.png](Screenshots/clc2.png)
*Calculator-3-Present Value Calculator:[img.png](Screenshots/clc3.png)
*Error: [img.png](Screenshots/error.png)

Interesting Piece of Code:
int daysPerYear = 365;
double futureValue = principal * Math.pow(1 + (annualRate / daysPerYear), daysPerYear * years);

I have used this code to calculate present value, and it requires a lot of effort to 
successfully calculate this. So this one was a little difficult to comprehend for me.
The internet says that: Instead of just compounding annually,  using daily periods makes the result more accurate.
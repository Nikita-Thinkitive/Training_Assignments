console.log("Hello world");



var str: string="Hello TYPESCRIPT";
console.log("***STRING OPERATIONS ***");
console.log("\n"+str);
console.log("\nUPPERCASE STRING: "+str.toUpperCase());
console.log("\nLOWER CASE: "+str.toLowerCase());
console.log("\n CHAR AT :  "+str.charAt(0));


var y: number=10;
var x: number=99;
console.log("\n***ARITHMATIC FUNCTIONS***\n");
console.log("Number1:"+x);
console.log("Number2:"+y);
var sub:number=x-y;
var mult:number=x*y;
var div:number=x/y;
console.log("\nADDITION:"+ x+y);
console.log("\nSUBSTRACTION:"+sub );
console.log("\nMULTIPLICATION:"+mult);
console.log("\nDIVISION:"+div);

console.log("\n***LOOPING***");

if(x>y)
{
    console.log(x+" is greater than "+y);
}
else{
    console.log(x+" is Lesser than "+y);
}

console.log("\n***FACTORIAL OF NUMBER***");
var num:number=5;
var ans:number=1;

var i:number=1;
while( i<=num)
{
    ans=ans*i;
    i++;
}
console.log("While Loop Factorial of "+num+ " is "+ans);
var fact:number=1;
for( var j=1;j<=num;j++)
{
    fact=fact*j;
}

console.log("For Loop Factorial of "+num+ " is "+fact);

export function hello()
{
return "\n***CALLLING FROM FUNCTION***";
}

console.log(hello());  //calling function
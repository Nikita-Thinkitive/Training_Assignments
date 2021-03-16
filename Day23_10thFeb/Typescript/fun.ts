//EXPORTING FUNCTION TO NEXT FILE

export module demo{

    var x:number=12;
    var y:number=3;
    console.log(x+y);
    console.log(x-y);
    console.log(x*y);
    console.log(x/y);
    console.log(x%y);
    console.log(x>y);
    console.log(x<y);
    console.log(x==y);
    
    var s:string="Hello world";
    console.log(s.toUpperCase());
    console.log(s.toLowerCase());
    console.log(s.charAt(0))
    
    if(x>y){
        console.log("greater");
    }else{
        console.log("lesser");
    }
    
    
    var i:number=1;
    while(i<=10){
        console.log(i);
        i++;
    }
    
    for(i=1;i<=10;i++){
        console.log("For loop:"+i);
    }
    
    export function hello(){
        return "hello";
    }
    
    export function add(){
        return "hello";
    }
    
    export function sub(){
        return "hello";
    }
    
    export function div(){
        return "hello";
    }
    
    }
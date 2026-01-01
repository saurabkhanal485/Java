class CommandLine2{
public static void PrintTable(int n){
for(int i=1;i<=10;i++){
System.out.println(n+"*"+i+"="+(n*i));
}
}

public static void main(String [] args){
int k=Integer.parseInt(args[0]);
if(args.length<=0){
System.out.println("Error:pass min 1 parameter");
}else{
PrintTable(k);
}
}
}
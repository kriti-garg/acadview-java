public class PatternAbc{
	void print(){
	int count=97;
	for(int i=1;i<=3;i++){
		count=97;
		for(int j=1;j<=3;j++){
			if(j<=i){
        System.out.print((char)count);
        count++;
    }
    else
    	System.out.print(" ");
	}
	System.out.println("");
}
}
public static void main(String[] args) {
		PatternAbc obj = new PatternAbc();
		obj.print();
	}
}
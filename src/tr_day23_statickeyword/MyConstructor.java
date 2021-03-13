package tr_day23_statickeyword;

public class MyConstructor {
	
    int x =3;
    int y =5;
    
    MyConstructor (){ //parametresiz calistiginda 
        x+=1;                                   //4. satir  **x'in degeri 3 oldugundan, 3+1=4 olur              
        System.out.println("-x" + x); //**-x4 //5. satir  x degiskeni 4 oldugu icin -x4 olur
    }
    
    MyConstructor (int i){
        this ();                                //3. satir da deger olmadigi icin 4. satira gonderiyor
        
        this.y=i;                               //6. satir **y 3 degeri atandi
        this.x+=y;                                   //7. satir **eski deger 4+3=7 oldu 
        System.out.println("-x" + x);         //yazdirinca da -x7 olur
    }
    
    MyConstructor (int i , int i2){
        this(3);                                //2. satir **iki argument oldugu icin buraya gelir
                                                //ancak 2. satirda tek int degeri olan 3. satira gonderiyor deger 3()
        this.x-=4;                              //8. satir **x'e yeni deger ataniyor eski deger 7-4=3 olur
        System.out.println("-x" + x);         //yazdirinca -x3 olur
    }
    public static void main(String[] args) {
        MyConstructor mc1 =new MyConstructor (4,3); //1. satir*ilk calisir
        
        //x=+1; bu sadece x'i degistirir,
        //this x-=4;  objenin x'ini degistirir
    }
}

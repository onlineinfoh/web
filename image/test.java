package image;
public class test {
private int AA;
private int BB;
private int CC;
private int DD;
private int EE;
private int FF;
private int GG;
public test(int a, int b, int c, int d, int e, int f, int g){
    AA = a;
    BB = b;
    CC = c;
    DD = d;
    EE = e;
    FF = f;
    GG = g;
}
    public String toAnswer(int a, int b, int c, int d, int e, int f, int g){
        int arr[] = {AA, BB, CC, DD, EE, FF, GG};
        int A = 0;
        int B = 0;
        int C = 0;
    outerloop:
    for(int x = 0; x< 5; x++){
        for(int i = 0+x; i<7; i++){
          for(int j = 1+x; j<7; j++){
            for(int h = 2+x; h<7; h++){
                int arr2[] = new int[7-3];               

                for (int aa = 0, bb = 0; aa<(7-3)-1;aa++){
                    if (arr[aa] != arr[i] &&arr[aa] != arr[j] && arr[aa]!=arr[h]){
                        arr2[bb] = arr[aa];
                    }
                    bb++;
                }
                //
                for (int cc = 0; cc<4; cc++){
                    if(arr2[cc] == arr[i]+arr[j]){
                        int arr3[]= new int[3];
                        for(int aaa = 0, bbb = 0; aaa<2;aaa++){
                            if(arr2[aaa]!=arr[cc]){
                            arr3[bbb] = arr2[aaa];
                            }
                            bbb++;
                        }
                        for (int ccc = 0; ccc<3; ccc++){
                            if(arr3[ccc] == arr[h]+arr[j]){//
                               int arr4[]= new int[2];
                               for(int aaaa = 0, bbbb = 0; aaaa<3;aaaa++){
                                if(arr3[aaaa] != arr3[ccc]){
                                arr4[bbbb] = arr3[aaaa];
                                }
                                bbbb++;
                            }
                        //here
                        for (int cccc = 0; cccc<2; cccc++){
                        if( arr4 [cccc] == arr[h]+arr[i]){
                         A = arr[i];
                         B = arr[j];
                         C = arr[h];
                    }
                    break outerloop;
                }//here
                        }//     
            }  
          }  
        }
        //4 for loops
                }
            }
        }
    }
    
    if (A>B){
        int holder;
        holder = A;
        A = B;
        B = holder;
    }
    if (B>C){
        int holder2;
        holder2 = B;
        B = C;
        C = holder2;
    }
    if (A>B){
        int holder3;
        holder3 = A;
        A = B;
        B = holder3;
    }
    return String.valueOf(A)+" "+String.valueOf(B)+" "+String.valueOf(C);
    }
    public static void main(String[] args) {
        test one = new test(2, 2, 11, 4, 9, 7, 9);
        System.out.println(one.toAnswer(2, 2, 11, 4, 9, 7, 9));
    } 
}
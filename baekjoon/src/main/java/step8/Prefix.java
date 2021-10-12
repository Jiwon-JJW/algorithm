package step8;

import java.io.*;

import java.util.*;



public class Prefix {

    public static void main(String ar[]) throws IOException{

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String string = null;

        char token[];

        Prefix prefix = new Prefix();

//사용자로부터 입력 받음

        System.out.print("표기식 기입 : ");

        string = in.readLine();

        token = string.toCharArray();



//변환과정.

        prefix.convertPrefix(token);

        prefix.printAndSave();//출력



//연산과정.

        prefix.operation();

        prefix.print();

    }



    private Stack convertSaveStack;

    private Stack operationStack;

    private Stack tokenStack;

    private BufferedReader in;

    private StackData stackData;



    private final char[][] PRIORITYOPERATOR ={//연산자 우선순위

            {')','^','*','/','+','-','('},

            {'0','3','2','2','1','1','?'},

            {'4','4','2','2','1','1','?'}

    };



    public Prefix(){//생성자

        tokenStack = new Stack();//token을 저장할 스택

        convertSaveStack = new Stack();//변환내용 저장 스택

        operationStack = new Stack();//연산자 스택

        in = new BufferedReader(new InputStreamReader(System.in));

    }



    public void convertPrefix(char[] token){

        this.tokenStack.push(new StackData('@'));//@이이면 완료.

        this.operationStack.push(new StackData('@'));//연산자 스택



        for(int i=0; i<token.length; i++){//token저장.

            tokenStack.push(new StackData(token[i]));

        }



        while(true){//영원토록...

            stackData = (StackData)tokenStack.pop();

            switch(stackData.getChar()){

                case '@':

                    process(stackData.getChar());

                    return;

                case ')':

                case '^':

                case '*':

                case '/':

                case '+':

                case '-':

                    process(stackData.getChar());// ),^,*,/,+,-일 경우 실행.

                    break;

                case '(':

                    process(stackData.getChar());

                    break;

                default :

                    this.saveToStack(stackData.getChar());

                    break;

            }

        }



    }



    private int getICP(char ch){

        for(int i=0; i<7; i++){

            if(this.PRIORITYOPERATOR[0][i] == ch){

                return (int)this.PRIORITYOPERATOR[2][i]-48;

            }

        }

        return -1;

    }

    private int getISP(char ch){

        for(int i=0; i<7; i++){

            if(this.PRIORITYOPERATOR[0][i] == ch){

                return this.PRIORITYOPERATOR[1][i]-48;

            }

        }

        return -1; // 파라미터문자가 '@' 일경우 -1리턴.

    }

    public void operation(){//연산작업.

        this.convertSaveStack.clear();//연산된 내용을 저장할 공간을 비움.

        while(true){//영원토록...

            this.stackData = (StackData)this.tokenStack.pop();

            switch(this.stackData.getChar()){

                case '@':

                    return;

                case '^':

                case '*':

                case '/':

                case '+':

                case '-':

                    this.process1(this.stackData.getChar());

                    break;

                default:

                    System.out.print(this.stackData.getChar());

                    System.out.print("에 들어갈 값은? : ");

                    try {

                        this.saveToStack(Integer.parseInt(in.readLine()));

                    } catch (IOException e) {}

            }

        }

    }



    public void print(){

        System.out.print("연산결과 : ");

        System.out.println(((StackData)this.convertSaveStack.pop()).getInt());

    }



    public void printAndSave(){//출력과 저장.

        System.out.print("Prefix : ");

        this.tokenStack.push(new StackData('@'));

        while(!this.convertSaveStack.isEmpty()){

//stack는 최초 TOKEN을 저장했던 스택으로서 변환과정에서 전부 사용하여 빈 공간이다.

            this.tokenStack.push(new StackData(((StackData)convertSaveStack.peek()).getChar()));

/**

 그러므로 후위표기식으로 변환된 내용을 저장함과 동시에 연산시 사용하기위해

 stack2에 저장하였다.

 */

            System.out.print(((StackData)convertSaveStack.pop()).getChar());

        }//while문 종료

        System.out.println("");

    }



    private void process(char ch) {

        if(ch == '('){

            while(((StackData)operationStack.peek()).getChar() != ')'){

                stackData = (StackData)this.operationStack.pop();

                this.saveToStack(stackData.getChar());

            }//while문 종료

            this.operationStack.pop(); //')'버림.

        }else if(ch == '@'){

            while(((StackData)operationStack.peek()).getChar() != '@'){

                this.saveToStack(((StackData)operationStack.pop()).getChar()); //빠져나감

            }//while문 종료



        }else{

            while(getISP(((StackData)operationStack.peek()).getChar()) >= getICP(ch)){

                this.saveToStack(((StackData)this.operationStack.pop()).getChar());

            }//while문 종료

            operationStack.push(new StackData(ch));

        }

    }



    private void process1(char ch){

        int tmp1 = ((StackData)this.convertSaveStack.pop()).getInt();

        int tmp2 = ((StackData)this.convertSaveStack.pop()).getInt();



        switch(ch){

            case '^':

                tmp1<<=tmp2-1;

                break;

            case '*':

                tmp1 *= tmp2;

                break;

            case '/':

                tmp1 /= tmp2;

                break;

            case '+':

                tmp1 += tmp2;

                break;

            case '-':

                tmp1 -= tmp2;



        }

        this.convertSaveStack.push(new StackData(tmp1));



    }



    private void saveToStack(char ch){//(변환내용 저장스택)에 변환된 내용 저장.

        this.convertSaveStack.push(new StackData(ch));

    }



    private void saveToStack(int integer){//integer 저장 스택

        this.convertSaveStack.push(new StackData(integer));

    }

}



class StackData{

    private char ch;

    private int integer;

    private String str;

    public StackData(){

        str = null;

    }

    public StackData(char ch){

        this.ch = ch;

    }

    public StackData(int integer){

        this.integer = integer;

    }

    public StackData(String str){

        this.str = str;

    }

    public char getChar(){

        return this.ch;

    }

    public int getInt(){

        return this.integer;

    }

    public String getStr(){

        return this.str;

    }

}

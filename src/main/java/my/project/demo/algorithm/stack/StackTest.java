package com.example.demo.algorithm.stack;

import java.util.Iterator;
import java.util.Stack;

public class StackTest {

    public static void main(String[] args) {
        StackTest st = new StackTest();
        st.stackPush();
    }

    // stack 선언
    public void stackCreate() {
        Stack st = new Stack(); // 타입 설정x Object로 선언
        Stack<StackTestClass> demo = new Stack<StackTestClass>(); // class타입으로 선언
        Stack<Integer> i = new Stack<Integer>(); // Integer타입 선언
        Stack<Integer> i2 = new Stack<>(); // 뒤의 타입 생략 가능

        Stack<String> s = new Stack<String>(); // String타입 선언
        Stack<Character> ch = new Stack<Character>(); // Char타입 선언
    }

    // stack 값 추가
    public void stackPush() {
        Stack<String> s = new Stack(); // 타입 설정x Object로 선언

        // Stack 값 추가
        s.push("Hello");

        // World를 반환 -> String
        String world = s.push("World");

        // true를 반환 -> boolean
        boolean bool = s.add("World");

        System.out.println("s = " + s);
        System.out.println("world = " + world);
    }

    // stack 값 삭제
    public void stackPop() {
        Stack<String> s = new Stack<String>();

        // Stack 값 추가
        s.push("Hello");
        s.push("World");

        System.out.println(s); // 결과 출력

        s.pop(); // Stack 값 제거

        System.out.println("s1 = " + s);
        ; // 결과 출력

        s.clear(); // Stack 값 전체 제거

        System.out.println("s2 = " + s);
        ; // 결과 출력System.out.println(s); // 결과 출력
    }

    // stack size
    public void stackSize() {
        Stack<String> s = new Stack<>();

        // Stack 값 추가
        s.push("Hello");

        System.out.println("s.size = " + s.size());

    }

    // stack print
    public void stackPrint() {
        Stack<String> s = new Stack<>();

        // Stack 값 추가
        s.push("Hello");
        s.push("World");

        // firstElement(), lastElement(), peek()을 사용 -> 처음, 마지막, 마지막 값을 불러온다
        System.out.println("처음 값 : " + s.firstElement());
        System.out.println("마지막 값 : " + s.lastElement());
        System.out.println("마지막 값 : " + s.peek());

        // get(i) 메서드를 사용하여 Stack의 Index 값을 출력
        for (int i = 0; i < s.size(); i++) {
            System.out.print(s.get(i) + " ");
        }

        System.out.println();

        // 향상된for문을 사용하여 Stack의 값을 출력
        for (String str : s) {
            System.out.print(str + " ");
        }
        // Iterator를 사용하여 Stack의 값을 출력
        Iterator iter = s.iterator();
        while (iter.hasNext())
            System.out.print(iter.next() + " ");
    }

    // stack 검색
    public void stackSearch() {
        Stack<String> s = new Stack<String>();

        // Stack 값 추가
        s.push("Hello");
        s.push("World");
        s.push("Hello");
        s.push("World");

        System.out.println("값 검색(contains) : " + s.contains("Hello"));
        System.out.println("값 검색(indexOf) : " + s.indexOf("Hello"));
    }

    public void stackEtc() {
        Stack<Integer> stack = new Stack<>(); //int형 스택 선언
        stack.push(1);       // stack에 값 1 추가
        stack.push(2);       // stack에 값 2 추가
        stack.empty();            // stack이 비어있는제 check (비어있다면 true)
        stack.contains(1);        // stack에 1이 있는지 check (있다면 true)
    }

}

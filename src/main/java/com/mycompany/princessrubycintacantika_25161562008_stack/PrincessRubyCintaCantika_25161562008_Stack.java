/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.princessrubycintacantika_25161562008_stack;

/**
 *
 * @author RUBY
 */
public class PrincessRubyCintaCantika_25161562008_Stack {
    
        // === BAGIAN 1: Deklarasi Stack ===
        static String[] stack = new String[10];
        static int top = -1;
        
        // === BAGIAN 2: Operasi Stack ===
        
        // TODO: Lengkapi method push()
        static void push(String tiket) {
            if(top == stack.length - 1) {
                System.out.println("Stack Penuh!");
            }else {
                top++; // naikkan posisi top
                stack[top] = tiket; // masukkan data
            }
        }
        
        // TODO: Lengkapi method pop()
        static String pop() {
            if(isEmpty()) {
                return "Stack kosong!";
            }else {
                String data = stack[top]; // ambil data
                top--; // turunkan data
                return data;
            }
        }
        
        // TODO: Lengkapi method peek()
        static String peek() {
            if(isEmpty()) {
                return "Stack kosong";
            }else {
                return stack[top];
            }
        }
        
        static boolean isEmpty() {
            return top == -1;
        }
       
        static void tampilkanStack() {
            System.out.println("=== Isi Stack (TOP -> BOTTOM) ===");
            for(int i = top; i >= 0; i--) {
                System.out.println("| " + stack[i] + " |");
            }
            System.out.println("================================");
        }
        
        // BONUS NILAI: Method hitung total:
        static void hitungTotal() {
            int total = 0;
            
            for(int i = 0; i <= top; i++) {
                // ambil angka setelah "Rp"
                String hargaStr = stack[i].split("Rp")[1].replace(".", "");
                int harga = Integer.parseInt(hargaStr);
                total += harga;
            }
            System.out.println("Total transaksi: Rp" + String.format("%,d",total).replace(',', '.'));
        }
        
        // BAGIAN 3: Main Program ===
        public static void main(String[] args) {
            
            //TODO: push 3 transaksi berikut ke dalam stack:
            push("Tiket-A01: Avengers Rp50.000");
            push("Tiket-B02: Interstellar Rp45.000");
            push("Tiket-C03: Inception Rp45.000");
            
            tampilkanStack();
            
            // BONUS NILAI: tampilkan total transaksi
            hitungTotal();
            
            // TODO: tampilkan tiket paling teratas (peek)
            System.out.println("Tiket terakhir masuk: " + peek());
            
            // TODO: batalkan 1 transaksi teratas (pop) dan tampilkan
            System.out.println("Tiket dibatalkan: " + pop());
            
            tampilkanStack();
        }
}


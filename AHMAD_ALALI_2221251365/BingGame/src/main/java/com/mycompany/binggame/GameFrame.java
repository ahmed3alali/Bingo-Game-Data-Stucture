/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.binggame;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import static java.lang.Math.random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.Set;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class GameFrame extends javax.swing.JFrame {

    /**     
     * Creates new form GameFrame
     */
    public GameFrame(String name1, String name2) {

        initComponents();
    this.setLocationRelativeTo(null);
        FirstPlayerLabel.setText(name1);
        SecondPlayerLabel.setText(name2);
      
        FRfc.setText("");
        SRfrthc.setText("");
        SRsc.setText("");
        THRsc.setText("");
        FRthc.setText("");
        fRFC_C12.setText("");
        SRsvnthc.setText("");
        SRsxthc.setText("");
        THRfrthc.setText("");
        FRethc.setText("");
        fRFC_C2.setText("");
        FRsvnthc.setText("");
        FRffthc.setText("");
        THRethc.setText("");
        THRsxthc.setText("");
        THRnthc.setText("");
        fRFC_C4.setText("");
        THRsvnthc.setText("");
        SRffthc.setText("");
        THRthc.setText("");
        THRffthc.setText("");

        SRfc.setText("");
        THRfc.setText("");
        FRfrthc.setText("");
        SRfrthc.setText("");
        FRnthC.setText("");
        FRsc.setText("");
        SRsc.setText("");
        THRsc.setText("");
        FRsxthc.setText("");

        SRthc.setText("");
        SRethc.setText("");

        FRsxthc.setText("");
        SRnthc.setText("");

        FRthrc_2.setText("");
        SRthrc_2.setText("");
        THRthrc_2.setText("");
        FRfrthc_2.setText("");
        SRfrthc_2.setText("");
        THRfrthc_2.setText("");
        FRffthc_2.setText("");
        SRffthc_2.setText("");
        THRfthc_2.setText("");
        FRsxthc_2.setText("");
        jLabel2.setText("");
        SRsxthc_2.setText("");
        THRsxthc_2.setText("");
        FRsvnthc_2.setText("");
        SRsvnthc_2.setText("");
        THRsvnthc_2.setText("");
        FRethc_2.setText("");
        SRethc_2.setText("");
        THRethc_2.setText("");
        
        FRfc_2.setText("");
        SRfc_2.setText("");
        THRfc_2.setText("");
        FRsc_2.setText("");
        SRsc_2.setText("");
        THRsc_2.setText("");
FRnthc_2.setText("");
SRnthc_2.setText("");
THRnthc_2.setText("");


 bingoCardLabelsC1= new JLabel[3][9]; 

// Populate the array with your JLabels
bingoCardLabelsC1[0][0] = FRfc;
bingoCardLabelsC1[0][1] = FRsc;
bingoCardLabelsC1[0][2] = FRthc;
bingoCardLabelsC1[0][3] = FRfrthc;
bingoCardLabelsC1[0][4] = FRffthc;
bingoCardLabelsC1[0][5] = FRsxthc;
bingoCardLabelsC1[0][6] = FRsvnthc;
bingoCardLabelsC1[0][7] = FRethc;
bingoCardLabelsC1[0][8] = FRnthC;

bingoCardLabelsC1[1][0] = SRfc;
bingoCardLabelsC1[1][1] = SRsc;
bingoCardLabelsC1[1][2] = SRthc;
bingoCardLabelsC1[1][3] = SRfrthc;
bingoCardLabelsC1[1][4] = SRffthc;
bingoCardLabelsC1[1][5] = SRsxthc;
bingoCardLabelsC1[1][6] = SRsvnthc;
bingoCardLabelsC1[1][7] = SRethc;
bingoCardLabelsC1[1][8] = SRnthc;

bingoCardLabelsC1[2][0] = THRfc;
bingoCardLabelsC1[2][1] = THRsc;
bingoCardLabelsC1[2][2] = THRthc;
bingoCardLabelsC1[2][3] = THRfrthc;
bingoCardLabelsC1[2][4] = THRffthc;
bingoCardLabelsC1[2][5] = THRsxthc;
bingoCardLabelsC1[2][6] = THRsvnthc;
bingoCardLabelsC1[2][7] = THRethc;
bingoCardLabelsC1[2][8] = THRnthc;


bingoCardLabelsC2= new JLabel[3][9]; 


bingoCardLabelsC2[0][0] = FRfc_2;
bingoCardLabelsC2[0][1] = FRsc_2;
bingoCardLabelsC2[0][2] = FRthrc_2;
bingoCardLabelsC2[0][3] = FRfrthc_2;
bingoCardLabelsC2[0][4] = FRffthc_2;
bingoCardLabelsC2[0][5] = FRsxthc_2;
bingoCardLabelsC2[0][6] = FRsvnthc_2;
bingoCardLabelsC2[0][7] = FRethc_2;
bingoCardLabelsC2[0][8] = FRnthc_2;

bingoCardLabelsC2[1][0] = SRfc_2;
bingoCardLabelsC2[1][1] = SRsc_2;
bingoCardLabelsC2[1][2] = SRthrc_2;
bingoCardLabelsC2[1][3] = SRfrthc_2;
bingoCardLabelsC2[1][4] = SRffthc_2;
bingoCardLabelsC2[1][5] = SRsxthc_2;
bingoCardLabelsC2[1][6] = SRsvnthc_2;
bingoCardLabelsC2[1][7] = SRethc_2;
bingoCardLabelsC2[1][8] = SRnthc_2;

bingoCardLabelsC2[2][0] = THRfc_2;
bingoCardLabelsC2[2][1] = THRsc_2;
bingoCardLabelsC2[2][2] = THRthrc_2;
bingoCardLabelsC2[2][3] = THRfrthc_2;
bingoCardLabelsC2[2][4] = THRfthc_2;
bingoCardLabelsC2[2][5] = THRsxthc_2;
bingoCardLabelsC2[2][6] = THRsvnthc;
bingoCardLabelsC2[2][7] = THRethc_2;
bingoCardLabelsC2[2][8] = THRnthc_2;

        
       card1 = generateRandomCard(3, 9);
 bingoCard1 = new MultiLinkedList(card1);

       
    
        bingoCard1.printListC1();
        
        
        
        
          card2= generateRandomCard(3, 9);
MultiLinkedList bingoCard2 = new MultiLinkedList(card2);

       
    
        bingoCard2.printListC2();
 

    }

    String fp;
    String sp;
MultiLinkedList bingoCard1;
    int card1[][];
    JLabel[][] bingoCardLabelsC1;
     JLabel[][] bingoCardLabelsC2;

 int card2[][];
 
  int chinkoCount1 = 0; 
 int chinkoCount2 = 0; 

    class MultiNode {

        int data;
        MultiNode right; 
        MultiNode down;  

        // Constructor
        MultiNode(int data) {
            this.data = data;
            this.right = null;
            this.down = null;
        }
    }

    class MultiLinkedList {

        public MultiNode head; 
        MultiNode[][] matrix;
 private int[][] generatedNumbers;
 private int[] rowCounts;
    private boolean tombalaReached;
        public void displayy() {
            MultiNode temp = head;
            while (temp != null) {
                MultiNode rowTemp = temp;
                while (rowTemp != null) {
                    System.out.print(rowTemp.data + "\t");
                    rowTemp = rowTemp.right;
                }
                System.out.println();
                temp = temp.down;
            }
        }

        public void displayV2(int[][] card) {

            for (int i = 0; i < card.length; i++) {
                for (int j = 0; j < card[i].length; j++) {
                    System.out.print(card[i][j] + "\t");

                }
                System.out.println();
            }

        }

        
        
     
 

    public MultiLinkedList(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        this.matrix = new MultiNode[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                this.matrix[i][j] = new MultiNode(matrix[i][j]);
            }
        }

     
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols - 1; j++) {
                this.matrix[i][j].right = this.matrix[i][j + 1];
            }
        }

       
        for (int j = 0; j < cols; j++) {
            for (int i = 0; i < rows - 1; i++) {
                this.matrix[i][j].down = this.matrix[i + 1][j];
            }
        }

        this.head = this.matrix[0][0];
        this.generatedNumbers = new int[rows][5];

     
        this.rowCounts = new int[rows];

        // Initialize tombalaReached flag
        this.tombalaReached = false;
    }
    
    
    public void printListC1() {
        MultiNode temp = head;
           int specialIndex = 0;
        while (temp != null) {
            MultiNode rowTemp = temp;
            while (rowTemp != null) {
                
                     int rowIndex = specialIndex / 9;
                int columnIndex = specialIndex % 9;
                System.out.print("(" + rowIndex + "," + columnIndex + "): ");
                
                
                if (rowTemp.data!=-1) {
                    
                      
             if (columnIndex==0) {
                
                 
                 
                 if (rowIndex==0) {
                     FRfc.setText(Integer.toString(rowTemp.data));
                 } else if (rowIndex==1) {
                       SRfc.setText(Integer.toString(rowTemp.data));
                 } else{
                 THRfc.setText(Integer.toString(rowTemp.data));
                 
                 }
                 
                 
                 
                 
            } else if(columnIndex==1) {
            
            
                 if (rowIndex==0) {
                     FRsc.setText(Integer.toString(rowTemp.data));
                 } else if (rowIndex==1) {
                       SRsc.setText(Integer.toString(rowTemp.data));
                 } else{
                 THRsc.setText(Integer.toString(rowTemp.data));
                 
                 }
          
            
            
            } else if (columnIndex==2) {
                
                
                  if (rowIndex==0) {
                     FRthc.setText(Integer.toString(rowTemp.data));
                 } else if (rowIndex==1) {
                       SRthc.setText(Integer.toString(rowTemp.data));
                 } else{
                 THRthc.setText(Integer.toString(rowTemp.data));
                 
                 }
                
                
                
            } else if (columnIndex==3) {
             
                
                
                   if (rowIndex==0) {
                     FRfrthc.setText(Integer.toString(rowTemp.data));
                 } else if (rowIndex==1) {
                       SRfrthc.setText(Integer.toString(rowTemp.data));
                 } else{
                 THRfrthc.setText(Integer.toString(rowTemp.data));
                 
                 }
                
                
            } else if (columnIndex==4) {
              
                    if (rowIndex==0) {
                     FRffthc.setText(Integer.toString(rowTemp.data));
                 } else if (rowIndex==1) {
                       SRffthc.setText(Integer.toString(rowTemp.data));
                 } else{
                 THRffthc.setText(Integer.toString(rowTemp.data));
                 
                 }
          
                
                
            } else if (columnIndex==5) {
                
                
                  if (rowIndex==0) {
                     FRsxthc.setText(Integer.toString(rowTemp.data));
                 } else if (rowIndex==1) {
                       SRsxthc.setText(Integer.toString(rowTemp.data));
                 } else{
                 THRsxthc.setText(Integer.toString(rowTemp.data));
                 
                 }
                
                
            } else if (columnIndex==6) {
                
                    if (rowIndex==0) {
                     FRsvnthc.setText(Integer.toString(rowTemp.data));
                 } else if (rowIndex==1) {
                       SRsvnthc.setText(Integer.toString(rowTemp.data));
                 } else{
                 THRsvnthc.setText(Integer.toString(rowTemp.data));
                 
                 }
          
                
                
                
            } else if (columnIndex==7) {
                
             if (rowIndex==0) {
                     FRethc.setText(Integer.toString(rowTemp.data));
                 } else if (rowIndex==1) {
                       SRethc.setText(Integer.toString(rowTemp.data));
                 } else{
                 THRethc.setText(Integer.toString(rowTemp.data));
                 
                 }
          
                
                
                
            } else if (columnIndex==8) {
                
                 if (rowIndex==0) {
                     FRnthC.setText(Integer.toString(rowTemp.data));
                 } else if (rowIndex==1) {
                       SRnthc.setText(Integer.toString(rowTemp.data));
                 } else{
                 THRnthc.setText(Integer.toString(rowTemp.data));
                 
                 }
          
                
                
            }
                    
                    
                }
                
                
                
                
                
                if (rowTemp.data != -1) {
                    System.out.print(rowTemp.data + " ");
                } else {
                    System.out.print("x ");
                }
                rowTemp = rowTemp.right;
                 specialIndex++;
            }
            System.out.println();
            temp = temp.down;
        }
    }
    
    
    
 public void checkRow(int rowIndex) {
        if (rowCounts[rowIndex] == 5) {
            if (rowCounts[0] == 5 && rowCounts[1] == 5 && rowCounts[2] == 5) {
                System.out.println("Tombala");
                tombalaReached = true;
            } else {
                System.out.println("Second chinko");
            }
        } else if (rowCounts[rowIndex] == 5 && rowCounts[rowIndex] == 0) {
            System.out.println("First chinko");
        }
    }

   
    public void updateCounts(int number, int rowIndex) {
        for (int i = 0; i < 5; i++) {
            if (generatedNumbers[rowIndex][i] == number) {
                rowCounts[rowIndex]++;
                break;
            }
        }
    }

    
    public void generateAndUpdate(int x) {
        while (!tombalaReached) {
            
            int rowIndex = x / 10; //
            generatedNumbers[rowIndex][rowCounts[rowIndex]] = x;
            updateCounts(x, rowIndex);
            checkRow(rowIndex);
        }
    }

    
    
      

    
     public void printListC2() {
        MultiNode temp = head;
           int specialIndex = 0;
        while (temp != null) {
            MultiNode rowTemp = temp;
            while (rowTemp != null) {
                
                     int rowIndex = specialIndex / 9;
                int columnIndex = specialIndex % 9;
                System.out.print("(" + rowIndex + "," + columnIndex + "): ");
                
                
                if (rowTemp.data!=-1) {
                    
                      
             if (columnIndex==0) {
                
                   if (rowIndex==0) {
                     FRfc_2.setText(Integer.toString(rowTemp.data));
                 } else if (rowIndex==1) {
                       SRfc_2.setText(Integer.toString(rowTemp.data));
                 } else{
                 THRfc_2.setText(Integer.toString(rowTemp.data));
                 
                 }
                 
                 
                 
                 
            } else if(columnIndex==1) {
            
               if (rowIndex==0) {
                     FRsc_2.setText(Integer.toString(rowTemp.data));
                 } else if (rowIndex==1) {
                       SRsc_2.setText(Integer.toString(rowTemp.data));
                 } else{
                 THRsc_2.setText(Integer.toString(rowTemp.data));
                 
                 }
            
            
            } else if (columnIndex==2) {
                
                
                   if (rowIndex==0) {
                     FRthrc_2.setText(Integer.toString(rowTemp.data));
                 } else if (rowIndex==1) {
                       SRthrc_2.setText(Integer.toString(rowTemp.data));
                 } else{
                 THRthrc_2.setText(Integer.toString(rowTemp.data));
                 
                 }
                
                
                
            } else if (columnIndex==3) {
             
                
                
                   if (rowIndex==0) {
                     FRfrthc_2.setText(Integer.toString(rowTemp.data));
                 } else if (rowIndex==1) {
                       SRfrthc_2.setText(Integer.toString(rowTemp.data));
                 } else{
                 THRfrthc_2.setText(Integer.toString(rowTemp.data));
                 
                 }
                
                
            } else if (columnIndex==4) {
              
                    if (rowIndex==0) {
                     FRffthc_2.setText(Integer.toString(rowTemp.data));
                 } else if (rowIndex==1) {
                       SRffthc_2.setText(Integer.toString(rowTemp.data));
                 } else{
                 THRfthc_2.setText(Integer.toString(rowTemp.data));
                 
                 }
          
                
                
            } else if (columnIndex==5) {
                
                
                 if (rowIndex==0) {
                     FRsxthc_2.setText(Integer.toString(rowTemp.data));
                 } else if (rowIndex==1) {
                       SRsxthc_2.setText(Integer.toString(rowTemp.data));
                 } else{
                 THRsxthc_2.setText(Integer.toString(rowTemp.data));
                 
                 }
          
                
                
            } else if (columnIndex==6) {
                
                   if (rowIndex==0) {
                     FRsvnthc_2.setText(Integer.toString(rowTemp.data));
                 } else if (rowIndex==1) {
                       SRsvnthc_2.setText(Integer.toString(rowTemp.data));
                 } else{
                 THRsvnthc_2.setText(Integer.toString(rowTemp.data));
                 
                 }
                
                
                
            } else if (columnIndex==7) {
                
               if (rowIndex==0) {
                     FRethc_2.setText(Integer.toString(rowTemp.data));
                 } else if (rowIndex==1) {
                       SRethc_2.setText(Integer.toString(rowTemp.data));
                 } else{
                 THRethc_2.setText(Integer.toString(rowTemp.data));
                 
                 }
                
                
                
            } else if (columnIndex==8) {
                
                  if (rowIndex==0) {
                     FRnthc_2.setText(Integer.toString(rowTemp.data));
                 } else if (rowIndex==1) {
                       SRnthc_2.setText(Integer.toString(rowTemp.data));
                 } else{
                 THRnthc_2.setText(Integer.toString(rowTemp.data));
                 
                 }
                
                
            }
                    
                    
                }
                
                
                
                
                
                if (rowTemp.data != -1) {
                    System.out.print(rowTemp.data + " ");
                } else {
                    System.out.print("x ");
                }
                rowTemp = rowTemp.right;
                 specialIndex++;
            }
            System.out.println();
            temp = temp.down;
        }
    }
    
        
        
        
        

       public void displayList() {
    MultiNode currentRowNode = head;

   
    while (currentRowNode != null) {
        MultiNode currentColumnNode = currentRowNode;

        
        while (currentColumnNode != null) {
            
            if (currentColumnNode.data == -1) {
                System.out.print("X\t");
            } else {
                System.out.print(currentColumnNode.data + "\t");
            }
      
            currentColumnNode = currentColumnNode.right;
        }

      
        System.out.println();
        currentRowNode = currentRowNode.down;
    }
}

   
      
       
       private void displayMatrixAndLinkedList() {
    
    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[0].length; j++) {
            if (matrix[i][j].data == -1) {
                System.out.print("X ");
            } else {
                System.out.print(matrix[i][j].data + " ");
            }
        }
        System.out.println();
    }
    
 
    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[0].length; j++) {
            if (matrix[i][j].data == -1) {
                System.out.print("x ");
            } else {
                System.out.print("  "); 
            }
        }
        System.out.println();
    }
}

       
       
       
  private void connectNodes() {
    int rows = matrix.length;
    int columns = matrix[0].length;

    head = matrix[0][0];
 
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < columns; j++) {
            if (matrix[i][j] != null) {
                // Connect nodes to the right
                if (j < columns - 1 && matrix[i][j + 1] != null) {
                    matrix[i][j].right = matrix[i][j + 1];
                }
                // Connect nodes downwards
                if (i < rows - 1 && matrix[i + 1][j] != null) {
                    matrix[i][j].down = matrix[i + 1][j];
                }
            }
        }
    }
    

}
   

    
    private void insertRandomNumbersV2() {
    Random rand = new Random();
    ArrayList<Integer> selectedNumbers = new ArrayList<>();
    int theGenerizedNo = 0;
   
    while (selectedNumbers.size() < 15) {
        int row = rand.nextInt(matrix.length);
        int col = rand.nextInt(matrix[0].length);
        if (matrix[row][col].data == 0) { 
            selectedNumbers.add(row * matrix[0].length + col); 
            matrix[row][col].data = -1; 
        }
    }

    
    for (Integer index : selectedNumbers) {
        int row = index / matrix[0].length;
        int col = index % matrix[0].length;
        
        if ((col + 1) % 5 == 0) { 
            matrix[row][col].data = -1; 
        } else {
            int randomNumber = rand.nextInt(10) + col * 10 + 1; 
            matrix[row][col].data = randomNumber;
            theGenerizedNo = randomNumber;
        }
    }
}
    
    
    
    
    
    
    
    private void insertRandomNumbersV3() {
    Random rand = new Random();
    ArrayList<Integer> selectedNumbers = new ArrayList<>();
    int[][] card1 = new int[3][9]; 

    
    while (selectedNumbers.size() < 27) {
        int row = rand.nextInt(card1.length);
        int col = rand.nextInt(card1[0].length);
        if (card1[row][col] == 0) { 
            selectedNumbers.add(row * card1[0].length + col); 
            card1[row][col] = -1; 
        }
    }

   
    for (Integer index : selectedNumbers) {
        int row = index / card1[0].length;
        int col = index % card1[0].length;
        if (card1[row][col] != -1) { 
            int randomNumber = rand.nextInt(10) + col * 10 + 1; 
            card1[row][col] = randomNumber;
        }
    }


    for (int i = 0; i < card1.length; i++) {
        for (int j = 0; j < card1[0].length; j++) {
            if (card1[i][j] != -1) {
               
                matrix[i][j].data = card1[i][j];
            }
        }
    }
}

    
    

       
private void insertRandomNumbers() {
    Random rand = new Random();
    ArrayList<Integer> selectedNumbers = new ArrayList<>();
int theGenerizedNo = 0;
    
    while (selectedNumbers.size() < 15) {
        int row = rand.nextInt(matrix.length);
        int col = rand.nextInt(matrix[0].length);
        if (matrix[row][col].data == 0) { 
            selectedNumbers.add(row * matrix[0].length + col); 
            matrix[row][col].data = -1; 
        }
    }


    for (Integer index : selectedNumbers) {
        int row = index / matrix[0].length;
        int col = index % matrix[0].length;
        int randomNumber = rand.nextInt(10) + col * 10 + 1; 
        matrix[row][col].data = randomNumber;
        theGenerizedNo = randomNumber;
        
        
        
        
        
      
    }
}

       
       
       
      
 public void displayMultiLinkedList() {
    MultiNode currentRowNode = head;
    MultiNode currentColumnNode;
    int numColumns = matrix[0].length;
int specialIndex = 0;
  
    while (currentRowNode != null) {
        currentColumnNode = currentRowNode;

       
        while (currentColumnNode != null) {
           
            int data = currentColumnNode.data;
            int columnRange = (data - 1) / 10;

            
            int rowIndex = specialIndex /numColumns;
            int columnIndex = specialIndex% numColumns;
            
             System.out.print("(" + rowIndex + "," + columnIndex + "): ");
            
             if (data!=0) {
                
                 
             
             if (columnIndex==0) {
                
                 if (FRfc.getText().isEmpty()) {
                     FRfc.setText(Integer.toString(data));
                 } else if (SRfc.getText().isEmpty()) {
                     SRfc.setText(Integer.toString(data));
                 } else {
                 
                 THRfc.setText(Integer.toString(data));
                 }
                 
                 
                 
                 
            } else if(columnIndex==1) {
            
            
              if (FRsc.getText().isEmpty()) {
                     FRsc.setText(Integer.toString(data));
                 } else if (SRsc.getText().isEmpty()) {
                     SRsc.setText(Integer.toString(data));
                 } else {
                 
                 THRsc.setText(Integer.toString(data));
                 }
          
            
            
            } else if (columnIndex==2) {
                
                
                 if (FRthc.getText().isEmpty()) {
                     FRthc.setText(Integer.toString(data));
                 } else if (SRthc.getText().isEmpty()) {
                     SRthc.setText(Integer.toString(data));
                 } else {
                 
                 THRthc.setText(Integer.toString(data));
                 }
          
                
                
                
            } else if (columnIndex==3) {
             
                
                
                 if (FRfrthc.getText().isEmpty()) {
                     FRfrthc.setText(Integer.toString(data));
                 } else if (SRfrthc.getText().isEmpty()) {
                     SRfrthc.setText(Integer.toString(data));
                 } else {
                 
                 THRfrthc.setText(Integer.toString(data));
                 }
          
                
                
            } else if (columnIndex==4) {
              
                 if (FRffthc.getText().isEmpty()) {
                     FRffthc.setText(Integer.toString(data));
                 } else if (SRffthc.getText().isEmpty()) {
                     SRffthc.setText(Integer.toString(data));
                 } else {
                 
                 THRffthc.setText(Integer.toString(data));
                 }
          
                
                
            } else if (columnIndex==5) {
                
                
                 if (FRsxthc.getText().isEmpty()) {
                     FRsxthc.setText(Integer.toString(data));
                 } else if (SRsxthc.getText().isEmpty()) {
                     SRsxthc.setText(Integer.toString(data));
                 } else {
                 
                 THRsxthc.setText(Integer.toString(data));
                 }
          
                
                
            } else if (columnIndex==6) {
                
                 if (FRsvnthc.getText().isEmpty()) {
                     FRsvnthc.setText(Integer.toString(data));
                 } else if (SRsvnthc.getText().isEmpty()) {
                     SRsvnthc.setText(Integer.toString(data));
                 } else {
                 
                 THRsvnthc.setText(Integer.toString(data));
                 }
          
                
                
                
            } else if (columnIndex==7) {
                
                 if (FRethc.getText().isEmpty()) {
                     FRethc.setText(Integer.toString(data));
                 } else if (SRethc.getText().isEmpty()) {
                     SRethc.setText(Integer.toString(data));
                 } else {
                 
                 THRethc.setText(Integer.toString(data));
                 }
          
                
                
                
            } else if (columnIndex==8) {
                
                 if (FRnthC.getText().isEmpty()) {
                     FRnthC.setText(Integer.toString(data));
                 } else if (SRnthc.getText().isEmpty()) {
                     SRnthc.setText(Integer.toString(data));
                 } else {
                 
                 THRnthc.setText(Integer.toString(data));
                 }
          
                
                
            }
             
             }
             
        
            if (data != 0) {
                
                
     
                System.out.print(data + " ");
            } else {
                System.out.print("x ");
            }
            
            

            currentColumnNode = currentColumnNode.right;
        specialIndex++;
        }
      
        System.out.println();
        currentRowNode = currentRowNode.down;
    }
}


       
       
       


        public void insert(int row, int column, int data) {
            if (row >= 0 && row < matrix.length && column >= 0 && column < matrix[0].length) {
                matrix[row][column].data = data;
            } else {
                System.out.println("Invalid row or column index.");
            }
        }

        public void generateAndInsertNumbers(int count) {
            Random rand = new Random();
            int rows = matrix.length;
            int columns = matrix[0].length;
            for (int i = 0; i < count; i++) {
                int num = rand.nextInt(90) + 1; 
                int row = i % rows; 
                int column = i / rows; 
                insert(row, column, num); 
            }
        }
        
        
        
   
        

        public void display() {
            int rows = matrix.length;
            int columns = matrix[0].length;
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    System.out.print(matrix[i][j].data + "\t");
                }
                System.out.println();
            }
        }

        WelcomePage p = new WelcomePage();

      

        public void generateAndInsertNumbersOnUI(int count) {
            Random rand = new Random();
            MultiNode temp = head;
            for (int i = 0; i < count; i++) {
                int num = rand.nextInt(90) + 1; 
                MultiNode newNode = new MultiNode(num);
                if (temp == null) {
                    temp = newNode;
                    head = temp;
                } else {
                    while (temp.down != null) {
                        temp = temp.down;
                    }
                    temp.down = newNode;

                }
            }
        }

        public int getDataAtPosition(int position) {
            MultiNode temp = head;
            for (int i = 0; i < position; i++) {
                if (temp == null) {
                    throw new IndexOutOfBoundsException("Index " + position + " is out of bounds.");
                }
                temp = temp.down;
            }
            if (temp == null) {
                throw new IndexOutOfBoundsException("Index " + position + " is out of bounds.");
            }
            return temp.data;
        }

        public void LabelChangerMachineCard1() {
            MultiNode temp = head;

        
            for (int i = 0; i < 15 && temp != null; i++) {
                LabelSettersCard1(temp.data);
                temp = temp.down;
            }
        }

        public void LabelChangerMachineCard2() {

            MultiNode temp = head;

            for (int i = 0; i < 15; i++) {

                LabelSettersCard2(temp.data);
                temp = temp.down;

            }

        }

        public void LabelChangerOnUI() {

            MultiNode temp = head;

            for (int i = 0; i < 15; i++) {

                UIlabelSetter(temp.data);
                temp = temp.down;

            }

        }

        public void UIlabelSetter(int number) {

            RandomizedLabel.setText(Integer.toString(number));

        }

        public void LabelSettersCard1(int number) {

            if (number <= 9 && number != 0) {

                if (FRfc.getText().isEmpty()) {
                    FRfc.setText(Integer.toString(number));

                } else if (SRfc.getText().isEmpty()) {

                    SRfc.setText(Integer.toString(number));

                } else {

                    THRfc.setText(Integer.toString(number));

                }

            } else if (number >= 10 && number <= 19) {

                if (SRsc.getText().isEmpty()) {

                    SRsc.setText(Integer.toString(number));

                } else if (THRsc.getText().isEmpty()) {

                    THRsc.setText(Integer.toString(number));

                } else {

                    FRsc.setText(Integer.toString(number));

                }

            } else if (number >= 19 && number <= 28) {

                if (FRthc.getText().isEmpty()) {
                    FRthc.setText(Integer.toString(number));

                } else if (THRthc.getText().isEmpty()) {

                    THRthc.setText(Integer.toString(number));

                } else {

                    SRthc.setText(Integer.toString(number));

                }

            } else if (number >= 29 && number <= 38) {

                if (SRfrthc.getText().isEmpty()) {
                    SRfrthc.setText(Integer.toString(number));

                } else if (THRfrthc.getText().isEmpty()) {

                    THRfrthc.setText(Integer.toString(number));

                } else {

                    FRfrthc.setText(Integer.toString(number));

                }

            } else if (number >= 39 && number <= 48) {

                if (SRfrthc.getText().isEmpty()) {
                    SRfrthc.setText(Integer.toString(number));

                } else if (THRfrthc.getText().isEmpty()) {

                    THRfrthc.setText(Integer.toString(number));

                } else {

                    FRfrthc.setText(Integer.toString(number));

                }

            } else if (number >= 48 && number <= 57) {

                if (FRffthc.getText().isEmpty()) {
                    FRffthc.setText(Integer.toString(number));

                } else if (SRffthc.getText().isEmpty()) {

                    SRffthc.setText(Integer.toString(number));

                } else {

                    THRffthc.setText(Integer.toString(number));

                }

            } else if (number >= 58 && number <= 67) {

                if (SRsxthc.getText().isEmpty()) {
                    SRsxthc.setText(Integer.toString(number));

                } else if (THRsxthc.getText().isEmpty()) {

                    THRsxthc.setText(Integer.toString(number));

                } else {

                    FRsxthc.setText(Integer.toString(number));

                }

            } else if (number >= 68 && number <= 77) {

                if (FRsvnthc.getText().isEmpty()) {
                    FRsvnthc.setText(Integer.toString(number));

                } else if (SRsvnthc.getText().isEmpty()) {

                    SRsvnthc.setText(Integer.toString(number));

                } else {

                    THRsvnthc.setText(Integer.toString(number));

                }

            } else if (number >= 78 && number <= 87) {

                if (FRethc.getText().isEmpty()) {
                    FRethc.setText(Integer.toString(number));

                } else if (THRethc.getText().isEmpty()) {

                    THRethc.setText(Integer.toString(number));

                } else {

                    SRethc.setText(Integer.toString(number));

                }

            } else if (number >= 88 && number <= 90) {

                if (THRnthc.getText().isEmpty()) {
                    THRnthc.setText(Integer.toString(number));
                } else if (FRnthC.getText().isEmpty()) {
                    FRnthC.setText(Integer.toString(number));

                } else {

                    SRnthc.setText(Integer.toString(number));

                }

            }

        }

        public void LabelSettersCard2(int number) {

            if (number <= 9 && number != 0) {

                if (SRfc_2.getText().isEmpty()) {
                    SRfc_2.setText(Integer.toString(number));

                } else if (FRfc_2.getText().isEmpty()) {

                    FRfc_2.setText(Integer.toString(number));

                } else {

                    THRfc_2.setText(Integer.toString(number));

                }

            } else if (number >= 10 && number <= 19) {

                if (FRsc_2.getText().isEmpty()) {

                    FRsc_2.setText(Integer.toString(number));

                } else if (SRsc_2.getText().isEmpty()) {

                    SRsc_2.setText(Integer.toString(number));

                } else {

                    THRsc_2.setText(Integer.toString(number));

                }

            } else if (number >= 20 && number <= 29) {

                if (SRthrc_2.getText().isEmpty()) {
                    SRthrc_2.setText(Integer.toString(number));

                } else if (THRthrc_2.getText().isEmpty()) {

                    THRthrc_2.setText(Integer.toString(number));

                } else {

                    FRthrc_2.setText(Integer.toString(number));

                }

            } else if (number >= 30 && number <= 39) {

                if (SRfrthc_2.getText().isEmpty()) {
                    SRfrthc_2.setText(Integer.toString(number));

                } else if (THRfrthc_2.getText().isEmpty()) {

                    THRfrthc_2.setText(Integer.toString(number));

                } else {

                    FRfrthc_2.setText(Integer.toString(number));

                }

            } else if (number >= 40 && number <= 49) {

                if (FRffthc_2.getText().isEmpty()) {
                    FRffthc_2.setText(Integer.toString(number));

                } else if (SRffthc_2.getText().isEmpty()) {

                    SRffthc_2.setText(Integer.toString(number));

                } else {

                    THRfthc_2.setText(Integer.toString(number));

                }

            } else if (number >= 50 && number <= 59) {

                if (FRsxthc_2.getText().isEmpty()) {
                    FRsxthc_2.setText(Integer.toString(number));

                } else if (THRsxthc_2.getText().isEmpty()) {

                    THRsxthc_2.setText(Integer.toString(number));

                } else {

                    SRsxthc_2.setText(Integer.toString(number));

                }

            } else if (number >= 60 && number <= 69) {

                if (SRsvnthc_2.getText().isEmpty()) {
                    SRsvnthc_2.setText(Integer.toString(number));

                } else if (THRsvnthc_2.getText().isEmpty()) {

                    THRsvnthc_2.setText(Integer.toString(number));

                } else {

                    FRsvnthc_2.setText(Integer.toString(number));

                }

            } else if (number >= 70 && number <= 79) {

                if (FRsvnthc.getText().isEmpty()) {
                    FRsvnthc.setText(Integer.toString(number));

                } else if (SRsvnthc.getText().isEmpty()) {

                    SRsvnthc.setText(Integer.toString(number));

                } else {

                    THRsvnthc.setText(Integer.toString(number));

                }

            } else if (number >= 80 && number <= 89) {

                if (FRethc.getText().isEmpty()) {
                    FRethc.setText(Integer.toString(number));

                } else if (THRethc.getText().isEmpty()) {

                    THRethc.setText(Integer.toString(number));

                } else {

                    SRethc.setText(Integer.toString(number));

                }

            }

        }
        
        
        
 
 

        public static boolean checkJLabelsForNumber(int number, Container container) {
            Component[] components = container.getComponents(); 
            for (Component component : components) {
                if (component instanceof JLabel) { 
                    JLabel label = (JLabel) component;
                    String labelText = label.getText();
                    try {
                        
                        int labelNumber = Integer.parseInt(labelText);
                     
                        if (labelNumber == number) {
                            return true; 
                        }
                    } catch (NumberFormatException e) {
                      
                    }
                }
            }
            return false; 
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FirstPlayerLabel = new javax.swing.JLabel();
        SecondPlayerLabel = new javax.swing.JLabel();
        Debugtesting2 = new javax.swing.JLabel();
        Debugtesting = new javax.swing.JLabel();
        THRnthc_2 = new javax.swing.JLabel();
        SRnthc_2 = new javax.swing.JLabel();
        FRnthc_2 = new javax.swing.JLabel();
        FRfc_2 = new javax.swing.JLabel();
        SRfc_2 = new javax.swing.JLabel();
        THRfc_2 = new javax.swing.JLabel();
        FRsc_2 = new javax.swing.JLabel();
        SRsc_2 = new javax.swing.JLabel();
        THRsc_2 = new javax.swing.JLabel();
        FRthrc_2 = new javax.swing.JLabel();
        SRthrc_2 = new javax.swing.JLabel();
        THRthrc_2 = new javax.swing.JLabel();
        FRfrthc_2 = new javax.swing.JLabel();
        SRfrthc_2 = new javax.swing.JLabel();
        THRfrthc_2 = new javax.swing.JLabel();
        FRffthc_2 = new javax.swing.JLabel();
        SRffthc_2 = new javax.swing.JLabel();
        THRfthc_2 = new javax.swing.JLabel();
        FRsxthc_2 = new javax.swing.JLabel();
        SRsxthc_2 = new javax.swing.JLabel();
        SRsvnthc_2 = new javax.swing.JLabel();
        FRsvnthc_2 = new javax.swing.JLabel();
        THRsxthc_2 = new javax.swing.JLabel();
        THRsvnthc_2 = new javax.swing.JLabel();
        SRethc_2 = new javax.swing.JLabel();
        FRethc_2 = new javax.swing.JLabel();
        THRethc_2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        RandomizedLabel = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        FRsxthc = new javax.swing.JLabel();
        FRsc = new javax.swing.JLabel();
        THRffthc = new javax.swing.JLabel();
        SRthc = new javax.swing.JLabel();
        SRfc = new javax.swing.JLabel();
        SRnthc = new javax.swing.JLabel();
        FRfrthc = new javax.swing.JLabel();
        THRfc = new javax.swing.JLabel();
        SRethc = new javax.swing.JLabel();
        FRnthC = new javax.swing.JLabel();
        THRethc = new javax.swing.JLabel();
        THRsxthc = new javax.swing.JLabel();
        FRthc = new javax.swing.JLabel();
        FRffthc = new javax.swing.JLabel();
        FRsvnthc = new javax.swing.JLabel();
        FRethc = new javax.swing.JLabel();
        THRfrthc = new javax.swing.JLabel();
        SRsc = new javax.swing.JLabel();
        SRfrthc = new javax.swing.JLabel();
        SRsxthc = new javax.swing.JLabel();
        SRsvnthc = new javax.swing.JLabel();
        fRFC_C12 = new javax.swing.JLabel();
        THRsc = new javax.swing.JLabel();
        THRthc = new javax.swing.JLabel();
        SRffthc = new javax.swing.JLabel();
        THRsvnthc = new javax.swing.JLabel();
        fRFC_C4 = new javax.swing.JLabel();
        THRnthc = new javax.swing.JLabel();
        fRFC_C2 = new javax.swing.JLabel();
        FRfc = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        SecondPlayerLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FirstPlayerLabel.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        FirstPlayerLabel.setForeground(new java.awt.Color(0, 0, 0));
        FirstPlayerLabel.setText("jLabel3");
        getContentPane().add(FirstPlayerLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 330, -1, -1));

        SecondPlayerLabel.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        SecondPlayerLabel.setForeground(new java.awt.Color(0, 0, 0));
        SecondPlayerLabel.setText("jLabel3");
        getContentPane().add(SecondPlayerLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 330, -1, -1));

        Debugtesting2.setFont(new java.awt.Font("Dubai Light", 0, 18)); // NOI18N
        Debugtesting2.setForeground(new java.awt.Color(0, 0, 0));
        Debugtesting2.setText("Card 2 Status");
        getContentPane().add(Debugtesting2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 580, 240, -1));

        Debugtesting.setFont(new java.awt.Font("Dubai Light", 0, 18)); // NOI18N
        Debugtesting.setForeground(new java.awt.Color(0, 0, 0));
        Debugtesting.setText("Card 1 Status");
        getContentPane().add(Debugtesting, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 180, -1));

        THRnthc_2.setForeground(new java.awt.Color(0, 0, 0));
        THRnthc_2.setText("jLabel7");
        getContentPane().add(THRnthc_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 510, -1, -1));

        SRnthc_2.setForeground(new java.awt.Color(0, 0, 0));
        SRnthc_2.setText("jLabel6");
        getContentPane().add(SRnthc_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 430, -1, -1));

        FRnthc_2.setForeground(new java.awt.Color(0, 0, 0));
        FRnthc_2.setText("jLabel5");
        getContentPane().add(FRnthc_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 350, 37, -1));

        FRfc_2.setForeground(new java.awt.Color(0, 0, 0));
        FRfc_2.setText("jLabel4");
        getContentPane().add(FRfc_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, -1, -1));

        SRfc_2.setForeground(new java.awt.Color(0, 0, 0));
        SRfc_2.setText("jLabel5");
        getContentPane().add(SRfc_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 430, -1, -1));

        THRfc_2.setForeground(new java.awt.Color(0, 0, 0));
        THRfc_2.setText("jLabel6");
        getContentPane().add(THRfc_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 510, -1, -1));

        FRsc_2.setBackground(new java.awt.Color(0, 0, 0));
        FRsc_2.setForeground(new java.awt.Color(0, 0, 0));
        FRsc_2.setText("jLabel7");
        getContentPane().add(FRsc_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, -1, -1));

        SRsc_2.setForeground(new java.awt.Color(0, 0, 0));
        SRsc_2.setText("jLabel8");
        getContentPane().add(SRsc_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 430, -1, -1));

        THRsc_2.setForeground(new java.awt.Color(0, 0, 0));
        THRsc_2.setText("jLabel9");
        getContentPane().add(THRsc_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 510, -1, -1));

        FRthrc_2.setForeground(new java.awt.Color(0, 0, 0));
        FRthrc_2.setText("jLabel10");
        getContentPane().add(FRthrc_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, -1, -1));

        SRthrc_2.setForeground(new java.awt.Color(0, 0, 0));
        SRthrc_2.setText("jLabel11");
        getContentPane().add(SRthrc_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 430, -1, -1));

        THRthrc_2.setForeground(new java.awt.Color(0, 0, 0));
        THRthrc_2.setText("jLabel12");
        getContentPane().add(THRthrc_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 510, -1, -1));

        FRfrthc_2.setBackground(new java.awt.Color(0, 0, 0));
        FRfrthc_2.setForeground(new java.awt.Color(0, 0, 0));
        FRfrthc_2.setText("jLabel13");
        getContentPane().add(FRfrthc_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, -1, -1));

        SRfrthc_2.setForeground(new java.awt.Color(0, 0, 0));
        SRfrthc_2.setText("jLabel14");
        getContentPane().add(SRfrthc_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 430, -1, -1));

        THRfrthc_2.setForeground(new java.awt.Color(0, 0, 0));
        THRfrthc_2.setText("jLabel15");
        getContentPane().add(THRfrthc_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 510, -1, -1));

        FRffthc_2.setForeground(new java.awt.Color(0, 0, 0));
        FRffthc_2.setText("jLabel16");
        getContentPane().add(FRffthc_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 350, -1, -1));

        SRffthc_2.setForeground(new java.awt.Color(0, 0, 0));
        SRffthc_2.setText("jLabel17");
        getContentPane().add(SRffthc_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 430, -1, -1));

        THRfthc_2.setForeground(new java.awt.Color(0, 0, 0));
        THRfthc_2.setText("jLabel18");
        getContentPane().add(THRfthc_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 510, -1, -1));

        FRsxthc_2.setForeground(new java.awt.Color(0, 0, 0));
        FRsxthc_2.setText("jLabel19");
        getContentPane().add(FRsxthc_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 350, -1, -1));

        SRsxthc_2.setForeground(new java.awt.Color(0, 0, 0));
        SRsxthc_2.setText("jLabel20");
        getContentPane().add(SRsxthc_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 430, -1, -1));

        SRsvnthc_2.setForeground(new java.awt.Color(0, 0, 0));
        SRsvnthc_2.setText("jLabel23");
        getContentPane().add(SRsvnthc_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 430, -1, -1));

        FRsvnthc_2.setForeground(new java.awt.Color(0, 0, 0));
        FRsvnthc_2.setText("jLabel22");
        getContentPane().add(FRsvnthc_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 350, -1, -1));

        THRsxthc_2.setForeground(new java.awt.Color(0, 0, 0));
        THRsxthc_2.setText("jLabel21");
        getContentPane().add(THRsxthc_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 510, -1, -1));

        THRsvnthc_2.setForeground(new java.awt.Color(0, 0, 0));
        THRsvnthc_2.setText("jLabel24");
        getContentPane().add(THRsvnthc_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 510, -1, -1));

        SRethc_2.setForeground(new java.awt.Color(51, 51, 51));
        SRethc_2.setText("jLabel26");
        getContentPane().add(SRethc_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 430, -1, -1));

        FRethc_2.setForeground(new java.awt.Color(0, 0, 0));
        FRethc_2.setText("jLabel25");
        getContentPane().add(FRethc_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 350, -1, -1));

        THRethc_2.setForeground(new java.awt.Color(0, 0, 0));
        THRethc_2.setText("jLabel27");
        getContentPane().add(THRethc_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 500, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Desktop\\UIX-gui-removed.png")); // NOI18N
        jLabel4.setText("jLabel2");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 590, 260));

        jLabel33.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(0, 0, 0));
        jLabel33.setText("VS");
        getContentPane().add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 320, 40, 30));

        jButton1.setText("Generate Number");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 510, -1, 20));

        RandomizedLabel.setBackground(new java.awt.Color(255, 255, 255));
        RandomizedLabel.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 18)); // NOI18N
        RandomizedLabel.setForeground(new java.awt.Color(255, 255, 255));
        RandomizedLabel.setText("Generated Number");
        getContentPane().add(RandomizedLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 450, 180, -1));

        jLabel32.setForeground(new java.awt.Color(0, 0, 0));
        jLabel32.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Desktop\\current_n_ui-r.png")); // NOI18N
        jLabel32.setText("jLabel32");
        getContentPane().add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 380, 390, 200));

        jLabel29.setForeground(new java.awt.Color(0, 0, 0));
        jLabel29.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Desktop\\BingoGameResultsUI-r.png")); // NOI18N
        jLabel29.setText("jLabel29");
        getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 60, 450, 510));

        FRsxthc.setForeground(new java.awt.Color(0, 0, 0));
        FRsxthc.setText("jLabel13");
        getContentPane().add(FRsxthc, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, -1, -1));

        FRsc.setForeground(new java.awt.Color(0, 0, 0));
        FRsc.setText("jLabel12");
        getContentPane().add(FRsc, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, -1, -1));

        THRffthc.setForeground(new java.awt.Color(0, 0, 0));
        THRffthc.setText("ffff");
        getContentPane().add(THRffthc, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, -1, -1));

        SRthc.setForeground(new java.awt.Color(0, 0, 0));
        SRthc.setText("jLabel6");
        getContentPane().add(SRthc, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, -1, -1));

        SRfc.setForeground(new java.awt.Color(0, 0, 0));
        SRfc.setText("jLabel4");
        getContentPane().add(SRfc, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, -1, -1));

        SRnthc.setForeground(new java.awt.Color(0, 0, 0));
        SRnthc.setText("jLabel10");
        getContentPane().add(SRnthc, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 180, -1, -1));

        FRfrthc.setForeground(new java.awt.Color(0, 0, 0));
        FRfrthc.setText("jLabel7");
        getContentPane().add(FRfrthc, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, -1, -1));

        THRfc.setForeground(new java.awt.Color(0, 0, 0));
        THRfc.setText("jLabel5");
        getContentPane().add(THRfc, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, -1, -1));

        SRethc.setForeground(new java.awt.Color(0, 0, 0));
        SRethc.setText("jLabel9");
        getContentPane().add(SRethc, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, -1, -1));

        FRnthC.setForeground(new java.awt.Color(51, 51, 51));
        FRnthC.setText("fffff");
        getContentPane().add(FRnthC, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 100, -1, -1));

        THRethc.setForeground(new java.awt.Color(0, 0, 0));
        THRethc.setText("jLabel5");
        getContentPane().add(THRethc, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 250, -1, -1));

        THRsxthc.setForeground(new java.awt.Color(0, 0, 0));
        THRsxthc.setText("jLabel5");
        getContentPane().add(THRsxthc, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, -1, -1));

        FRthc.setForeground(new java.awt.Color(0, 0, 0));
        FRthc.setText("jLabel5");
        getContentPane().add(FRthc, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, -1, 10));

        FRffthc.setForeground(new java.awt.Color(0, 0, 0));
        FRffthc.setText("jLabel5");
        getContentPane().add(FRffthc, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, -1, -1));

        FRsvnthc.setForeground(new java.awt.Color(0, 0, 0));
        FRsvnthc.setText("jLabel5");
        getContentPane().add(FRsvnthc, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, -1, -1));

        FRethc.setForeground(new java.awt.Color(0, 0, 0));
        FRethc.setText("jLabel5");
        getContentPane().add(FRethc, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 100, -1, -1));

        THRfrthc.setForeground(new java.awt.Color(0, 0, 0));
        THRfrthc.setText("jLabel5");
        getContentPane().add(THRfrthc, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, -1, -1));

        SRsc.setForeground(new java.awt.Color(0, 0, 0));
        SRsc.setText("jLabel5");
        getContentPane().add(SRsc, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, -1, -1));

        SRfrthc.setForeground(new java.awt.Color(0, 0, 0));
        SRfrthc.setText("jLabel5");
        getContentPane().add(SRfrthc, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, -1, -1));

        SRsxthc.setForeground(new java.awt.Color(0, 0, 0));
        SRsxthc.setText("jLabel5");
        getContentPane().add(SRsxthc, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, -1, -1));

        SRsvnthc.setForeground(new java.awt.Color(0, 0, 0));
        SRsvnthc.setText("jLabel5");
        getContentPane().add(SRsvnthc, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, -1, -1));

        fRFC_C12.setText("jLabel5");
        getContentPane().add(fRFC_C12, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, -1, -1));

        THRsc.setForeground(new java.awt.Color(0, 0, 0));
        THRsc.setText("jLabel5");
        getContentPane().add(THRsc, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, -1, -1));

        THRthc.setForeground(new java.awt.Color(0, 0, 0));
        THRthc.setText("jLabel5");
        getContentPane().add(THRthc, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, -1, -1));

        SRffthc.setForeground(new java.awt.Color(0, 0, 0));
        SRffthc.setText("jLabel5");
        getContentPane().add(SRffthc, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, -1, -1));

        THRsvnthc.setForeground(new java.awt.Color(0, 0, 0));
        THRsvnthc.setText("jLabel5");
        getContentPane().add(THRsvnthc, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 260, -1, -1));

        fRFC_C4.setText("jLabel5");
        getContentPane().add(fRFC_C4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 250, -1, -1));

        THRnthc.setForeground(new java.awt.Color(51, 51, 51));
        THRnthc.setText("jLabel5");
        getContentPane().add(THRnthc, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 250, -1, -1));

        fRFC_C2.setText("jLabel5");
        getContentPane().add(fRFC_C2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, -1, -1));

        FRfc.setForeground(new java.awt.Color(0, 0, 0));
        FRfc.setText("jLabel5");
        getContentPane().add(FRfc, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Desktop\\UIX-gui-removed.png")); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 590, 260));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Desktop\\projectwallpaper.png")); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 630));

        jLabel28.setText("jLabel28");
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 150, -1, -1));

        jLabel30.setText("jLabel30");
        getContentPane().add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 470, -1, -1));

        jLabel31.setText("jLabel31");
        getContentPane().add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 490, -1, -1));

        jButton2.setText("jButton2");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 60, 110, -1));

        SecondPlayerLabel1.setForeground(new java.awt.Color(0, 0, 0));
        SecondPlayerLabel1.setText("jLabel3");
        getContentPane().add(SecondPlayerLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 330, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
   public int generateNumber() {
        Set<Integer> generatedNumbers = new HashSet<>();
        Random random = new Random();
        
        int number;
        do {
            number = random.nextInt(90) + 1;
        } while (generatedNumbers.contains(number));
        
        generatedNumbers.add(number);
        return number;
    }
    



    public void updateLabels(int number) {
    boolean foundInCard1 = searchNumberInCard(card1, number);
    boolean foundInCard2 = searchNumberInCard(card2, number);

    if (foundInCard1 && foundInCard2) {
        // Number found in both cards
        // Update labels accordingly
        updateLabelsWithIndex("Number: " + number + " found in card1 and card2");
    } else if (foundInCard1) {
        // Number found only in card1
        // Update labels accordingly
        updateLabelsWithIndex("Number: " + number + " found in card1");
    } else if (foundInCard2) {
        // Number found only in card2
        // Update labels accordingly
        updateLabelsWithIndex("Number: " + number + " found in card2");
    } else {
        // Number not found in any card
        // Update labels accordingly
        updateLabelsWithIndex("Number: " + number + " not found in any card");
    }
}
    
    
public boolean searchNumberInCard(int[][] matrix, int number) {
    int rows = matrix.length;
    int cols = matrix[0].length;
    int index = 0;

    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            if (matrix[i][j] == number) {
                // Number found in the card
                System.out.println("Number " + number + " found in card at index " + index);
                return true;
            }
            index++;
        }
    }

    // Number not found in the card
    return false;
}
public void updateLabelsWithIndex(String labelText) {
    // Update labels with the provided text
    // For example:
    Debugtesting.setText(labelText);
}


public void labelchangerforgame(int x) {

    RandomizedLabel.setText(Integer.toString(x));


}

/*
private boolean isRowComplete(int[] markedCellsInRow) {
    // Check if all cells in the row are marked
    for (int count : markedCellsInRow) {
        if (count == 0) {
            return false;
        }
    }
    return true;
}
*/




private void checkAndModifyLabels(JLabel[][] card1Labels, JLabel[][] card2Labels, int number) {
    for (int i = 0; i < card1Labels.length; i++) {
        for (int j = 0; j < card1Labels[i].length; j++) {
            JLabel label1 = card1Labels[i][j];
            JLabel label2 = card2Labels[i][j];

            // Check if label text matches the generated number for card 1
            if (label1.getText().equals(Integer.toString(number))) {
                // Mark the label as red for card 1
                label1.setForeground(Color.RED);
            }

            // Check if label text matches the generated number for card 2
            if (label2.getText().equals(Integer.toString(number))) {
                // Mark the label as red for card 2
                label2.setForeground(Color.RED);
            }
        }
    }
}
private void printRedLabelCountsInRowsC1(JLabel[][] cardLabels, String cardName) {
    
    int[] redCounts = new int[cardLabels.length]; // Array to store red label counts for each row
    int rowsWithFive = 0; // Counter for rows with five red labels
    
    for (int i = 0; i < cardLabels.length; i++) {
        for (int j = 0; j < cardLabels[i].length; j++) {
            JLabel label = cardLabels[i][j];
            if (label.getForeground() == Color.RED) {
                redCounts[i]++; // Increment count if the label is red
            }
        }
        
        // Check if the current row has five red labels
        if (redCounts[i] == 5) {
            rowsWithFive++;
             
        }
    }
    
    // Print the counts for each row
    System.out.println("Red label counts for " + cardName + ":");
    for (int i = 0; i < cardLabels.length; i++) {
        System.out.println("Row " + i + ": " + redCounts[i]);
    }
    
    // Print additional messages based on conditions
    if (rowsWithFive >= 3) {
        System.out.println("tombala");
        Debugtesting.setText("Tobala!! Player1 Won!");
        JOptionPane.showMessageDialog(this, "Tobala - Player One Won !");
        
    } else if (rowsWithFive == 2) {
        System.out.println("second chinko for " + cardName);
        Debugtesting.setText("SECOND Chinko!");
     
    } else if (rowsWithFive == 1) {
        System.out.println("first chinko for " + cardName);
        Debugtesting.setText("FIRST CHINKO !");
    
    }
    
    System.out.println(); // Print an empty line for better readability
}




private void printRedLabelCountsInRowsC2(JLabel[][] cardLabels, String cardName) {
    int[] redCounts = new int[cardLabels.length]; // Array to store red label counts for each row
    int rowsWithFive = 0; // Counter for rows with five red labels
    
    for (int i = 0; i < cardLabels.length; i++) {
        for (int j = 0; j < cardLabels[i].length; j++) {
            JLabel label = cardLabels[i][j];
            if (label.getForeground() == Color.RED) {
                redCounts[i]++; // Increment count if the label is red
            }
        }
        
        // Check if the current row has five red labels
        if (redCounts[i] == 5) {
            rowsWithFive++;
        }
    }
    
    // Print the counts for each row
    System.out.println("Red label counts for " + cardName + ":");
    for (int i = 0; i < cardLabels.length; i++) {
        System.out.println("Row " + i + ": " + redCounts[i]);
    }
    
    // Print additional messages based on conditions
    if (rowsWithFive >= 3) {
        System.out.println("tombala");
        Debugtesting2.setText("Tobala!! Player2 Won!");
        JOptionPane.showMessageDialog(this, "Player Two Won !");
    } else if (rowsWithFive == 2) {
        System.out.println("second chinko for " + cardName);
        Debugtesting2.setText("SECOND Chinko!");
    } else if (rowsWithFive == 1) {
        System.out.println("first chinko for " + cardName);
        Debugtesting2.setText("FIRST CHINKO !");
    }
    
    System.out.println(); // Print an empty line for better readability
}







    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

       int x = generateNumber();
        labelchangerforgame(x);
        checkAndModifyLabels(bingoCardLabelsC1,bingoCardLabelsC2, x);
        printRedLabelCountsInRowsC1(bingoCardLabelsC1, "card1");
        System.out.println("");
        printRedLabelCountsInRowsC2(bingoCardLabelsC2, "card2");
        System.out.println("");       

    
        


        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

   

   

    private static int[][] generateRandomCard(int rows, int columns) {
        Random rand = new Random();
        int[][] card = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            // Maintain a set of numbers already chosen for each column
            Set<Integer> chosenNumbers = new HashSet<>();
            // Generate 4 unique random indices within the row
            int[] randomIndices = new int[4];
            for (int k = 0; k < 4; k++) {
                int randomIndex;
                boolean isUnique;
                do {
                    randomIndex = rand.nextInt(columns);
                    // Check if the index is unique
                    isUnique = true;
                    for (int m = 0; m < k; m++) {
                        if (randomIndices[m] == randomIndex) {
                            isUnique = false;
                            break;
                        }
                    }
                } while (!isUnique);
                // Store the unique random index
                randomIndices[k] = randomIndex;
            }
            
            // Set the values at the randomly chosen indices to -1
            for (int j = 0; j < columns; j++) {
                if (contains(randomIndices, j)) {
                    card[i][j] = -1;
                } else {
                    int lowerBound = j * 10 + 1;
                    int upperBound = (j + 1) * 10;
                    // Generate a unique number for this column
                    int randomNumber;
                    do {
                        randomNumber = rand.nextInt(upperBound - lowerBound + 1) + lowerBound;
                    } while (chosenNumbers.contains(randomNumber));
                    chosenNumbers.add(randomNumber);
                    card[i][j] = randomNumber;
                }
            }
        }
        return card;
    }

    private static boolean contains(int[] arr, int target) {
        for (int i : arr) {
            if (i == target) {
                return true;
            }
        }
        return false;
    }

// Helper method to check if an array contains a specific value
private static boolean containsy(int[] array, int value) {
    for (int element : array) {
        if (element == value) {
            return true; 
        }
    }
    return false;
}


private static void displayCardForDebug(int[][] card) {
    // Loop through each row
    for (int i = 0; i < card.length; i++) {
        // Loop through each column
        for (int j = 0; j < card[i].length; j++) {
            // Print the value at the current position
            if (card[i][j] == -1) {
                System.out.print("  X"); // Display X for -1
            } else {
                // Format the number to ensure consistent spacing
                String number = String.valueOf(card[i][j]);
                // Print leading spaces if the number has less than 3 digits
                for (int k = 0; k < 3 - number.length(); k++) {
                    System.out.print(" ");
                }
                System.out.print(number);
            }
        }
        // Move to the next line after each row
        System.out.println();
    }
}


  
       







    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameFrame("", "").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Debugtesting;
    private javax.swing.JLabel Debugtesting2;
    private javax.swing.JLabel FRethc;
    private javax.swing.JLabel FRethc_2;
    private javax.swing.JLabel FRfc;
    private javax.swing.JLabel FRfc_2;
    private javax.swing.JLabel FRffthc;
    private javax.swing.JLabel FRffthc_2;
    private javax.swing.JLabel FRfrthc;
    private javax.swing.JLabel FRfrthc_2;
    private javax.swing.JLabel FRnthC;
    private javax.swing.JLabel FRnthc_2;
    private javax.swing.JLabel FRsc;
    private javax.swing.JLabel FRsc_2;
    private javax.swing.JLabel FRsvnthc;
    private javax.swing.JLabel FRsvnthc_2;
    private javax.swing.JLabel FRsxthc;
    private javax.swing.JLabel FRsxthc_2;
    private javax.swing.JLabel FRthc;
    private javax.swing.JLabel FRthrc_2;
    private javax.swing.JLabel FirstPlayerLabel;
    private javax.swing.JLabel RandomizedLabel;
    private javax.swing.JLabel SRethc;
    private javax.swing.JLabel SRethc_2;
    private javax.swing.JLabel SRfc;
    private javax.swing.JLabel SRfc_2;
    private javax.swing.JLabel SRffthc;
    private javax.swing.JLabel SRffthc_2;
    private javax.swing.JLabel SRfrthc;
    private javax.swing.JLabel SRfrthc_2;
    private javax.swing.JLabel SRnthc;
    private javax.swing.JLabel SRnthc_2;
    private javax.swing.JLabel SRsc;
    private javax.swing.JLabel SRsc_2;
    private javax.swing.JLabel SRsvnthc;
    private javax.swing.JLabel SRsvnthc_2;
    private javax.swing.JLabel SRsxthc;
    private javax.swing.JLabel SRsxthc_2;
    private javax.swing.JLabel SRthc;
    private javax.swing.JLabel SRthrc_2;
    private javax.swing.JLabel SecondPlayerLabel;
    private javax.swing.JLabel SecondPlayerLabel1;
    private javax.swing.JLabel THRethc;
    private javax.swing.JLabel THRethc_2;
    private javax.swing.JLabel THRfc;
    private javax.swing.JLabel THRfc_2;
    private javax.swing.JLabel THRffthc;
    private javax.swing.JLabel THRfrthc;
    private javax.swing.JLabel THRfrthc_2;
    private javax.swing.JLabel THRfthc_2;
    private javax.swing.JLabel THRnthc;
    private javax.swing.JLabel THRnthc_2;
    private javax.swing.JLabel THRsc;
    private javax.swing.JLabel THRsc_2;
    private javax.swing.JLabel THRsvnthc;
    private javax.swing.JLabel THRsvnthc_2;
    private javax.swing.JLabel THRsxthc;
    private javax.swing.JLabel THRsxthc_2;
    private javax.swing.JLabel THRthc;
    private javax.swing.JLabel THRthrc_2;
    private javax.swing.JLabel fRFC_C12;
    private javax.swing.JLabel fRFC_C2;
    private javax.swing.JLabel fRFC_C4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}

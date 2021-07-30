package com.company;

import org.junit.jupiter.api.BeforeEach;

import java.io.ByteArrayInputStream;

import static org.junit.jupiter.api.Assertions.*;

class ElectionDataTest {

    ElectionData obj = new ElectionData();

    @BeforeEach
    public void initEach(){
        ByteArrayInputStream in = new ByteArrayInputStream("a\nb\n30\n40\n10".getBytes());
        System.setIn(in);
    }


    @org.junit.jupiter.api.Test
    void electionService() {
    }

    @org.junit.jupiter.api.Test
    void compute() {
    }

    @org.junit.jupiter.api.Test
    void display() {
    }
}
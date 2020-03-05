package com.company;

/*

1227 Fly, Run, Swim for Duck, Penguin, Toad classes
There are interfaces Fly (Fly), Swim (Run).
Add these interfaces to Duck, Penguin, Toad

Requirements:
1. The Solution class must contain a Fly interface with the void fly () method.
2. The Solution class must have a Swim interface with void swim () method.
3. The Solution class must contain a Run interface with the void run () method.
4. The Solution class must contain the Duck, Penguin, Toad classes.
5. An object of the Duck class must be able to fly (to support the Fly interface), to run (to support the Run interface) and to swim (to support the Swim interface).
6. A Penguin class object must be able to run (support the Run interface) and swim (support the Swim interface).
7. The Toad class object must only be able to swim (support the Swim interface).



 */

import java.io.*;
import java.lang.reflect.Array;
import java.net.URISyntaxException;
import java.nio.file.FileSystemException;
import java.nio.file.attribute.AclFileAttributeView;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.*;


public class Main {
    public static void main(String[] args) {

    }

    public interface Fly {
        public void fly();
    }

    public interface Run {
        public void run();
    }

    public interface Swim {
        public void swim();
    }

    public class Duck implements Swim, Fly, Run {

        @Override
        public void fly() {

        }

        @Override
        public void swim() {

        }

        @Override
        public void run() {
        }
    }
    public class Penguin implements Swim, Run {

        @Override
        public void run() {

        }

        @Override
        public void swim() {

        }
    }

    public class Toad implements Swim {

        @Override
        public void swim() {
        }
    }
}




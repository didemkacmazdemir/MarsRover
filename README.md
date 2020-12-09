# MarsRover
A squad of robotic rovers are to be landed by NASA on a plateau on Mars. This plateau, which is curiously rectangular, must be navigated by the rovers so that their on board cameras can get a complete view of the surrounding terrain to send back to Earth.

A rover's position and location is represented by a combination of x and y co-ordinates and a letter representing one of the four cardinal compass points.

The plateau is divided up into a grid to simplify navigation. An example position might be 0, 0, N, which means the rover is in the bottom left corner and facing North.

In order to control a rover, NASA sends a simple string of letters. 

The possible letters are 'L', 'R' and 'M'. 'L' and 'R' makes the rover spin 90 degrees left or right respectively, without moving from its current spot. 

'M' means move forward one grid point, and maintain the same heading.

Assume that the square directly North from (x, y) is (x, y+1).

Input: The first line of input is the upper-right coordinates of the plateau, the lower-left coordinates are assumed to be 0,0.

The rest of the input is information pertaining to the rovers that have been deployed. Each rover has two lines of input. 

The first line gives the rover's position, and the second line is a series of instructions telling the rover how to explore the plateau.

The position is made up of two integers and a letter separated by spaces, corresponding to the x and y co-ordinates and the rover's orientation.

Each rover will be finished sequentially, which means that the second rover won't start to move until the first one has finished moving.

Output: The output for each rover should be its final co-ordinates and heading.

Input and Output

Test Input: 

5 5 

1 2 N 

LMLMLMLMM 

3 3 E 

MMRMMRMRRM

Expected Output: 

1 3 N 

5 1 E



Soru Yorumlarım;


Aracın bulunduğu nokta x y düzlemindedir. X, Y Lokasyonunu, four cardinal compass points ile de pozisyonunu temsil eder.

0,0,N -> x=0, y=0 yönü de Kuzey e doğru olduğu anlaşılmalı,

Aracı String serisi ile kontrol edeceğiz, gideceği iki yön var Left, Right. Aracın baktığı yöne göre left ve right, sol ve sağında kalır.

Her bir L ve R harfi aracı 90 derece döndürür. Yönü N olan arac 90 derece sola dönerse yönü W olur.

String dizisi içinde L ve R yönünü, M ise bulunduğu yönden 1 birim ilerlemesi gerektiğini belirtir. Her bir M, +1 anlamına gelir


Input Yorumlama:

ilk satır, arazının xy kordinatlarını verir. Sağ üst kordinati ilk satır olarak alırız. sol alt kordinat her zaman 0,0 dır.

ikinci satır baslangıc noktaları ve baktığı yönü belirtir.

üçüncü satır ise hareket edeceği yönü belirten string dizisidir.


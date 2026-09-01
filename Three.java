t1.add(1,2);

//test
int testSum = 30;

int sum = t1.add(10,20);

if(sum == testSum){
    System.out.println("test of add success");
}

System.out.println("sum is:" + sum);

/*
Test case 1: a=10 b=20 testSum=30 result=pass
Test case 2: a=10 b=20 testSum=3 result=fail
use if else to print padd or fail
*/
Intent intent = new Intent(Intent.ACTION_MAIN);
intent.setClassName("com.android.calculator2", "com.android.calculator2.Calculator");
startActivity(intent);

int num1 = 2;
int num2 = 3;

int result = num1 + num2;

if (result == 5) {
  System.out.println("Test passed: 2 + 3 = 5");
} else {
  System.out.println("Test failed: expected result was 5 but got " + result);
}

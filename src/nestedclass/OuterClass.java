package nestedclass;

public class OuterClass {

    public String name;

    InnerClassA innerA = new InnerClassA();
    public void outerClassMethodA() {
        System.out.println("Outer method A");
        innerA.innerMethodA();
    }

    private class InnerClassA {
        private String id;

        private void innerMethodA() {
            System.out.println("Inner method A");

        }
    }
        public class InnerClassB {
            private String dob;

            public void innerMethodB() {
                System.out.println("Inner method B");


            }
        }
    }
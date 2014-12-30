/**
 * Created by huoweiguang on 14-11-29.
 */
public class OuterThis {
        class InnerThis {
            public void doSomething() {
                OuterThis.this.doAnotherThing();
                // Here, "this" alone would refer to the instance of
                // the InnerThis class, so one needs to specify that the
                // instance of the OuterThis class is what is being
                // referred to.
            }
        }

        public void doAnotherThing() {
            System.out.println("outer");
        }
}

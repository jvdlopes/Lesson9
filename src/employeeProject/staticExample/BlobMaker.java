
package employeeProject.staticExample;


public class BlobMaker {

    
    public static void main(String[] args) {
        Blob a, b, c;
        System.out.println("I start out with " + Blob.getBlobCount() + " blobs.");
        a = new Blob("Joey");
        b = new Blob("Frankie");
        c = new Blob("Moe");
        System.out.println("My blobs are called: ");
        System.out.println(a.getName());
        System.out.println(b.getName());
        System.out.println(c.getName());
        //you CAN access static methods through an object, but normally you don't
        System.out.println("c will tell how many: " + c.getBlobCount());
    }
    
}

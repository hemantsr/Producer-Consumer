package consumer;

import buffer.Buffer;
import model.TreeNode;
import util.TreeHelper;

public class DataConsumer extends Thread {

    private final Buffer<Integer> buffer;
    private final TreeNode rootNode;

    public DataConsumer(final Buffer<Integer> buffer) {
        this.buffer = buffer;
        rootNode = new TreeNode();
    }

    @Override
    public void run() {
        System.out.println("Running Consumer");
        while (!buffer.isEmpty()) {
            Integer element = buffer.get();
            TreeHelper.addElement(element, this.rootNode);
        }
        TreeHelper.printTree(this.rootNode);
        System.out.println("Shutting Down the Consumer");
    }
}

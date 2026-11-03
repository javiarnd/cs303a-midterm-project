public class FarmLinkedList {
    private AssetNode m_first;
    private int m_size = 0;

    public FarmLinkedList() {
        m_first = null;
    }

    public void add(FarmAsset asset) {
        if (isEmpty())
            m_first = new AssetNode(asset);
        else {
            AssetNode currentNode = m_first;

            while (currentNode.getLink() != null)
                currentNode = currentNode.getLink();

            currentNode.setLink(new AssetNode(asset));
        }

        m_size++;
    }

    public void remove(int index) {
        int i = 0;
        AssetNode currentNode = m_first;
        AssetNode lastNode, nextNode;

        lastNode = currentNode;

        while (i != index && currentNode.getLink() != null) {
            lastNode = currentNode;
            currentNode = currentNode.getLink();
            i++;
        }

        if (i != index)
            System.out.println("invalid index!");
        else if (i == 0) {
            m_size--;
            m_first = m_first.getLink();
        } else {
            nextNode = currentNode.getLink();
            lastNode.setLink(nextNode);
            m_size--;
        }
    }

    public boolean search(FarmAsset asset) {
        AssetNode currentNode = m_first;
        while (currentNode != null) {
            if (currentNode.getInfo().equals(asset)) {
                return true;
            }
            currentNode = currentNode.getLink();
        }
        return false;
    }

    public FarmAsset getInfo(int index) {
        if (isEmpty())
            return null;

        int i = 0;
        AssetNode currentNode = m_first;

        while (i != index && currentNode.getLink() != null) {
            currentNode = currentNode.getLink();
            i++;
        }

        if (i != index)
            return null;
        else
            return currentNode.getInfo();
    }

    public int getm_size() {
        return m_size;
    }

    public boolean isEmpty() {
        return m_size == 0;
    }

    @Override
    public String toString() {
        String s = "\n";

        for (int i = 0; i < m_size; i++) {
            FarmAsset asset = getInfo(i);
            s += "Asset " + (i + 1) + " on farm: " + asset.getFarmName() + "\n";
        }

        if (s.equals("\n"))
            s = "Farm list is empty!";

        return s;
    }
}

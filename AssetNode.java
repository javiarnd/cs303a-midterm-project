public class AssetNode {
    private FarmAsset m_info;
    private AssetNode m_link;

    public AssetNode(FarmAsset asset) {
        m_info = asset;
        m_link = null;
    }

    public void setLink(AssetNode link) {
        m_link = link;
    }

    public AssetNode getLink() {
        return m_link;
    }

    public FarmAsset getInfo() {
        return m_info;
    }
}
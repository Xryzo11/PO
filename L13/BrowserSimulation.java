public class BrowserSimulation {
    private ListStack<String> urlHistory;
    private String currentUrl = "";

    public BrowserSimulation() {
        urlHistory = new ListStack<>();
    }

    public void visitPage(String url) {
        urlHistory.push(currentUrl);
        currentUrl = url;
    }

    public void goBack() {
        if (urlHistory.size() <= 1) {
            System.out.println("Nie można dalej cofnąć");
            return;
        }
        currentUrl = urlHistory.pop();
    }

    public String getCurrentUrl() {
        return currentUrl;
    }
}

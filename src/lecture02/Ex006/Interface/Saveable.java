package lecture02.Ex006.Interface;

import lecture02.Ex006.Document.TextDocument;

public interface Saveable {
    void SaveAs(TextDocument document, String path);
}

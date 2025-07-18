package defpackage;

import android.text.Annotation;
import android.text.Editable;
import android.text.Html;
import org.xml.sax.XMLReader;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hph implements Html.TagHandler {
    @Override // android.text.Html.TagHandler
    public final void handleTag(boolean z, String str, Editable editable, XMLReader xMLReader) {
        str.getClass();
        editable.getClass();
        xMLReader.getClass();
        if (agvy.c(str, "annotation")) {
            int length = editable.length();
            if (z) {
                editable.setSpan(new Annotation("image", "image"), length, length, 17);
                return;
            }
            Object[] spans = editable.getSpans(0, editable.length(), Annotation.class);
            spans.getClass();
            int length2 = spans.length - 1;
            Object obj = null;
            if (length2 >= 0) {
                while (true) {
                    int i = length2 - 1;
                    Object obj2 = spans[length2];
                    if (editable.getSpanFlags((Annotation) obj2) == 17) {
                        obj = obj2;
                        break;
                    } else if (i < 0) {
                        break;
                    } else {
                        length2 = i;
                    }
                }
            }
            Annotation annotation = (Annotation) obj;
            int spanStart = editable.getSpanStart(annotation);
            editable.removeSpan(annotation);
            if (spanStart != length) {
                editable.setSpan(new Annotation("image", "image"), spanStart, length, 33);
            }
        }
    }
}

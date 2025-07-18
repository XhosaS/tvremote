package defpackage;

import java.util.Map;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.AttributesImpl;
import org.xml.sax.helpers.DefaultHandler;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class mez extends DefaultHandler {
    public Object a;
    private final Map b;
    private final mer c;
    private final mer d;
    private final mer e;
    private final mer f;

    public mez(Map map) {
        this.b = map;
        mer merVar = new mer();
        this.d = merVar;
        merVar.offer("");
        this.e = new mer();
        this.f = new mer();
        this.c = new mer();
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void characters(char[] cArr, int i, int i2) {
        if (this.b.get((String) this.d.peek()) != null) {
            ((StringBuilder) this.f.peek()).append(cArr, i, i2);
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void endElement(String str, String str2, String str3) {
        mjo mjoVar = (mjo) this.b.get((String) this.d.poll());
        if (mjoVar != null) {
            Attributes attributes = (Attributes) this.e.poll();
            String string = ((StringBuilder) this.f.poll()).toString();
            mer merVar = this.c;
            Object objPeek = merVar.peek();
            if (objPeek == null) {
                objPeek = this.a;
            }
            this.a = objPeek;
            mjoVar.a(merVar, attributes, string);
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void startElement(String str, String str2, String str3, Attributes attributes) {
        mer merVar = this.d;
        String str4 = ((String) merVar.peek()) + "/" + str3;
        merVar.offer(str4);
        mjo mjoVar = (mjo) this.b.get(str4);
        if (mjoVar != null) {
            this.e.offer(attributes != null ? new AttributesImpl(attributes) : mfa.a);
            this.f.offer(new StringBuilder());
            mjoVar.b(this.c, attributes);
        }
    }
}

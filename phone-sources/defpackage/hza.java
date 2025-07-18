package defpackage;

import org.xml.sax.SAXException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hza extends hyj {
    protected hza() {
    }

    @Override // defpackage.hyj, defpackage.hyl
    public final void b(hyp hypVar) throws SAXException {
        if (!(hypVar instanceof hyz)) {
            throw new SAXException(a.ch(hypVar, "Text content elements cannot contain ", " elements."));
        }
        this.i.add(hypVar);
    }
}

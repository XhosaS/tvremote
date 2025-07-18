package defpackage;

import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.List;
import org.xml.sax.SAXException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hxm extends hyn implements hyl {
    public List a = new ArrayList();
    public Boolean b;
    public Matrix c;
    public String d;
    public int e;

    protected hxm() {
    }

    @Override // defpackage.hyl
    public final void b(hyp hypVar) throws SAXException {
        if (!(hypVar instanceof hyf)) {
            throw new SAXException(a.ch(hypVar, "Gradient elements cannot contain ", " elements."));
        }
        this.a.add(hypVar);
    }

    @Override // defpackage.hyl
    public final List n() {
        return this.a;
    }
}

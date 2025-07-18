package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gvi implements gvg {
    public final gex a;
    public final gei b = new gvh();

    public gvi(gex gexVar) {
        this.a = gexVar;
    }

    @Override // defpackage.gvg
    public final List a(String str) {
        return (List) gez.j(this.a, true, false, new gup(str, 18, (byte[][][]) null));
    }

    @Override // defpackage.gvg
    public final void b(String str) {
        gez.j(this.a, false, true, new gup(str, 17, (float[][]) null));
    }

    @Override // defpackage.gvg
    public final /* synthetic */ void c(String str, Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            gez.j(this.a, false, true, new gup(this, new fse((String) it.next(), str), 19));
        }
    }
}

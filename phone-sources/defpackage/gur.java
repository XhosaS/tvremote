package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gur implements guo {
    public final gei a = new guq();
    private final gex b;

    public gur(gex gexVar) {
        this.b = gexVar;
    }

    @Override // defpackage.guo
    public final List a(String str) {
        return (List) gez.j(this.b, true, false, new gup(str, 1));
    }

    @Override // defpackage.guo
    public final void b(fse fseVar) {
        gez.j(this.b, false, true, new gup(this, fseVar, 0));
    }
}

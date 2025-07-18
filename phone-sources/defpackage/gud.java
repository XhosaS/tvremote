package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gud implements gub {
    public final gei a = new guc();
    private final gex b;

    public gud(gex gexVar) {
        this.b = gexVar;
    }

    @Override // defpackage.gub
    public final List a(String str) {
        str.getClass();
        return (List) gez.j(this.b, true, false, new bct(str, 14));
    }

    @Override // defpackage.gub
    public final boolean b(String str) {
        str.getClass();
        return ((Boolean) gez.j(this.b, true, false, new bct(str, 16, (byte[]) null))).booleanValue();
    }

    @Override // defpackage.gub
    public final void c(fse fseVar) {
        gez.j(this.b, false, true, new bct(this, fseVar, 15));
    }
}

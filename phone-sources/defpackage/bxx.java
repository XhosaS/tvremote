package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bxx {
    private final cag a = new cag(bxz.a);

    public final bys a() {
        bys bysVar = (bys) this.a.first();
        e(bysVar);
        return bysVar;
    }

    public final void b(bys bysVar) {
        if (!bysVar.af()) {
            bty.c("DepthSortedSet.add called on an unattached node");
        }
        this.a.add(bysVar);
    }

    public final boolean c(bys bysVar) {
        return this.a.contains(bysVar);
    }

    public final boolean d() {
        return this.a.isEmpty();
    }

    public final void e(bys bysVar) {
        if (!bysVar.af()) {
            bty.c("DepthSortedSet.remove called on an unattached node");
        }
        this.a.remove(bysVar);
    }

    public final String toString() {
        return this.a.toString();
    }
}

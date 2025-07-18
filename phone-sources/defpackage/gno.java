package defpackage;

import android.graphics.Rect;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gno implements gnm {
    private final gmx a;
    private final gnn b;
    private final gnl c;

    public gno(gmx gmxVar, gnn gnnVar, gnl gnlVar) {
        this.a = gmxVar;
        this.b = gnnVar;
        this.c = gnlVar;
        if (gmxVar.b() == 0 && gmxVar.a() == 0) {
            throw new IllegalArgumentException("Bounds must be non zero");
        }
        if (gmxVar.a != 0 && gmxVar.b != 0) {
            throw new IllegalArgumentException("Bounding rectangle must start at the top or left window edge for folding features");
        }
    }

    @Override // defpackage.gni
    public final Rect a() {
        return this.a.c();
    }

    @Override // defpackage.gnm
    public final gnj b() {
        gmx gmxVar = this.a;
        return (gmxVar.b() == 0 || gmxVar.a() == 0) ? gnj.a : gnj.b;
    }

    @Override // defpackage.gnm
    public final gnk c() {
        gmx gmxVar = this.a;
        return gmxVar.b() > gmxVar.a() ? gnk.b : gnk.a;
    }

    @Override // defpackage.gnm
    public final gnl d() {
        return this.c;
    }

    @Override // defpackage.gnm
    public final boolean e() {
        gnn gnnVar = this.b;
        if (yks.e(gnnVar, gnn.b)) {
            return true;
        }
        return yks.e(gnnVar, gnn.a) && yks.e(this.c, gnl.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!yks.e(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        gno gnoVar = (gno) obj;
        return yks.e(this.a, gnoVar.a) && yks.e(this.b, gnoVar.b) && yks.e(this.c, gnoVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "gno { " + this.a + ", type=" + this.b + ", state=" + this.c + " }";
    }
}

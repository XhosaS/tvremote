package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class elr {
    public static final elr a = new hmy().e();
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public elr(hmy hmyVar) {
        this.b = hmyVar.b;
        this.c = hmyVar.c;
        this.d = hmyVar.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            elr elrVar = (elr) obj;
            if (this.b == elrVar.b && this.c == elrVar.c && this.d == elrVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        boolean z = this.b;
        boolean z2 = this.c;
        return ((z ? 1 : 0) << 2) + (z2 ? 1 : 0) + (z2 ? 1 : 0) + (this.d ? 1 : 0);
    }
}

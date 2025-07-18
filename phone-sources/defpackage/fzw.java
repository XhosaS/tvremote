package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fzw {
    public static final fzw a;
    public final fzv b;
    public final fzv c;
    public final fzv d;
    public final boolean e;
    public final boolean f;

    static {
        fzu fzuVar = fzu.b;
        a = new fzw(fzuVar, fzuVar, fzuVar);
    }

    public fzw(fzv fzvVar, fzv fzvVar2, fzv fzvVar3) {
        fzvVar.getClass();
        fzvVar2.getClass();
        fzvVar3.getClass();
        this.b = fzvVar;
        this.c = fzvVar2;
        this.d = fzvVar3;
        boolean z = false;
        this.e = (fzvVar instanceof fzs) || (fzvVar3 instanceof fzs) || (fzvVar2 instanceof fzs);
        if ((fzvVar instanceof fzu) && (fzvVar3 instanceof fzu) && (fzvVar2 instanceof fzu)) {
            z = true;
        }
        this.f = z;
    }

    public static /* synthetic */ fzw a(fzw fzwVar, fzv fzvVar, fzv fzvVar2, fzv fzvVar3, int i) {
        if ((i & 1) != 0) {
            fzvVar = fzwVar.b;
        }
        if ((i & 2) != 0) {
            fzvVar2 = fzwVar.c;
        }
        if ((i & 4) != 0) {
            fzvVar3 = fzwVar.d;
        }
        fzvVar.getClass();
        fzvVar2.getClass();
        fzvVar3.getClass();
        return new fzw(fzvVar, fzvVar2, fzvVar3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fzw)) {
            return false;
        }
        fzw fzwVar = (fzw) obj;
        return yks.e(this.b, fzwVar.b) && yks.e(this.c, fzwVar.c) && yks.e(this.d, fzwVar.d);
    }

    public final int hashCode() {
        return (((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "LoadStates(refresh=" + this.b + ", prepend=" + this.c + ", append=" + this.d + ')';
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dro {
    public static final dro a = new dro(0, 0);
    public static final dro b = new dro(0, 1);
    public static final dro c = new dro(1, 1);
    public static final dro d = new dro(2, 1);
    public final int e;
    public final int f;

    public dro(int i, int i2) {
        this.e = i;
        this.f = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!yks.e(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        dro droVar = (dro) obj;
        return a.r(this.e, droVar.e) && a.r(this.f, droVar.f);
    }

    public final int hashCode() {
        return (this.e * 31) + this.f;
    }

    public final String toString() {
        return "Alignment(horizontal=" + ((Object) drm.a(this.e)) + ", vertical=" + ((Object) drn.a(this.f)) + ')';
    }
}

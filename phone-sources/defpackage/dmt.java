package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dmt {
    private final int a;
    private final int b;

    public dmt(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmt)) {
            return false;
        }
        dmt dmtVar = (dmt) obj;
        return this.a == dmtVar.a && this.b == dmtVar.b;
    }

    public final int hashCode() {
        int i = this.a;
        a.bw(i);
        int i2 = this.b;
        a.bw(i2);
        return (i * 31) + i2;
    }

    public final String toString() {
        return "SizeSelector(width=" + ((Object) cwn.p(this.a)) + ", height=" + ((Object) cwn.p(this.b)) + ')';
    }
}

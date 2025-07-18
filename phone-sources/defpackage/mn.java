package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mn {
    public final yjv a;
    public final np b;

    public mn(yjv yjvVar, np npVar) {
        this.a = yjvVar;
        this.b = npVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mn)) {
            return false;
        }
        mn mnVar = (mn) obj;
        return yks.e(this.a, mnVar.a) && yks.e(this.b, mnVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "Slide(slideOffset=" + this.a + ", animationSpec=" + this.b + ')';
    }
}

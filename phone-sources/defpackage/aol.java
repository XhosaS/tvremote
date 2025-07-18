package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aol {
    public final Object a;
    public final yka b;

    public aol(Object obj, yka ykaVar) {
        this.a = obj;
        this.b = ykaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aol)) {
            return false;
        }
        aol aolVar = (aol) obj;
        return yks.e(this.a, aolVar.a) && yks.e(this.b, aolVar.b);
    }

    public final int hashCode() {
        Object obj = this.a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "FadeInFadeOutAnimationItem(key=" + this.a + ", transition=" + this.b + ')';
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class asa {
    public final Object a;
    public final yka b;

    public asa(Object obj, yka ykaVar) {
        this.a = obj;
        this.b = ykaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof asa)) {
            return false;
        }
        asa asaVar = (asa) obj;
        return yks.e(this.a, asaVar.a) && yks.e(this.b, asaVar.b);
    }

    public final int hashCode() {
        Object obj = this.a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "FadeInFadeOutAnimationItem(key=" + this.a + ", transition=" + this.b + ')';
    }
}

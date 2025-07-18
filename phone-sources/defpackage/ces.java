package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ces {
    public final String a;
    public final yfq b;

    public ces(String str, yfq yfqVar) {
        this.a = str;
        this.b = yfqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ces)) {
            return false;
        }
        ces cesVar = (ces) obj;
        return yks.e(this.a, cesVar.a) && yks.e(this.b, cesVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        return ((str != null ? str.hashCode() : 0) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "AccessibilityAction(label=" + this.a + ", action=" + this.b + ')';
    }
}

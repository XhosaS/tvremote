package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cgk {
    public final cgl a;
    public final int b;
    public final int c;

    public cgk(cgl cglVar, int i, int i2) {
        this.a = cglVar;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cgk)) {
            return false;
        }
        cgk cgkVar = (cgk) obj;
        return yks.e(this.a, cgkVar.a) && this.b == cgkVar.b && this.c == cgkVar.c;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b) * 31) + this.c;
    }

    public final String toString() {
        return "ParagraphIntrinsicInfo(intrinsics=" + this.a + ", startIndex=" + this.b + ", endIndex=" + this.c + ')';
    }
}

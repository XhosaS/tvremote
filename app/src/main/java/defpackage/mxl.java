package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mxl extends mye {
    private final String a;
    private final int b;

    public mxl(String str, int i) {
        if (str == null) {
            throw new NullPointerException("Null fontName");
        }
        this.a = str;
        this.b = i;
    }

    @Override // defpackage.mye
    public final int a() {
        return this.b;
    }

    @Override // defpackage.mye
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mye) {
            mye myeVar = (mye) obj;
            if (this.a.equals(myeVar.b()) && this.b == myeVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        return "LegacyFontKey{fontName=" + this.a + ", weightAdjustment=" + this.b + "}";
    }
}

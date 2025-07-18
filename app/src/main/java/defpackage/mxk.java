package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mxk extends myd {
    private final String a;
    private final int b;
    private final boolean c;

    public mxk(String str, int i, boolean z) {
        if (str == null) {
            throw new NullPointerException("Null fontName");
        }
        this.a = str;
        this.b = i;
        this.c = z;
    }

    @Override // defpackage.myd
    public final int a() {
        return this.b;
    }

    @Override // defpackage.myd
    public final String b() {
        return this.a;
    }

    @Override // defpackage.myd
    public final boolean c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof myd) {
            myd mydVar = (myd) obj;
            if (this.a.equals(mydVar.b()) && this.b == mydVar.a() && this.c == mydVar.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ (true != this.c ? 1237 : 1231);
    }

    public final String toString() {
        return "FontKey{fontName=" + this.a + ", weight=" + this.b + ", italic=" + this.c + "}";
    }
}

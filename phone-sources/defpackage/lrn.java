package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lrn {
    public final ieg a;
    public final String b;
    public final int c;
    public final int d;
    public final int e;

    public lrn() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lrn) {
            lrn lrnVar = (lrn) obj;
            if (this.a.equals(lrnVar.a) && this.b.equals(lrnVar.b) && this.c == lrnVar.c && this.d == lrnVar.d && this.e == lrnVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ this.e;
    }

    public final String toString() {
        return "SuggestRequest{account=" + String.valueOf(this.a) + ", partialQuery=" + this.b + ", iconBlobSize=" + this.c + ", maxAsset=" + this.d + ", maxCollection=" + this.e + "}";
    }

    public lrn(ieg iegVar, String str, int i, int i2, int i3) {
        this.a = iegVar;
        this.b = str;
        this.c = i;
        this.d = i2;
        this.e = i3;
    }
}

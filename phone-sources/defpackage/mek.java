package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mek {
    public final String a;
    public final String b;
    public final int c;
    public final ieg d;

    public mek() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mek) {
            mek mekVar = (mek) obj;
            if (this.a.equals(mekVar.a) && this.b.equals(mekVar.b) && this.c == mekVar.c && this.d.equals(mekVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        return "AnnotationData{text=" + this.a + ", contentDescription=" + this.b + ", iconResId=" + this.c + ", preferredOffer=" + this.d.toString() + "}";
    }

    public mek(String str, String str2, int i, ieg iegVar) {
        if (str == null) {
            throw new NullPointerException("Null text");
        }
        this.a = str;
        if (str2 == null) {
            throw new NullPointerException("Null contentDescription");
        }
        this.b = str2;
        this.c = i;
        if (iegVar == null) {
            throw new NullPointerException("Null preferredOffer");
        }
        this.d = iegVar;
    }
}

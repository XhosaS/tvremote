package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mww {
    public final String a;
    public final tst b;

    public mww() {
        throw null;
    }

    public static nwo a(String str) {
        nwo nwoVar = new nwo((byte[]) null, (byte[]) null);
        if (str == null) {
            throw new NullPointerException("Null description");
        }
        nwoVar.a = str;
        nwoVar.b = trk.a;
        return nwoVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mww) {
            mww mwwVar = (mww) obj;
            if (this.a.equals(mwwVar.a) && this.b.equals(mwwVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "DiscountAnnotationViewModel{description=" + this.a + ", strikethroughPrice=" + String.valueOf(this.b) + "}";
    }

    public mww(String str, tst tstVar) {
        this.a = str;
        this.b = tstVar;
    }
}

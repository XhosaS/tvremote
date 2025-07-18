package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mwk {
    public final CharSequence a;
    public final String b;

    public mwk() {
        throw null;
    }

    public static nwo a() {
        nwo nwoVar = new nwo();
        nwoVar.f("");
        nwoVar.e("");
        return nwoVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mwk) {
            mwk mwkVar = (mwk) obj;
            if (this.a.equals(mwkVar.a) && this.b.equals(mwkVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "AccessibleText{text=" + String.valueOf(this.a) + ", contentDescription=" + this.b + "}";
    }

    public mwk(CharSequence charSequence, String str) {
        this.a = charSequence;
        this.b = str;
    }
}

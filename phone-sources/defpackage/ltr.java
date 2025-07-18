package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ltr {
    public final tst a;
    public final ksn b;

    public ltr() {
        throw null;
    }

    public static ltr a(ksn ksnVar, String str) {
        nwo nwoVar = new nwo((byte[]) null, (char[]) null);
        nwoVar.b = ksnVar;
        nwoVar.h(str);
        return nwoVar.g();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ltr) {
            ltr ltrVar = (ltr) obj;
            if (this.a.equals(ltrVar.a) && this.b.equals(ltrVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        ksn ksnVar = this.b;
        return "GetWatchEventsRequest{videoId=" + String.valueOf(this.a) + ", account=" + String.valueOf(ksnVar) + "}";
    }

    public ltr(tst tstVar, ksn ksnVar) {
        this.a = tstVar;
        this.b = ksnVar;
    }
}

package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ksq implements kst {
    private final ksr a;
    private final String b;
    private final Uri c;

    public ksq() {
        throw null;
    }

    @Override // defpackage.kum
    public final String dX() {
        return o().c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ksq) {
            ksq ksqVar = (ksq) obj;
            if (this.a.equals(ksqVar.a) && this.b.equals(ksqVar.b) && this.c.equals(ksqVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    @Override // defpackage.kst
    public final ksy o() {
        return ksy.a(this.a);
    }

    public final String toString() {
        Uri uri = this.c;
        return "AndroidApp{androidAppId=" + this.a.toString() + ", title=" + this.b + ", logoUrl=" + uri.toString() + "}";
    }

    public ksq(ksr ksrVar, String str, Uri uri) {
        this.a = ksrVar;
        if (str == null) {
            throw new NullPointerException("Null title");
        }
        this.b = str;
        if (uri == null) {
            throw new NullPointerException("Null logoUrl");
        }
        this.c = uri;
    }
}

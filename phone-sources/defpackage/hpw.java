package defpackage;

import java.net.URL;
import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hpw implements hlg {
    public final hpx b;
    public final URL c;
    public final String d;
    public String e;
    public URL f;
    private volatile byte[] g;
    private int h;

    public hpw(String str) {
        hpx hpxVar = hpx.a;
        this.c = null;
        hju.n(str);
        this.d = str;
        hju.p(hpxVar);
        this.b = hpxVar;
    }

    @Override // defpackage.hlg
    public final void a(MessageDigest messageDigest) {
        if (this.g == null) {
            this.g = b().getBytes(a);
        }
        messageDigest.update(this.g);
    }

    public final String b() {
        String str = this.d;
        if (str != null) {
            return str;
        }
        URL url = this.c;
        hju.p(url);
        return url.toString();
    }

    @Override // defpackage.hlg
    public final boolean equals(Object obj) {
        if (obj instanceof hpw) {
            hpw hpwVar = (hpw) obj;
            if (b().equals(hpwVar.b()) && this.b.equals(hpwVar.b)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.hlg
    public final int hashCode() {
        int i = this.h;
        if (i != 0) {
            return i;
        }
        int iHashCode = b().hashCode();
        this.h = iHashCode;
        int iHashCode2 = (iHashCode * 31) + this.b.hashCode();
        this.h = iHashCode2;
        return iHashCode2;
    }

    public final String toString() {
        return b();
    }

    public hpw(URL url) {
        hpx hpxVar = hpx.a;
        hju.p(url);
        this.c = url;
        this.d = null;
        hju.p(hpxVar);
        this.b = hpxVar;
    }
}

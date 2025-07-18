package defpackage;

import java.net.URL;
import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dgr implements daj {
    public final dgs b;
    public final URL c;
    public final String d;
    public String e;
    public URL f;
    private volatile byte[] g;
    private int h;

    public dgr(String str, dgs dgsVar) {
        this.c = null;
        dqk.b(str);
        this.d = str;
        dqk.d(dgsVar, "Argument must not be null");
        this.b = dgsVar;
    }

    @Override // defpackage.daj
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
        dqk.d(url, "Argument must not be null");
        return url.toString();
    }

    @Override // defpackage.daj
    public final boolean equals(Object obj) {
        if (obj instanceof dgr) {
            dgr dgrVar = (dgr) obj;
            if (b().equals(dgrVar.b()) && this.b.equals(dgrVar.b)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.daj
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

    public dgr(URL url, dgs dgsVar) {
        dqk.d(url, "Argument must not be null");
        this.c = url;
        this.d = null;
        dqk.d(dgsVar, "Argument must not be null");
        this.b = dgsVar;
    }
}

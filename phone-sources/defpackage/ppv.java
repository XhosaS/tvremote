package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ppv {
    public final Uri a;
    public final int b;
    public final int c;
    public final boolean d;
    private final int e;

    public ppv(Uri uri, int i, int i2, boolean z, int i3) {
        uri.getClass();
        this.a = uri;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppv)) {
            return false;
        }
        ppv ppvVar = (ppv) obj;
        return yks.e(this.a, ppvVar.a) && this.b == ppvVar.b && this.c == ppvVar.c && this.d == ppvVar.d && this.e == ppvVar.e;
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b) * 31) + this.c) * 31) + a.q(this.d)) * 31) + this.e;
    }

    public final String toString() {
        return "FontInfo(uri=" + this.a + ", ttcIndex=" + this.b + ", weight=" + this.c + ", isItalic=" + this.d + ", resultCode=" + this.e + ")";
    }
}

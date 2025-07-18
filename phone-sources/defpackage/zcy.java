package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zcy {
    public final zdg a;
    public final zbi b;
    public final zdc c;
    public zdi d;
    public int e;
    public int f;
    public int g;
    public zco h;
    public zlj i;

    public zcy(zdg zdgVar, zbi zbiVar, zdc zdcVar) {
        this.a = zdgVar;
        this.b = zbiVar;
        this.c = zdcVar;
    }

    public final void a(IOException iOException) {
        iOException.getClass();
        this.h = null;
        if ((iOException instanceof zfh) && ((zfh) iOException).a == 8) {
            this.e++;
        } else if (iOException instanceof zdz) {
            this.f++;
        } else {
            this.g++;
        }
    }

    public final boolean b(zce zceVar) {
        zce zceVar2 = this.b.h;
        return zceVar.d == zceVar2.d && yks.e(zceVar.c, zceVar2.c);
    }
}

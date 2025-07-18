package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zdy implements zdn {
    public final zch a;
    public final zde b;
    public final zgm c;
    public int d;
    public final zdt e;
    public zcc f;
    private final zgl g;

    public zdy(zch zchVar, zde zdeVar, zgm zgmVar, zgl zglVar) {
        this.a = zchVar;
        this.b = zdeVar;
        this.c = zgmVar;
        this.g = zglVar;
        this.e = new zdt(zgmVar);
    }

    private static final boolean j(zcl zclVar) {
        return ylh.y("chunked", zcl.a(zclVar, "Transfer-Encoding"), true);
    }

    @Override // defpackage.zdn
    public final long a(zcl zclVar) {
        if (!zdo.b(zclVar)) {
            return 0L;
        }
        if (j(zclVar)) {
            return -1L;
        }
        return zcr.i(zclVar);
    }

    @Override // defpackage.zdn
    public final zde b() {
        return this.b;
    }

    @Override // defpackage.zdn
    public final zho c(zcl zclVar) {
        if (!zdo.b(zclVar)) {
            return h(0L);
        }
        if (j(zclVar)) {
            zcj zcjVar = zclVar.a;
            int i = this.d;
            if (i != 4) {
                throw new IllegalStateException(a.cf(i, "state: "));
            }
            zce zceVar = zcjVar.a;
            this.d = 5;
            return new zdv(this, zceVar);
        }
        long jI = zcr.i(zclVar);
        if (jI != -1) {
            return h(jI);
        }
        int i2 = this.d;
        if (i2 != 4) {
            throw new IllegalStateException(a.cf(i2, "state: "));
        }
        this.d = 5;
        this.b.e();
        return new zdx(this);
    }

    @Override // defpackage.zdn
    public final void d() {
        this.b.b();
    }

    @Override // defpackage.zdn
    public final void e() {
        this.g.flush();
    }

    @Override // defpackage.zdn
    public final void f(zcj zcjVar) {
        Proxy.Type type = this.b.a.b.type();
        type.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(zcjVar.b);
        sb.append(' ');
        if (zcjVar.c() || type != Proxy.Type.HTTP) {
            sb.append(wbb.F(zcjVar.a));
        } else {
            sb.append(zcjVar.a);
        }
        sb.append(" HTTP/1.1");
        i(zcjVar.c, sb.toString());
    }

    @Override // defpackage.zdn
    public final zck g() throws NumberFormatException, IOException {
        int i = this.d;
        if (i != 1 && i != 2 && i != 3) {
            throw new IllegalStateException(a.cf(i, "state: "));
        }
        try {
            zdt zdtVar = this.e;
            zds zdsVarE = wbb.E(zdtVar.a());
            zck zckVar = new zck();
            zckVar.d(zdsVarE.a);
            int i2 = zdsVarE.b;
            zckVar.b = i2;
            zckVar.c = zdsVarE.c;
            zckVar.c(zdtVar.b());
            if (i2 != 100 && (i2 < 102 || i2 >= 200)) {
                this.d = 4;
                return zckVar;
            }
            this.d = 3;
            return zckVar;
        } catch (EOFException e) {
            throw new IOException("unexpected end of stream on ".concat(this.b.a.a.h.e()), e);
        }
    }

    public final zho h(long j) {
        int i = this.d;
        if (i != 4) {
            throw new IllegalStateException(a.cf(i, "state: "));
        }
        this.d = 5;
        return new zdw(this, j);
    }

    public final void i(zcc zccVar, String str) {
        int i = this.d;
        if (i != 0) {
            throw new IllegalStateException(a.cf(i, "state: "));
        }
        zgl zglVar = this.g;
        zglVar.Z(str);
        zglVar.Z("\r\n");
        int iA = zccVar.a();
        for (int i2 = 0; i2 < iA; i2++) {
            zglVar.Z(zccVar.c(i2));
            zglVar.Z(": ");
            zglVar.Z(zccVar.d(i2));
            zglVar.Z("\r\n");
        }
        zglVar.Z("\r\n");
        this.d = 1;
    }
}

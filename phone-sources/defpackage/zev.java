package defpackage;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zev implements zdn {
    public static final List a = zcr.m("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");
    public static final List b = zcr.m("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");
    private final zde c;
    private final zeu d;
    private volatile zfb e;
    private final zci f;
    private volatile boolean g;

    public zev(zch zchVar, zde zdeVar, zeu zeuVar) {
        this.c = zdeVar;
        this.d = zeuVar;
        List list = zchVar.m;
        zci zciVar = zci.e;
        this.f = list.contains(zciVar) ? zciVar : zci.d;
    }

    @Override // defpackage.zdn
    public final long a(zcl zclVar) {
        if (zdo.b(zclVar)) {
            return zcr.i(zclVar);
        }
        return 0L;
    }

    @Override // defpackage.zdn
    public final zde b() {
        return this.c;
    }

    @Override // defpackage.zdn
    public final zho c(zcl zclVar) {
        zfb zfbVar = this.e;
        zfbVar.getClass();
        return zfbVar.h;
    }

    @Override // defpackage.zdn
    public final void d() {
        this.g = true;
        zfb zfbVar = this.e;
        if (zfbVar != null) {
            zfbVar.k(9);
        }
    }

    @Override // defpackage.zdn
    public final void e() {
        zfb zfbVar = this.e;
        zfbVar.getClass();
        synchronized (zfbVar) {
            if (!zfbVar.g && !zfbVar.g()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        zfbVar.i.close();
    }

    @Override // defpackage.zdn
    public final void f(zcj zcjVar) throws IOException {
        int i;
        zfb zfbVar;
        if (this.e == null) {
            zcc zccVar = zcjVar.c;
            ArrayList arrayList = new ArrayList(zccVar.a() + 4);
            arrayList.add(new zea(zea.c, zcjVar.b));
            zce zceVar = zcjVar.a;
            arrayList.add(new zea(zea.d, wbb.F(zceVar)));
            String strA = zcjVar.a("Host");
            if (strA != null) {
                arrayList.add(new zea(zea.f, strA));
            }
            arrayList.add(new zea(zea.e, zceVar.b));
            int iA = zccVar.a();
            for (int i2 = 0; i2 < iA; i2++) {
                String strC = zccVar.c(i2);
                Locale locale = Locale.US;
                locale.getClass();
                String lowerCase = strC.toLowerCase(locale);
                lowerCase.getClass();
                if (!a.contains(lowerCase) || (yks.e(lowerCase, "te") && yks.e(zccVar.d(i2), "trailers"))) {
                    arrayList.add(new zea(lowerCase, zccVar.d(i2)));
                }
            }
            zeu zeuVar = this.d;
            synchronized (zeuVar.q) {
                synchronized (zeuVar) {
                    if (zeuVar.e > 1073741823) {
                        zeuVar.l(8);
                    }
                    if (zeuVar.f) {
                        throw new zdz();
                    }
                    i = zeuVar.e;
                    zeuVar.e = i + 2;
                    zfbVar = new zfb(i, zeuVar, true, false, null);
                    if (zfbVar.h()) {
                        zeuVar.b.put(Integer.valueOf(i), zfbVar);
                    }
                }
                zeuVar.q.g(i, arrayList);
            }
            zeuVar.q.c();
            this.e = zfbVar;
            if (this.g) {
                zfb zfbVar2 = this.e;
                zfbVar2.getClass();
                zfbVar2.k(9);
                throw new IOException("Canceled");
            }
            zfb zfbVar3 = this.e;
            zfbVar3.getClass();
            zfbVar3.j.k(10000L, TimeUnit.MILLISECONDS);
            zfb zfbVar4 = this.e;
            zfbVar4.getClass();
            zfbVar4.k.k(10000L, TimeUnit.MILLISECONDS);
        }
    }

    @Override // defpackage.zdn
    public final zck g() throws NumberFormatException, IOException {
        zfb zfbVar = this.e;
        if (zfbVar == null) {
            throw new IOException("stream wasn't created");
        }
        zci zciVar = this.f;
        zcc zccVarA = zfbVar.a();
        zciVar.getClass();
        zds zdsVarE = null;
        upq upqVar = new upq((byte[]) null, (byte[]) null);
        int iA = zccVarA.a();
        for (int i = 0; i < iA; i++) {
            String strC = zccVarA.c(i);
            String strD = zccVarA.d(i);
            if (yks.e(strC, ":status")) {
                zdsVarE = wbb.E("HTTP/1.1 ".concat(String.valueOf(strD)));
            } else if (!b.contains(strC)) {
                upqVar.v(strC, strD);
            }
        }
        if (zdsVarE == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        zck zckVar = new zck();
        zckVar.d(zciVar);
        zckVar.b = zdsVarE.b;
        zckVar.c = zdsVarE.c;
        zckVar.c(upqVar.t());
        return zckVar;
    }
}

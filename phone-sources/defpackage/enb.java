package defpackage;

import android.net.Uri;
import j$.util.Objects;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class enb implements ezr {
    final /* synthetic */ enf a;

    public enb(enf enfVar) {
        this.a = enfVar;
    }

    @Override // defpackage.ezr
    public final /* synthetic */ void dn(ezt eztVar, long j, long j2, int i) {
        evq evqVar;
        faa faaVar = (faa) eztVar;
        if (i == 0) {
            long j3 = faaVar.a;
            evqVar = new evq(faaVar.b, j);
        } else {
            long j4 = faaVar.a;
            eey eeyVar = faaVar.b;
            faaVar.a();
            evqVar = new evq(eeyVar, j, j2);
        }
        enf enfVar = this.a;
        enfVar.o.i(evqVar, faaVar.c, i);
    }

    @Override // defpackage.ezr
    /* renamed from: do, reason: not valid java name */
    public final /* synthetic */ aacv mo349do(ezt eztVar, long j, long j2, IOException iOException, int i) {
        faa faaVar = (faa) eztVar;
        long j3 = faaVar.a;
        eey eeyVar = faaVar.b;
        faaVar.a();
        evq evqVar = new evq(eeyVar, j, j2);
        int i2 = faaVar.c;
        long jI = sew.i(new zuw(iOException, i));
        aacv aacvVar = jI == -9223372036854775807L ? ezw.f : new aacv(0, jI);
        this.a.o.g(evqVar, i2, iOException, !aacvVar.c());
        return aacvVar;
    }

    @Override // defpackage.ezr
    public final /* bridge */ /* synthetic */ void ds(ezt eztVar, long j, long j2, boolean z) {
        this.a.d((faa) eztVar, j, j2);
    }

    @Override // defpackage.ezr
    public final /* synthetic */ void du(ezt eztVar, long j, long j2) {
        faa faaVar = (faa) eztVar;
        long j3 = faaVar.a;
        eey eeyVar = faaVar.b;
        faaVar.a();
        evq evqVar = new evq(eeyVar, j, j2);
        int i = faaVar.c;
        enf enfVar = this.a;
        enfVar.o.e(evqVar, i);
        enr enrVar = (enr) faaVar.d;
        enr enrVar2 = enfVar.g;
        int iA = enrVar2 == null ? 0 : enrVar2.a();
        long j4 = enrVar.f(0).a;
        int i2 = 0;
        while (i2 < iA && enfVar.g.f(i2).a < j4) {
            i2++;
        }
        if (enrVar.d) {
            if (iA - i2 > enrVar.a()) {
                edb.e("DashMediaSource", "Loaded out of sync manifest");
            } else {
                long j5 = enfVar.m;
                if (j5 == -9223372036854775807L || enrVar.h * 1000 > j5) {
                    enfVar.l = 0;
                } else {
                    edb.e("DashMediaSource", "Loaded stale dynamic manifest: " + enrVar.h + ", " + j5);
                }
            }
            int i3 = enfVar.l;
            enfVar.l = i3 + 1;
            if (i3 < enfVar.p.h(faaVar.c)) {
                enfVar.l(Math.min((enfVar.l - 1) * 1000, 5000));
                return;
            } else {
                enfVar.d = new emv();
                return;
            }
        }
        enfVar.g = enrVar;
        enfVar.h &= enfVar.g.d;
        enfVar.i = j - j2;
        enfVar.j = j;
        enfVar.n += i2;
        synchronized (enfVar.a) {
            if (eeyVar.a.equals(enfVar.f)) {
                Uri uriA = enfVar.g.k;
                if (uriA == null) {
                    uriA = faaVar.a();
                    if (uriA.getQueryParameter("CMCD") != null) {
                        uriA = eci.o(uriA, "CMCD");
                    }
                }
                enfVar.f = uriA;
            }
        }
        enr enrVar3 = enfVar.g;
        if (!enrVar3.d || enfVar.k != -9223372036854775807L) {
            enfVar.h(true);
            return;
        }
        eoi eoiVar = enrVar3.i;
        if (eoiVar == null) {
            enfVar.b();
            return;
        }
        String str = eoiVar.a;
        if (Objects.equals(str, "urn:mpeg:dash:utc:direct:2014") || Objects.equals(str, "urn:mpeg:dash:utc:direct:2012")) {
            try {
                enfVar.f(edt.z(eoiVar.b) - enfVar.j);
                return;
            } catch (eaf e) {
                enfVar.e(e);
                return;
            }
        }
        if (Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2014") || Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2012")) {
            enfVar.k(eoiVar, new ena());
            return;
        }
        if (Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2014") || Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
            enfVar.k(eoiVar, new ene());
        } else if (Objects.equals(str, "urn:mpeg:dash:utc:ntp:2014") || Objects.equals(str, "urn:mpeg:dash:utc:ntp:2012")) {
            enfVar.b();
        } else {
            enfVar.e(new IOException("Unsupported UTC timing scheme"));
        }
    }
}

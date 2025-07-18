package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class erb implements ezr {
    public final erq a;
    public ezw d;
    public Handler e;
    public eru f;
    public erm g;
    public Uri h;
    public erl i;
    public boolean j;
    public eph l;
    public final dxc m;
    public final sew n;
    public final CopyOnWriteArrayList c = new CopyOnWriteArrayList();
    public final HashMap b = new HashMap();
    public long k = -9223372036854775807L;

    public erb(dxc dxcVar, sew sewVar, erq erqVar) {
        this.m = dxcVar;
        this.a = erqVar;
        this.n = sewVar;
    }

    public static eri f(erl erlVar, erl erlVar2) {
        long j = erlVar2.h - erlVar.h;
        List list = erlVar.o;
        int i = (int) j;
        if (i < list.size()) {
            return (eri) list.get(i);
        }
        return null;
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
        this.l.i(evqVar, faaVar.c, i);
    }

    @Override // defpackage.ezr
    /* renamed from: do */
    public final /* synthetic */ aacv mo349do(ezt eztVar, long j, long j2, IOException iOException, int i) {
        faa faaVar = (faa) eztVar;
        long j3 = faaVar.a;
        eey eeyVar = faaVar.b;
        faaVar.a();
        evq evqVar = new evq(eeyVar, j, j2);
        int i2 = faaVar.c;
        long jI = sew.i(new zuw(iOException, i));
        boolean z = jI == -9223372036854775807L;
        this.l.g(evqVar, i2, iOException, z);
        return z ? ezw.f : new aacv(0, jI);
    }

    @Override // defpackage.ezr
    public final /* synthetic */ void ds(ezt eztVar, long j, long j2, boolean z) {
        faa faaVar = (faa) eztVar;
        long j3 = faaVar.a;
        eey eeyVar = faaVar.b;
        faaVar.a();
        this.l.c(new evq(eeyVar, j, j2), 4);
    }

    @Override // defpackage.ezr
    public final /* synthetic */ void du(ezt eztVar, long j, long j2) {
        erm ermVar;
        faa faaVar = (faa) eztVar;
        ern ernVar = (ern) faaVar.d;
        boolean z = ernVar instanceof erl;
        if (z) {
            String str = ernVar.u;
            erm ermVar2 = erm.a;
            Uri uri = Uri.parse(str);
            dzd dzdVar = new dzd();
            dzdVar.a = "0";
            dzdVar.a("application/x-mpegURL");
            ermVar = new erm("", Collections.EMPTY_LIST, Collections.singletonList(new esn(uri, new dze(dzdVar), (String) null, (String) null, (String) null, (String) null)), Collections.EMPTY_LIST, Collections.EMPTY_LIST, Collections.EMPTY_LIST, Collections.EMPTY_LIST, null, null, false, Collections.EMPTY_MAP, Collections.EMPTY_LIST);
        } else {
            ermVar = (erm) ernVar;
        }
        this.g = ermVar;
        this.h = (Uri) ((esn) ermVar.c.get(0)).e;
        this.c.add(new eqz(this));
        List list = ermVar.b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Uri uri2 = (Uri) list.get(i);
            this.b.put(uri2, new era(this, uri2));
        }
        long j3 = faaVar.a;
        eey eeyVar = faaVar.b;
        faaVar.a();
        evq evqVar = new evq(eeyVar, j, j2);
        era eraVar = (era) this.b.get(this.h);
        if (z) {
            eraVar.h((erl) ernVar, evqVar);
        } else {
            eraVar.e(false);
        }
        this.l.e(evqVar, 4);
    }

    public final Uri e(Uri uri) {
        erh erhVar;
        erl erlVar = this.i;
        if (erlVar == null || !erlVar.s.e || (erhVar = (erh) erlVar.q.get(uri)) == null) {
            return uri;
        }
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(erhVar.a));
        int i = erhVar.b;
        if (i != -1) {
            builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(i));
        }
        return builderBuildUpon.build();
    }

    public final erl g(Uri uri, boolean z) {
        HashMap map = this.b;
        erl erlVar = ((era) map.get(uri)).c;
        if (erlVar != null && z) {
            if (!uri.equals(this.h)) {
                List list = this.g.c;
                int i = 0;
                while (true) {
                    if (i >= list.size()) {
                        break;
                    }
                    if (uri.equals(((esn) list.get(i)).e)) {
                        erl erlVar2 = this.i;
                        if (erlVar2 == null || !erlVar2.l) {
                            this.h = uri;
                            era eraVar = (era) map.get(uri);
                            erl erlVar3 = eraVar.c;
                            if (erlVar3 == null || !erlVar3.l) {
                                eraVar.g(e(uri));
                            } else {
                                this.i = erlVar3;
                                this.f.b(erlVar3);
                            }
                        }
                    } else {
                        i++;
                    }
                }
            }
            era eraVar2 = (era) map.get(uri);
            erl erlVar4 = eraVar2.c;
            if (!eraVar2.h) {
                eraVar2.h = true;
                if (erlVar4 != null && !erlVar4.l) {
                    eraVar2.e(true);
                }
            }
        }
        return erlVar;
    }

    public final void h(Uri uri) {
        era eraVar = (era) this.b.get(uri);
        if (eraVar != null) {
            eraVar.h = false;
        }
    }

    public final void i(Uri uri) {
        era eraVar = (era) this.b.get(uri);
        eraVar.b.a();
        IOException iOException = eraVar.g;
        if (iOException != null) {
            throw iOException;
        }
    }

    public final boolean j(Uri uri) {
        int i;
        era eraVar = (era) this.b.get(uri);
        if (eraVar.c == null) {
            return false;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jMax = Math.max(30000L, edt.F(eraVar.c.r));
        erl erlVar = eraVar.c;
        return erlVar.l || (i = erlVar.a) == 2 || i == 1 || eraVar.d + jMax > jElapsedRealtime;
    }

    public final boolean k(Uri uri, zuw zuwVar, boolean z) {
        Iterator it = this.c.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            z2 |= !((err) it.next()).k(uri, zuwVar, z);
        }
        return z2;
    }
}

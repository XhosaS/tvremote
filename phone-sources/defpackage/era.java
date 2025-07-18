package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import com.google.common.collect.Iterables;
import java.io.IOException;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class era implements ezr {
    public final Uri a;
    public final ezw b = new ezw("DefaultHlsPlaylistTracker:MediaPlaylist");
    public erl c;
    public long d;
    public long e;
    public boolean f;
    public IOException g;
    public boolean h;
    final /* synthetic */ erb i;
    private final ees j;
    private long k;
    private long l;

    public era(erb erbVar, Uri uri) {
        this.i = erbVar;
        this.a = uri;
        this.j = erbVar.m.f();
    }

    private final Uri j() {
        erl erlVar = this.c;
        if (erlVar != null) {
            erk erkVar = erlVar.s;
            if (erkVar.a != -9223372036854775807L || erkVar.e) {
                Uri.Builder builderBuildUpon = this.a.buildUpon();
                erl erlVar2 = this.c;
                if (erlVar2.s.e) {
                    builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(erlVar2.h + erlVar2.o.size()));
                    erl erlVar3 = this.c;
                    if (erlVar3.k != -9223372036854775807L) {
                        List list = erlVar3.p;
                        int size = list.size();
                        if (!list.isEmpty() && ((erg) Iterables.getLast(list)).b) {
                            size--;
                        }
                        builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                    }
                }
                erk erkVar2 = this.c.s;
                if (erkVar2.a != -9223372036854775807L) {
                    builderBuildUpon.appendQueryParameter("_HLS_skip", true != erkVar2.b ? "YES" : "v2");
                }
                return builderBuildUpon.build();
            }
        }
        return this.a;
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
        this.i.l.i(evqVar, faaVar.c, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    @Override // defpackage.ezr
    /* renamed from: do */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ defpackage.aacv mo349do(defpackage.ezt r7, long r8, long r10, java.io.IOException r12, int r13) {
        /*
            r6 = this;
            faa r7 = (defpackage.faa) r7
            evq r0 = new evq
            long r1 = r7.a
            eey r1 = r7.b
            r7.a()
            r2 = r8
            r4 = r10
            r0.<init>(r1, r2, r4)
            android.net.Uri r8 = r7.a()
            java.lang.String r9 = "_HLS_msn"
            java.lang.String r8 = r8.getQueryParameter(r9)
            boolean r9 = r12 instanceof defpackage.ero
            r10 = 1
            r11 = 0
            if (r8 != 0) goto L23
            if (r9 == 0) goto L3b
            r9 = r10
        L23:
            boolean r8 = r12 instanceof defpackage.efm
            if (r8 == 0) goto L2d
            r8 = r12
            efm r8 = (defpackage.efm) r8
            int r8 = r8.c
            goto L30
        L2d:
            r8 = 2147483647(0x7fffffff, float:NaN)
        L30:
            if (r9 != 0) goto L6f
            r9 = 400(0x190, float:5.6E-43)
            if (r8 == r9) goto L6f
            r9 = 503(0x1f7, float:7.05E-43)
            if (r8 != r9) goto L3b
            goto L6f
        L3b:
            int r7 = r7.c
            zuw r8 = new zuw
            r8.<init>(r12, r13)
            erb r9 = r6.i
            android.net.Uri r13 = r6.a
            boolean r13 = r9.k(r13, r8, r11)
            if (r13 == 0) goto L62
            long r1 = defpackage.sew.i(r8)
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r8 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r8 == 0) goto L5f
            aacv r8 = new aacv
            r8.<init>(r11, r1)
            goto L64
        L5f:
            aacv r8 = defpackage.ezw.f
            goto L64
        L62:
            aacv r8 = defpackage.ezw.e
        L64:
            boolean r11 = r8.c()
            r10 = r10 ^ r11
            eph r9 = r9.l
            r9.g(r0, r7, r12, r10)
            return r8
        L6f:
            long r8 = android.os.SystemClock.elapsedRealtime()
            r6.l = r8
            r6.e(r11)
            erb r8 = r6.i
            eph r8 = r8.l
            java.lang.String r9 = defpackage.edt.a
            int r7 = r7.c
            r8.g(r0, r7, r12, r10)
            aacv r7 = defpackage.ezw.e
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.era.mo349do(ezt, long, long, java.io.IOException, int):aacv");
    }

    @Override // defpackage.ezr
    public final /* synthetic */ void ds(ezt eztVar, long j, long j2, boolean z) {
        faa faaVar = (faa) eztVar;
        long j3 = faaVar.a;
        eey eeyVar = faaVar.b;
        faaVar.a();
        this.i.l.c(new evq(eeyVar, j, j2), 4);
    }

    @Override // defpackage.ezr
    public final /* synthetic */ void du(ezt eztVar, long j, long j2) {
        faa faaVar = (faa) eztVar;
        ern ernVar = (ern) faaVar.d;
        long j3 = faaVar.a;
        eey eeyVar = faaVar.b;
        faaVar.a();
        evq evqVar = new evq(eeyVar, j, j2);
        if (ernVar instanceof erl) {
            h((erl) ernVar, evqVar);
            this.i.l.e(evqVar, 4);
        } else {
            this.g = new eaf("Loaded playlist has unexpected type.", null, true, 4);
            this.i.l.g(evqVar, 4, this.g, true);
        }
    }

    public final void e(boolean z) {
        g(z ? j() : this.a);
    }

    public final void f(Uri uri) {
        erb erbVar = this.i;
        ezz ezzVarB = erbVar.a.b(erbVar.g, this.c);
        eex eexVar = new eex();
        eexVar.a = uri;
        eexVar.i = 1;
        faa faaVar = new faa(this.j, eexVar.a(), 4, ezzVarB);
        this.b.i(faaVar, this, erbVar.n.h(faaVar.c));
    }

    public final void g(Uri uri) {
        this.e = 0L;
        if (this.f) {
            return;
        }
        ezw ezwVar = this.b;
        if (ezwVar.h() || ezwVar.g()) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.l;
        if (jElapsedRealtime >= j) {
            f(uri);
        } else {
            this.f = true;
            this.i.e.postDelayed(new eoy(this, uri, 6), j - jElapsedRealtime);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(defpackage.erl r67, defpackage.evq r68) {
        /*
            Method dump skipped, instructions count: 549
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.era.h(erl, evq):void");
    }

    public final boolean i(long j) {
        this.e = SystemClock.elapsedRealtime() + j;
        Uri uri = this.a;
        erb erbVar = this.i;
        if (uri.equals(erbVar.h)) {
            List list = erbVar.g.c;
            int size = list.size();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            for (int i = 0; i < size; i++) {
                era eraVar = (era) erbVar.b.get(((esn) list.get(i)).e);
                eraVar.getClass();
                if (jElapsedRealtime > eraVar.e) {
                    erbVar.h = eraVar.a;
                    eraVar.g(erbVar.e(erbVar.h));
                }
            }
            return true;
        }
        return false;
    }
}

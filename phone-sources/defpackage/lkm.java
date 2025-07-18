package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import java.io.File;
import java.io.InvalidClassException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lkm implements llq {
    public int A;
    public final llh B;
    public final lsc C;
    public final man D;
    public final nux E;
    public zuw F;
    private final lzi G;
    private final mab H;
    private final ieg I;
    private final Executor J;
    private final boolean K;
    private final mfe L;
    private final idf M;
    private final lux N;
    private mff O;
    private volatile mfm P;
    private boolean Q;
    private boolean R;
    private int S;
    private lgo T;
    private volatile lgo U;
    private final lfz V;
    private final lqs W;
    public final idf a;
    public final Executor b;
    public final ieh c;
    public final String d;
    public final Executor e;
    public final lnu f;
    public final llw g;
    public final ksy h;
    public final idf i;
    public boolean j;
    public boolean k;
    public long l;
    public int m;
    public int n;
    public kuz o;
    public kuz p;
    public List q;
    public List r;
    public List s;
    public byte[] t;
    public int u;
    public boolean v;
    public kwy w;
    public kuw x;
    public int y;
    public volatile llr z;

    public lkm(lzi lziVar, lzz lzzVar, mab mabVar, man manVar, ExecutorService executorService, Executor executor, lfz lfzVar, lsc lscVar, lqs lqsVar, Context context, lzh lzhVar, idf idfVar, nux nuxVar, idf idfVar2, mem memVar, lnu lnuVar, llh llhVar, String str, boolean z, ieg iegVar, llw llwVar, lux luxVar) {
        Executor executor2 = ksk.a;
        int i = 3;
        this.O = new mff(new ehq(3));
        this.l = -1L;
        this.r = Collections.EMPTY_LIST;
        this.y = -1;
        this.A = 0;
        this.J = executor;
        this.E = nuxVar;
        this.B = llhVar;
        this.d = str;
        this.K = z;
        this.h = z ? ksy.h(str) : ksy.i(str);
        a.H(iegVar.m());
        this.I = iegVar;
        this.G = lziVar;
        this.H = mabVar;
        this.D = manVar;
        this.e = executorService;
        this.f = lnuVar;
        this.V = lfzVar;
        this.C = lscVar;
        this.W = lqsVar;
        this.g = llwVar;
        this.N = luxVar;
        Executor executor3 = ((maa) lzzVar).c;
        this.b = executor3;
        this.a = new ljt(lzzVar, 2);
        this.M = idfVar;
        this.i = idfVar2;
        this.c = new lkj(this, lzhVar);
        mfe mfeVar = new mfe(new lkh(this), false);
        this.L = mfeVar;
        lnuVar.e(4);
        mjo.e(mfeVar.a(new lkd(this, context, memVar, i)), new lxf(this, iegVar, str, idfVar2, 1), executor3);
    }

    private final void k(Cursor cursor) {
        List list = this.q;
        boolean z = list != null;
        boolean z2 = z ? ((lvd) list.get(0)).c.d : true;
        if (this.k || !z2) {
            return;
        }
        String string = cursor.getString(true != z ? 7 : 5);
        byte[] blob = cursor.getBlob(true != z ? 6 : 4);
        String strJ = z ? "" : mei.j(cursor, 8);
        if (blob == null || string == null) {
            return;
        }
        this.T = new lgo(strJ, blob, string, z, this.j, this.u, this.t);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.llq
    public final lgo a() {
        if (this.T != null && this.z != null) {
            ImmutableList immutableList = this.z.h.a;
            if (immutableList.isEmpty()) {
                krd.c("Unexpected empty mediaStreams list for: ".concat(this.d));
                return this.U;
            }
            if (this.T.a.equals(((lvd) immutableList.get(0)).b.n)) {
                this.U = this.T;
                this.T = null;
            }
        }
        return this.U;
    }

    public final synchronized void b(kvx kvxVar) {
        if (this.Q) {
            return;
        }
        this.p = kuz.a(kvxVar);
    }

    public final void c() {
        krd.b("Getting mpd of ".concat(this.d));
        llw llwVar = this.g;
        lbh lbhVarA = lgm.a();
        String strC = llwVar.c();
        Locale localeForLanguageTag = TextUtils.isEmpty(strC) ? null : Locale.forLanguageTag(strC);
        nag nagVar = new nag(null, null, null, null);
        nagVar.n(this.I);
        nagVar.o(this.h);
        nagVar.a = tst.h(localeForLanguageTag);
        nagVar.p(lbhVarA);
        lry lryVarM = nagVar.m();
        synchronized (this) {
            if (this.Q) {
                return;
            }
            int i = 2;
            if (!this.g.j()) {
                String str = this.d;
                krd.b(a.cr(str, "Getting video userdata for "));
                this.f.e(2);
                mjo.e(this.L.a(new jbj(this, 13)), new iei(this.W, ltr.a((ksn) this.I.g(), str)), this.J);
            }
            int i2 = 0;
            if (this.S != 2) {
                String str2 = this.d;
                krd.b(a.cr(str2, "Syncing purchases of "));
                this.P = new mfm();
                ksn ksnVar = (ksn) this.I.g();
                uof uofVarK = uof.k(ksnVar, str2);
                mab mabVar = this.H;
                mfe mfeVar = this.L;
                mabVar.e(uofVarK, krh.b(new krn(new mcb(this.P, 2), mfeVar.a(new lkd(this, mfeVar.b(new jbj(this, 12)), ksnVar, i2)), i2)), this.P);
            }
            this.f.e(3);
            this.J.execute(new lke(this, lryVarM, this.L.a(new lkd(this, (Locale) lryVarM.d.f(), lryVarM.a.b, i)), i2));
        }
    }

    public final synchronized void d(Context context, Cursor cursor, kst kstVar, mem memVar) {
        boolean z;
        final File file;
        lat latVar;
        List list;
        if (this.Q) {
            return;
        }
        int i = 2;
        try {
            try {
            } catch (vuq e) {
                krd.d("Failed to deserialize proto", e);
                this.E.d(2, new llt(0, -1, e, false, false, trk.a));
            }
            if (!cursor.moveToFirst()) {
                c();
            } else if (h(kstVar)) {
                e(cursor, kstVar);
                this.o = new kuz(cursor.getInt(lkl.j), cursor.getLong(lkl.k));
                int i2 = cursor.getInt(0);
                this.S = i2;
                if (i2 != 2) {
                    c();
                } else if (mei.h(cursor, lkl.l)) {
                    this.y = cursor.getInt(lkl.m);
                    int iA = mei.a(cursor, lkl.g, 0);
                    int i3 = lkl.d;
                    int[] iArr = {i3, lkl.c};
                    int i4 = 0;
                    while (true) {
                        if (i4 >= 2) {
                            z = false;
                            break;
                        } else {
                            if (cursor.isNull(iArr[i4])) {
                                z = true;
                                break;
                            }
                            i4++;
                        }
                    }
                    long j = 0;
                    long jB = mei.b(cursor, lkl.e, 0L);
                    if (z || (iA != 1 ? iA != 2 : jB <= 0)) {
                        this.E.d(2, new llt(18, -1, null, false, false, trk.a));
                    } else {
                        byte[] bArr = null;
                        try {
                            file = new File(kfw.M(context, this.y), cursor.getString(i3));
                        } catch (lkb e2) {
                            if (this.y == 0) {
                                this.E.d(2, new llt(e2.b(), -1, new lln(true), false, false, trk.a));
                            } else {
                                this.E.d(2, new llt(19, -1, new lln(false), false, false, trk.a));
                            }
                            file = null;
                        }
                        if (file != null) {
                            final long j2 = cursor.getLong(lkl.c);
                            long j3 = cursor.getLong(lkl.e);
                            if (j2 > 0) {
                                j = (j3 * 100) / j2;
                            }
                            this.A = (int) j;
                            Uri uriFromFile = Uri.fromFile(file);
                            int i5 = lkl.f;
                            byte[] blob = cursor.isNull(i5) ? null : cursor.getBlob(i5);
                            if (blob != null) {
                                vuc vucVarP = vuc.p(lat.a, blob, 0, blob.length, vtp.a());
                                vuc.B(vucVarP);
                                latVar = (lat) vucVarP;
                            } else {
                                latVar = null;
                            }
                            int i6 = lkl.g;
                            if (mei.a(cursor, i6, 0) == 1) {
                                list = Collections.EMPTY_LIST;
                            } else {
                                ArrayList arrayList = new ArrayList();
                                for (lcl lclVar : latVar.b) {
                                    arrayList.add(new lvd(uriFromFile, (kuy) this.G.a(lclVar.c).g(), lclVar));
                                }
                                list = arrayList;
                            }
                            this.q = list;
                            this.t = cursor.getBlob(lkl.h);
                            this.u = cursor.getInt(lkl.i);
                            final int i7 = cursor.getInt(i6) == 2 ? 3 : 1;
                            idf idfVar = (idf) this.M.b(Integer.valueOf(i7));
                            if (mei.h(cursor, lkl.n)) {
                                mjo.e(this.L.b(new idy() { // from class: lkg
                                    @Override // defpackage.idy
                                    public final void c(Object obj) {
                                        ieg iegVar = (ieg) obj;
                                        boolean zM = iegVar.m();
                                        lkm lkmVar = this.a;
                                        if (!zM) {
                                            File file2 = file;
                                            Throwable thI = iegVar.i();
                                            krd.d("Could not get offline file length: ".concat(file2.toString()), thI);
                                            lkmVar.E.d(2, new llt(8, -1, thI, false, false, trk.a));
                                            return;
                                        }
                                        long j4 = j2;
                                        int i8 = i7;
                                        if (i8 != 1) {
                                            if (j4 <= ((Long) iegVar.g()).longValue()) {
                                                return;
                                            }
                                        } else if (j4 == ((Long) iegVar.g()).longValue()) {
                                            return;
                                        }
                                        krd.c("Unexpected cache size received: " + i8 + " " + j4 + " " + iegVar.g().toString());
                                        lkmVar.E.d(2, new llt(19, -1, null, false, false, trk.a));
                                    }
                                }), new iei(idfVar, file), this.e);
                            }
                            mfe mfeVar = this.L;
                            final String str = this.d;
                            final boolean zD = memVar.d();
                            ksk.g(new lik(this, mfeVar.a(new idy() { // from class: lkf
                                @Override // defpackage.idy
                                public final void c(Object obj) {
                                    ieg iegVar = (ieg) obj;
                                    List list2 = (List) iegVar.h(Collections.EMPTY_LIST);
                                    lkm lkmVar = this.a;
                                    lkmVar.s = list2;
                                    krd.c("offlineCaptionTracks count = " + lkmVar.s.size());
                                    if (iegVar.k()) {
                                        boolean z2 = zD;
                                        String str2 = str;
                                        krd.d("Could not load subtitle track list for video with id: ".concat(str2), iegVar.i());
                                        if (z2) {
                                            if ((iegVar.i() instanceof InvalidClassException) || (iegVar.i() instanceof NullPointerException)) {
                                                krd.c("re-fetching broken subtitles for video with id: ".concat(str2));
                                                lkmVar.c();
                                            }
                                        }
                                    }
                                }
                            }), 5, bArr));
                            ksk.g(new lik(this, mfeVar.a(new krn(this, str, i)), 6, bArr));
                            k(cursor);
                        }
                    }
                } else {
                    c();
                    k(cursor);
                }
            }
        } finally {
            cursor.close();
        }
    }

    public final synchronized void e(Cursor cursor, kst kstVar) {
        this.j = mei.h(cursor, 3);
        long j = cursor.isNull(2) ? -1L : cursor.getLong(2) * 1000;
        this.l = j;
        this.k = j != -1 && cursor.getLong(1) - System.currentTimeMillis() > this.l;
        int i = 18;
        if (kstVar instanceof kvf) {
            kvf kvfVar = (kvf) kstVar;
            this.m = kvfVar.c() * 1000;
            this.n = kvfVar.e();
            this.w = new kwy(kvfVar);
            this.x = new kuw(kvfVar);
            ImmutableList list = FluentIterable.from(kvfVar.r()).transform(new eyt(i)).toList();
            this.v = list.isEmpty() || a.am(list, Locale.getDefault().getLanguage());
            return;
        }
        if (!(kstVar instanceof kuo)) {
            krd.c("Unexpected asset type: ".concat(kstVar.toString()));
            this.E.d(2, new llt(0, -1, null, false, false, trk.a));
            return;
        }
        kuo kuoVar = (kuo) kstVar;
        this.m = kuoVar.m * 1000;
        this.n = kuoVar.l;
        this.w = new kwy(kuoVar);
        this.x = new kuw(kuoVar);
        ImmutableList list2 = FluentIterable.from(kuoVar.w).transform(new eyt(i)).toList();
        this.v = list2.isEmpty() || a.am(list2, Locale.getDefault().getLanguage());
    }

    @Override // defpackage.llq
    public final synchronized void f() {
        mfm.a(this.P);
        this.L.e();
        this.O.a();
        this.Q = true;
    }

    public final synchronized void g(Runnable runnable) {
        if (this.Q) {
            return;
        }
        mff mffVar = new mff(runnable);
        this.O = mffVar;
        ksk.g(mffVar);
    }

    public final boolean h(kst kstVar) {
        if (!(kstVar instanceof kwf)) {
            krd.c("Unexpected unrated asset type: ".concat(kstVar.toString()));
            this.E.d(2, new llt(0, -1, null, false, false, trk.a));
            return false;
        }
        krd.e("maxRating = null");
        if (this.K) {
            this.V.p();
            return true;
        }
        this.V.o();
        return true;
    }

    @Override // defpackage.llq
    public final synchronized boolean i() {
        if (this.z == null || this.R) {
            return false;
        }
        this.R = true;
        this.B.x(this.z);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    public final synchronized void j(zuw zuwVar, Locale locale) {
        Iterator it = zuwVar.b.iterator();
        while (it.hasNext()) {
            if (((lvh) it.next()).a.isEmpty()) {
                this.E.d(1, new llt(7, -1, new lve(), false, false, trk.a));
                return;
            }
        }
        if (locale != null || zuwVar.g() <= zuwVar.a) {
            this.F = zuwVar;
            return;
        }
        this.g.m();
        this.F = zuwVar.k(this.N.b(zuwVar.i().a));
    }
}

package defpackage;

import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class exs implements ewx, ewz, ezr, ezu {
    public final int a;
    public final int[] b;
    public final dze[] c;
    public final boolean[] d;
    public final ArrayList f;
    public final eww g;
    public final eww[] h;
    public long i;
    public long j;
    public int k;
    public boolean l;
    public boolean m;
    public boolean n;
    public final enl o;
    public final eph p;
    private final ewy q;
    private final List r;
    private exp s;
    private dze t;
    private exr u;
    private final epm w;
    private final sew x;
    public final ezw e = new ezw("ChunkSampleStream");
    private final hin v = new hin();

    public exs(int i, int[] iArr, dze[] dzeVarArr, enl enlVar, ewy ewyVar, ezp ezpVar, long j, epd epdVar, eph ephVar, sew sewVar, eph ephVar2, boolean z) {
        this.a = i;
        this.b = iArr;
        this.c = dzeVarArr;
        this.o = enlVar;
        this.q = ewyVar;
        this.p = ephVar2;
        this.x = sewVar;
        this.l = z;
        ArrayList arrayList = new ArrayList();
        this.f = arrayList;
        this.r = DesugarCollections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.h = new eww[length];
        this.d = new boolean[length];
        int i2 = length + 1;
        int[] iArr2 = new int[i2];
        eww[] ewwVarArr = new eww[i2];
        eww ewwVar = new eww(ezpVar, epdVar, ephVar);
        this.g = ewwVar;
        int i3 = 0;
        iArr2[0] = i;
        ewwVarArr[0] = ewwVar;
        while (i3 < length) {
            eww ewwVar2 = new eww(ezpVar, null, null);
            this.h[i3] = ewwVar2;
            int i4 = i3 + 1;
            ewwVarArr[i4] = ewwVar2;
            iArr2[i4] = this.b[i3];
            i3 = i4;
        }
        this.w = new epm(iArr2, ewwVarArr, (byte[]) null);
        this.i = j;
        this.j = j;
    }

    private final exl k(int i) {
        ArrayList arrayList = this.f;
        exl exlVar = (exl) arrayList.get(i);
        edt.af(arrayList, i, arrayList.size());
        this.k = Math.max(this.k, arrayList.size());
        int i2 = 0;
        this.g.v(exlVar.a(0));
        while (true) {
            eww[] ewwVarArr = this.h;
            if (i2 >= ewwVarArr.length) {
                return exlVar;
            }
            eww ewwVar = ewwVarArr[i2];
            i2++;
            ewwVar.v(exlVar.a(i2));
        }
    }

    private final void l() {
        int iF = f(this.g.k(), this.k - 1);
        while (true) {
            int i = this.k;
            if (i > iF) {
                return;
            }
            this.k = i + 1;
            exl exlVar = (exl) this.f.get(i);
            dze dzeVar = exlVar.s;
            if (!dzeVar.equals(this.t)) {
                eph ephVar = this.p;
                int i2 = this.a;
                int i3 = exlVar.t;
                Object obj = exlVar.u;
                ephVar.m(i2, dzeVar, i3, exlVar.v);
            }
            this.t = dzeVar;
        }
    }

    private final boolean q(int i) {
        int iK;
        exl exlVar = (exl) this.f.get(i);
        if (this.g.k() > exlVar.a(0)) {
            return true;
        }
        int i2 = 0;
        do {
            eww[] ewwVarArr = this.h;
            if (i2 >= ewwVarArr.length) {
                return false;
            }
            iK = ewwVarArr[i2].k();
            i2++;
        } while (iK <= exlVar.a(i2));
        return true;
    }

    @Override // defpackage.ewx
    public final int a(long j) throws Throwable {
        if (j()) {
            return 0;
        }
        eww ewwVar = this.g;
        int iL = ewwVar.l(j, this.n);
        ewwVar.D(iL);
        l();
        return iL;
    }

    @Override // defpackage.ewx
    public final void b() throws IOException {
        ezw ezwVar = this.e;
        ezwVar.a();
        this.g.x();
        if (ezwVar.h()) {
            return;
        }
        enl enlVar = this.o;
        IOException iOException = enlVar.j;
        if (iOException != null) {
            throw iOException;
        }
        enlVar.a.a();
    }

    @Override // defpackage.ewz
    public final long c() {
        if (this.n) {
            return Long.MIN_VALUE;
        }
        if (j()) {
            return this.i;
        }
        long jMax = this.j;
        exl exlVarG = g();
        if (!exlVarG.f()) {
            ArrayList arrayList = this.f;
            exlVarG = arrayList.size() > 1 ? (exl) arrayList.get(arrayList.size() - 2) : null;
        }
        if (exlVarG != null) {
            jMax = Math.max(jMax, exlVarG.w);
        }
        return Math.max(jMax, this.g.p());
    }

    @Override // defpackage.ewz
    public final long d() {
        if (j()) {
            return this.i;
        }
        if (this.n) {
            return Long.MIN_VALUE;
        }
        return g().w;
    }

    @Override // defpackage.ezr
    public final /* synthetic */ void dn(ezt eztVar, long j, long j2, int i) {
        evq evqVar;
        exp expVar = (exp) eztVar;
        if (i == 0) {
            long j3 = expVar.p;
            evqVar = new evq(expVar.q, j);
        } else {
            long j4 = expVar.p;
            eey eeyVar = expVar.q;
            expVar.i();
            evqVar = new evq(eeyVar, j, j2);
        }
        eph ephVar = this.p;
        int i2 = expVar.r;
        int i3 = this.a;
        dze dzeVar = expVar.s;
        int i4 = expVar.t;
        Object obj = expVar.u;
        ephVar.q(evqVar, i2, i3, dzeVar, i4, expVar.v, expVar.w, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0143 A[LOOP:1: B:58:0x013d->B:60:0x0143, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x016d A[LOOP:2: B:62:0x0167->B:64:0x016d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0222  */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.ezr
    /* renamed from: do */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ defpackage.aacv mo349do(defpackage.ezt r27, long r28, long r30, java.io.IOException r32, int r33) {
        /*
            Method dump skipped, instructions count: 557
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.exs.mo349do(ezt, long, long, java.io.IOException, int):aacv");
    }

    @Override // defpackage.ezr
    public final /* synthetic */ void ds(ezt eztVar, long j, long j2, boolean z) {
        exp expVar = (exp) eztVar;
        this.s = null;
        long j3 = expVar.p;
        eey eeyVar = expVar.q;
        expVar.i();
        evq evqVar = new evq(eeyVar, j, j2);
        int i = expVar.r;
        dze dzeVar = expVar.s;
        int i2 = expVar.t;
        Object obj = expVar.u;
        this.p.n(evqVar, i, this.a, dzeVar, i2, expVar.v, expVar.w);
        if (z) {
            return;
        }
        if (j()) {
            i();
        } else if (expVar instanceof exl) {
            ArrayList arrayList = this.f;
            k(arrayList.size() - 1);
            if (arrayList.isEmpty()) {
                this.i = this.j;
            }
        }
        ((emx) this.q).q();
    }

    @Override // defpackage.ezr
    public final /* synthetic */ void du(ezt eztVar, long j, long j2) {
        exp expVar = (exp) eztVar;
        this.s = null;
        boolean z = expVar instanceof exv;
        enl enlVar = this.o;
        if (z) {
            int iE = enlVar.g.e(((exv) expVar).s);
            enj[] enjVarArr = enlVar.f;
            enj enjVar = enjVarArr[iE];
            if (enjVar.c == null) {
                exo exoVar = enjVar.f;
                eci.e(exoVar);
                fdg fdgVarA = exoVar.a();
                if (fdgVarA != null) {
                    enz enzVar = enjVar.a;
                    enjVarArr[iE] = new enj(enjVar.d, enzVar, enjVar.b, exoVar, enjVar.e, new enh(fdgVarA, enzVar.g));
                }
            }
        }
        enn ennVar = enlVar.e;
        if (ennVar != null) {
            long j3 = ennVar.b;
            if (j3 == -9223372036854775807L || expVar.w > j3) {
                ennVar.b = expVar.w;
            }
            ennVar.c.e = true;
        }
        long j4 = expVar.p;
        eey eeyVar = expVar.q;
        expVar.i();
        evq evqVar = new evq(eeyVar, j, j2);
        eph ephVar = this.p;
        int i = expVar.r;
        int i2 = this.a;
        dze dzeVar = expVar.s;
        int i3 = expVar.t;
        Object obj = expVar.u;
        ephVar.o(evqVar, i, i2, dzeVar, i3, expVar.v, expVar.w);
        ((emx) this.q).q();
    }

    @Override // defpackage.ewx
    public final boolean dv() {
        return !j() && this.g.F(this.n);
    }

    @Override // defpackage.ewx
    public final int e(hig higVar, ehk ehkVar, int i) {
        if (j()) {
            return -3;
        }
        l();
        return this.g.J(higVar, ehkVar, i, this.n);
    }

    public final int f(int i, int i2) {
        ArrayList arrayList;
        do {
            i2++;
            arrayList = this.f;
            if (i2 >= arrayList.size()) {
                return arrayList.size() - 1;
            }
        } while (((exl) arrayList.get(i2)).a(0) <= i);
        return i2 - 1;
    }

    public final exl g() {
        return (exl) this.f.get(r0.size() - 1);
    }

    public final void h(exr exrVar) {
        this.u = exrVar;
        this.g.y();
        int i = 0;
        while (true) {
            eww[] ewwVarArr = this.h;
            if (i >= ewwVarArr.length) {
                this.e.f(this);
                return;
            } else {
                ewwVarArr[i].y();
                i++;
            }
        }
    }

    public final void i() {
        this.g.A();
        int i = 0;
        while (true) {
            eww[] ewwVarArr = this.h;
            if (i >= ewwVarArr.length) {
                return;
            }
            ewwVarArr[i].A();
            i++;
        }
    }

    public final boolean j() {
        return this.i != -9223372036854775807L;
    }

    @Override // defpackage.ewz
    public final void m(long j) {
        ezw ezwVar = this.e;
        if (ezwVar.g() || j()) {
            return;
        }
        if (ezwVar.h()) {
            exp expVar = this.s;
            expVar.getClass();
            if ((expVar instanceof exl) && q(this.f.size() - 1)) {
                return;
            }
            enl enlVar = this.o;
            if (enlVar.j == null) {
                enlVar.g.w();
                return;
            }
            return;
        }
        enl enlVar2 = this.o;
        List list = this.r;
        int size = (enlVar2.j != null || enlVar2.g.t() < 2) ? list.size() : enlVar2.g.i(j, list);
        ArrayList arrayList = this.f;
        if (size < arrayList.size()) {
            a.ab(!ezwVar.h());
            int size2 = arrayList.size();
            while (true) {
                if (size >= size2) {
                    size = -1;
                    break;
                } else if (!q(size)) {
                    break;
                } else {
                    size++;
                }
            }
            if (size != -1) {
                long j2 = g().w;
                exl exlVarK = k(size);
                if (arrayList.isEmpty()) {
                    this.i = this.j;
                }
                this.n = false;
                this.p.l(this.a, exlVarK.v, j2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0222  */
    /* JADX WARN: Type inference failed for: r1v15, types: [ezt, java.lang.Object] */
    @Override // defpackage.ewz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean n(defpackage.eji r57) {
        /*
            Method dump skipped, instructions count: 1075
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.exs.n(eji):boolean");
    }

    @Override // defpackage.ewz
    public final boolean o() {
        return this.e.h();
    }

    @Override // defpackage.ezu
    public final void p() {
        this.g.z();
        int i = 0;
        int i2 = 0;
        while (true) {
            eww[] ewwVarArr = this.h;
            if (i2 >= ewwVarArr.length) {
                break;
            }
            ewwVarArr[i2].z();
            i2++;
        }
        enl enlVar = this.o;
        while (true) {
            enj[] enjVarArr = enlVar.f;
            if (i >= enjVarArr.length) {
                break;
            }
            exo exoVar = enjVarArr[i].f;
            if (exoVar != null) {
                exoVar.b();
            }
            i++;
        }
        exr exrVar = this.u;
        if (exrVar != null) {
            exrVar.k(this);
        }
    }
}

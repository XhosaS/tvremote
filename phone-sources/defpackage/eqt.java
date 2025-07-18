package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseIntArray;
import com.google.common.collect.Iterables;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eqt implements ezr, ezu, ewz, fdr, ewv {
    private static final Set G = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));
    public boolean A;
    public dza B;
    public final eqn C;
    public final eph D;
    public final sew E;
    private final String H;
    private final dze I;
    private final epd J;
    private final Runnable K;
    private final Runnable L;
    private final Map M;
    private exp N;
    private final SparseIntArray P;
    private fel Q;
    private boolean R;
    private long S;
    private boolean T;
    private long U;
    private eqm V;
    private final ezp W;
    private final eph X;
    public final int a;
    public final eqk b;
    public final ArrayList d;
    public final List e;
    public final Handler f;
    public final ArrayList g;
    public eqs[] h;
    public final Set i;
    public int j;
    public int k;
    public boolean l;
    public boolean m;
    public int n;
    public dze o;
    public dze p;
    public boolean q;
    public exi r;
    public Set s;
    public int[] t;
    public int u;
    public boolean[] v;
    public boolean[] w;
    public long x;
    public boolean y;
    public boolean z;
    public final ezw c = new ezw("Loader:HlsSampleStreamWrapper");
    private final ydo Y = new ydo(null, null);
    private int[] O = new int[0];

    public eqt(String str, int i, eqn eqnVar, eqk eqkVar, Map map, ezp ezpVar, long j, dze dzeVar, epd epdVar, eph ephVar, sew sewVar, eph ephVar2) {
        this.H = str;
        this.a = i;
        this.C = eqnVar;
        this.b = eqkVar;
        this.M = map;
        this.W = ezpVar;
        this.I = dzeVar;
        this.J = epdVar;
        this.X = ephVar;
        this.E = sewVar;
        this.D = ephVar2;
        Set set = G;
        this.i = new HashSet(set.size());
        this.P = new SparseIntArray(set.size());
        this.h = new eqs[0];
        this.w = new boolean[0];
        this.v = new boolean[0];
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.e = DesugarCollections.unmodifiableList(arrayList);
        this.g = new ArrayList();
        this.K = new emy(this, 4);
        this.L = new emy(this, 5);
        this.f = edt.J();
        this.x = j;
        this.S = j;
    }

    private final exi A(eba[] ebaVarArr) {
        for (int i = 0; i < ebaVarArr.length; i++) {
            eba ebaVar = ebaVarArr[i];
            int i2 = ebaVar.c;
            dze[] dzeVarArr = new dze[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                dze dzeVarC = ebaVar.c(i3);
                dzeVarArr[i3] = dzeVarC.b(this.J.a(dzeVarC));
            }
            ebaVarArr[i] = new eba(ebaVar.d, dzeVarArr);
        }
        return new exi(ebaVarArr);
    }

    private static fdm B(int i, int i2) {
        edb.e("HlsSampleStreamWrapper", a.ce(i2, i, "Unmapped track with id ", " of type "));
        return new fdm();
    }

    private final void C(int i) {
        ArrayList arrayList;
        int i2;
        a.ab(!this.c.h());
        loop0: while (true) {
            arrayList = this.d;
            if (i >= arrayList.size()) {
                i = -1;
                break;
            }
            int i3 = i;
            while (true) {
                if (i3 >= arrayList.size()) {
                    eqm eqmVar = (eqm) arrayList.get(i);
                    for (0; i2 < this.h.length; i2 + 1) {
                        i2 = this.h[i2].k() <= eqmVar.a(i2) ? i2 + 1 : 0;
                    }
                    break loop0;
                }
                if (((eqm) arrayList.get(i3)).d) {
                    break;
                } else {
                    i3++;
                }
            }
            i++;
        }
        if (i == -1) {
            return;
        }
        long j = e().w;
        eqm eqmVar2 = (eqm) arrayList.get(i);
        edt.af(arrayList, i, arrayList.size());
        for (int i4 = 0; i4 < this.h.length; i4++) {
            this.h[i4].v(eqmVar2.a(i4));
        }
        if (arrayList.isEmpty()) {
            this.S = this.x;
        } else {
            ((eqm) Iterables.getLast(arrayList)).d();
        }
        this.A = false;
        this.D.l(this.j, eqmVar2.v, j);
    }

    private final void D() {
        this.m = true;
    }

    private static int y(int i) {
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 3;
    }

    private static dze z(dze dzeVar, dze dzeVar2, boolean z) {
        String strF;
        String strU;
        if (dzeVar == null) {
            return dzeVar2;
        }
        String str = dzeVar2.Y;
        String str2 = dzeVar.U;
        int iB = eae.b(str);
        if (edt.k(str2, iB) == 1) {
            strU = edt.U(str2, iB);
            strF = eae.f(strU);
        } else {
            String strE = eae.e(str2, str);
            strF = str;
            strU = strE;
        }
        dzd dzdVar = new dzd(dzeVar2);
        dzdVar.a = dzeVar.K;
        dzdVar.b = dzeVar.L;
        dzdVar.c(dzeVar.M);
        dzdVar.d = dzeVar.N;
        dzdVar.e = dzeVar.O;
        dzdVar.f = dzeVar.P;
        dzdVar.h = z ? dzeVar.R : -1;
        dzdVar.i = z ? dzeVar.S : -1;
        dzdVar.j = strU;
        if (iB == 2) {
            dzdVar.t = dzeVar.af;
            dzdVar.u = dzeVar.ag;
            dzdVar.x = dzeVar.aj;
            iB = 2;
        }
        if (strF != null) {
            dzdVar.d(strF);
        }
        int i = dzeVar.aq;
        if (i != -1 && iB == 1) {
            dzdVar.E = i;
        }
        ead eadVarD = dzeVar.V;
        if (eadVarD != null) {
            ead eadVar = dzeVar2.V;
            if (eadVar != null) {
                eadVarD = eadVar.d(eadVarD);
            }
            dzdVar.k = eadVarD;
        }
        return new dze(dzdVar);
    }

    @Override // defpackage.ewz
    public final long c() {
        if (this.A) {
            return Long.MIN_VALUE;
        }
        if (u()) {
            return this.S;
        }
        long jMax = this.x;
        eqm eqmVarE = e();
        if (!eqmVarE.j) {
            ArrayList arrayList = this.d;
            eqmVarE = arrayList.size() > 1 ? (eqm) arrayList.get(arrayList.size() - 2) : null;
        }
        if (eqmVarE != null) {
            jMax = Math.max(jMax, eqmVarE.w);
        }
        if (this.l) {
            for (eqs eqsVar : this.h) {
                jMax = Math.max(jMax, eqsVar.p());
            }
        }
        return jMax;
    }

    @Override // defpackage.ewz
    public final long d() {
        if (u()) {
            return this.S;
        }
        if (this.A) {
            return Long.MIN_VALUE;
        }
        return e().w;
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
        eph ephVar = this.D;
        int i2 = expVar.r;
        int i3 = this.a;
        dze dzeVar = expVar.s;
        int i4 = expVar.t;
        Object obj = expVar.u;
        ephVar.q(evqVar, i2, i3, dzeVar, i4, expVar.v, expVar.w, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f4  */
    @Override // defpackage.ezr
    /* renamed from: do */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ defpackage.aacv mo349do(defpackage.ezt r18, long r19, long r21, java.io.IOException r23, int r24) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eqt.mo349do(ezt, long, long, java.io.IOException, int):aacv");
    }

    @Override // defpackage.fdr
    public final fel dq(int i, int i2) {
        int i3;
        Set set = G;
        Integer numValueOf = Integer.valueOf(i2);
        fel felVarB = null;
        boolean z = false;
        if (set.contains(numValueOf)) {
            a.H(set.contains(numValueOf));
            int i4 = this.P.get(i2, -1);
            if (i4 != -1) {
                if (this.i.add(numValueOf)) {
                    this.O[i4] = i;
                }
                felVarB = this.O[i4] == i ? this.h[i4] : B(i, i2);
            }
        } else {
            int i5 = 0;
            while (true) {
                fel[] felVarArr = this.h;
                if (i5 >= felVarArr.length) {
                    break;
                }
                if (this.O[i5] == i) {
                    felVarB = felVarArr[i5];
                    break;
                }
                i5++;
            }
        }
        if (felVarB == null) {
            if (this.T) {
                return B(i, i2);
            }
            int length = this.h.length;
            if (i2 != 1) {
                i3 = 2;
                if (i2 == 2) {
                    z = true;
                    i2 = 2;
                } else {
                    i3 = i2;
                }
            } else {
                i3 = i2;
                z = true;
            }
            eqs eqsVar = new eqs(this.W, this.J, this.X, this.M);
            eqsVar.d = this.x;
            if (z) {
                eqsVar.i(this.B);
            }
            eqsVar.C(this.U);
            eqm eqmVar = this.V;
            if (eqmVar != null) {
                eqsVar.j(eqmVar);
            }
            eqsVar.b = this;
            int i6 = length + 1;
            int[] iArrCopyOf = Arrays.copyOf(this.O, i6);
            this.O = iArrCopyOf;
            iArrCopyOf[length] = i;
            eqs[] eqsVarArr = this.h;
            String str = edt.a;
            int length2 = eqsVarArr.length;
            Object[] objArrCopyOf = Arrays.copyOf(eqsVarArr, length2 + 1);
            objArrCopyOf[length2] = eqsVar;
            this.h = (eqs[]) objArrCopyOf;
            boolean[] zArrCopyOf = Arrays.copyOf(this.w, i6);
            this.w = zArrCopyOf;
            zArrCopyOf[length] = z;
            this.R |= z;
            this.i.add(Integer.valueOf(i2));
            this.P.append(i2, length);
            if (y(i2) > y(this.j)) {
                this.k = length;
                this.j = i2;
            }
            this.v = Arrays.copyOf(this.v, i6);
            i2 = i3;
            felVarB = eqsVar;
        }
        if (i2 != 5) {
            return felVarB;
        }
        if (this.Q == null) {
            this.Q = new eqr(felVarB);
        }
        return this.Q;
    }

    @Override // defpackage.ezr
    public final /* synthetic */ void ds(ezt eztVar, long j, long j2, boolean z) {
        exp expVar = (exp) eztVar;
        this.N = null;
        long j3 = expVar.p;
        eey eeyVar = expVar.q;
        expVar.i();
        evq evqVar = new evq(eeyVar, j, j2);
        int i = expVar.r;
        dze dzeVar = expVar.s;
        int i2 = expVar.t;
        Object obj = expVar.u;
        this.D.n(evqVar, i, this.a, dzeVar, i2, expVar.v, expVar.w);
        if (z) {
            return;
        }
        if (u() || this.n == 0) {
            q();
        }
        if (this.n > 0) {
            this.C.b(this);
        }
    }

    @Override // defpackage.ezr
    public final /* synthetic */ void du(ezt eztVar, long j, long j2) {
        exp expVar = (exp) eztVar;
        this.N = null;
        if (expVar instanceof exu) {
            eqk eqkVar = this.b;
            exu exuVar = (exu) expVar;
            eqkVar.h = exuVar.a;
            Uri uri = exuVar.q.a;
            byte[] bArr = exuVar.b;
            bArr.getClass();
            eqkVar.p.e(uri, bArr);
        }
        long j3 = expVar.p;
        eey eeyVar = expVar.q;
        expVar.i();
        evq evqVar = new evq(eeyVar, j, j2);
        eph ephVar = this.D;
        int i = expVar.r;
        int i2 = this.a;
        dze dzeVar = expVar.s;
        int i3 = expVar.t;
        Object obj = expVar.u;
        ephVar.o(evqVar, i, i2, dzeVar, i3, expVar.v, expVar.w);
        if (this.m) {
            this.C.b(this);
            return;
        }
        ejh ejhVar = new ejh();
        ejhVar.a = this.x;
        n(new eji(ejhVar));
    }

    public final eqm e() {
        return (eqm) this.d.get(r0.size() - 1);
    }

    public final exi f() {
        h();
        return this.r;
    }

    public final void h() {
        a.ab(this.m);
        this.r.getClass();
        this.s.getClass();
    }

    public final void i() {
        if (this.m) {
            return;
        }
        ejh ejhVar = new ejh();
        ejhVar.a = this.x;
        n(new eji(ejhVar));
    }

    @Override // defpackage.fdr
    public final void j() {
        this.T = true;
        this.f.post(this.L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k() {
        int i;
        dze dzeVar;
        if (!this.q && this.t == null && this.l) {
            int i2 = 0;
            for (eqs eqsVar : this.h) {
                if (eqsVar.s() == null) {
                    return;
                }
            }
            exi exiVar = this.r;
            if (exiVar != null) {
                int i3 = exiVar.c;
                int[] iArr = new int[i3];
                this.t = iArr;
                Arrays.fill(iArr, -1);
                for (int i4 = 0; i4 < i3; i4++) {
                    int i5 = 0;
                    while (true) {
                        eqs[] eqsVarArr = this.h;
                        if (i5 < eqsVarArr.length) {
                            dze dzeVarS = eqsVarArr[i5].s();
                            eci.e(dzeVarS);
                            dze dzeVarC = this.r.b(i4).c(0);
                            String str = dzeVarC.Y;
                            String str2 = dzeVarS.Y;
                            int iB = eae.b(str2);
                            if (iB == 3) {
                                if (Objects.equals(str2, str) && (!("application/cea-608".equals(str2) || "application/cea-708".equals(str2)) || dzeVarS.av == dzeVarC.av)) {
                                    break;
                                } else {
                                    i5++;
                                }
                            } else if (iB == eae.b(str)) {
                                break;
                            } else {
                                i5++;
                            }
                        }
                    }
                    this.t[i4] = i5;
                }
                ArrayList arrayList = this.g;
                int size = arrayList.size();
                while (i2 < size) {
                    ((eqq) arrayList.get(i2)).c();
                    i2++;
                }
                return;
            }
            int length = this.h.length;
            int i6 = 0;
            int i7 = -1;
            int i8 = -2;
            while (true) {
                if (i6 >= length) {
                    break;
                }
                dze dzeVarS2 = this.h[i6].s();
                eci.e(dzeVarS2);
                String str3 = dzeVarS2.Y;
                int i9 = eae.p(str3) ? 2 : eae.l(str3) ? 1 : eae.o(str3) ? 3 : -2;
                if (y(i9) > y(i8)) {
                    i7 = i6;
                    i8 = i9;
                } else if (i9 == i8) {
                    i7 = -1;
                }
                i6++;
            }
            eqk eqkVar = this.b;
            this.u = -1;
            this.t = new int[length];
            for (int i10 = 0; i10 < length; i10++) {
                this.t[i10] = i10;
            }
            eba[] ebaVarArr = new eba[length];
            int i11 = 0;
            while (i11 < length) {
                dze dzeVarS3 = this.h[i11].s();
                eci.e(dzeVarS3);
                if (i11 == i7) {
                    eba ebaVar = eqkVar.e;
                    int i12 = ebaVar.c;
                    dze[] dzeVarArr = new dze[i12];
                    for (int i13 = i2; i13 < i12; i13++) {
                        dze dzeVarC2 = ebaVar.c(i13);
                        if (i8 == 1 && (dzeVar = this.I) != null) {
                            dzeVarC2 = dzeVarC2.c(dzeVar);
                        }
                        dzeVarArr[i13] = i12 == 1 ? dzeVarS3.c(dzeVarC2) : z(dzeVarC2, dzeVarS3, true);
                    }
                    ebaVarArr[i11] = new eba(this.H, dzeVarArr);
                    this.u = i11;
                    i = 0;
                } else {
                    dze dzeVar2 = null;
                    if (i8 == 2 && eae.l(dzeVarS3.Y)) {
                        dzeVar2 = this.I;
                    }
                    i = 0;
                    ebaVarArr[i11] = new eba(this.H + ":muxed:" + (i11 < i7 ? i11 : i11 - 1), z(dzeVar2, dzeVarS3, false));
                }
                i11++;
                i2 = i;
            }
            int i14 = i2;
            this.r = A(ebaVarArr);
            a.ab(this.s == null ? 1 : i14);
            this.s = Collections.EMPTY_SET;
            D();
            this.C.c();
        }
    }

    public final void l() throws IOException {
        this.c.a();
        eqk eqkVar = this.b;
        IOException iOException = eqkVar.i;
        if (iOException != null) {
            throw iOException;
        }
        Uri uri = eqkVar.j;
        if (uri == null || !uri.equals(eqkVar.k)) {
            return;
        }
        eqkVar.o.i(eqkVar.j);
    }

    @Override // defpackage.ewz
    public final void m(long j) {
        ezw ezwVar = this.c;
        if (ezwVar.g() || u()) {
            return;
        }
        if (ezwVar.h()) {
            this.N.getClass();
            eqk eqkVar = this.b;
            if (eqkVar.i == null) {
                eqkVar.m.w();
                return;
            }
            return;
        }
        List list = this.e;
        int size = list.size();
        while (size > 0) {
            int i = size - 1;
            if (this.b.a((eqm) list.get(i)) != 2) {
                break;
            } else {
                size = i;
            }
        }
        if (size < list.size()) {
            C(size);
        }
        eqk eqkVar2 = this.b;
        int size2 = (eqkVar2.i != null || eqkVar2.m.t() < 2) ? list.size() : eqkVar2.m.i(j, list);
        if (size2 < this.d.size()) {
            C(size2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x026b, code lost:
    
        if (r5.w != false) goto L127;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01df  */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12, types: [int] */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r1v14, types: [ezt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v39, types: [ezw] */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19, types: [int] */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21, types: [int] */
    /* JADX WARN: Type inference failed for: r7v24 */
    @Override // defpackage.ewz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean n(defpackage.eji r63) {
        /*
            Method dump skipped, instructions count: 1157
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eqt.n(eji):boolean");
    }

    @Override // defpackage.ewz
    public final boolean o() {
        return this.c.h();
    }

    @Override // defpackage.ezu
    public final void p() {
        for (eqs eqsVar : this.h) {
            eqsVar.z();
        }
    }

    public final void q() {
        for (eqs eqsVar : this.h) {
            eqsVar.B(this.y);
        }
        this.y = false;
    }

    public final void s(boolean z) {
        this.b.g = z;
    }

    public final void t(long j) {
        if (this.U != j) {
            this.U = j;
            for (eqs eqsVar : this.h) {
                eqsVar.C(j);
            }
        }
    }

    public final boolean u() {
        return this.S != -9223372036854775807L;
    }

    public final boolean v(long j, boolean z) throws Throwable {
        boolean zH;
        this.x = j;
        if (u()) {
            this.S = j;
            return true;
        }
        eqm eqmVar = null;
        if (this.b.l) {
            int i = 0;
            while (true) {
                ArrayList arrayList = this.d;
                if (i >= arrayList.size()) {
                    break;
                }
                eqm eqmVar2 = (eqm) arrayList.get(i);
                if (eqmVar2.v == j) {
                    eqmVar = eqmVar2;
                    break;
                }
                i++;
            }
        }
        if (this.l && !z) {
            int length = this.h.length;
            for (int i2 = 0; i2 < length; i2++) {
                eqs eqsVar = this.h[i2];
                if (eqmVar != null) {
                    zH = eqsVar.G(eqmVar.a(i2));
                } else {
                    long jD = d();
                    zH = eqsVar.H(j, jD == Long.MIN_VALUE || j < jD);
                }
                if (zH || (!this.w[i2] && this.R)) {
                }
            }
            return false;
        }
        this.S = j;
        this.A = false;
        this.d.clear();
        ezw ezwVar = this.c;
        if (ezwVar.h()) {
            if (this.l) {
                for (eqs eqsVar2 : this.h) {
                    eqsVar2.t();
                }
            }
            ezwVar.b();
        } else {
            ezwVar.c();
            q();
        }
        return true;
    }

    @Override // defpackage.ewv
    public final void w() {
        this.f.post(this.K);
    }

    public final void x(eba[] ebaVarArr, int... iArr) {
        this.r = A(ebaVarArr);
        this.s = new HashSet();
        for (int i = 0; i < iArr.length; i = 1) {
            this.s.add(this.r.b(iArr[0]));
        }
        this.u = 0;
        Handler handler = this.f;
        eqn eqnVar = this.C;
        eqnVar.getClass();
        handler.post(new emy(eqnVar, 6));
        D();
    }

    @Override // defpackage.fdr
    public final void r(fef fefVar) {
    }
}

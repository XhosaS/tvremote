package defpackage;

import android.net.Uri;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import java.io.IOException;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eqo implements evx, err {
    public evw a;
    public int b;
    public exi c;
    public final erb e;
    private final eql f;
    private final efy g;
    private final epd h;
    private final elk j;
    private int m;
    private final ezp o;
    private final eph q;
    private final eph r;
    private final dxc s;
    private final sew t;
    private final eqn p = new eqn(this);
    private ewz n = cme.u();
    private final IdentityHashMap i = new IdentityHashMap();
    private final dhq u = new dhq((byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null);
    public eqt[] d = new eqt[0];
    private eqt[] k = new eqt[0];
    private int[][] l = new int[0][];

    public eqo(eql eqlVar, erb erbVar, dxc dxcVar, efy efyVar, epd epdVar, eph ephVar, sew sewVar, eph ephVar2, ezp ezpVar, elk elkVar) {
        this.f = eqlVar;
        this.e = erbVar;
        this.s = dxcVar;
        this.g = efyVar;
        this.h = epdVar;
        this.r = ephVar;
        this.t = sewVar;
        this.q = ephVar2;
        this.o = ezpVar;
        this.j = elkVar;
    }

    private static dze q(dze dzeVar, dze dzeVar2, boolean z) {
        String strU;
        ead eadVar;
        int i;
        String str;
        int i2;
        String str2;
        int i3;
        List listOf = ImmutableList.of();
        if (dzeVar2 != null) {
            listOf = dzeVar2.M;
            str = dzeVar2.L;
            str2 = dzeVar2.N;
            i = dzeVar2.P;
            i3 = dzeVar2.O;
            i2 = dzeVar2.aq;
            eadVar = dzeVar2.V;
            strU = dzeVar2.U;
        } else {
            strU = edt.U(dzeVar.U, 1);
            eadVar = dzeVar.V;
            if (z) {
                i2 = dzeVar.aq;
                i3 = dzeVar.O;
                i = dzeVar.P;
                str2 = dzeVar.N;
                str = dzeVar.L;
                listOf = dzeVar.M;
            } else {
                i = 0;
                str = null;
                i2 = -1;
                str2 = null;
                i3 = 0;
            }
        }
        String strF = eae.f(strU);
        int i4 = z ? dzeVar.R : -1;
        int i5 = z ? dzeVar.S : -1;
        dzd dzdVar = new dzd();
        dzdVar.a = dzeVar.K;
        dzdVar.b = str;
        dzdVar.c(listOf);
        dzdVar.a(dzeVar.X);
        dzdVar.d(strF);
        dzdVar.j = strU;
        dzdVar.k = eadVar;
        dzdVar.h = i4;
        dzdVar.i = i5;
        dzdVar.E = i2;
        dzdVar.e = i3;
        dzdVar.f = i;
        dzdVar.d = str2;
        return new dze(dzdVar);
    }

    private final eqt r(String str, int i, Uri[] uriArr, dze[] dzeVarArr, dze dzeVar, List list, Map map, long j) {
        eqk eqkVar = new eqk(this.f, this.e, uriArr, dzeVarArr, this.s, this.g, this.u, list);
        epd epdVar = this.h;
        eph ephVar = this.r;
        sew sewVar = this.t;
        eph ephVar2 = this.q;
        return new eqt(str, i, this.p, eqkVar, map, this.o, j, dzeVar, epdVar, ephVar, sewVar, ephVar2);
    }

    @Override // defpackage.evx
    public final long a(long j, ekj ekjVar) {
        eqt[] eqtVarArr = this.k;
        int length = eqtVarArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            eqt eqtVar = eqtVarArr[i];
            if (eqtVar.j == 2) {
                eqk eqkVar = eqtVar.b;
                int iA = eqkVar.m.a();
                Uri[] uriArr = eqkVar.c;
                erl erlVarG = null;
                if (iA < uriArr.length && iA != -1) {
                    erlVarG = eqkVar.o.g(uriArr[eqkVar.m.r()], true);
                }
                if (erlVarG != null) {
                    List list = erlVarG.o;
                    if (!list.isEmpty()) {
                        long j2 = erlVarG.e - eqkVar.o.k;
                        long j3 = j - j2;
                        int iAy = edt.ay(list, Long.valueOf(j3), true);
                        long j4 = ((eri) list.get(iAy)).g;
                        return ekjVar.a(j3, j4, (!erlVarG.w || iAy == list.size() + (-1)) ? j4 : ((eri) list.get(iAy + 1)).g) + j2;
                    }
                }
            } else {
                i++;
            }
        }
        return j;
    }

    @Override // defpackage.err
    public final void b() {
        long j;
        for (eqt eqtVar : this.d) {
            ArrayList arrayList = eqtVar.d;
            if (!arrayList.isEmpty()) {
                eqm eqmVar = (eqm) Iterables.getLast(arrayList);
                eqk eqkVar = eqtVar.b;
                int iA = eqkVar.a(eqmVar);
                if (iA == 1) {
                    if (!eqmVar.g()) {
                        int i = eqmVar.e;
                        a.ab(i != -1);
                        erl erlVarG = eqkVar.o.g(eqkVar.c[eqkVar.e.a(eqmVar.s)], false);
                        erlVarG.getClass();
                        int i2 = (int) (eqmVar.y - erlVarG.h);
                        if (i2 < 0) {
                            j = 0;
                        } else {
                            List list = erlVarG.o;
                            j = ((erg) (i2 < list.size() ? ((eri) list.get(i2)).b : erlVarG.p).get(i)).e;
                        }
                        eqmVar.m = j;
                    }
                } else if (iA == 0) {
                    eqtVar.f.post(new eoy(eqtVar, eqmVar, 5));
                } else if (iA == 2 && !eqtVar.A) {
                    ezw ezwVar = eqtVar.c;
                    if (ezwVar.h()) {
                        ezwVar.b();
                    }
                }
            }
        }
        this.a.b(this);
    }

    @Override // defpackage.evx, defpackage.ewz
    public final long c() {
        return this.n.c();
    }

    @Override // defpackage.evx, defpackage.ewz
    public final long d() {
        return this.n.d();
    }

    @Override // defpackage.evx
    public final void dr() throws IOException {
        for (eqt eqtVar : this.d) {
            eqtVar.l();
            if (eqtVar.A && !eqtVar.m) {
                throw new eaf("Loading finished before preparation is complete.", null, true, 1);
            }
        }
    }

    @Override // defpackage.evx
    public final void dt(long j) {
        for (eqt eqtVar : this.k) {
            if (eqtVar.l && !eqtVar.u()) {
                int length = eqtVar.h.length;
                for (int i = 0; i < length; i++) {
                    eqtVar.h[i].I(j, eqtVar.v[i]);
                }
            }
        }
    }

    @Override // defpackage.evx
    public final long e() {
        return -9223372036854775807L;
    }

    @Override // defpackage.evx
    public final long f(long j) throws Throwable {
        eqt[] eqtVarArr = this.k;
        if (eqtVarArr.length > 0) {
            boolean zV = eqtVarArr[0].v(j, false);
            int i = 1;
            while (true) {
                eqt[] eqtVarArr2 = this.k;
                if (i >= eqtVarArr2.length) {
                    break;
                }
                eqtVarArr2[i].v(j, zV);
                i++;
            }
            if (zV) {
                this.u.B();
            }
        }
        return j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02d7  */
    /* JADX WARN: Type inference failed for: r24v0 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v23 */
    @Override // defpackage.evx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long g(defpackage.ezf[] r36, boolean[] r37, defpackage.ewx[] r38, boolean[] r39, long r40) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 807
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eqo.g(ezf[], boolean[], ewx[], boolean[], long):long");
    }

    @Override // defpackage.evx
    public final exi h() {
        exi exiVar = this.c;
        exiVar.getClass();
        return exiVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3, types: [int] */
    /* JADX WARN: Type inference failed for: r14v8 */
    @Override // defpackage.evx
    public final List i(List list) {
        int[] iArr;
        exi exiVarF;
        int i;
        erm ermVar = this.e.g;
        ermVar.getClass();
        List list2 = ermVar.c;
        boolean zIsEmpty = list2.isEmpty();
        boolean z = !zIsEmpty;
        int i2 = 0;
        if (zIsEmpty) {
            iArr = new int[0];
            exiVarF = exi.a;
            i = 0;
        } else {
            eqt eqtVar = this.d[0];
            iArr = this.l[0];
            exiVarF = eqtVar.f();
            i = eqtVar.u;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        boolean z2 = false;
        boolean z3 = false;
        while (it.hasNext()) {
            ezf ezfVar = (ezf) it.next();
            eba ebaVarH = ezfVar.h();
            int iA = exiVarF.a(ebaVarH);
            if (iA == -1) {
                ?? r14 = z;
                int i3 = i2;
                while (true) {
                    eqt[] eqtVarArr = this.d;
                    if (r14 >= eqtVarArr.length) {
                        break;
                    }
                    exi exiVarF2 = eqtVarArr[r14].f();
                    int iA2 = exiVarF2.a(ebaVarH);
                    if (iA2 != -1) {
                        int i4 = exiVarF2.b(iA2).e != 1 ? 2 : 1;
                        int[] iArr2 = this.l[r14];
                        for (int i5 = i3; i5 < ezfVar.t(); i5++) {
                            arrayList.add(new eas(i4, iArr2[ezfVar.q(i5)]));
                        }
                    } else {
                        r14++;
                    }
                }
                i2 = i3;
            } else if (iA == i) {
                for (int i6 = i2; i6 < ezfVar.t(); i6++) {
                    arrayList.add(new eas(i2, iArr[ezfVar.q(i6)]));
                }
                z3 = true;
            } else {
                z2 = true;
            }
        }
        int i7 = i2;
        if (z2 && !z3) {
            int i8 = iArr[i7];
            int i9 = ((dze) ((esn) list2.get(i8)).b).T;
            for (int i10 = 1; i10 < iArr.length; i10++) {
                int i11 = ((dze) ((esn) list2.get(iArr[i10])).b).T;
                if (i11 < i9) {
                    i8 = iArr[i10];
                    i9 = i11;
                }
            }
            arrayList.add(new eas(i7, i8));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x004f A[SYNTHETIC] */
    @Override // defpackage.err
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean k(android.net.Uri r17, defpackage.zuw r18, boolean r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            eqt[] r2 = r0.d
            int r3 = r2.length
            r6 = 0
            r7 = 1
        L9:
            if (r6 >= r3) goto L82
            r8 = r2[r6]
            eqk r9 = r8.b
            android.net.Uri[] r10 = r9.c
            boolean r11 = defpackage.edt.ah(r10, r1)
            if (r11 != 0) goto L1c
            r13 = r18
        L19:
            r5 = 1
            goto L7e
        L1c:
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r19 != 0) goto L3b
            sew r8 = r8.E
            ezf r8 = r9.m
            fht r8 = defpackage.fki.ag(r8)
            r13 = r18
            aacv r8 = defpackage.sew.j(r8, r13)
            if (r8 == 0) goto L3d
            int r14 = r8.a
            r15 = 2
            if (r14 != r15) goto L3d
            long r14 = r8.b
            goto L3e
        L3b:
            r13 = r18
        L3d:
            r14 = r11
        L3e:
            r8 = 0
        L3f:
            int r4 = r10.length
            r5 = -1
            if (r8 >= r4) goto L4f
            r4 = r10[r8]
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L4c
            goto L50
        L4c:
            int r8 = r8 + 1
            goto L3f
        L4f:
            r8 = r5
        L50:
            if (r8 != r5) goto L53
        L52:
            goto L19
        L53:
            ezf r4 = r9.m
            int r4 = r4.s(r8)
            if (r4 != r5) goto L5c
            goto L52
        L5c:
            r9.j = r1
            int r5 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r5 == 0) goto L7d
            ezf r5 = r9.m
            boolean r4 = r5.u(r4, r14)
            if (r4 == 0) goto L7d
            erb r4 = r9.o
            java.util.HashMap r4 = r4.b
            java.lang.Object r4 = r4.get(r1)
            era r4 = (defpackage.era) r4
            if (r4 == 0) goto L7d
            boolean r4 = r4.i(r14)
            if (r4 != 0) goto L7d
            goto L52
        L7d:
            r5 = 0
        L7e:
            r7 = r7 & r5
            int r6 = r6 + 1
            goto L9
        L82:
            evw r1 = r0.a
            r1.b(r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eqo.k(android.net.Uri, zuw, boolean):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ec A[PHI: r0
  0x00ec: PHI (r0v6 int) = (r0v5 int), (r0v5 int), (r0v4 int) binds: [B:42:0x00e1, B:44:0x00e5, B:37:0x00d1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x022e  */
    @Override // defpackage.evx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(defpackage.evw r23, long r24) {
        /*
            Method dump skipped, instructions count: 1089
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eqo.l(evw, long):void");
    }

    @Override // defpackage.evx, defpackage.ewz
    public final void m(long j) {
        this.n.m(j);
    }

    @Override // defpackage.evx, defpackage.ewz
    public final boolean n(eji ejiVar) {
        if (this.c != null) {
            return this.n.n(ejiVar);
        }
        for (eqt eqtVar : this.d) {
            eqtVar.i();
        }
        return false;
    }

    @Override // defpackage.evx, defpackage.ewz
    public final boolean o() {
        return this.n.o();
    }
}

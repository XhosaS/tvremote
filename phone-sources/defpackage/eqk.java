package defpackage;

import android.net.Uri;
import android.util.Pair;
import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eqk {
    public final eql a;
    public final ees b;
    public final Uri[] c;
    public final dze[] d;
    public final eba e;
    public final List f;
    public boolean g;
    public IOException i;
    public Uri j;
    public Uri k;
    public boolean l;
    public ezf m;
    public final erb o;
    public final dhq q;
    private final ees r;
    public final dxc p = new dxc((char[]) null);
    public byte[] h = edt.b;
    public long n = -9223372036854775807L;

    public eqk(eql eqlVar, erb erbVar, Uri[] uriArr, dze[] dzeVarArr, dxc dxcVar, efy efyVar, dhq dhqVar, List list) {
        this.a = eqlVar;
        this.o = erbVar;
        this.c = uriArr;
        this.d = dzeVarArr;
        this.q = dhqVar;
        this.f = list;
        ees eesVarF = dxcVar.f();
        this.b = eesVarF;
        if (efyVar != null) {
            eesVarF.f(efyVar);
        }
        this.r = dxcVar.f();
        this.e = new eba(dzeVarArr);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < uriArr.length; i++) {
            if ((dzeVarArr[i].P & 16384) == 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        this.m = new eqi(this.e, sfy.ae(arrayList));
    }

    public static Uri b(erl erlVar, erj erjVar) {
        String str;
        if (erjVar == null || (str = erjVar.i) == null) {
            return null;
        }
        return eci.p(erlVar.u, str);
    }

    public static eqj d(erl erlVar, long j, int i) {
        long j2 = j - erlVar.h;
        List list = erlVar.o;
        int i2 = (int) j2;
        if (i2 == list.size()) {
            if (i == -1) {
                i = 0;
            }
            List list2 = erlVar.p;
            if (i < list2.size()) {
                return new eqj((erj) list2.get(i), j, i);
            }
            return null;
        }
        eri eriVar = (eri) list.get(i2);
        if (i == -1) {
            return new eqj(eriVar, j, -1);
        }
        List list3 = eriVar.b;
        if (i < list3.size()) {
            return new eqj((erj) list3.get(i), j, i);
        }
        int i3 = i2 + 1;
        if (i3 < list.size()) {
            return new eqj((erj) list.get(i3), j + 1, -1);
        }
        List list4 = erlVar.p;
        if (list4.isEmpty()) {
            return null;
        }
        return new eqj((erj) list4.get(0), j + 1, 0);
    }

    public final int a(eqm eqmVar) {
        int i = eqmVar.e;
        if (i == -1) {
            return 1;
        }
        erl erlVarG = this.o.g(this.c[this.e.a(eqmVar.s)], false);
        erlVarG.getClass();
        int i2 = (int) (eqmVar.y - erlVarG.h);
        if (i2 < 0) {
            return 1;
        }
        List list = erlVarG.o;
        List list2 = i2 < list.size() ? ((eri) list.get(i2)).b : erlVarG.p;
        if (i >= list2.size()) {
            return 2;
        }
        erg ergVar = (erg) list2.get(i);
        if (ergVar.b) {
            return 0;
        }
        return Objects.equals(Uri.parse(eci.q(erlVarG.u, ergVar.c)), eqmVar.q.a) ? 1 : 2;
    }

    public final Pair c(eqm eqmVar, boolean z, erl erlVar, long j, long j2) {
        boolean z2 = true;
        if (eqmVar != null && !z) {
            if (!eqmVar.j) {
                return new Pair(Long.valueOf(eqmVar.y), Integer.valueOf(eqmVar.e));
            }
            int i = eqmVar.e;
            return new Pair(Long.valueOf(i == -1 ? eqmVar.m() : eqmVar.y), Integer.valueOf(i != -1 ? i + 1 : -1));
        }
        long j3 = erlVar.r + j;
        if (eqmVar != null && !this.l) {
            j2 = eqmVar.v;
        }
        if (!erlVar.l && j2 >= j3) {
            return new Pair(Long.valueOf(erlVar.h + erlVar.o.size()), -1);
        }
        long j4 = j2 - j;
        List list = erlVar.o;
        erb erbVar = this.o;
        Long lValueOf = Long.valueOf(j4);
        int i2 = 0;
        if (erbVar.j && eqmVar != null) {
            z2 = false;
        }
        int iAy = edt.ay(list, lValueOf, z2);
        long j5 = iAy + erlVar.h;
        if (iAy >= 0) {
            eri eriVar = (eri) list.get(iAy);
            List list2 = j4 < eriVar.g + eriVar.e ? eriVar.b : erlVar.p;
            while (true) {
                if (i2 >= list2.size()) {
                    break;
                }
                erg ergVar = (erg) list2.get(i2);
                if (j4 >= ergVar.g + ergVar.e) {
                    i2++;
                } else if (ergVar.a) {
                    j5 += list2 == erlVar.p ? 1L : 0L;
                    i = i2;
                }
            }
        }
        return new Pair(Long.valueOf(j5), Integer.valueOf(i));
    }

    public final void e() {
        this.o.h(this.c[this.m.r()]);
    }

    public final void f() {
        e();
        this.i = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.exy[] g(defpackage.eqm r17, long r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r8 = -1
            if (r1 != 0) goto L9
            r9 = r8
            goto L12
        L9:
            eba r2 = r0.e
            dze r3 = r1.s
            int r2 = r2.a(r3)
            r9 = r2
        L12:
            ezf r2 = r0.m
            int r10 = r2.t()
            exy[] r11 = new defpackage.exy[r10]
            r12 = 0
            r13 = r12
        L1c:
            if (r13 >= r10) goto Le2
            ezf r2 = r0.m
            int r2 = r2.q(r13)
            android.net.Uri[] r3 = r0.c
            r3 = r3[r2]
            erb r4 = r0.o
            boolean r5 = r4.j(r3)
            if (r5 != 0) goto L36
            exy r2 = defpackage.exy.b
            r11[r13] = r2
            goto Lda
        L36:
            erl r3 = r4.g(r3, r12)
            defpackage.a.aq(r3)
            long r5 = r3.e
            long r14 = r4.k
            long r5 = r5 - r14
            if (r2 == r9) goto L46
            r2 = 1
            goto L47
        L46:
            r2 = r12
        L47:
            r4 = r5
            r6 = r18
            android.util.Pair r2 = r0.c(r1, r2, r3, r4, r6)
            java.lang.Object r0 = r2.first
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            java.lang.Object r2 = r2.second
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            eqh r6 = new eqh
            java.lang.String r7 = r3.u
            long r14 = r3.h
            long r0 = r0 - r14
            int r0 = (int) r0
            if (r0 < 0) goto Ld1
            java.util.List r1 = r3.o
            int r7 = r1.size()
            if (r7 >= r0) goto L71
            goto Ld1
        L71:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            int r14 = r1.size()
            if (r0 >= r14) goto Lab
            if (r2 == r8) goto L9f
            java.lang.Object r14 = r1.get(r0)
            eri r14 = (defpackage.eri) r14
            if (r2 != 0) goto L8a
            r7.add(r14)
            goto L9d
        L8a:
            java.util.List r14 = r14.b
            int r15 = r14.size()
            if (r2 >= r15) goto L9d
            int r15 = r14.size()
            java.util.List r2 = r14.subList(r2, r15)
            r7.addAll(r2)
        L9d:
            int r0 = r0 + 1
        L9f:
            int r2 = r1.size()
            java.util.List r0 = r1.subList(r0, r2)
            r7.addAll(r0)
            r2 = r12
        Lab:
            long r0 = r3.k
            r14 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r0 == 0) goto Lcc
            if (r2 != r8) goto Lb9
            r2 = r12
        Lb9:
            java.util.List r0 = r3.p
            int r1 = r0.size()
            if (r2 >= r1) goto Lcc
            int r1 = r0.size()
            java.util.List r0 = r0.subList(r2, r1)
            r7.addAll(r0)
        Lcc:
            java.util.List r0 = j$.util.DesugarCollections.unmodifiableList(r7)
            goto Ld5
        Ld1:
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.of()
        Ld5:
            r6.<init>(r4, r0)
            r11[r13] = r6
        Lda:
            int r13 = r13 + 1
            r0 = r16
            r1 = r17
            goto L1c
        Le2:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eqk.g(eqm, long):exy[]");
    }

    public final exp h(Uri uri, int i, ezo ezoVar) {
        if (uri == null) {
            return null;
        }
        dxc dxcVar = this.p;
        byte[] bArr = (byte[]) ((LinkedHashMap) dxcVar.a).remove(uri);
        if (bArr != null) {
            dxcVar.e(uri, bArr);
            return null;
        }
        eex eexVar = new eex();
        eexVar.a = uri;
        eexVar.i = 1;
        eey eeyVarA = eexVar.a();
        ees eesVar = this.r;
        dze dzeVar = this.d[i];
        int iB = this.m.b();
        this.m.d();
        return new exu(eesVar, eeyVarA, dzeVar, iB, this.h);
    }
}

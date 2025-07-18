package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cfc implements Iterable, yli {
    public boolean a;
    public boolean b;
    public final ki c;
    private Map d;

    public cfc() {
        long[] jArr = kj.a;
        this.c = new ki((byte[]) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.cfc a() {
        /*
            r19 = this;
            r0 = r19
            cfc r1 = new cfc
            r1.<init>()
            boolean r2 = r0.a
            r1.a = r2
            boolean r2 = r0.b
            r1.b = r2
            ki r2 = r1.c
            ki r3 = r0.c
            java.lang.Object[] r4 = r3.b
            java.lang.Object[] r5 = r3.c
            long[] r3 = r3.a
            int r6 = r3.length
            int r6 = r6 + (-2)
            if (r6 < 0) goto L5a
            r7 = 0
            r8 = r7
        L20:
            r9 = r3[r8]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L55
            int r11 = r8 - r6
            r12 = r7
        L33:
            int r13 = ~r11
            int r13 = r13 >>> 31
            r14 = 8
            int r13 = 8 - r13
            if (r12 >= r13) goto L53
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r9
            r17 = 128(0x80, double:6.3E-322)
            int r13 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r13 >= 0) goto L4f
            int r13 = r8 << 3
            int r13 = r13 + r12
            r15 = r4[r13]
            r13 = r5[r13]
            r2.j(r15, r13)
        L4f:
            long r9 = r9 >> r14
            int r12 = r12 + 1
            goto L33
        L53:
            if (r13 != r14) goto L5a
        L55:
            if (r8 == r6) goto L5a
            int r8 = r8 + 1
            goto L20
        L5a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cfc.a():cfc");
    }

    public final Object b(cfm cfmVar) {
        Object objA = this.c.a(cfmVar);
        if (objA != null) {
            return objA;
        }
        throw new IllegalStateException(a.cj(cfmVar, "Key not present: ", " - consider getOrElse or getOrNull"));
    }

    public final Object c(cfm cfmVar, yjk yjkVar) {
        Object objA = this.c.a(cfmVar);
        return objA == null ? yjkVar.a() : objA;
    }

    public final void d(cfc cfcVar) {
        int i;
        ki kiVar = cfcVar.c;
        Object[] objArr = kiVar.b;
        Object[] objArr2 = kiVar.c;
        long[] jArr = kiVar.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j = jArr[i2];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = i2 - length;
                int i4 = 0;
                while (true) {
                    i = 8 - ((~i3) >>> 31);
                    if (i4 >= i) {
                        break;
                    }
                    if ((255 & j) < 128) {
                        int i5 = (i2 << 3) + i4;
                        Object obj = objArr[i5];
                        Object obj2 = objArr2[i5];
                        cfm cfmVar = (cfm) obj;
                        ki kiVar2 = this.c;
                        Object objA = kiVar2.a(cfmVar);
                        cfmVar.getClass();
                        Object objA2 = cfmVar.b.a(objA, obj2);
                        if (objA2 != null) {
                            kiVar2.j(cfmVar, objA2);
                        }
                    }
                    j >>= 8;
                    i4++;
                }
                if (i != 8) {
                    return;
                }
            }
            if (i2 == length) {
                return;
            } else {
                i2++;
            }
        }
    }

    public final void e(cfm cfmVar, Object obj) {
        if (!(obj instanceof ces) || !f(cfmVar)) {
            this.c.j(cfmVar, obj);
            return;
        }
        ki kiVar = this.c;
        Object objA = kiVar.a(cfmVar);
        objA.getClass();
        ces cesVar = (ces) objA;
        ces cesVar2 = (ces) obj;
        String str = cesVar2.a;
        if (str == null) {
            str = cesVar.a;
        }
        kiVar.j(cfmVar, new ces(str, cesVar2.b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cfc)) {
            return false;
        }
        cfc cfcVar = (cfc) obj;
        return yks.e(this.c, cfcVar.c) && this.a == cfcVar.a && this.b == cfcVar.b;
    }

    public final boolean f(cfm cfmVar) {
        return ki.e(this.c, cfmVar);
    }

    public final int hashCode() {
        return (((this.c.hashCode() * 31) + a.q(this.a)) * 31) + a.q(this.b);
    }

    @Override // java.lang.Iterable
    public final Iterator<Map.Entry<cfm<?>, Object>> iterator() {
        Map map = this.d;
        if (map == null) {
            jr jrVar = new jr(this.c);
            this.d = jrVar;
            map = jrVar;
        }
        return map.entrySet().iterator();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0079 A[PHI: r2
  0x0079: PHI (r2v6 java.lang.String) = (r2v5 java.lang.String), (r2v7 java.lang.String) binds: [B:13:0x003f, B:21:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            r20 = this;
            r0 = r20
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            boolean r2 = r0.a
            java.lang.String r3 = ", "
            if (r2 == 0) goto L14
            java.lang.String r2 = "mergeDescendants=true"
            r1.append(r2)
            r2 = r3
            goto L16
        L14:
            java.lang.String r2 = ""
        L16:
            boolean r4 = r0.b
            if (r4 == 0) goto L23
            r1.append(r2)
            java.lang.String r2 = "isClearingSemantics=true"
            r1.append(r2)
            r2 = r3
        L23:
            ki r4 = r0.c
            java.lang.Object[] r5 = r4.b
            java.lang.Object[] r6 = r4.c
            long[] r4 = r4.a
            int r7 = r4.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L7e
            r9 = 0
        L31:
            r10 = r4[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L79
            int r12 = r9 - r7
            r13 = 0
        L44:
            int r14 = ~r12
            int r14 = r14 >>> 31
            r15 = 8
            int r14 = 8 - r14
            if (r13 >= r14) goto L77
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r10 & r16
            r18 = 128(0x80, double:6.3E-322)
            int r14 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r14 >= 0) goto L73
            int r14 = r9 << 3
            int r14 = r14 + r13
            r16 = r5[r14]
            r14 = r6[r14]
            r8 = r16
            cfm r8 = (defpackage.cfm) r8
            r1.append(r2)
            java.lang.String r2 = r8.a
            r1.append(r2)
            java.lang.String r2 = " : "
            r1.append(r2)
            r1.append(r14)
            r2 = r3
        L73:
            long r10 = r10 >> r15
            int r13 = r13 + 1
            goto L44
        L77:
            if (r14 != r15) goto L7e
        L79:
            if (r9 == r7) goto L7e
            int r9 = r9 + 1
            goto L31
        L7e:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = defpackage.cbp.v(r0)
            r2.append(r3)
            java.lang.String r3 = "{ "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = " }"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cfc.toString():java.lang.String");
    }
}

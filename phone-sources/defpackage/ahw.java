package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahw implements Appendable {
    public final ajb a;
    public long b;
    public chb c;
    public bfz d;
    public yfw e;
    private aio f = null;

    public /* synthetic */ ahw(ahx ahxVar) {
        this.a = new ajb(ahxVar);
        bfz bfzVar = null;
        this.b = ahxVar.d;
        this.c = ahxVar.e;
        List list = ahxVar.a;
        if (list != null && !list.isEmpty()) {
            int size = ahxVar.a.size();
            agt agtVar = new agt(ahxVar, 8);
            cfx[] cfxVarArr = new cfx[size];
            for (int i = 0; i < size; i++) {
                cfxVarArr[i] = (cfx) agtVar.a(Integer.valueOf(i));
            }
            bfzVar = new bfz(cfxVarArr, size);
        }
        this.d = bfzVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ defpackage.ahx i(defpackage.ahw r8) {
        /*
            long r2 = r8.b
            chb r4 = r8.c
            bfz r0 = r8.d
            r1 = 0
            if (r0 == 0) goto L16
            java.util.List r0 = r0.f()
            boolean r5 = r0.isEmpty()
            if (r5 == 0) goto L14
            goto L16
        L14:
            r6 = r0
            goto L17
        L16:
            r6 = r1
        L17:
            ajb r8 = r8.a
            ahx r0 = new ahx
            java.lang.String r1 = r8.toString()
            r5 = 0
            r7 = 8
            r0.<init>(r1, r2, r4, r5, r6, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahw.i(ahw):ahx");
    }

    private final void j(int i, int i2, int i3) {
        int i4;
        int i5;
        aio aioVarB = b();
        int i6 = 0;
        if (i == i2 && i3 == 0) {
            i3 = 0;
        } else {
            int iMin = Math.min(i, i2);
            int iMax = Math.max(i, i2);
            int i7 = iMax - iMin;
            ain ainVar = null;
            boolean z = false;
            while (true) {
                i4 = i3 - i7;
                bfz bfzVar = aioVarB.a;
                if (i6 >= bfzVar.b) {
                    break;
                }
                int i8 = i6 + 1;
                ain ainVar2 = (ain) bfzVar.a[i6];
                int i9 = ainVar2.a;
                if ((iMin > i9 || i9 > iMax) && ((iMin > (i5 = ainVar2.b) || i5 > iMax) && ((iMin > i5 || i9 > iMin) && (iMax > i5 || i9 > iMax)))) {
                    if (i9 > iMax) {
                        if (!z) {
                            aioVarB.b(ainVar, iMin, iMax, i4);
                        }
                        z = true;
                    }
                    if (z) {
                        ainVar2.a += i4;
                        ainVar2.b += i4;
                    }
                    aioVarB.b.o(ainVar2);
                } else if (ainVar == null) {
                    ainVar = ainVar2;
                } else {
                    ainVar.b = ainVar2.b;
                    ainVar.d = ainVar2.d;
                }
                i6 = i8;
            }
            if (!z) {
                aioVarB.b(ainVar, iMin, iMax, i4);
            }
            bfz bfzVar2 = aioVarB.a;
            aioVarB.a = aioVarB.b;
            aioVarB.b = bfzVar2;
            aioVarB.b.h();
        }
        this.b = ht.o(this.b, i, i2, i3);
    }

    private final void k(chb chbVar) {
        if (chbVar != null && !chb.g(chbVar.b)) {
            this.c = chbVar;
            return;
        }
        this.c = null;
        bfz bfzVar = this.d;
        if (bfzVar != null) {
            bfzVar.h();
        }
    }

    public final int a() {
        return this.a.b();
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c) {
        j(a(), a(), 1);
        ajb ajbVar = this.a;
        int iB = ajbVar.b();
        int iB2 = ajbVar.b();
        String strValueOf = String.valueOf(c);
        ajbVar.c(iB, iB2, strValueOf, strValueOf.length());
        return this;
    }

    public final aio b() {
        aio aioVar = this.f;
        if (aioVar != null) {
            return aioVar;
        }
        aio aioVar2 = new aio(null);
        this.f = aioVar2;
        return aioVar2;
    }

    public final void c() {
        this.e = null;
    }

    public final void d() {
        k(null);
    }

    public final void e(int i, int i2, CharSequence charSequence) {
        int length = charSequence.length();
        if (i > i2) {
            wv.c(a.ce(i2, i, "Expected start=", " <= end="));
        }
        if (length < 0) {
            wv.c(a.cf(length, "Expected textStart=0 <= textEnd="));
        }
        j(i, i2, length);
        this.a.c(i, i2, charSequence, length);
        d();
        c();
    }

    public final void f(int i, int i2, List list) {
        if (i >= 0) {
            ajb ajbVar = this.a;
            if (i <= ajbVar.b()) {
                if (i2 < 0 || i2 > ajbVar.b()) {
                    throw new IndexOutOfBoundsException("end (" + i2 + ") offset is outside of text region " + ajbVar.b());
                }
                if (i >= i2) {
                    throw new IllegalArgumentException(a.ce(i2, i, "Do not set reversed or empty range: ", " > "));
                }
                k(new chb(ccf.N(i, i2)));
                bfz bfzVar = this.d;
                if (bfzVar != null) {
                    bfzVar.h();
                }
                if (list == null || list.isEmpty()) {
                    return;
                }
                if (this.d == null) {
                    this.d = new bfz(new cfx[16], 0);
                }
                int size = list.size();
                for (int i3 = 0; i3 < size; i3++) {
                    cfx cfxVar = (cfx) list.get(i3);
                    bfz bfzVar2 = this.d;
                    if (bfzVar2 != null) {
                        bfzVar2.o(cfx.a(cfxVar, null, cfxVar.b + i, cfxVar.c + i, 9));
                    }
                }
                return;
            }
        }
        throw new IndexOutOfBoundsException("start (" + i + ") offset is outside of text region " + this.a.b());
    }

    public final void g(long j) {
        long jN = ccf.N(0, a());
        if (!((chb.d(jN) <= chb.d(j)) & (chb.c(j) <= chb.c(jN)))) {
            wv.c("Expected " + ((Object) chb.f(j)) + " to be in " + ((Object) chb.f(jN)));
        }
        this.b = j;
        this.e = null;
    }

    public final String toString() {
        return this.a.toString();
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        if (charSequence != null) {
            j(a(), a(), charSequence.length());
            ajb ajbVar = this.a;
            ajbVar.c(ajbVar.b(), ajbVar.b(), charSequence, charSequence.length());
        }
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        if (charSequence != null) {
            j(a(), a(), i2 - i);
            ajb ajbVar = this.a;
            int iB = ajbVar.b();
            int iB2 = ajbVar.b();
            CharSequence charSequenceSubSequence = charSequence.subSequence(i, i2);
            ajbVar.c(iB, iB2, charSequenceSubSequence, charSequenceSubSequence.length());
        }
        return this;
    }
}

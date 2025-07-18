package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akb {
    public final aid a;
    public ahu b = null;
    private final ahv c = null;
    private final bdy d;
    private final bcb e;
    private final ajd f;

    public akb(aid aidVar, ajd ajdVar) {
        this.a = aidVar;
        bbh bbhVar = null;
        this.f = ajdVar;
        if (ajdVar != null) {
            ajm ajmVar = new ajm(this, 5);
            ivx ivxVar = bdt.a;
            bbhVar = new bbh(ajmVar, null);
        }
        this.d = bbhVar;
        this.e = new bci(new ajc(1, 1), bcz.c);
    }

    public static /* synthetic */ void n(akb akbVar, CharSequence charSequence, long j, boolean z, int i) {
        aid aidVar = akbVar.a;
        aidVar.a.b().c();
        ahw ahwVar = aidVar.a;
        long jB = akbVar.b(j);
        ahwVar.e(chb.d(jB), chb.c(jB), charSequence);
        int iD = chb.d(jB) + charSequence.length();
        ht.q(ahwVar, iD, iD);
        akbVar.m(ahwVar);
        aid.h(aidVar, (!((i & 8) == 0)) | z, (i & 4) != 0 ? 1 : 0);
    }

    public static /* synthetic */ void o(akb akbVar, CharSequence charSequence, boolean z, int i, boolean z2, int i2) {
        aid aidVar = akbVar.a;
        aidVar.a.b().c();
        ahw ahwVar = aidVar.a;
        if (z & ((i2 & 2) == 0)) {
            ahwVar.d();
        }
        boolean z3 = z2 | (!((i2 & 8) == 0));
        if ((i2 & 4) != 0) {
            i = 1;
        }
        long j = ahwVar.b;
        ahwVar.e(chb.d(j), chb.c(j), charSequence);
        int iD = chb.d(j) + charSequence.length();
        ht.q(ahwVar, iD, iD);
        akbVar.m(ahwVar);
        aid.h(aidVar, z3, i);
    }

    public final long a(int i) {
        ajz ajzVar;
        bdy bdyVar = this.d;
        ira iraVar = null;
        if (bdyVar != null && (ajzVar = (ajz) bdyVar.a()) != null) {
            iraVar = ajzVar.b;
        }
        if (iraVar != null) {
            return iraVar.h(i);
        }
        long jN = ccf.N(i, i);
        long j = chb.a;
        return jN;
    }

    public final long b(long j) {
        ajz ajzVar;
        bdy bdyVar = this.d;
        ira iraVar = null;
        if (bdyVar != null && (ajzVar = (ajz) bdyVar.a()) != null) {
            iraVar = ajzVar.b;
        }
        if (iraVar == null) {
            return j;
        }
        boolean zG = chb.g(j);
        long jH = iraVar.h(chb.e(j));
        long jH2 = zG ? jH : iraVar.h(chb.a(j));
        int iMin = Math.min(chb.d(jH), chb.d(jH2));
        int iMax = Math.max(chb.c(jH), chb.c(jH2));
        return chb.h(j) ? ccf.N(iMax, iMin) : ccf.N(iMin, iMax);
    }

    public final long c(long j) {
        ajz ajzVar;
        bdy bdyVar = this.d;
        ira iraVar = null;
        if (bdyVar != null && (ajzVar = (ajz) bdyVar.a()) != null) {
            iraVar = ajzVar.b;
        }
        return iraVar != null ? hv.o(j, iraVar, f()) : j;
    }

    public final ahx d() {
        return this.a.b();
    }

    public final ahx e() {
        ajz ajzVar;
        bdy bdyVar = this.d;
        return (bdyVar == null || (ajzVar = (ajz) bdyVar.a()) == null) ? d() : ajzVar.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof akb)) {
            return false;
        }
        akb akbVar = (akb) obj;
        if (!yks.e(this.a, akbVar.a) || !yks.e(this.f, akbVar.f)) {
            return false;
        }
        ahv ahvVar = akbVar.c;
        return yks.e(null, null);
    }

    public final ajc f() {
        return (ajc) this.e.a();
    }

    public final void g() {
        aid aidVar = this.a;
        aidVar.a.b().c();
        ahw ahwVar = aidVar.a;
        int iC = chb.c(ahwVar.b);
        ht.q(ahwVar, iC, iC);
        aid.h(aidVar, true, 1);
    }

    public final void h() {
        aid aidVar = this.a;
        aidVar.a.b().c();
        ahw ahwVar = aidVar.a;
        ht.p(ahwVar, chb.d(ahwVar.b), chb.c(ahwVar.b));
        int iD = chb.d(ahwVar.b);
        ht.q(ahwVar, iD, iD);
        m(ahwVar);
        aid.h(aidVar, true, 3);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        ajd ajdVar = this.f;
        return (iHashCode + (ajdVar != null ? ajdVar.hashCode() : 0)) * 31;
    }

    public final void i(CharSequence charSequence) {
        aid aidVar = this.a;
        aidVar.a.b().c();
        ahw ahwVar = aidVar.a;
        ht.p(ahwVar, 0, ahwVar.a());
        ahwVar.append(((cfy) charSequence).b);
        m(ahwVar);
        aid.h(aidVar, true, 1);
    }

    public final void j(long j) {
        k(b(j));
    }

    public final void k(long j) {
        aid aidVar = this.a;
        aidVar.a.b().c();
        ht.q(aidVar.a, chb.e(j), chb.a(j));
        aid.h(aidVar, true, 1);
    }

    public final void l(ajc ajcVar) {
        this.e.b(ajcVar);
    }

    public final void m(ahw ahwVar) {
        if (ahwVar.b().a() <= 0 || !chb.g(ahwVar.b)) {
            return;
        }
        l(new ajc(1, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object p(defpackage.pku r5, defpackage.yih r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.aka
            if (r0 == 0) goto L13
            r0 = r6
            aka r0 = (defpackage.aka) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            aka r0 = new aka
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2b:
            defpackage.ybn.f(r6)
            goto L57
        L2f:
            defpackage.ybn.f(r6)
            r0.c = r3
            yof r6 = new yof
            yih r0 = defpackage.wcq.S(r0)
            r6.<init>(r0, r3)
            r6.v()
            aid r0 = r4.a
            bfz r0 = r0.c
            r0.o(r5)
            bbs r0 = new bbs
            r2 = 0
            r0.<init>(r4, r5, r3, r2)
            r6.b(r0)
            java.lang.Object r5 = r6.i()
            if (r5 != r1) goto L57
            return r1
        L57:
            yfs r5 = new yfs
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akb.p(pku, yih):java.lang.Object");
    }

    public final String toString() {
        return "TransformedTextFieldState(textFieldState=" + this.a + ", outputTransformation=null, outputTransformedText=null, codepointTransformation=" + this.f + ", codepointTransformedText=" + this.d + ", outputText=\"" + ((Object) d()) + "\", visualText=\"" + ((Object) e()) + "\")";
    }
}

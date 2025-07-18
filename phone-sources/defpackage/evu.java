package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class evu extends exk {
    public evs a;
    private final boolean c;
    private final eax d;
    private final eav e;
    private evr f;
    private boolean g;
    private boolean h;
    private boolean i;

    public evu(ewb ewbVar, boolean z) {
        boolean z2;
        super(ewbVar);
        if (z) {
            ewbVar.D();
            z2 = true;
        } else {
            z2 = false;
        }
        this.c = z2;
        this.d = new eax();
        this.e = new eav();
        ewbVar.C();
        this.a = evs.s(ewbVar.a());
    }

    private final Object I(Object obj) {
        evs evsVar = this.a;
        Object obj2 = evs.f;
        return (evsVar.g == null || !obj.equals(evs.f)) ? obj : this.a.g;
    }

    private final boolean J(long j) {
        evr evrVar = this.f;
        int iA = this.a.a(evrVar.a.a);
        if (iA == -1) {
            return false;
        }
        long j2 = this.a.n(iA, this.e).i;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        evrVar.e = j;
        return true;
    }

    @Override // defpackage.exk, defpackage.ewb
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public final evr p(evz evzVar, ezp ezpVar, long j) {
        evr evrVar = new evr(evzVar, ezpVar, j);
        a.ab(evrVar.c == null);
        evrVar.c = this.b;
        if (this.h) {
            evrVar.k(evzVar.a(I(evzVar.a)));
            return evrVar;
        }
        this.f = evrVar;
        if (!this.g) {
            this.g = true;
            H();
        }
        return evrVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0061  */
    @Override // defpackage.exk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void b(defpackage.eay r12) {
        /*
            r11 = this;
            boolean r0 = r11.h
            r1 = 0
            if (r0 == 0) goto L18
            evs r0 = r11.a
            evs r12 = r0.r(r12)
            r11.a = r12
            evr r12 = r11.f
            if (r12 == 0) goto L9c
            long r2 = r12.e
            r11.J(r2)
            goto L9c
        L18:
            boolean r0 = r12.q()
            if (r0 == 0) goto L36
            boolean r0 = r11.i
            if (r0 == 0) goto L29
            evs r0 = r11.a
            evs r12 = r0.r(r12)
            goto L33
        L29:
            java.lang.Object r0 = defpackage.eax.a
            java.lang.Object r2 = defpackage.evs.f
            evs r3 = new evs
            r3.<init>(r12, r0, r2)
            r12 = r3
        L33:
            r11.a = r12
            goto L9c
        L36:
            eax r3 = r11.d
            r0 = 0
            r12.p(r0, r3)
            long r4 = r3.z
            java.lang.Object r8 = r3.o
            evr r2 = r11.f
            if (r2 == 0) goto L61
            evs r6 = r11.a
            eav r7 = r11.e
            evz r9 = r2.a
            java.lang.Object r9 = r9.a
            r6.o(r9, r7)
            long r6 = r7.j
            long r9 = r2.b
            long r6 = r6 + r9
            evs r2 = r11.a
            eax r0 = r2.p(r0, r3)
            long r9 = r0.z
            int r0 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r0 == 0) goto L61
            goto L62
        L61:
            r6 = r4
        L62:
            eav r4 = r11.e
            r5 = 0
            r2 = r12
            android.util.Pair r12 = r2.l(r3, r4, r5, r6)
            java.lang.Object r0 = r12.first
            java.lang.Object r12 = r12.second
            java.lang.Long r12 = (java.lang.Long) r12
            long r3 = r12.longValue()
            boolean r12 = r11.i
            if (r12 == 0) goto L7f
            evs r12 = r11.a
            evs r12 = r12.r(r2)
            goto L84
        L7f:
            evs r12 = new evs
            r12.<init>(r2, r8, r0)
        L84:
            r11.a = r12
            evr r12 = r11.f
            if (r12 == 0) goto L9c
            boolean r0 = r11.J(r3)
            if (r0 == 0) goto L9c
            evz r12 = r12.a
            java.lang.Object r0 = r12.a
            java.lang.Object r0 = r11.I(r0)
            evz r1 = r12.a(r0)
        L9c:
            r12 = 1
            r11.i = r12
            r11.h = r12
            evs r12 = r11.a
            r11.y(r12)
            if (r1 == 0) goto Lb0
            evr r12 = r11.f
            defpackage.a.aq(r12)
            r12.k(r1)
        Lb0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.evu.b(eay):void");
    }

    @Override // defpackage.exk, defpackage.ewb
    public final void i(evx evxVar) {
        evr evrVar = (evr) evxVar;
        if (evrVar.d != null) {
            ewb ewbVar = evrVar.c;
            ewbVar.getClass();
            ewbVar.i(evrVar.d);
        }
        if (evxVar == this.f) {
            this.f = null;
        }
    }

    @Override // defpackage.evg, defpackage.euv
    public final void j() {
        this.h = false;
        this.g = false;
        super.j();
    }

    @Override // defpackage.exk
    protected final evz l(evz evzVar) {
        evs evsVar = this.a;
        Object obj = evs.f;
        Object obj2 = evsVar.g;
        Object obj3 = evzVar.a;
        if (obj2 != null && this.a.g.equals(obj3)) {
            obj3 = evs.f;
        }
        return evzVar.a(obj3);
    }

    @Override // defpackage.exk
    public final void m() {
        if (this.c) {
            return;
        }
        this.g = true;
        H();
    }

    @Override // defpackage.exk, defpackage.euv, defpackage.ewb
    public final void n(dzy dzyVar) {
        if (this.i) {
            this.a = this.a.r(new exh(this.a.e, dzyVar));
        } else {
            this.a = evs.s(dzyVar);
        }
        this.b.n(dzyVar);
    }

    @Override // defpackage.exk, defpackage.euv, defpackage.ewb
    public final boolean o(dzy dzyVar) {
        return this.b.o(dzyVar);
    }
}

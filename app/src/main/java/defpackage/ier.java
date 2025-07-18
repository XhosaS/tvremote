package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ier extends agtu implements agvb {
    Object a;
    boolean b;
    int c;
    final /* synthetic */ ies d;
    final /* synthetic */ boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ier(ies iesVar, boolean z, agsw agswVar) {
        super(2, agswVar);
        this.d = iesVar;
        this.e = z;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ier) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0060, code lost:
    
        if (r9.b(r1, r8) == r0) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0083  */
    @Override // defpackage.agto
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r9) {
        /*
            r8 = this;
            agtg r0 = defpackage.agtg.a
            int r1 = r8.c
            r2 = 3
            java.lang.String r3 = "led_to_idle_state"
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L1b
            if (r1 == r5) goto L13
            defpackage.agpl.b(r9)
            if (r1 == r4) goto L4d
            goto L63
        L13:
            boolean r1 = r8.b
            java.lang.Object r6 = r8.a
            defpackage.agpl.b(r9)
            goto L36
        L1b:
            defpackage.agpl.b(r9)
            ies r9 = r8.d
            boolean r1 = r9.q
            if (r1 == 0) goto L6c
            icx r6 = r9.k
            boolean r1 = r8.e
            gtu r9 = r9.j
            r8.a = r6
            r8.b = r1
            r8.c = r5
            java.lang.Object r9 = r9.j(r8)
            if (r9 == r0) goto L6b
        L36:
            android.accounts.Account r9 = (android.accounts.Account) r9
            r7 = 0
            if (r9 == 0) goto L3e
            java.lang.String r9 = r9.name
            goto L3f
        L3e:
            r9 = r7
        L3f:
            r8.a = r7
            r8.c = r4
            if (r9 != 0) goto L47
            java.lang.String r9 = ""
        L47:
            java.lang.Object r9 = r6.a(r1, r9, r8)
            if (r9 == r0) goto L6b
        L4d:
            ies r9 = r8.d
            boolean r1 = r8.e
            if (r1 == 0) goto L56
            foc r1 = defpackage.foc.TOGGLE_ON
            goto L58
        L56:
            foc r1 = defpackage.foc.TOGGLE_OFF
        L58:
            fjr r9 = r9.f
            r8.c = r2
            java.lang.Object r9 = r9.b(r1, r8)
            if (r9 != r0) goto L63
            goto L6b
        L63:
            ies r9 = r8.d
            ffp r9 = r9.i
            r9.c(r3)
            goto L6c
        L6b:
            return r0
        L6c:
            ies r9 = r8.d
            boolean r0 = r9.r
            if (r0 == 0) goto L7e
            icx r0 = r9.k
            boolean r1 = r8.e
            r0.b(r1)
            ffp r0 = r9.i
            r0.c(r3)
        L7e:
            boolean r0 = r8.e
            if (r5 == r0) goto L83
            goto L84
        L83:
            r2 = r4
        L84:
            r9.a(r2)
            agpu r9 = defpackage.agpu.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ier.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new ier(this.d, this.e, agswVar);
    }
}

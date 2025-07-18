package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hax extends agtu implements agvb {
    Object a;
    Object b;
    Object c;
    Object d;
    int e;
    final /* synthetic */ hba f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hax(hba hbaVar, agsw agswVar) {
        super(2, agswVar);
        this.f = hbaVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((hax) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00aa, code lost:
    
        if (r14.l.g((android.accounts.Account) r1, r2, r13) == r0) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0086 A[PHI: r1 r11
  0x0086: PHI (r1v4 java.lang.Object) = (r1v3 java.lang.Object), (r1v6 java.lang.Object) binds: [B:24:0x0084, B:9:0x001b] A[DONT_GENERATE, DONT_INLINE]
  0x0086: PHI (r11v2 hax) = (r11v1 hax), (r11v3 hax) binds: [B:24:0x0084, B:9:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.agto
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r14) {
        /*
            r13 = this;
            agtg r0 = defpackage.agtg.a
            int r1 = r13.e
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L32
            if (r1 == r4) goto L2e
            if (r1 == r3) goto L1e
            if (r1 == r2) goto L16
            defpackage.agpl.b(r14)
            r11 = r13
            goto Lad
        L16:
            java.lang.Object r1 = r13.a
            defpackage.agpl.b(r14)
        L1b:
            r11 = r13
            goto L86
        L1e:
            java.lang.Object r1 = r13.d
            java.lang.Object r3 = r13.c
            java.lang.Object r6 = r13.b
            java.lang.Object r7 = r13.a
            defpackage.agpl.b(r14)
            r12 = r6
            r6 = r1
            r1 = r7
            r7 = r12
            goto L60
        L2e:
            defpackage.agpl.b(r14)
            goto L41
        L32:
            defpackage.agpl.b(r14)
            hba r14 = r13.f
            r13.e = r4
            gtu r14 = r14.j
            java.lang.Object r14 = r14.j(r13)
            if (r14 == r0) goto Lb5
        L41:
            r1 = r14
            android.accounts.Account r1 = (android.accounts.Account) r1
            if (r1 == 0) goto L1b
            hba r6 = r13.f
            r13.a = r1
            r13.b = r6
            r13.c = r1
            gwo r14 = r6.a
            r13.d = r14
            r13.e = r3
            fda r3 = r6.c
            java.lang.Object r3 = r3.f(r13)
            if (r3 == r0) goto Lb5
            r7 = r6
            r6 = r14
            r14 = r3
            r3 = r1
        L60:
            r8 = r14
            fcy r8 = (defpackage.fcy) r8
            int r14 = defpackage.hba.q
            hba r7 = (defpackage.hba) r7
            gph r14 = r7.f
            gph r7 = defpackage.gph.a
            if (r14 != r7) goto L6e
            goto L6f
        L6e:
            r4 = 0
        L6f:
            r9 = r4
            r13.a = r1
            r13.b = r5
            r13.c = r5
            r13.d = r5
            r13.e = r2
            r7 = r3
            android.accounts.Account r7 = (android.accounts.Account) r7
            java.lang.String r10 = "GooglePreferenceFragmentPeer"
            r11 = r13
            java.lang.Object r14 = r6.a(r7, r8, r9, r10, r11)
            if (r14 == r0) goto Lb6
        L86:
            hba r14 = r11.f
            agow r2 = r14.k
            java.lang.Object r2 = r2.a()
            r2.getClass()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            fcu r3 = r14.p
            boolean r2 = r3.c(r2)
            r11.a = r5
            r3 = 4
            r11.e = r3
            idl r14 = r14.l
            android.accounts.Account r1 = (android.accounts.Account) r1
            java.lang.Object r14 = r14.g(r1, r2, r13)
            if (r14 != r0) goto Lad
            goto Lb6
        Lad:
            hba r14 = r11.f
            r14.b()
            agpu r14 = defpackage.agpu.a
            return r14
        Lb5:
            r11 = r13
        Lb6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hax.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new hax(this.f, agswVar);
    }
}

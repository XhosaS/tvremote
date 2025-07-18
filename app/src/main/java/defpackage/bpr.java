package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class bpr {
    public static final Object a(bmn bmnVar, boolean z, agsw agswVar) {
        bnc bncVar = (bnc) agswVar.fr().get(bnc.a);
        agte agteVar = bncVar != null ? bncVar.b : null;
        if (!bmnVar.r()) {
            agte agteVarK = bmnVar.k();
            if (agteVar == null) {
                agteVar = agtf.a;
            }
            return agteVarK.plus(agteVar);
        }
        if (agteVar != null) {
            return bmnVar.k().plus(agteVar);
        }
        if (!z) {
            return bmnVar.k();
        }
        agte agteVar2 = bmnVar.b;
        if (agteVar2 != null) {
            return agteVar2;
        }
        agvy.b("transactionContext");
        return null;
    }

    public static final Object b(bmn bmnVar, boolean z, boolean z2, agux aguxVar) {
        bmnVar.m();
        if (bmnVar.r() && !bmnVar.s()) {
            agte agteVar = (agte) bmnVar.i.get();
            if ((agteVar != null ? (bnc) agteVar.get(bnc.a) : null) != null) {
                throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
            }
        }
        agte agteVar2 = (agte) bmnVar.i.get();
        if (agteVar2 == null) {
            agteVar2 = agtf.a;
        }
        return bov.a(new bpf(agteVar2, bmnVar, z2, z, aguxVar, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(defpackage.bmn r8, defpackage.agux r9, defpackage.agsw r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof defpackage.bph
            if (r0 == 0) goto L13
            r0 = r10
            bph r0 = (defpackage.bph) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            bph r0 = new bph
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.a
            agtg r1 = defpackage.agtg.a
            int r2 = r0.b
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L49
            if (r2 == r6) goto L45
            if (r2 == r5) goto L41
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            defpackage.agpl.b(r10)
            return r10
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            ixw r9 = r0.d
            com.google.android.apps.tvsearch.suggestions.starters.FallbackSuggestionDatabase_Impl r8 = r0.c
            defpackage.agpl.b(r10)
            goto L95
        L41:
            defpackage.agpl.b(r10)
            return r10
        L45:
            defpackage.agpl.b(r10)
            return r10
        L49:
            defpackage.agpl.b(r10)
            boolean r10 = r8.r()
            if (r10 == 0) goto L61
            bpk r10 = new bpk
            r10.<init>(r8, r9, r7)
            r0.b = r6
            java.lang.Object r8 = defpackage.bmr.b(r8, r10, r0)
            if (r8 != r1) goto L60
            goto La8
        L60:
            return r8
        L61:
            boolean r10 = r8.r()
            if (r10 == 0) goto L82
            boolean r10 = r8.t()
            if (r10 == 0) goto L82
            boolean r10 = r8.s()
            if (r10 == 0) goto L82
            bpm r10 = new bpm
            r10.<init>(r8, r7, r9)
            r0.b = r5
            java.lang.Object r8 = r8.w(r10, r0)
            if (r8 != r1) goto L81
            goto La8
        L81:
            return r8
        L82:
            r10 = r8
            com.google.android.apps.tvsearch.suggestions.starters.FallbackSuggestionDatabase_Impl r10 = (com.google.android.apps.tvsearch.suggestions.starters.FallbackSuggestionDatabase_Impl) r10
            r0.c = r10
            r10 = r9
            ixw r10 = (defpackage.ixw) r10
            r0.d = r10
            r0.b = r4
            java.lang.Object r10 = a(r8, r6, r0)
            if (r10 != r1) goto L95
            goto La8
        L95:
            agte r10 = (defpackage.agte) r10
            bpg r2 = new bpg
            r2.<init>(r7, r8, r9)
            r0.c = r7
            r0.d = r7
            r0.b = r3
            java.lang.Object r8 = defpackage.ahal.a(r10, r2, r0)
            if (r8 != r1) goto La9
        La8:
            return r1
        La9:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bpr.c(bmn, agux, agsw):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object d(defpackage.bmn r14, boolean r15, boolean r16, defpackage.agux r17, defpackage.agsw r18) throws java.lang.Throwable {
        /*
            r0 = r18
            boolean r1 = r0 instanceof defpackage.bpo
            if (r1 == 0) goto L15
            r1 = r0
            bpo r1 = (defpackage.bpo) r1
            int r2 = r1.f
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f = r2
            goto L1a
        L15:
            bpo r1 = new bpo
            r1.<init>(r0)
        L1a:
            r6 = r1
            java.lang.Object r0 = r6.e
            agtg r7 = defpackage.agtg.a
            int r1 = r6.f
            r2 = 3
            r3 = 2
            r8 = 1
            if (r1 == 0) goto L4c
            if (r1 == r8) goto L48
            if (r1 == r3) goto L38
            if (r1 != r2) goto L30
            defpackage.agpl.b(r0)
            return r0
        L30:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L38:
            boolean r14 = r6.d
            boolean r15 = r6.c
            java.lang.Object r1 = r6.b
            java.lang.Object r3 = r6.a
            defpackage.agpl.b(r0)
            r12 = r14
            r13 = r1
            r14 = r3
        L46:
            r11 = r15
            goto L91
        L48:
            defpackage.agpl.b(r0)
            return r0
        L4c:
            defpackage.agpl.b(r0)
            boolean r0 = r14.r()
            if (r0 == 0) goto L78
            boolean r0 = r14.t()
            if (r0 == 0) goto L78
            boolean r0 = r14.s()
            if (r0 == 0) goto L78
            bpq r0 = new bpq
            r4 = 0
            r3 = r14
            r2 = r15
            r1 = r16
            r5 = r17
            r0.<init>(r1, r2, r3, r4, r5)
            r15 = r0
            r6.f = r8
            java.lang.Object r14 = r14.w(r15, r6)
            if (r14 != r7) goto L77
            goto La9
        L77:
            return r14
        L78:
            r4 = r16
            r6.a = r14
            r5 = r17
            r6.b = r5
            r6.c = r15
            r6.d = r4
            r6.f = r3
            java.lang.Object r3 = a(r14, r4, r6)
            if (r3 != r7) goto L8d
            goto La9
        L8d:
            r0 = r3
            r12 = r4
            r13 = r5
            goto L46
        L91:
            agte r0 = (defpackage.agte) r0
            bpn r8 = new bpn
            r9 = 0
            r10 = r14
            bmn r10 = (defpackage.bmn) r10
            r8.<init>(r9, r10, r11, r12, r13)
            r14 = 0
            r6.a = r14
            r6.b = r14
            r6.f = r2
            java.lang.Object r14 = defpackage.ahal.a(r0, r8, r6)
            if (r14 != r7) goto Laa
        La9:
            return r7
        Laa:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bpr.d(bmn, boolean, boolean, agux, agsw):java.lang.Object");
    }
}

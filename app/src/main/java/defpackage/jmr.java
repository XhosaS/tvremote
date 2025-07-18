package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jmr {
    public static final zdy a = zdy.h("com/google/android/apps/tvsearch/voice/libassistant/updaters/CastIdFetcher");
    public static final long b;
    public final fda c;
    public final agow d;

    static {
        long j = agzn.a;
        b = agzp.a(10, agzq.d);
    }

    public jmr(fda fdaVar, agow agowVar) {
        fdaVar.getClass();
        agowVar.getClass();
        this.c = fdaVar;
        this.d = agowVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x007f, code lost:
    
        if (r10 != r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(long r8, defpackage.agsw r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.jmm
            if (r0 == 0) goto L13
            r0 = r10
            jmm r0 = (defpackage.jmm) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            jmm r0 = new jmm
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.b
            agtg r1 = defpackage.agtg.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.agpl.b(r10)
            goto L81
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L32:
            long r8 = r0.a
            defpackage.agpl.b(r10)
            goto L47
        L38:
            defpackage.agpl.b(r10)
            fda r10 = r7.c
            r0.a = r8
            r0.d = r4
            java.lang.Object r10 = r10.e(r0)
            if (r10 == r1) goto L92
        L47:
            java.lang.String r10 = (java.lang.String) r10
            int r2 = r10.length()
            if (r2 != 0) goto L91
            jmo r10 = new jmo
            r2 = 0
            r10.<init>(r7, r2)
            ahio r4 = new ahio
            r4.<init>(r10)
            jmp r10 = new jmp
            r10.<init>(r2)
            r5 = 0
            int r5 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r5 <= 0) goto L89
            ahhn r5 = new ahhn
            r5.<init>(r8, r10, r2)
            ahhp r8 = new ahhp
            r8.<init>(r4, r5)
            jmq r9 = new jmq
            r9.<init>(r2)
            ahhj r10 = new ahhj
            r10.<init>(r8, r9)
            r0.d = r3
            java.lang.Object r10 = defpackage.ahii.c(r10, r0)
            if (r10 == r1) goto L92
        L81:
            java.lang.String r10 = (java.lang.String) r10
            if (r10 != 0) goto L88
            java.lang.String r8 = ""
            return r8
        L88:
            return r10
        L89:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Expected positive amount of retries, but had 0"
            r8.<init>(r9)
            throw r8
        L91:
            return r10
        L92:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jmr.a(long, agsw):java.lang.Object");
    }
}

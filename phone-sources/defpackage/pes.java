package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pes implements pdx {
    private static final tvn a = tvn.n("GnpSdk");
    private final pdv b;
    private final pdy c;
    private final owz d;
    private final Set e;

    public pes(pdv pdvVar, pdy pdyVar, owz owzVar, osk oskVar, Set set) {
        pdvVar.getClass();
        pdyVar.getClass();
        owzVar.getClass();
        oskVar.getClass();
        this.b = pdvVar;
        this.c = pdyVar;
        this.d = owzVar;
        this.e = set;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0091 -> B:19:0x0093). Please report as a decompilation issue!!! */
    @Override // defpackage.pdx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.yih r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.per
            if (r0 == 0) goto L13
            r0 = r8
            per r0 = (defpackage.per) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            per r0 = new per
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.c
            yio r1 = defpackage.yio.a
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r2 = r0.b
            java.lang.Object r4 = r0.a
            defpackage.ybn.f(r8)
            goto L93
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L33:
            defpackage.ybn.f(r8)
            j$.time.Instant r8 = j$.time.Instant.now()
            xfo r2 = defpackage.xfo.a
            xfp r2 = r2.get()
            long r4 = r2.b()
            j$.time.Instant r8 = r8.minusMillis(r4)
            long r4 = r8.toEpochMilli()
            tvn r8 = defpackage.pes.a
            tuv r8 = r8.l()
            j$.time.Instant r2 = j$.time.Instant.ofEpochMilli(r4)
            java.lang.String r6 = "Storage cleanup started. Deleting events before %s"
            r8.v(r6, r2)
            pdv r8 = r7.b
            r8.d(r4)
            pdy r2 = r7.c
            r2.e(r4)
            owz r4 = r7.d
            java.util.List r4 = r4.a()
            r2.f(r4)
            r8.e(r4)
            java.util.Set r8 = r7.e
            java.util.Iterator r8 = r8.iterator()
            r2 = r8
        L78:
            boolean r8 = r2.hasNext()
            if (r8 == 0) goto L97
            java.lang.Object r8 = r2.next()
            pis r8 = (defpackage.pis) r8
            r4.getClass()
            r0.a = r4
            r0.b = r2
            r0.e = r3
            java.lang.Object r8 = r8.a()
            if (r8 == r1) goto L96
        L93:
            qdl r8 = (defpackage.qdl) r8
            goto L78
        L96:
            return r1
        L97:
            ygi r8 = defpackage.ygi.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pes.a(yih):java.lang.Object");
    }
}

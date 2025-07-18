package defpackage;

import android.content.ContentResolver;
import android.content.pm.PackageManager;
import java.util.List;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hdh implements hda, hdi {
    private static final zdy a = zdy.h("com/google/android/apps/tvsearch/providers/slice/AssistantSearchableAppsService");
    private final Supplier b;
    private final ContentResolver c;
    private final fiu d;
    private final Supplier e;
    private final gtu f;
    private final fth g;
    private final jbc h;
    private final PackageManager i;
    private final jbd j;
    private final jbd k;
    private final idl l;
    private final fqh m;
    private List n;
    private final fcu o;
    private final igs p;

    public hdh(Supplier supplier, ContentResolver contentResolver, fiu fiuVar, Supplier supplier2, gtu gtuVar, fth fthVar, fcu fcuVar, jbc jbcVar, PackageManager packageManager, jbd jbdVar, jbd jbdVar2, idl idlVar, igs igsVar, fqh fqhVar) {
        fiuVar.getClass();
        gtuVar.getClass();
        fthVar.getClass();
        fcuVar.getClass();
        jbdVar.getClass();
        jbdVar2.getClass();
        idlVar.getClass();
        igsVar.getClass();
        this.b = supplier;
        this.c = contentResolver;
        this.d = fiuVar;
        this.e = supplier2;
        this.f = gtuVar;
        this.g = fthVar;
        this.o = fcuVar;
        this.h = jbcVar;
        this.i = packageManager;
        this.j = jbdVar;
        this.k = jbdVar2;
        this.l = idlVar;
        this.p = igsVar;
        this.m = fqhVar;
        this.n = agrd.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c3, code lost:
    
        if (r5 != r4) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v22, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r20v0, types: [hdh] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v23, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0120 -> B:41:0x0123). Please report as a decompilation issue!!! */
    @Override // defpackage.hda
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r21, defpackage.agsw r22) {
        /*
            Method dump skipped, instructions count: 469
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hdh.a(java.lang.String, agsw):java.lang.Object");
    }

    @Override // defpackage.hda
    public final List b() {
        return this.n;
    }

    @Override // defpackage.hda
    public final void c() {
        this.n = agrd.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r14v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x008d -> B:12:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(java.util.List r14, defpackage.agsw r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof defpackage.hde
            if (r0 == 0) goto L13
            r0 = r15
            hde r0 = (defpackage.hde) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            hde r0 = new hde
            r0.<init>(r13, r15)
        L18:
            java.lang.Object r15 = r0.e
            agtg r1 = defpackage.agtg.a
            int r2 = r0.g
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r14 = r0.d
            java.lang.String r2 = r0.h
            java.lang.Object r4 = r0.c
            java.lang.Object r5 = r0.b
            java.lang.Object r6 = r0.a
            defpackage.agpl.b(r15)
        L30:
            r8 = r2
            goto L8f
        L32:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L3a:
            defpackage.agpl.b(r15)
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.Iterator r14 = r14.iterator()
        L46:
            boolean r2 = r14.hasNext()
            if (r2 == 0) goto L5a
            java.lang.Object r2 = r14.next()
            r4 = r2
            jba r4 = (defpackage.jba) r4
            r4.i()
            r15.add(r2)
            goto L46
        L5a:
            java.util.ArrayList r14 = new java.util.ArrayList
            r2 = 10
            int r2 = defpackage.agqq.i(r15, r2)
            r14.<init>(r2)
            java.util.Iterator r15 = r15.iterator()
            r5 = r15
        L6a:
            boolean r15 = r5.hasNext()
            if (r15 == 0) goto Lb0
            java.lang.Object r15 = r5.next()
            r4 = r15
            jba r4 = (defpackage.jba) r4
            java.lang.String r2 = r4.i()
            r0.a = r14
            r0.b = r5
            r0.c = r4
            r0.h = r2
            r0.d = r14
            r0.g = r3
            java.lang.Object r15 = r4.f(r0)
            if (r15 == r1) goto Laf
            r6 = r14
            goto L30
        L8f:
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r9 = r15.booleanValue()
            boolean r10 = r4.n()
            java.lang.CharSequence r15 = r4.e()
            java.lang.String r11 = r15.toString()
            int r12 = r4.a()
            hcz r7 = new hcz
            r7.<init>(r8, r9, r10, r11, r12)
            r14.add(r7)
            r14 = r6
            goto L6a
        Laf:
            return r1
        Lb0:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hdh.d(java.util.List, agsw):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00de, code lost:
    
        if (r9.b(r0) != r1) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.hdi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(java.lang.String r9, boolean r10, android.accounts.Account r11, defpackage.agsw r12) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hdh.e(java.lang.String, boolean, android.accounts.Account, agsw):java.lang.Object");
    }
}

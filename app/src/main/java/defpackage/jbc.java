package defpackage;

import android.content.pm.PackageManager;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jbc {
    public final Supplier a;
    public final fja b;
    public final fsg c;
    public final Supplier d;
    public final gtu e;
    public final hab f;
    public final PackageManager g;
    public final fqm h;
    private final fiu i;
    private final fry j;
    private final fqh k;

    public jbc(Supplier supplier, fiu fiuVar, fja fjaVar, fry fryVar, fsg fsgVar, Supplier supplier2, gtu gtuVar, hab habVar, PackageManager packageManager, fqh fqhVar, fqm fqmVar) {
        fiuVar.getClass();
        fjaVar.getClass();
        fsgVar.getClass();
        gtuVar.getClass();
        habVar.getClass();
        fqmVar.getClass();
        this.a = supplier;
        this.i = fiuVar;
        this.b = fjaVar;
        this.j = fryVar;
        this.c = fsgVar;
        this.d = supplier2;
        this.e = gtuVar;
        this.f = habVar;
        this.g = packageManager;
        this.k = fqhVar;
        this.h = fqmVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0075, code lost:
    
        if (r13 == r1) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00bd, code lost:
    
        if (r13 != r1) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r11, java.lang.String r12, defpackage.agsw r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof defpackage.jbb
            if (r0 == 0) goto L13
            r0 = r13
            jbb r0 = (defpackage.jbb) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            jbb r0 = new jbb
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.b
            agtg r1 = defpackage.agtg.a
            int r2 = r0.d
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L4a
            if (r2 == r6) goto L42
            if (r2 == r5) goto L3a
            if (r2 != r4) goto L32
            long r11 = r0.a
            defpackage.agpl.b(r13)
            goto Lbf
        L32:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3a:
            long r11 = r0.a
            java.lang.String r2 = r0.e
            defpackage.agpl.b(r13)
            goto La9
        L42:
            java.lang.String r12 = r0.f
            java.lang.String r11 = r0.e
            defpackage.agpl.b(r13)
            goto L78
        L4a:
            defpackage.agpl.b(r13)
            java.util.function.Supplier r13 = r10.a
            java.lang.Object r13 = defpackage.al$$ExternalSyntheticApiModelOutline1.m(r13)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto L82
            java.util.function.Supplier r13 = r10.d
            java.lang.Object r13 = defpackage.al$$ExternalSyntheticApiModelOutline1.m(r13)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto L82
            fry r13 = r10.j
            r0.e = r11
            r0.f = r12
            r0.d = r6
            java.lang.Object r13 = r13.b(r12, r0)
            if (r13 != r1) goto L78
            goto Ld0
        L78:
            fwe r2 = defpackage.fwe.DSC_GRANTED
            if (r13 != r2) goto L7d
            goto L82
        L7d:
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r7)
            return r11
        L82:
            hab r13 = r10.f
            gzs r13 = r13.a(r11)
            if (r13 == 0) goto L8d
            long r8 = r13.b
            goto L97
        L8d:
            android.content.pm.PackageManager r13 = r10.g     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Ld1
            android.content.pm.PackageInfo r13 = r13.getPackageInfo(r11, r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Ld1
            long r8 = defpackage.jj$$ExternalSyntheticApiModelOutline0.m(r13)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Ld1
        L97:
            fqh r13 = r10.k
            r0.e = r11
            r0.f = r3
            r0.a = r8
            r0.d = r5
            java.lang.Object r13 = r13.a(r12, r11, r0)
            if (r13 == r1) goto Ld0
            r2 = r11
            r11 = r8
        La9:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 != 0) goto Lca
            fiu r13 = r10.i
            r0.e = r3
            r0.a = r11
            r0.d = r4
            java.lang.Object r13 = r13.k(r2, r0)
            if (r13 == r1) goto Ld0
        Lbf:
            java.lang.Number r13 = (java.lang.Number) r13
            long r0 = r13.longValue()
            int r11 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r11 == 0) goto Lca
            goto Lcb
        Lca:
            r6 = r7
        Lcb:
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r6)
            return r11
        Ld0:
            return r1
        Ld1:
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r7)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jbc.a(java.lang.String, java.lang.String, agsw):java.lang.Object");
    }
}

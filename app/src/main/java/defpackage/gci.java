package defpackage;

import java.util.Collections;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gci implements gyi {
    private static final zdy b = zdy.h("com/google/android/apps/tvsearch/led/controller/LedRebootStateTask");
    public final agow a;
    private final agte c;
    private final agow d;
    private final agow e;
    private final agow f;
    private final agow g;
    private final agow h;
    private final agow i;
    private final agow j;
    private final gyx k;
    private final Set l;
    private final Set m;
    private final int n;

    public gci(agte agteVar, agow agowVar, agow agowVar2, agow agowVar3, agow agowVar4, agow agowVar5, agow agowVar6, agow agowVar7, agow agowVar8) {
        agteVar.getClass();
        agowVar.getClass();
        agowVar2.getClass();
        agowVar3.getClass();
        agowVar4.getClass();
        agowVar5.getClass();
        agowVar6.getClass();
        agowVar7.getClass();
        this.c = agteVar;
        this.d = agowVar;
        this.e = agowVar2;
        this.f = agowVar3;
        this.g = agowVar4;
        this.h = agowVar5;
        this.i = agowVar6;
        this.a = agowVar7;
        this.j = agowVar8;
        this.k = gyx.u;
        Set setSingleton = Collections.singleton(hag.d);
        setSingleton.getClass();
        this.l = setSingleton;
        this.m = agrf.a;
        boolean zBooleanValue = ((Boolean) agowVar.a()).booleanValue();
        int i = 1;
        if (zBooleanValue && !((Boolean) agowVar2.a()).booleanValue()) {
            i = 3;
        }
        this.n = i;
    }

    @Override // defpackage.gzc
    public final int a() {
        return 0;
    }

    @Override // defpackage.gzc
    public final gyx b() {
        return this.k;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00cf, code lost:
    
        if (defpackage.ahal.a(r13, r9, r0) == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00e9, code lost:
    
        if (g(r13, r0) != r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00cf -> B:31:0x00d2). Please report as a decompilation issue!!! */
    @Override // defpackage.gyi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.agsw r13) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gci.c(agsw):java.lang.Object");
    }

    @Override // defpackage.gyi
    public final Set d() {
        return this.m;
    }

    @Override // defpackage.gyi
    public final Set e() {
        return this.l;
    }

    @Override // defpackage.gyi
    public final int f() {
        return this.n;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(boolean r8, defpackage.agsw r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.gch
            if (r0 == 0) goto L13
            r0 = r9
            gch r0 = (defpackage.gch) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            gch r0 = new gch
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.a
            agtg r1 = defpackage.agtg.a
            int r2 = r0.c
            r3 = 1
            java.lang.String r4 = "setLedLights"
            java.lang.String r5 = "com/google/android/apps/tvsearch/led/controller/LedRebootStateTask"
            java.lang.String r6 = "LedRebootStateTask.kt"
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            defpackage.agpl.b(r9)
            goto L97
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            defpackage.agpl.b(r9)
            if (r8 == 0) goto L86
            agow r8 = r7.g
            java.lang.Object r8 = r8.a()
            jcy r8 = (defpackage.jcy) r8
            boolean r8 = r8.d()
            if (r8 == 0) goto L67
            zdy r8 = defpackage.gci.b
            zeo r8 = r8.b()
            r9 = 103(0x67, float:1.44E-43)
            zeo r8 = r8.q(r5, r4, r9, r6)
            zdv r8 = (defpackage.zdv) r8
            java.lang.String r9 = "Restore Led State to OFF as hardware toggle is on"
            r8.u(r9)
            agow r8 = r7.h
            java.lang.Object r8 = r8.a()
            gcd r8 = (defpackage.gcd) r8
            r8.f()
            goto Ld8
        L67:
            zdy r8 = defpackage.gci.b
            zeo r8 = r8.b()
            r9 = 106(0x6a, float:1.49E-43)
            zeo r8 = r8.q(r5, r4, r9, r6)
            zdv r8 = (defpackage.zdv) r8
            java.lang.String r9 = "Restore Led State to MUTE as hardware toggle is off"
            r8.u(r9)
            agow r8 = r7.h
            java.lang.Object r8 = r8.a()
            gcd r8 = (defpackage.gcd) r8
            r8.d()
            goto Ld8
        L86:
            agow r8 = r7.f
            java.lang.Object r8 = r8.a()
            fjr r8 = (defpackage.fjr) r8
            r0.c = r3
            java.lang.Object r9 = r8.a(r0)
            if (r9 != r1) goto L97
            return r1
        L97:
            foc r8 = defpackage.foc.TOGGLE_ON
            if (r9 != r8) goto Lba
            zdy r8 = defpackage.gci.b
            zeo r8 = r8.b()
            r9 = 111(0x6f, float:1.56E-43)
            zeo r8 = r8.q(r5, r4, r9, r6)
            zdv r8 = (defpackage.zdv) r8
            java.lang.String r9 = "Restore Led State to OFF as hotword toggle is on"
            r8.u(r9)
            agow r8 = r7.h
            java.lang.Object r8 = r8.a()
            gcd r8 = (defpackage.gcd) r8
            r8.f()
            goto Ld8
        Lba:
            zdy r8 = defpackage.gci.b
            zeo r8 = r8.b()
            r9 = 114(0x72, float:1.6E-43)
            zeo r8 = r8.q(r5, r4, r9, r6)
            zdv r8 = (defpackage.zdv) r8
            java.lang.String r9 = "Restore Led State to MUTE as hotword toggle is off"
            r8.u(r9)
            agow r8 = r7.h
            java.lang.Object r8 = r8.a()
            gcd r8 = (defpackage.gcd) r8
            r8.d()
        Ld8:
            agpu r8 = defpackage.agpu.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gci.g(boolean, agsw):java.lang.Object");
    }
}

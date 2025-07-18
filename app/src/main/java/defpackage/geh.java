package defpackage;

import java.util.Collections;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class geh implements gyi {
    private final agow a;
    private final agow b;
    private final agow c;
    private final gyx d;
    private final Set e;
    private final Set f;
    private final fxk g;

    public geh(agow agowVar, agow agowVar2, agow agowVar3) {
        agowVar.getClass();
        agowVar2.getClass();
        agowVar3.getClass();
        this.a = agowVar;
        this.b = agowVar2;
        this.c = agowVar3;
        this.d = gyx.y;
        Set setSingleton = Collections.singleton(hag.g);
        setSingleton.getClass();
        this.e = setSingleton;
        Set setSingleton2 = Collections.singleton(gyx.j);
        setSingleton2.getClass();
        this.f = setSingleton2;
        this.g = new fxk(fki.a, new gef(this));
    }

    @Override // defpackage.gzc
    public final int a() {
        return -1073741824;
    }

    @Override // defpackage.gzc
    public final gyx b() {
        return this.d;
    }

    @Override // defpackage.gyi
    public final Object c(agsw agswVar) {
        ((fxu) this.b.a()).d(this.g);
        Object objG = g(agswVar);
        return objG == agtg.a ? objG : agpu.a;
    }

    @Override // defpackage.gyi
    public final Set d() {
        return this.f;
    }

    @Override // defpackage.gyi
    public final Set e() {
        return this.e;
    }

    @Override // defpackage.gyi
    public final int f() {
        return 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(defpackage.agsw r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.geg
            if (r0 == 0) goto L13
            r0 = r6
            geg r0 = (defpackage.geg) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            geg r0 = new geg
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            agtg r1 = defpackage.agtg.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.agpl.b(r6)
            goto L42
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            defpackage.agpl.b(r6)
            agow r6 = r5.c
            java.lang.Object r6 = r6.a()
            fki r6 = (defpackage.fki) r6
            r0.c = r3
            java.lang.Object r6 = r6.a(r0)
            if (r6 == r1) goto L64
        L42:
            fog r6 = (defpackage.fog) r6
            if (r6 == 0) goto L61
            agow r0 = r5.a
            java.lang.Object r0 = r0.a()
            gea r0 = (defpackage.gea) r0
            adwm r1 = r6.c
            if (r1 != 0) goto L54
            adwm r1 = defpackage.adwm.a
        L54:
            double r1 = r1.b
            adwm r6 = r6.c
            if (r6 != 0) goto L5c
            adwm r6 = defpackage.adwm.a
        L5c:
            double r3 = r6.c
            r0.a(r1, r3)
        L61:
            agpu r6 = defpackage.agpu.a
            return r6
        L64:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.geh.g(agsw):java.lang.Object");
    }
}

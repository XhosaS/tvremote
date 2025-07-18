package defpackage;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Intent;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lys implements gyi {
    private static final zdy a = zdy.h("com/google/android/katniss/search/serviceapi/KatnissVoiceInteractionServiceTask");
    private final agow b;
    private final agow c;
    private final agow d;
    private final agow e;
    private final agow f;
    private final agow g;
    private final gph h;
    private final agow i;
    private final agow j;
    private final agow k;
    private final gyx l;
    private final Set m;
    private final Set n;

    public lys(agow agowVar, agow agowVar2, agow agowVar3, agow agowVar4, agow agowVar5, agow agowVar6, gph gphVar, agow agowVar7, agow agowVar8, agow agowVar9) {
        agowVar.getClass();
        agowVar2.getClass();
        agowVar3.getClass();
        agowVar4.getClass();
        agowVar5.getClass();
        agowVar6.getClass();
        agowVar7.getClass();
        agowVar9.getClass();
        this.b = agowVar;
        this.c = agowVar2;
        this.d = agowVar3;
        this.e = agowVar4;
        this.f = agowVar5;
        this.g = agowVar6;
        this.h = gphVar;
        this.i = agowVar7;
        this.j = agowVar8;
        this.k = agowVar9;
        this.l = gyx.s;
        Set setSingleton = Collections.singleton(hag.d);
        setSingleton.getClass();
        this.m = setSingleton;
        this.n = agrf.a;
    }

    private final void g() throws SecurityException {
        List<ActivityManager.RunningServiceInfo> runningServices = ((ActivityManager) this.b.a()).getRunningServices(Integer.MAX_VALUE);
        runningServices.getClass();
        if (!runningServices.isEmpty()) {
            Iterator<T> it = runningServices.iterator();
            while (it.hasNext()) {
                String className = ((ActivityManager.RunningServiceInfo) it.next()).service.getClassName();
                ComponentName componentName = irm.a;
                if (agvy.c(className, irm.p.getClassName())) {
                    return;
                }
            }
        }
        ((zdv) a.b().q("com/google/android/katniss/search/serviceapi/KatnissVoiceInteractionServiceTask", "launchKatnissVoiceInteractionServiceIfNotRunning", 104, "KatnissVoiceInteractionServiceTask.kt")).u("KatnissVoiceInteractionService not running; auto-starting it.");
        Intent intentPutExtra = new Intent("android.intent.action.ASSIST").putExtra("EXTRA_WARM_UP_KVIS", true);
        intentPutExtra.getClass();
        ((exz) this.k.a()).d(intentPutExtra);
        ((glk) this.i.a()).k();
        jcv jcvVar = (jcv) this.g.a();
        ((zdv) ((zdv) jcv.a.b()).q("com/google/android/apps/tvsearch/voice/dsp/DspManager", "setIsAfterGmsUpdate", 502, "DspManager.java")).x("isAfterGmsUpdate changed to: %b", true);
        jcvVar.n = true;
    }

    @Override // defpackage.gzc
    public final int a() {
        return Integer.MIN_VALUE;
    }

    @Override // defpackage.gzc
    public final gyx b() {
        return this.l;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006d, code lost:
    
        if (defpackage.zty.a(r7, r0) != r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b9, code lost:
    
        if (defpackage.zty.a(r7, r0) != r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.gyi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.agsw r7) throws java.lang.SecurityException {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.lyr
            if (r0 == 0) goto L13
            r0 = r7
            lyr r0 = (defpackage.lyr) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            lyr r0 = new lyr
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            agtg r1 = defpackage.agtg.a
            int r2 = r0.c
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3e
            if (r2 == r5) goto L3a
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            defpackage.agpl.b(r7)
            goto Lbb
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L36:
            defpackage.agpl.b(r7)
            goto L99
        L3a:
            defpackage.agpl.b(r7)
            goto L6f
        L3e:
            defpackage.agpl.b(r7)
            gph r7 = r6.h
            gph r2 = defpackage.gph.a
            if (r7 != r2) goto L73
            agow r2 = r6.c
            java.lang.Object r2 = r2.a()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L73
            agow r7 = r6.d
            java.lang.Object r7 = r7.a()
            r7.getClass()
            abwf r7 = (defpackage.abwf) r7
            j$.time.Duration r7 = defpackage.acbh.b(r7)
            r7.getClass()
            r0.c = r5
            java.lang.Object r7 = defpackage.zty.a(r7, r0)
            if (r7 == r1) goto Lbf
        L6f:
            r6.g()
            goto Lc0
        L73:
            gph r2 = defpackage.gph.b
            if (r7 == r2) goto L7b
            gph r2 = defpackage.gph.c
            if (r7 != r2) goto Lc0
        L7b:
            agow r7 = r6.e
            java.lang.Object r7 = r7.a()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto Lc0
            agow r7 = r6.j
            java.lang.Object r7 = r7.a()
            gtu r7 = (defpackage.gtu) r7
            r0.c = r4
            java.lang.Object r7 = r7.g(r0)
            if (r7 == r1) goto Lbf
        L99:
            java.util.Collection r7 = (java.util.Collection) r7
            boolean r7 = r7.isEmpty()
            if (r7 != 0) goto Lc0
            agow r7 = r6.f
            java.lang.Object r7 = r7.a()
            r7.getClass()
            abwf r7 = (defpackage.abwf) r7
            j$.time.Duration r7 = defpackage.acbh.b(r7)
            r7.getClass()
            r0.c = r3
            java.lang.Object r7 = defpackage.zty.a(r7, r0)
            if (r7 == r1) goto Lbf
        Lbb:
            r6.g()
            goto Lc0
        Lbf:
            return r1
        Lc0:
            agpu r7 = defpackage.agpu.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lys.c(agsw):java.lang.Object");
    }

    @Override // defpackage.gyi
    public final Set d() {
        return this.n;
    }

    @Override // defpackage.gyi
    public final Set e() {
        return this.m;
    }

    @Override // defpackage.gyi
    public final int f() {
        return 1;
    }
}

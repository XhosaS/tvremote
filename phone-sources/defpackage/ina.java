package defpackage;

import android.content.Context;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ina implements xcm {
    private final xcq a;
    private final xcq b;

    public ina(xcq xcqVar, xcq xcqVar2) {
        this.a = xcqVar;
        this.b = xcqVar2;
    }

    @Override // defpackage.yfo, defpackage.yfn
    public final /* synthetic */ Object b() {
        Context contextA = ((rgq) this.a).a();
        lxc lxcVar = (lxc) this.b.b();
        wjo wjoVarC = kqv.c();
        lxcVar.getClass();
        vtw vtwVarM = wjv.a.m();
        vtwVarM.getClass();
        vtw vtwVarM2 = wjs.a.m();
        vtwVarM2.getClass();
        String packageName = contextA.getPackageName();
        packageName.getClass();
        if (!vtwVarM2.b.A()) {
            vtwVarM2.u();
        }
        vuc vucVar = vtwVarM2.b;
        wjs wjsVar = (wjs) vucVar;
        wjsVar.b |= 1;
        wjsVar.c = packageName;
        if (!vucVar.A()) {
            vtwVarM2.u();
        }
        wjs wjsVar2 = (wjs) vtwVarM2.b;
        wjsVar2.e = 3;
        wjsVar2.b |= 4;
        vtw vtwVarM3 = wkd.a.m();
        vtwVarM3.getClass();
        int i = lxcVar.b;
        if (!vtwVarM3.b.A()) {
            vtwVarM3.u();
        }
        vuc vucVar2 = vtwVarM3.b;
        wkd wkdVar = (wkd) vucVar2;
        wkdVar.b |= 2;
        wkdVar.d = i;
        String str = lxcVar.a;
        if (!vucVar2.A()) {
            vtwVarM3.u();
        }
        wkd wkdVar2 = (wkd) vtwVarM3.b;
        wkdVar2.b |= 1;
        wkdVar2.c = str;
        vuc vucVarR = vtwVarM3.r();
        vucVarR.getClass();
        wkd wkdVar3 = (wkd) vucVarR;
        if (!vtwVarM2.b.A()) {
            vtwVarM2.u();
        }
        wjs wjsVar3 = (wjs) vtwVarM2.b;
        wjsVar3.d = wkdVar3;
        wjsVar3.b |= 2;
        vuc vucVarR2 = vtwVarM2.r();
        vucVarR2.getClass();
        wjs wjsVar4 = (wjs) vucVarR2;
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        wjv wjvVar = (wjv) vtwVarM.b;
        wjvVar.c = wjsVar4;
        wjvVar.b |= 1;
        vtw vtwVarM4 = wka.a.m();
        vtwVarM4.getClass();
        vtw vtwVarM5 = wjr.a.m();
        vtwVarM5.getClass();
        long jB = opc.b(contextA.getContentResolver(), "android_id", 0L);
        if (!vtwVarM5.b.A()) {
            vtwVarM5.u();
        }
        wjr wjrVar = (wjr) vtwVarM5.b;
        wjrVar.b |= 1;
        wjrVar.c = jB;
        vtw vtwVarM6 = wjq.a.m();
        vtwVarM6.getClass();
        vtw vtwVarM7 = wjp.a.m();
        vtwVarM7.getClass();
        String str2 = Build.VERSION.RELEASE;
        str2.getClass();
        if (!vtwVarM7.b.A()) {
            vtwVarM7.u();
        }
        wjp wjpVar = (wjp) vtwVarM7.b;
        wjpVar.b |= 2;
        wjpVar.d = str2;
        int i2 = Build.VERSION.SDK_INT;
        if (!vtwVarM7.b.A()) {
            vtwVarM7.u();
        }
        wjp wjpVar2 = (wjp) vtwVarM7.b;
        wjpVar2.b |= 1;
        wjpVar2.c = i2;
        vuc vucVarR3 = vtwVarM7.r();
        vucVarR3.getClass();
        wjp wjpVar3 = (wjp) vucVarR3;
        if (!vtwVarM6.b.A()) {
            vtwVarM6.u();
        }
        wjq wjqVar = (wjq) vtwVarM6.b;
        wjqVar.c = wjpVar3;
        wjqVar.b |= 1;
        String str3 = Build.ID;
        str3.getClass();
        if (!vtwVarM6.b.A()) {
            vtwVarM6.u();
        }
        wjq wjqVar2 = (wjq) vtwVarM6.b;
        wjqVar2.b |= 2;
        wjqVar2.d = str3;
        String str4 = Build.MANUFACTURER;
        str4.getClass();
        if (!vtwVarM6.b.A()) {
            vtwVarM6.u();
        }
        wjq wjqVar3 = (wjq) vtwVarM6.b;
        wjqVar3.b |= 4;
        wjqVar3.e = str4;
        String str5 = Build.MODEL;
        str5.getClass();
        if (!vtwVarM6.b.A()) {
            vtwVarM6.u();
        }
        wjq wjqVar4 = (wjq) vtwVarM6.b;
        wjqVar4.b |= 8;
        wjqVar4.f = str5;
        String str6 = Build.PRODUCT;
        str6.getClass();
        if (!vtwVarM6.b.A()) {
            vtwVarM6.u();
        }
        wjq wjqVar5 = (wjq) vtwVarM6.b;
        wjqVar5.b |= 16;
        wjqVar5.g = str6;
        String str7 = Build.BRAND;
        str7.getClass();
        if (!vtwVarM6.b.A()) {
            vtwVarM6.u();
        }
        wjq wjqVar6 = (wjq) vtwVarM6.b;
        wjqVar6.b |= 32;
        wjqVar6.h = str7;
        String str8 = Build.DEVICE;
        str8.getClass();
        if (!vtwVarM6.b.A()) {
            vtwVarM6.u();
        }
        wjq wjqVar7 = (wjq) vtwVarM6.b;
        wjqVar7.b |= 64;
        wjqVar7.i = str8;
        String str9 = Build.FINGERPRINT;
        str9.getClass();
        if (!vtwVarM6.b.A()) {
            vtwVarM6.u();
        }
        wjq wjqVar8 = (wjq) vtwVarM6.b;
        wjqVar8.b |= 128;
        wjqVar8.j = str9;
        vuc vucVarR4 = vtwVarM6.r();
        vucVarR4.getClass();
        wjq wjqVar9 = (wjq) vucVarR4;
        if (!vtwVarM5.b.A()) {
            vtwVarM5.u();
        }
        vuc vucVar3 = vtwVarM5.b;
        wjr wjrVar2 = (wjr) vucVar3;
        wjrVar2.d = wjqVar9;
        wjrVar2.b |= 2;
        if (!vucVar3.A()) {
            vtwVarM5.u();
        }
        wjr wjrVar3 = (wjr) vtwVarM5.b;
        wjrVar3.e = wjoVarC.h;
        wjrVar3.b |= 8;
        vuc vucVarR5 = vtwVarM5.r();
        vucVarR5.getClass();
        wjr wjrVar4 = (wjr) vucVarR5;
        if (!vtwVarM4.b.A()) {
            vtwVarM4.u();
        }
        wka wkaVar = (wka) vtwVarM4.b;
        wkaVar.c = wjrVar4;
        wkaVar.b = 1;
        vuc vucVarR6 = vtwVarM4.r();
        vucVarR6.getClass();
        wka wkaVar2 = (wka) vucVarR6;
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        wjv wjvVar2 = (wjv) vtwVarM.b;
        wjvVar2.d = wkaVar2;
        wjvVar2.b |= 2;
        vuc vucVarR7 = vtwVarM.r();
        vucVarR7.getClass();
        return (wjv) vucVarR7;
    }
}

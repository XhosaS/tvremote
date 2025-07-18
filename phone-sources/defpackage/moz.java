package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class moz {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;

    public moz(yfo yfoVar, vbo vboVar, idf idfVar, SharedPreferences sharedPreferences, lfn lfnVar, lfx lfxVar, yfo yfoVar2, xlt xltVar) {
        this.g = yfoVar;
        this.e = vboVar;
        this.d = idfVar;
        this.c = sharedPreferences;
        this.b = lfnVar;
        this.a = lfxVar;
        this.h = yfoVar2;
        this.f = xltVar;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, yfo] */
    public final moy a(int i) {
        Object obj = this.a;
        Object objB = this.g.b();
        Context contextA = ((rgq) obj).a();
        mru mruVar = (mru) this.b.b();
        mruVar.getClass();
        iea ieaVar = (iea) this.c.b();
        ieaVar.getClass();
        pkg pkgVar = (pkg) this.h.b();
        pkgVar.getClass();
        pjx pjxVarA = ((plb) this.d).b();
        irc ircVar = (irc) this.e.b();
        ircVar.getClass();
        mem memVar = (mem) this.f.b();
        memVar.getClass();
        return new moy((ntp) objB, contextA, mruVar, ieaVar, pkgVar, pjxVarA, ircVar, memVar, i);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r7v1, types: [idf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r8v1, types: [idf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, yfo] */
    public final lwd b(iea ieaVar, boolean z, iea ieaVar2, String str, boolean z2, ActivityManager activityManager) {
        lfn lfnVar = (lfn) this.e.b();
        lfnVar.getClass();
        iea ieaVarB = ((kqg) this.b).b();
        lys lysVar = (lys) this.a.b();
        lysVar.getClass();
        SharedPreferences sharedPreferences = (SharedPreferences) this.h.b();
        sharedPreferences.getClass();
        ?? r6 = this.f;
        ?? r7 = this.d;
        ?? B = this.c.b();
        ?? B2 = r7.b();
        ExecutorService executorService = (ExecutorService) r6.b();
        executorService.getClass();
        Executor executor = (Executor) this.g.b();
        executor.getClass();
        ieaVar.getClass();
        ieaVar2.getClass();
        activityManager.getClass();
        return new lwd(lfnVar, ieaVarB, lysVar, sharedPreferences, B, B2, executorService, executor, ieaVar, z, ieaVar2, str, z2, activityManager);
    }

    public final vdn c(ksn ksnVar) {
        return d(ieg.f(ksnVar), trk.a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [idf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object, lfn] */
    public final vdn d(ieg iegVar, tst tstVar) {
        vbq vbqVar;
        String string = this.c.getString(ktw.c(iegVar), "");
        Object objB = this.d.b(iegVar);
        Locale localeBuild = (Locale) tstVar.e(Locale.getDefault());
        if (!ksg.e(localeBuild)) {
            localeBuild = new Locale.Builder().setLocale(localeBuild).setRegion("").build();
        }
        Context context = ((xlu) this.f).b;
        String languageTag = localeBuild.toLanguageTag();
        if (((Boolean) xlu.a.et(context)).booleanValue()) {
            vtw vtwVarM = vbq.a.m();
            String strA = ((ldb) this.h).a();
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            vbq vbqVar2 = (vbq) vtwVarM.b;
            vbqVar2.b = 3;
            vbqVar2.c = strA;
            vbqVar = (vbq) vtwVarM.r();
        } else {
            vtw vtwVarM2 = vbp.a.m();
            Set set = ((lfx) this.a).a(iegVar).d;
            if (!vtwVarM2.b.A()) {
                vtwVarM2.u();
            }
            vbp vbpVar = (vbp) vtwVarM2.b;
            vbpVar.b();
            vsf.h(set, vbpVar.b);
            if (this.b.dp()) {
                vtwVarM2.av();
            }
            vtw vtwVarM3 = vbq.a.m();
            if (!vtwVarM3.b.A()) {
                vtwVarM3.u();
            }
            vbq vbqVar3 = (vbq) vtwVarM3.b;
            vbp vbpVar2 = (vbp) vtwVarM2.r();
            vbpVar2.getClass();
            vbqVar3.c = vbpVar2;
            vbqVar3.b = 2;
            vbqVar = (vbq) vtwVarM3.r();
        }
        vtw vtwVarM4 = vdn.a.m();
        vas vasVar = (vas) this.g.b();
        if (!vtwVarM4.b.A()) {
            vtwVarM4.u();
        }
        vuc vucVar = vtwVarM4.b;
        vdn vdnVar = (vdn) vucVar;
        vasVar.getClass();
        vdnVar.d = vasVar;
        vdnVar.b = 2 | vdnVar.b;
        Object obj = this.e;
        if (!vucVar.A()) {
            vtwVarM4.u();
        }
        vdn vdnVar2 = (vdn) vtwVarM4.b;
        obj.getClass();
        vdnVar2.c = (vbo) obj;
        vdnVar2.b |= 1;
        vtw vtwVarM5 = vbm.a.m();
        if (!vtwVarM5.b.A()) {
            vtwVarM5.u();
        }
        vbm vbmVar = (vbm) vtwVarM5.b;
        string.getClass();
        vbmVar.b = 1;
        vbmVar.c = string;
        if (!vtwVarM4.b.A()) {
            vtwVarM4.u();
        }
        vdn vdnVar3 = (vdn) vtwVarM4.b;
        vbm vbmVar2 = (vbm) vtwVarM5.r();
        vbmVar2.getClass();
        vdnVar3.f = vbmVar2;
        vdnVar3.b |= 8;
        vtw vtwVarM6 = vci.a.m();
        if (!vtwVarM6.b.A()) {
            vtwVarM6.u();
        }
        vuc vucVar2 = vtwVarM6.b;
        objB.getClass();
        ((vci) vucVar2).c = (String) objB;
        if (!vucVar2.A()) {
            vtwVarM6.u();
        }
        vci vciVar = (vci) vtwVarM6.b;
        languageTag.getClass();
        vciVar.b = languageTag;
        if (!vtwVarM4.b.A()) {
            vtwVarM4.u();
        }
        vdn vdnVar4 = (vdn) vtwVarM4.b;
        vci vciVar2 = (vci) vtwVarM6.r();
        vciVar2.getClass();
        vdnVar4.e = vciVar2;
        vdnVar4.b |= 4;
        if (!vtwVarM4.b.A()) {
            vtwVarM4.u();
        }
        vdn vdnVar5 = (vdn) vtwVarM4.b;
        vbqVar.getClass();
        vdnVar5.g = vbqVar;
        vdnVar5.b |= 16;
        return (vdn) vtwVarM4.r();
    }

    public final synchronized void e(hnn hnnVar, hlg hlgVar) {
        ((hfx) this.f).b(hlgVar, hnnVar);
    }

    public final synchronized void f(hnn hnnVar, hlg hlgVar, hnp hnpVar) {
        if (hnpVar != null) {
            if (hnpVar.a) {
                ((hmr) this.b).b(hlgVar, hnpVar);
            }
            ((hfx) this.f).b(hlgVar, hnnVar);
        } else {
            ((hfx) this.f).b(hlgVar, hnnVar);
        }
    }

    public moz(how howVar, hfx hfxVar, hpd hpdVar, hpd hpdVar2, hpd hpdVar3) throws Throwable {
        this.h = howVar;
        hni hniVar = new hni(hfxVar);
        this.d = hniVar;
        hmr hmrVar = new hmr();
        this.b = hmrVar;
        synchronized (this) {
            try {
                try {
                    synchronized (hmrVar) {
                        try {
                        } catch (Throwable th) {
                            th = th;
                            while (true) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            }
                        }
                    }
                    this.c = new hjt();
                    this.f = new hfx((byte[]) null);
                    this.a = new lkt(hpdVar, hpdVar2, hpdVar3, this, this);
                    this.e = new nuh(hniVar);
                    this.g = new rin((byte[]) null);
                    ((hov) howVar).a = this;
                } catch (Throwable th3) {
                    th = th3;
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                throw th;
            }
        }
    }

    public moz(yfo yfoVar, yfo yfoVar2, yfo yfoVar3, yfo yfoVar4, yfo yfoVar5, yfo yfoVar6, yfo yfoVar7, yfo yfoVar8, byte[] bArr, byte[] bArr2) {
        yfoVar.getClass();
        this.c = yfoVar;
        yfoVar2.getClass();
        this.h = yfoVar2;
        yfoVar3.getClass();
        this.g = yfoVar3;
        yfoVar4.getClass();
        this.a = yfoVar4;
        yfoVar5.getClass();
        this.f = yfoVar5;
        yfoVar6.getClass();
        this.e = yfoVar6;
        yfoVar7.getClass();
        this.b = yfoVar7;
        yfoVar8.getClass();
        this.d = yfoVar8;
    }

    public moz(yfo yfoVar, yfo yfoVar2, yfo yfoVar3, yfo yfoVar4, yfo yfoVar5, yfo yfoVar6, yfo yfoVar7, yfo yfoVar8, short[] sArr) {
        yfoVar.getClass();
        this.b = yfoVar;
        yfoVar2.getClass();
        this.d = yfoVar2;
        yfoVar3.getClass();
        this.a = yfoVar3;
        yfoVar4.getClass();
        this.c = yfoVar4;
        yfoVar5.getClass();
        this.g = yfoVar5;
        yfoVar6.getClass();
        this.h = yfoVar6;
        yfoVar7.getClass();
        this.e = yfoVar7;
        yfoVar8.getClass();
        this.f = yfoVar8;
    }

    public moz(yfo yfoVar, yfo yfoVar2, yfo yfoVar3, yfo yfoVar4, yfo yfoVar5, yfo yfoVar6, yfo yfoVar7, yfo yfoVar8, byte[] bArr) {
        yfoVar.getClass();
        this.e = yfoVar;
        yfoVar2.getClass();
        this.b = yfoVar2;
        yfoVar3.getClass();
        this.a = yfoVar3;
        yfoVar4.getClass();
        this.h = yfoVar4;
        yfoVar5.getClass();
        this.c = yfoVar5;
        yfoVar6.getClass();
        this.d = yfoVar6;
        yfoVar7.getClass();
        this.f = yfoVar7;
        yfoVar8.getClass();
        this.g = yfoVar8;
    }

    public moz(yfo yfoVar, yfo yfoVar2, yfo yfoVar3, yfo yfoVar4, yfo yfoVar5, yfo yfoVar6, yfo yfoVar7, yfo yfoVar8, char[] cArr) {
        yfoVar.getClass();
        this.e = yfoVar;
        yfoVar2.getClass();
        this.d = yfoVar2;
        yfoVar3.getClass();
        this.g = yfoVar3;
        yfoVar4.getClass();
        this.f = yfoVar4;
        yfoVar5.getClass();
        this.a = yfoVar5;
        yfoVar6.getClass();
        this.h = yfoVar6;
        yfoVar7.getClass();
        this.b = yfoVar7;
        yfoVar8.getClass();
        this.c = yfoVar8;
    }

    public moz(yfo yfoVar, yfo yfoVar2, yfo yfoVar3, yfo yfoVar4, yfo yfoVar5, yfo yfoVar6, yfo yfoVar7, yfo yfoVar8) {
        yfoVar.getClass();
        this.g = yfoVar;
        yfoVar2.getClass();
        this.a = yfoVar2;
        yfoVar3.getClass();
        this.b = yfoVar3;
        yfoVar4.getClass();
        this.c = yfoVar4;
        yfoVar5.getClass();
        this.h = yfoVar5;
        yfoVar6.getClass();
        this.d = yfoVar6;
        yfoVar7.getClass();
        this.e = yfoVar7;
        yfoVar8.getClass();
        this.f = yfoVar8;
    }
}

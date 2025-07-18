package defpackage;

import android.app.Service;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wvp {
    wwt a;
    private final Service b;

    public wvp(Service service) {
        this.b = service;
    }

    public final wwc a() {
        return wum.t() ? wwc.c(wxj.c(this.b)) : wwb.a;
    }

    public final wwt b(String str) {
        if (wum.t()) {
            return null;
        }
        Service service = this.b;
        return wxj.b(service).d("com/google/apps/tiktok/tracing/ServiceLifecycleTraceManager", "ensureRootTrace", 187, str + " " + service.getClass().getSimpleName(), wwk.b);
    }

    public final wwt c(Intent intent) {
        Service service = this.b;
        wwc wwcVarA = wvr.a(service, intent);
        wwq wwqVar = wum.c().c;
        return new wvm(wzg.f(g("onBind"), wwcVarA, true), wvr.a.b(service, intent, String.valueOf(service.getClass().getName()).concat(".onBind"), false), wwqVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final wwt d() {
        final wvl wvlVarD;
        wwc wwcVarA = a();
        final wwq wwqVar = wum.c().c;
        if (wum.t()) {
            wvlVarD = null;
        } else {
            wwq wwqVarF = wum.f();
            if (wwqVarF != null) {
                wvo wvoVar = new wvo();
                wum.g(wum.c(), wwqVarF);
                wwa wwaVarB = wwb.a.b();
                wwaVarB.a(wwk.c, wvoVar);
                this.a = wzg.f("Creating ".concat(String.valueOf(this.b.getClass().getSimpleName())), ((wwc) wwaVarB).e(), true);
                wvlVarD = wwqVarF;
            } else {
                Service service = this.b;
                wvlVarD = wxj.b(service).d("com/google/apps/tiktok/tracing/ServiceLifecycleTraceManager", "ensureServiceRootTrace", 173, "Creating ".concat(String.valueOf(service.getClass().getSimpleName())), wwk.b);
            }
        }
        final wvx wvxVarF = wzg.f(g("onCreate"), wwcVarA, true);
        return new wwt() { // from class: wvn
            @Override // defpackage.wwt, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                wvxVarF.close();
                wwt wwtVar = this.a.a;
                if (wwtVar != null) {
                    wwtVar.close();
                }
                wwt wwtVar2 = wvlVarD;
                if (wwtVar2 != null) {
                    wwtVar2.close();
                }
                wum.g(wum.c(), wwqVar);
            }
        };
    }

    public final wwt e(String str) {
        wwc wwcVarA = a();
        wwq wwqVar = wum.c().c;
        return new wvm(wzg.f(g(str), wwcVarA, true), b(str), wwqVar);
    }

    public final wwt f() {
        wwc wwcVarA = a();
        wwq wwqVar = wum.c().c;
        return new wvm(wzg.f(g("onDestroy"), wwcVarA, true), b("Destroying"), wwqVar);
    }

    public final String g(String str) {
        return str + " " + this.b.getClass().getSimpleName();
    }

    public final wwt h(Intent intent, int i) {
        Service service = this.b;
        wwc wwcVarA = wvr.a(service, intent);
        wwq wwqVar = wum.c().c;
        Class<?> cls = service.getClass();
        wvr wvrVar = wvr.a;
        int i2 = i & 2;
        String strConcat = String.valueOf(cls.getName()).concat(".onStartCommand");
        if (i2 != 0) {
            strConcat = "Retry ".concat(strConcat);
        } else if ((i & 1) != 0) {
            strConcat = "Redelivery ".concat(strConcat);
        }
        return new wvm(wzg.f(g("onStartCommand"), wwcVarA, true), wvrVar.b(service, intent, strConcat, true), wwqVar);
    }

    public final wwt i() {
        wwc wwcVarA = a();
        wwq wwqVar = wum.c().c;
        return new wvm(wzg.f(g("onUnbind"), wwcVarA, true), b("Unbinding"), wwqVar);
    }
}

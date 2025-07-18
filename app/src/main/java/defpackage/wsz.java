package defpackage;

import android.content.Context;
import android.content.Intent;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wsz {
    public wwq a;
    public boolean b;
    public wwq c;
    public boolean d;
    public wwt e;
    private final bw f;
    private final Context g;
    private wwq h;
    private boolean i;
    private boolean j;
    private wwt k;
    private wwt l;

    public wsz(bw bwVar, Context context) {
        this.f = bwVar;
        this.g = context;
    }

    private final wwc C(wwc wwcVar) {
        wwc wwcVarD = wwc.d(wwcVar, wwc.c(((wxi) aehg.a(this.g, wxi.class)).n()));
        wwcVarD.getClass();
        return wwcVarD;
    }

    private final String D(String str) {
        return str + " " + this.g.getClass().getSimpleName();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void E(String str, String str2, Intent intent) {
        wwc wwcVarC;
        this.c = wum.c().c;
        wwq wwqVarN = wyo.a.n(intent, true);
        wwc wwcVarC2 = wwk.b;
        wwa wwaVarB = wwb.a.b();
        wwaVarB.a(wwk.c, new wuo() { // from class: wss
            @Override // defpackage.wuo
            public final void a() {
            }
        });
        wwc wwcVarE = ((wwc) wwaVarB).e();
        if (wwqVarN != null) {
            wum.g(wum.c(), wwqVarN);
            this.a = wwqVarN;
            wwcVarC2.getClass();
            wwcVarC = C(wwcVarC2);
        } else {
            wwq wwqVar = this.a;
            if (wwqVar != null) {
                wum.g(wum.c(), wwqVar);
                wwcVarC2.getClass();
                wwcVarC = C(wwcVarC2);
            } else {
                this.j = wum.u();
                wwq wwqVar2 = wum.c().c;
                boolean z = false;
                if ((wwqVar2 instanceof xae) && ((xae) wwqVar2).a()) {
                    z = true;
                }
                if (!wum.t() || z) {
                    wwq wwqVarF = wum.f();
                    if (wwqVarF != null) {
                        this.k = wwqVarF;
                        wum.g(wum.c(), wwqVarF);
                        this.l = wzg.f(D(str), wwc.d(wwcVarE, wwk.a(wwj.INTENT_TO_ACTIVITY)), true);
                    } else {
                        this.k = wxj.a(this.g).d("", "", 0, D(str), wwc.d(wwcVarC2, wwk.a(wwj.INTENT_TO_ACTIVITY)));
                    }
                } else {
                    wwcVarC2.getClass();
                    wwcVarC2 = C(wwcVarC2);
                }
                this.a = wum.c().c;
                wwcVarC = wwcVarC2;
            }
        }
        this.e = wzg.f(D(str2), wwc.d(wwcVarC, wwk.a(wwj.ACTIVITY_CREATE)), true);
        uea.a().post(new Runnable() { // from class: wst
            @Override // java.lang.Runnable
            public final void run() {
                this.a.a = null;
            }
        });
    }

    private final void F() {
        if (this.i) {
            this.a = null;
            this.i = false;
        }
    }

    private final void G() {
        wwq wwqVar = this.h;
        if (wwqVar != null) {
            this.a = wwqVar;
            this.h = null;
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [wwq, wwt] */
    private final void H() {
        ?? r1;
        if (this.b) {
            return;
        }
        synchronized (wyo.d) {
            r1 = wyo.e;
            wyo.e = null;
        }
        if (r1 != 0) {
            this.b = true;
            this.a = r1;
        }
    }

    private final void I() {
        wwt wwtVar = this.e;
        if (wwtVar == null) {
            return;
        }
        Objects.toString(wwtVar);
        throw new IllegalStateException("Expected lifecycleStepSpan to be null but was: ".concat(wwtVar.toString()));
    }

    public static final void p(wsz wszVar) {
        wszVar.t();
        wszVar.r();
        wszVar.a = null;
    }

    public final wwt A() {
        F();
        wwc wwcVar = wwb.a;
        wwcVar.getClass();
        s("onPostCreate", wwcVar);
        return new wsx(this);
    }

    public final wwt B() {
        wwc wwcVar = wwb.a;
        wwcVar.getClass();
        s("onSaveInstanceState", wwcVar);
        return new wsv(this);
    }

    public final wwt a() {
        wwc wwcVar = wto.a;
        final wwt wwtVarN = n("finish", wto.a);
        wwq wwqVar = wum.c().c;
        this.h = wwqVar;
        wwqVar.getClass();
        synchronized (wyo.d) {
            wyo.e = wwqVar;
        }
        final wyj wyjVar = new wyj(wwqVar);
        return new wwt() { // from class: wsp
            @Override // defpackage.wwt, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                wwtVarN.close();
                wyjVar.close();
            }
        };
    }

    public final wwt b() {
        I();
        return n("onAttachedToWindow", null);
    }

    public final wwt c() {
        I();
        final wwt wwtVarN = n("Back pressed", null);
        final wwt wwtVarI = wum.i();
        return new wwt() { // from class: wsr
            @Override // defpackage.wwt, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                wwtVarN.close();
                wwtVarI.close();
            }
        };
    }

    public final wwt d() {
        G();
        s("onDestroy", wwk.a(wwj.ACTIVITY_DESTROY));
        return new wsw(this);
    }

    public final wwt e(Intent intent) {
        intent.getClass();
        E("Reintenting into", "onNewIntent", intent);
        return new wsx(this);
    }

    public final wwt f() {
        G();
        s("onPause", wwk.a(wwj.ACTIVITY_PAUSE));
        return new wsv(this);
    }

    public final wwt g() {
        this.c = wum.c().c;
        wum.g(wum.c(), this.a);
        final wwt wwtVarN = n("onPostResume", null);
        return new wwt() { // from class: wsu
            @Override // defpackage.wwt, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                wwtVarN.close();
                wsz wszVar = this;
                wszVar.a = null;
                wszVar.b = false;
                wum.g(wum.c(), wszVar.c);
                wszVar.c = null;
            }
        };
    }

    public final wwt h() {
        F();
        wwc wwcVar = wwb.a;
        wwcVar.getClass();
        s("onRestart", wwcVar);
        return new wsx(this);
    }

    public final wwt i() {
        F();
        H();
        s("onResume", wwk.a(wwj.ACTIVITY_RESUME));
        return new wsx(this);
    }

    public final wwt j() {
        F();
        H();
        s("onStart", wwk.a(wwj.ACTIVITY_START));
        return new wsx(this);
    }

    public final wwt k() {
        G();
        s("onStop", wwk.a(wwj.ACTIVITY_STOP));
        return new wsv(this);
    }

    public final wwt l() {
        I();
        return n("onSupportNavigateUp", null);
    }

    public final wwt m() {
        I();
        return n("onUserInteraction", null);
    }

    public final wwt n(String str, wwc wwcVar) {
        if (!wum.t()) {
            wxc wxcVarA = wxj.a(this.g);
            wxcVarA.getClass();
            return wwcVar != null ? wxcVarA.a.b(str, wwc.d((wwc) wxcVarA.b.a(), wwcVar), wxcVarA.d, "", "") : wxcVarA.a(str);
        }
        if (wwcVar == null) {
            wwcVar = wwb.a;
        }
        wwcVar.getClass();
        return wzg.f(str, C(wwcVar), true);
    }

    public final void o() {
        de deVar = this.f.a.a.e;
        deVar.j.add(new wxb(wxj.a(this.g)));
    }

    public final void q(bce bceVar) {
        int iOrdinal = bceVar.ordinal();
        if (iOrdinal == 0) {
            if (this.d) {
                t();
                this.d = false;
                return;
            }
            return;
        }
        if (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 4 || iOrdinal == 5) {
            t();
        } else {
            Objects.toString(bceVar);
            throw new UnsupportedOperationException("Unknown lifecycle: ".concat(bceVar.toString()));
        }
    }

    public final void r() {
        this.i = true;
        bw bwVar = this.f;
        if (bwVar.isChangingConfigurations() || bwVar.isFinishing()) {
            return;
        }
        this.a = null;
    }

    public final void s(String str, wwc wwcVar) {
        this.c = wum.c().c;
        wwc wwcVarD = wwc.d(wwk.b, wwcVar);
        wwq wwqVar = this.a;
        if (wwqVar != null) {
            wum.g(wum.c(), wwqVar);
            wwcVarD.getClass();
            wwcVarD = C(wwcVarD);
        } else {
            this.j = wum.u();
            if (wum.t()) {
                wwcVarD.getClass();
                wwcVarD = C(wwcVarD);
            } else {
                Context context = this.g;
                Class<?> cls = context.getClass();
                wxc wxcVarA = wxj.a(context);
                this.k = wxcVarA.a.b(cls.getSimpleName() + ": " + str, wwc.d((wwc) wxcVarA.b.a(), wwcVarD), wxcVarA.d, "", "");
            }
            this.a = wum.c().c;
        }
        this.e = wzg.f(D(str), wwcVarD, true);
    }

    public final void t() {
        wwt wwtVar = this.e;
        if (wwtVar == null) {
            throw new IllegalStateException("Required value was null.");
        }
        wwtVar.close();
        this.e = null;
        if (this.j) {
            this.j = false;
            wum.n();
        }
        wwt wwtVar2 = this.l;
        if (wwtVar2 != null) {
            wwtVar2.close();
        }
        this.l = null;
        wwt wwtVar3 = this.k;
        if (wwtVar3 != null) {
            wwtVar3.close();
        }
        this.k = null;
        wum.g(wum.c(), this.c);
        this.c = null;
    }

    public final wwt u() {
        I();
        F();
        H();
        if (this.a == null) {
            return n("onActivityResult", null);
        }
        final wwq wwqVar = wum.c().c;
        wum.g(wum.c(), this.a);
        final wwt wwtVarN = n("onActivityResult", null);
        return new wwt() { // from class: wsq
            @Override // defpackage.wwt, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                wwtVarN.close();
                wum.g(wum.c(), wwqVar);
            }
        };
    }

    public final wwt v() {
        H();
        Intent intent = this.f.getIntent();
        intent.getClass();
        E("Intenting into", "onCreate", intent);
        return new wsx(this);
    }

    public final wwt w() {
        wwt wwtVarH = wum.h();
        if (wum.t()) {
            return wwtVarH;
        }
        Context context = this.g;
        final wvl wvlVarB = wxj.a(context).b(String.valueOf(context.getClass().getSimpleName()).concat(": onCreatePanelMenu"), "", "", 0);
        return new wwt() { // from class: wsy
            @Override // defpackage.wwt, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                wvlVarB.close();
                wum.n();
            }
        };
    }

    public final wwt x() {
        I();
        return n("onMenuItemSelected", null);
    }

    public final wwt y() {
        I();
        return n("onOptionsItemSelected", null);
    }

    public final wwt z() {
        I();
        return n("onPictureInPictureModeChanged", null);
    }
}

package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import com.google.android.apps.tvsearch.app.hover.HoverWindow$HoverLayoutParams;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes.dex */
public class exa implements exh {
    public static final zdy a = zdy.h("com/google/android/apps/tvsearch/app/hover/HoverActivityThread");
    public final Context b;
    public final jpk c;
    private final Handler d = new Handler(Looper.getMainLooper());
    private final jpl e;

    static {
        Duration.ofMillis(150L);
    }

    public exa(Context context, jpk jpkVar, jpl jplVar) {
        this.b = context;
        this.c = jpkVar;
        this.e = jplVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void p(jpg jpgVar, exg exgVar) {
        Animator animatorB = b((Context) jpgVar, exgVar, true);
        if (animatorB == null) {
            jpgVar.r();
        } else {
            animatorB.addListener(new ewz(jpgVar));
            animatorB.start();
        }
    }

    public final Animator a(Context context, exg exgVar, int i) throws Resources.NotFoundException {
        Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i);
        animatorLoadAnimator.setTarget(exgVar.a());
        return animatorLoadAnimator;
    }

    final Animator b(Context context, exg exgVar, boolean z) {
        int i;
        if (exgVar.a() == null) {
            return null;
        }
        HoverWindow$HoverLayoutParams hoverWindow$HoverLayoutParams = exgVar.c;
        if (z) {
            Animator animator = hoverWindow$HoverLayoutParams.b;
            i = hoverWindow$HoverLayoutParams.a;
        } else {
            Animator animator2 = hoverWindow$HoverLayoutParams.d;
            i = hoverWindow$HoverLayoutParams.c;
        }
        if (i != 0) {
            return a(context, exgVar, i);
        }
        return null;
    }

    protected void c(jph jphVar) {
        jpg jpgVar = jphVar.a;
        exg exgVarEC = jpgVar.eC();
        exgVarEC.d = false;
        ((exb) exgVarEC.getDecorView()).a = true;
        jpgVar.t();
        jphVar.b = true;
        jphVar.d = false;
    }

    protected void d(jph jphVar) {
        jpg jpgVar = jphVar.a;
        exg exgVarEC = jpgVar.eC();
        this.e.e(exgVarEC.getDecorView());
        jpgVar.v();
        exgVarEC.d = true;
        ((exb) exgVarEC.getDecorView()).a = false;
        jphVar.b = false;
        jphVar.d = false;
    }

    final void e(jph jphVar) {
        jpg jpgVar = jphVar.a;
        ViewGroup decorView = jpgVar.eC().getDecorView();
        jpgVar.x();
        jphVar.b = true;
        jphVar.c = null;
        jphVar.d = true;
        if (decorView.getParent() != null) {
            this.e.d(decorView);
        }
    }

    public final void f(Animator animator) {
        if (animator instanceof AnimatorSet) {
            ((AnimatorSet) animator).reverse();
        } else if (animator instanceof ValueAnimator) {
            ((ValueAnimator) animator).reverse();
        }
    }

    @Override // defpackage.exh
    public final void g() {
        this.d.post(new Runnable() { // from class: ewu
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v2, types: [android.content.ComponentCallbacks, jpg] */
            @Override // java.lang.Runnable
            public final void run() {
                exa exaVar = this.a;
                jph jphVarH = exaVar.c.h();
                if (jphVarH == null || jphVarH.e) {
                    return;
                }
                jphVarH.e = true;
                ?? r2 = jphVarH.a;
                Context context = exaVar.b;
                exg exgVarEC = r2.eC();
                context.unregisterComponentCallbacks(r2);
                if (!jphVarH.b) {
                    exaVar.c(jphVarH);
                }
                ewx ewxVar = new ewx(exaVar, r2, jphVarH, exgVarEC);
                Animator animatorB = exaVar.b((Context) r2, exgVarEC, false);
                if (animatorB == null) {
                    ewxVar.onAnimationEnd(null);
                } else {
                    animatorB.addListener(ewxVar);
                    animatorB.start();
                }
            }
        });
    }

    final void h() {
        jph jphVarH = this.c.h();
        if (jphVarH == null || jphVarH.b || jphVarH.e) {
            return;
        }
        this.e.c(jphVarH.a.eC().getDecorView());
        c(jphVarH);
    }

    @Override // defpackage.exh
    public final void i() {
        this.d.post(new Runnable() { // from class: ewr
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() throws Resources.NotFoundException {
                exa exaVar = this.a;
                jph jphVarH = exaVar.c.h();
                if (jphVarH == null || jphVarH.c != null || jphVarH.d || jphVarH.e) {
                    return;
                }
                jpg jpgVar = jphVarH.a;
                exg exgVarEC = jpgVar.eC();
                if (!jphVarH.b) {
                    exaVar.c(jphVarH);
                }
                Animator animatorA = null;
                if (exgVarEC.a() != null) {
                    HoverWindow$HoverLayoutParams hoverWindow$HoverLayoutParams = exgVarEC.c;
                    Animator animator = hoverWindow$HoverLayoutParams.g;
                    int i = hoverWindow$HoverLayoutParams.f;
                    if (i != 0) {
                        animatorA = exaVar.a((Context) jpgVar, exgVarEC, i);
                    }
                }
                if (animatorA == null) {
                    exaVar.e(jphVarH);
                    return;
                }
                jphVarH.c = animatorA;
                animatorA.addListener(new eww(exaVar, jpgVar, jphVarH));
                animatorA.start();
            }
        });
    }

    final boolean j(jpg jpgVar) {
        jph jphVarH = this.c.h();
        return jphVarH == null || jphVarH.a != jpgVar;
    }

    @Override // defpackage.exh
    public final void k() {
        this.d.post(new Runnable() { // from class: ewt
            @Override // java.lang.Runnable
            public final void run() {
                this.a.h();
            }
        });
    }

    @Override // defpackage.exh
    public final void l(final Runnable runnable) {
        this.d.post(new Runnable() { // from class: ews
            @Override // java.lang.Runnable
            public final void run() {
                Runnable runnable2 = runnable;
                exa exaVar = this.a;
                jph jphVarH = exaVar.c.h();
                if (jphVarH == null) {
                    ((zdv) ((zdv) exa.a.d()).q("com/google/android/apps/tvsearch/app/hover/HoverActivityThread", "requestPauseThenRun", 447, "HoverActivityThread.java")).u("#requestPauseThenRun called for non-existing HoverActivity");
                    runnable2.run();
                    return;
                }
                ViewGroup decorView = jphVarH.a.eC().getDecorView();
                if (!jphVarH.b || decorView.hasFocus()) {
                    decorView.getViewTreeObserver().addOnWindowFocusChangeListener(new ewy(decorView, runnable2));
                } else {
                    ((zdv) ((zdv) exa.a.b()).q("com/google/android/apps/tvsearch/app/hover/HoverActivityThread", "requestPauseThenRun", 453, "HoverActivityThread.java")).u("#requestPauseThenRun already paused");
                    runnable2.run();
                }
                exaVar.h();
            }
        });
    }

    @Override // defpackage.exh
    public final void m() {
        this.d.post(new Runnable() { // from class: ewv
            @Override // java.lang.Runnable
            public final void run() {
                exa exaVar = this.a;
                jph jphVarH = exaVar.c.h();
                if (jphVarH == null || !jphVarH.b || jphVarH.e) {
                    return;
                }
                jpg jpgVar = jphVarH.a;
                if (jphVarH.d) {
                    exaVar.o(jphVarH);
                } else {
                    Animator animator = jphVarH.c;
                    if (animator != null) {
                        exaVar.f(animator);
                        jphVarH.c = null;
                    }
                }
                if (jpgVar.A()) {
                    return;
                }
                exaVar.d(jphVarH);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13, types: [android.content.ComponentCallbacks, jpg] */
    public final void n(Intent intent) {
        jpk jpkVar = this.c;
        jph jphVarH = jpkVar.h();
        if (jphVarH != null) {
            if (jphVarH.e) {
                ((zdv) ((zdv) a.c()).q("com/google/android/apps/tvsearch/app/hover/HoverActivityThread", "start", 76, "HoverActivityThread.java")).u("Unable to start. HoverActivity is destroying.");
                return;
            }
            ((zdv) ((zdv) a.b()).q("com/google/android/apps/tvsearch/app/hover/HoverActivityThread", "start", 73, "HoverActivityThread.java")).u("#start handleNewIntentActivity");
            jph jphVarH2 = jpkVar.h();
            if (jphVarH2 != null) {
                jpg jpgVar = jphVarH2.a;
                if (jpgVar.A()) {
                    return;
                }
                if (jphVarH2.d) {
                    o(jphVarH2);
                } else {
                    Animator animator = jphVarH2.c;
                    if (animator != null) {
                        f(animator);
                        jphVarH2.c = null;
                    } else if (!jphVarH2.b) {
                        c(jphVarH2);
                    }
                }
                if (!jpgVar.A()) {
                    jpgVar.s(intent);
                }
                if (jpgVar.A()) {
                    return;
                }
                d(jphVarH2);
                return;
            }
            return;
        }
        ((zdv) ((zdv) a.b()).q("com/google/android/apps/tvsearch/app/hover/HoverActivityThread", "start", 70, "HoverActivityThread.java")).u("#start handleLaunchActivity");
        ?? K = jpkVar.k();
        jph jphVarB = jpkVar.b(K);
        jpkVar.i(jphVarB);
        Context context = this.b;
        jpl jplVar = this.e;
        K.eA(context, this, jplVar, intent);
        context.registerComponentCallbacks(K);
        exg exgVarEC = K.eC();
        HoverWindow$HoverLayoutParams hoverWindow$HoverLayoutParamsA = jplVar.a();
        exgVarEC.c = hoverWindow$HoverLayoutParamsA;
        exgVarEC.setAttributes(hoverWindow$HoverLayoutParamsA);
        jpg jpgVar2 = jphVarB.a;
        jpgVar2.p();
        jphVarB.b = true;
        jphVarB.d = true;
        if (!K.A()) {
            exg exgVarEC2 = jpgVar2.eC();
            if (jplVar.g(exgVarEC2.getDecorView(), exgVarEC2.c)) {
                jpgVar2.i();
            } else {
                jpgVar2.w();
                jphVarB.b = true;
                jphVarB.d = false;
                if (!jpgVar2.A()) {
                    p(jpgVar2, exgVarEC2);
                }
            }
        }
        if (!K.A()) {
            K.u();
        }
        if (K.A()) {
            return;
        }
        d(jphVarB);
    }

    public final void o(jph jphVar) {
        jpg jpgVar = jphVar.a;
        exg exgVarEC = jpgVar.eC();
        if (this.e.g(exgVarEC.getDecorView(), exgVarEC.c)) {
            jpgVar.i();
            return;
        }
        jpgVar.D();
        jphVar.b = true;
        jphVar.d = false;
        if (jpgVar.A()) {
            return;
        }
        p(jpgVar, exgVarEC);
    }
}

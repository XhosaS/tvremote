package defpackage;

import android.support.v7.app.AlertDialog;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import androidx.media3.exoplayer.ExoPlayer;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.tv.remote.virtual.ui.assistant.VirtualRemoteAssistantButton;
import j$.time.Duration;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class iuc implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ iuc(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object, yjk] */
    @Override // java.lang.Runnable
    public final void run() {
        Object objD;
        Object objA;
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        ViewPropertyAnimator viewPropertyAnimatorAlpha;
        ViewPropertyAnimator viewPropertyAnimatorAnimate2;
        ViewPropertyAnimator viewPropertyAnimatorAlpha2;
        ViewPropertyAnimator viewPropertyAnimatorAnimate3;
        ViewPropertyAnimator viewPropertyAnimatorAlpha3;
        ViewPropertyAnimator viewPropertyAnimatorAnimate4;
        ViewPropertyAnimator viewPropertyAnimatorAlpha4;
        switch (this.b) {
            case 0:
                ((iui) this.a).a();
                return;
            case 1:
                iua iuaVar = (iua) this.a;
                idr idrVar = iuaVar.m;
                Object objA2 = idrVar.a();
                objA2.getClass();
                itf itfVar = (itf) objA2;
                tad tadVarC = itfVar.c();
                if (tadVarC == null || tadVarC.a != 1) {
                    return;
                }
                idrVar.c(new itx(itfVar.b(), itfVar.a(), 1));
                yvc yvcVar = iuaVar.o;
                do {
                    objD = yvcVar.d();
                    objA = idrVar.a();
                    objA.getClass();
                } while (!yvcVar.f(objD, (itf) objA));
                return;
            case 2:
                BottomSheetBehavior.G((View) this.a).P(3);
                return;
            case 3:
                BottomSheetBehavior.G((View) this.a).P(3);
                return;
            case 4:
                ((iul) this.a).a();
                return;
            case 5:
                VirtualRemoteAssistantButton virtualRemoteAssistantButtonF = ((ivp) this.a).f();
                if (virtualRemoteAssistantButtonF.a()) {
                    virtualRemoteAssistantButtonF.performHapticFeedback(3);
                }
                virtualRemoteAssistantButtonF.b.e(17, false);
                return;
            case 6:
                ((iwu) this.a).i();
                return;
            case 7:
                tui tuiVar = iwu.a;
                tuv tuvVarE = tuiVar.e();
                tuy tuyVar = tvo.a;
                tug tugVar = (tug) tuvVarE.h(tuyVar, "VIRTUAL_REMOTE").j("com/google/android/apps/googletv/app/device/virtualremote/impl/VirtualRemoteImpl", "connect$lambda$4", 296, "VirtualRemoteImpl.kt");
                Object obj = this.a;
                iwu iwuVar = (iwu) obj;
                tmd tmdVar = iwuVar.b;
                tugVar.v("Connecting to virtual remote for %s.", tmdVar.a());
                ReentrantLock reentrantLock = iwuVar.h;
                reentrantLock.lock();
                try {
                    if (((iwu) obj).s != null) {
                        ((tug) tuiVar.e().h(tuyVar, "VIRTUAL_REMOTE").j("com/google/android/apps/googletv/app/device/virtualremote/impl/VirtualRemoteImpl", "connect$lambda$4", 299, "VirtualRemoteImpl.kt")).s("Virtual remote is already connected. Nothing further to do.");
                        return;
                    }
                    ((iwu) obj).o.set(true);
                    tmb tmbVar = ((iwu) obj).c;
                    pku pkuVar = ((iwu) obj).u;
                    tmbVar.c.a();
                    ((iwu) obj).s = new ulo(tmbVar.b, tmdVar, pkuVar);
                    return;
                } finally {
                    reentrantLock.unlock();
                }
            case 8:
                ((sbt) this.a).z();
                return;
            case 9:
                this.a.a();
                return;
            case 10:
                TextView textView = ((jcm) this.a).v;
                if (textView == null || (viewPropertyAnimatorAnimate = textView.animate()) == null || (viewPropertyAnimatorAlpha = viewPropertyAnimatorAnimate.alpha(0.0f)) == null) {
                    return;
                }
                viewPropertyAnimatorAlpha.setDuration(500L);
                return;
            case 11:
                TextView textView2 = ((jcm) this.a).w;
                if (textView2 == null || (viewPropertyAnimatorAnimate2 = textView2.animate()) == null || (viewPropertyAnimatorAlpha2 = viewPropertyAnimatorAnimate2.alpha(0.0f)) == null) {
                    return;
                }
                viewPropertyAnimatorAlpha2.setDuration(500L);
                return;
            case 12:
                ((View) this.a).animate().alpha(0.0f).setDuration(500L);
                return;
            case 13:
                jdd jddVar = (jdd) this.a;
                long j = jddVar.J;
                long j2 = ynm.a;
                if (ynm.b(j, 0L) > 0) {
                    ovs ovsVar = jddVar.j().a;
                    Duration durationOfSeconds = Duration.ofSeconds(ynm.l(jddVar.J), ynm.e(r2));
                    durationOfSeconds.getClass();
                    ovsVar.R(durationOfSeconds);
                }
                ExoPlayer exoPlayer = jddVar.C;
                if (exoPlayer != null) {
                    exoPlayer.W();
                    AlertDialog alertDialog = jddVar.W;
                    if (alertDialog != null && !alertDialog.isShowing()) {
                        exoPlayer.f();
                    }
                }
                AlertDialog alertDialog2 = jddVar.W;
                if (alertDialog2 == null || alertDialog2.isShowing()) {
                    return;
                }
                jddVar.K = jdd.Q(System.currentTimeMillis());
                return;
            case 14:
                ((jdd) this.a).I();
                return;
            case 15:
                ((jdd) this.a).A();
                return;
            case 16:
                tui tuiVar2 = jdd.a;
                ((View) this.a).animate().alpha(0.0f).setDuration(500L);
                return;
            case 17:
                TextView textView3 = ((jdd) this.a).ad;
                if (textView3 == null || (viewPropertyAnimatorAnimate3 = textView3.animate()) == null || (viewPropertyAnimatorAlpha3 = viewPropertyAnimatorAnimate3.alpha(0.0f)) == null) {
                    return;
                }
                viewPropertyAnimatorAlpha3.setDuration(500L);
                return;
            case 18:
                TextView textView4 = ((jdd) this.a).ae;
                if (textView4 == null || (viewPropertyAnimatorAnimate4 = textView4.animate()) == null || (viewPropertyAnimatorAlpha4 = viewPropertyAnimatorAnimate4.alpha(0.0f)) == null) {
                    return;
                }
                viewPropertyAnimatorAlpha4.setDuration(500L);
                return;
            case 19:
                View view = ((jdd) this.a).M;
                if (view == null) {
                    yks.c("playerTextContainer");
                    view = null;
                }
                view.setVisibility(8);
                return;
            default:
                ((sbt) this.a).z();
                return;
        }
    }
}

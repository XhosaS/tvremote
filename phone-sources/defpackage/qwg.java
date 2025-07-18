package defpackage;

import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qwg implements View.OnTouchListener {
    public final qwn a;
    public final SelectedAccountDisc b;
    public boolean c;
    final GestureDetector.SimpleOnGestureListener d;
    private final rjg e;
    private final nhl f;

    public qwg(qwn qwnVar, SelectedAccountDisc selectedAccountDisc) {
        qwd qwdVar = new qwd(this);
        this.d = qwdVar;
        this.a = qwnVar;
        this.b = selectedAccountDisc;
        nhl nhlVar = new nhl(selectedAccountDisc.getContext(), qwdVar);
        this.f = nhlVar;
        nhlVar.a(true);
        this.e = qwnVar.m;
    }

    public static boolean d(int i) {
        return i == 4 || i == 5;
    }

    public static boolean e(int i) {
        return i == 3 || i == 2;
    }

    public static final ObjectAnimator f(AccountParticleDisc accountParticleDisc, int i) {
        boolean z;
        if (i == 3) {
            z = true;
        } else if (i == 4) {
            i = 4;
            z = true;
        } else {
            z = false;
        }
        boolean zE = e(i);
        return ObjectAnimator.ofFloat(accountParticleDisc, true != zE ? "translationX" : "translationY", (zE ? accountParticleDisc.getMeasuredHeight() : accountParticleDisc.getMeasuredWidth()) * (true != z ? -0.4f : 0.4f)).setDuration(100L);
    }

    public static Object g(List list, Object obj, int i) {
        int size;
        if (!list.isEmpty()) {
            int i2 = i - 1;
            int i3 = 1;
            if (i2 == 1) {
                i3 = -1;
            } else if (i2 != 2) {
                throw new RuntimeException();
            }
            int iIndexOf = list.indexOf(obj);
            if (iIndexOf != -1 && (size = ((i3 + iIndexOf) + list.size()) % list.size()) != iIndexOf) {
                return list.get(size);
            }
        }
        return obj;
    }

    public final boolean a(Object obj, Object obj2) {
        qth qthVar = this.a.c;
        return qthVar.c(obj).equals(qthVar.c(obj2));
    }

    public final AnimatorSet b(int i, AnimatorListenerAdapter animatorListenerAdapter, Runnable runnable) {
        AccountParticleDisc accountParticleDisc = this.b.b;
        ObjectAnimator duration = ObjectAnimator.ofFloat(accountParticleDisc, "alpha", 1.0f, 0.0f).setDuration(50L);
        duration.setStartDelay(50L);
        ImmutableList immutableListOf = ImmutableList.of(f(accountParticleDisc, i), duration);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(immutableListOf);
        animatorSet.addListener(new qwe(this, runnable, animatorListenerAdapter));
        return animatorSet;
    }

    public final void c(int i) {
        int i2;
        int i3 = i - 1;
        if (i3 != 1) {
            i2 = 2;
            if (i3 == 2) {
                i2 = 5;
            } else if (i3 != 3) {
                i2 = 3;
            }
        } else {
            i2 = 4;
        }
        rjg rjgVar = this.e;
        ntp ntpVar = new ntp(22);
        vvd vvdVar = ple.b;
        vtw vtwVarM = plf.a.m();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        plf plfVar = (plf) vtwVarM.b;
        plfVar.c = i2 - 1;
        plfVar.b = 1 | plfVar.b;
        ntpVar.v(new pjv(vvdVar, (plf) vtwVarM.r()));
        rjgVar.f(ntpVar, this.b);
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        SelectedAccountDisc selectedAccountDisc = this.b;
        sij.x(view == selectedAccountDisc, "View must be the selectedAccountDisc passed on the c'tor.");
        if (motionEvent.getAction() == 0) {
            selectedAccountDisc.requestDisallowInterceptTouchEvent(true);
        }
        return this.f.b(motionEvent);
    }
}

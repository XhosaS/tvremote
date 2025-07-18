package defpackage;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ah implements Animation.AnimationListener {
    public static final /* synthetic */ int e = 0;
    final /* synthetic */ en a;
    final /* synthetic */ ViewGroup b;
    final /* synthetic */ View c;
    final /* synthetic */ ai d;

    public ah(en enVar, ViewGroup viewGroup, View view, ai aiVar) {
        this.a = enVar;
        this.b = viewGroup;
        this.c = view;
        this.d = aiVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        animation.getClass();
        final ViewGroup viewGroup = this.b;
        final View view = this.c;
        final ai aiVar = this.d;
        viewGroup.post(new Runnable() { // from class: ag
            @Override // java.lang.Runnable
            public final void run() {
                int i = ah.e;
                viewGroup.endViewTransition(view);
                ai aiVar2 = aiVar;
                aiVar2.a.a.f(aiVar2);
            }
        });
        if (de.S(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.a + " has ended.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        animation.getClass();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        animation.getClass();
        if (de.S(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.a + " has reached onAnimationStart.");
        }
    }
}

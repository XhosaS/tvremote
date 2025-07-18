package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hew extends AnimatorListenerAdapter {
    final /* synthetic */ View a;
    final /* synthetic */ hex b;

    public hew(hex hexVar, View view) {
        this.a = view;
        this.b = hexVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        View view = this.a;
        view.setVisibility(8);
        view.setAlpha(1.0f);
        hex hexVar = this.b;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = hexVar.e;
        view.setLayoutParams(layoutParams);
    }
}

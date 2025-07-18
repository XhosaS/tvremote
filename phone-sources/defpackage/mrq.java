package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class mrq extends AnimatorListenerAdapter {
    final /* synthetic */ int a;
    final /* synthetic */ mrt b;

    public mrq(mrt mrtVar, int i) {
        this.a = i;
        this.b = mrtVar;
    }

    private final void a() {
        mrt mrtVar = this.b;
        mrtVar.f();
        ImageView imageView = mrtVar.b;
        int i = this.a;
        imageView.setVisibility(i);
        TextView textView = mrtVar.c;
        if (textView != null) {
            textView.setVisibility(i);
        }
        if (i == 4) {
            mrtVar.d(false);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        a();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        a();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.b.b.setVisibility(0);
    }
}

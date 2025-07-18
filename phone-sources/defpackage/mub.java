package defpackage;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mub implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ boolean a;
    final /* synthetic */ View b;
    final /* synthetic */ mud c;
    private final /* synthetic */ int d;

    public mub(mud mudVar, boolean z, View view, int i) {
        this.d = i;
        this.a = z;
        this.b = view;
        this.c = mudVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (this.d != 0) {
            if (this.a) {
                View view = this.b;
                view.setAlpha(this.c.a(view));
                return;
            }
            return;
        }
        if (this.a) {
            View view2 = this.b;
            view2.setAlpha(this.c.a(view2));
        }
    }
}

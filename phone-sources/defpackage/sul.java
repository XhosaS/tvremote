package defpackage;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sul implements ValueAnimator.AnimatorUpdateListener {
    public static final /* synthetic */ int a = 0;
    private final suk b;
    private final View[] c;

    public sul(suk sukVar, View... viewArr) {
        this.b = sukVar;
        this.c = viewArr;
    }

    public static sul a(View... viewArr) {
        return new sul(new suj(3), viewArr);
    }

    public static sul b(View... viewArr) {
        return new sul(new suj(1), viewArr);
    }

    public static sul c(View... viewArr) {
        return new sul(new suj(2), viewArr);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = 0;
        while (true) {
            View[] viewArr = this.c;
            if (i >= viewArr.length) {
                return;
            }
            this.b.a(valueAnimator, viewArr[i]);
            i++;
        }
    }
}

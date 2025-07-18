package defpackage;

import android.animation.ValueAnimator;

/* compiled from: PG */
/* loaded from: classes.dex */
class cqb implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ cqd a;

    public cqb(cqd cqdVar) {
        this.a = cqdVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        cqd cqdVar = this.a;
        cuh cuhVar = cqdVar.k;
        if (cuhVar != null) {
            cuhVar.o(cqdVar.b.c());
        }
    }
}

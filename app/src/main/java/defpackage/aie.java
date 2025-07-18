package defpackage;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
class aie implements Runnable {
    final /* synthetic */ View a;
    final /* synthetic */ aik b;
    final /* synthetic */ aia c;
    final /* synthetic */ ValueAnimator d;

    public aie(View view, aik aikVar, aia aiaVar, ValueAnimator valueAnimator) {
        this.a = view;
        this.b = aikVar;
        this.c = aiaVar;
        this.d = valueAnimator;
    }

    @Override // java.lang.Runnable
    public final void run() {
        aig.f(this.a, this.b, this.c);
        this.d.start();
    }
}

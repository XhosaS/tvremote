package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.google.android.apps.play.movies.mobile.usecase.watch.bingewatch.BingeWatchCard;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class muc extends AnimatorListenerAdapter {
    final /* synthetic */ boolean a;
    final /* synthetic */ View b;
    final /* synthetic */ mud c;

    public muc(mud mudVar, boolean z, View view) {
        this.a = z;
        this.b = view;
        this.c = mudVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.a) {
            this.b.setAlpha(1.0f);
        }
        BingeWatchCard bingeWatchCard = (BingeWatchCard) this.c.h.b;
        bingeWatchCard.f = false;
        if (!bingeWatchCard.c || bingeWatchCard.e) {
            return;
        }
        ((View) bingeWatchCard.getParent()).setWillNotDraw(bingeWatchCard.d);
    }
}

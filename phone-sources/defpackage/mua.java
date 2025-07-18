package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.Resources;
import android.view.View;
import com.google.android.apps.play.movies.mobile.usecase.watch.bingewatch.BingeWatchCard;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mua extends AnimatorListenerAdapter {
    final /* synthetic */ boolean a;
    final /* synthetic */ View b;
    final /* synthetic */ mud c;

    public mua(mud mudVar, boolean z, View view) {
        this.a = z;
        this.b = view;
        this.c = mudVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) throws Resources.NotFoundException {
        if (this.a) {
            View view = this.b;
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
            view.setAlpha(1.0f);
        }
        BingeWatchCard bingeWatchCard = (BingeWatchCard) this.c.h.b;
        bingeWatchCard.f = false;
        bingeWatchCard.setVisibility(8);
        msi msiVar = bingeWatchCard.g;
        if (msiVar != null) {
            msiVar.g();
            msiVar.b = 5;
            nqq.j(140, msiVar.a);
        }
    }
}

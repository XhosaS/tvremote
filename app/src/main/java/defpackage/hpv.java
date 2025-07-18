package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.google.android.apps.tvsearch.widget.imagedownload.ImageFitDownloadView;

/* compiled from: PG */
/* loaded from: classes.dex */
class hpv extends AnimatorListenerAdapter {
    final /* synthetic */ ImageFitDownloadView a;
    final /* synthetic */ View b;

    public hpv(ImageFitDownloadView imageFitDownloadView, View view) {
        this.a = imageFitDownloadView;
        this.b = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.setVisibility(8);
        this.b.setTranslationX(0.0f);
    }
}

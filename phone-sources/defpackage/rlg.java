package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.libraries.onegoogle.popovercontainer.ExpandableDialogView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rlg extends AnimatorListenerAdapter {
    final /* synthetic */ ExpandableDialogView a;

    public rlg(ExpandableDialogView expandableDialogView) {
        this.a = expandableDialogView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.l(0.0f);
    }
}

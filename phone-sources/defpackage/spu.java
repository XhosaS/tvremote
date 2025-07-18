package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class spu extends AnimatorListenerAdapter {
    final /* synthetic */ BottomSheetBehavior a;

    public spu(BottomSheetBehavior bottomSheetBehavior) {
        this.a = bottomSheetBehavior;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        BottomSheetBehavior bottomSheetBehavior = this.a;
        bottomSheetBehavior.Q(5);
        WeakReference weakReference = bottomSheetBehavior.C;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        ((View) bottomSheetBehavior.C.get()).requestLayout();
    }
}

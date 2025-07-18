package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Property;
import android.util.SparseArray;
import android.view.View;
import com.google.android.libraries.tv.widgets.transition.AnimatorTransition;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class uvu extends AnimatorListenerAdapter {
    int a;
    final /* synthetic */ boolean b;
    final /* synthetic */ View c;
    final /* synthetic */ SparseArray d;
    final /* synthetic */ AnimatorTransition e;

    public uvu(AnimatorTransition animatorTransition, boolean z, View view, SparseArray sparseArray) {
        this.b = z;
        this.c = view;
        this.d = sparseArray;
        this.e = animatorTransition;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        View view;
        yyk yykVar = AnimatorTransition.a;
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.d;
            view = this.c;
            if (i >= sparseArray.size()) {
                break;
            }
            int iKeyAt = sparseArray.keyAt(i);
            ((Property) AnimatorTransition.a.get(iKeyAt)).set(view, (Float) sparseArray.valueAt(i));
            i++;
        }
        if (this.b) {
            view.setLayerType(this.a, null);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (this.b) {
            View view = this.c;
            this.a = view.getLayerType();
            view.setLayerType(this.e.d, null);
        }
    }
}

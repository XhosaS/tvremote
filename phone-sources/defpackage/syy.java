package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.EditText;
import com.google.android.material.internal.ClippableRoundedCornerLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class syy extends AnimatorListenerAdapter {
    final /* synthetic */ boolean a;
    final /* synthetic */ syz b;

    public syy(syz syzVar, boolean z) {
        this.a = z;
        this.b = syzVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        boolean z = this.a;
        float f = true != z ? 0.0f : 1.0f;
        syz syzVar = this.b;
        syzVar.f(f);
        EditText editText = syzVar.d;
        editText.setAlpha(1.0f);
        sym symVar = syzVar.g;
        if (symVar != null) {
            symVar.a.setAlpha(1.0f);
        }
        editText.setClipBounds(null);
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = syzVar.b;
        clippableRoundedCornerLayout.a = null;
        clippableRoundedCornerLayout.b = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        clippableRoundedCornerLayout.invalidate();
        if (z) {
            return;
        }
        syzVar.e.i = null;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.b.f(true != this.a ? 1.0f : 0.0f);
    }
}

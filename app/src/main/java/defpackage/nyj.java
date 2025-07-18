package defpackage;

import android.view.View;
import android.view.ViewParent;
import android.view.animation.Animation;

/* compiled from: PG */
/* loaded from: classes.dex */
public class nyj implements Animation.AnimationListener {
    final /* synthetic */ View a;
    private final dvz b;

    public nyj(View view) {
        this.a = view;
        yrp yrpVar = nym.a;
        ViewParent parent = view.getParent();
        while (parent != null && !(parent instanceof dvz)) {
            parent = parent.getParent();
        }
        this.b = (dvz) parent;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        dvz dvzVar = this.b;
        if (dvzVar != null) {
            dvzVar.setHasTransientState(false);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        dvz dvzVar = this.b;
        if (dvzVar != null) {
            dvzVar.setHasTransientState(true);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }
}

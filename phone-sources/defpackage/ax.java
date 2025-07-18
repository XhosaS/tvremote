package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ax implements Animation.AnimationListener {
    public static final /* synthetic */ int e = 0;
    final /* synthetic */ C0038do a;
    final /* synthetic */ ViewGroup b;
    final /* synthetic */ View c;
    final /* synthetic */ ay d;

    public ax(C0038do c0038do, ViewGroup viewGroup, View view, ay ayVar) {
        this.a = c0038do;
        this.b = viewGroup;
        this.c = view;
        this.d = ayVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        animation.getClass();
        ViewGroup viewGroup = this.b;
        viewGroup.post(new bd(viewGroup, this.c, this.d, 1));
        if (cr.Y(2)) {
            Objects.toString(this.a);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        animation.getClass();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        animation.getClass();
        if (cr.Y(2)) {
            Objects.toString(this.a);
        }
    }
}

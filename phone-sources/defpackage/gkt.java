package defpackage;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gkt extends Animatable2.AnimationCallback {
    final /* synthetic */ gku a;

    public gkt(gku gkuVar) {
        this.a = gkuVar;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        this.a.b(drawable);
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        this.a.c(drawable);
    }
}

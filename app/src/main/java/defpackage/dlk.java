package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dlk implements ddp {
    private final AnimatedImageDrawable a;

    public dlk(AnimatedImageDrawable animatedImageDrawable) {
        this.a = animatedImageDrawable;
    }

    @Override // defpackage.ddp
    public final int a() {
        AnimatedImageDrawable animatedImageDrawable = this.a;
        int intrinsicWidth = animatedImageDrawable.getIntrinsicWidth() * animatedImageDrawable.getIntrinsicHeight() * dqm.b(Bitmap.Config.ARGB_8888);
        return intrinsicWidth + intrinsicWidth;
    }

    @Override // defpackage.ddp
    public final Class b() {
        return Drawable.class;
    }

    @Override // defpackage.ddp
    public final /* synthetic */ Object c() {
        return this.a;
    }

    @Override // defpackage.ddp
    public final void e() {
        AnimatedImageDrawable animatedImageDrawable = this.a;
        animatedImageDrawable.stop();
        animatedImageDrawable.clearAnimationCallbacks();
    }
}

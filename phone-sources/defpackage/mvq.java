package defpackage;

import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mvq extends TransitionDrawable {
    public mvq(Drawable[] drawableArr) {
        super(drawableArr);
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        outline.setRect(getBounds());
        outline.setAlpha(1.0f);
    }
}

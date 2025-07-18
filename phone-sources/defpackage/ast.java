package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ast extends ViewOutlineProvider {
    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        outline.setRect(0, 0, view.getWidth(), view.getHeight());
        outline.setAlpha(0.0f);
    }
}

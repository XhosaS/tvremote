package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kkf extends ViewOutlineProvider {
    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        view.getClass();
        outline.getClass();
        outline.setOval(0, 0, view.getWidth(), view.getHeight());
    }
}

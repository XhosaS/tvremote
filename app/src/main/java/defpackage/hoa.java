package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: PG */
/* loaded from: classes.dex */
class hoa extends ViewOutlineProvider {
    final /* synthetic */ int a;

    public hoa(int i) {
        this.a = i;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        int i = this.a;
        outline.setOval(0, 0, i, i);
        outline.setAlpha(1.0f);
    }
}

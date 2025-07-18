package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bqb extends ViewOutlineProvider {
    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        if (view instanceof bqc) {
            int i = bqc.h;
            Outline outline2 = ((bqc) view).b;
            if (outline2 != null) {
                outline.set(outline2);
            }
        }
    }
}

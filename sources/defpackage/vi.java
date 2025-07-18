package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class vi extends vl {
    @Override // defpackage.vk
    public final float a(View view) {
        return view.getLayoutDirection() == 1 ? view.getTranslationX() + view.getWidth() : view.getTranslationX() - view.getWidth();
    }
}

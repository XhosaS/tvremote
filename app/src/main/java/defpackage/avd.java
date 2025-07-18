package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public class avd extends avf {
    @Override // defpackage.ave
    public final float a(View view) {
        return view.getLayoutDirection() == 1 ? view.getTranslationX() - view.getWidth() : view.getTranslationX() + view.getWidth();
    }
}

package defpackage;

import android.view.WindowManager;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cnm {
    public static final cnm a = new cnm();

    private cnm() {
    }

    public final void a(WindowManager.LayoutParams layoutParams, int i) {
        layoutParams.setFitInsetsSides(i);
    }

    public final void b(WindowManager.LayoutParams layoutParams, int i) {
        layoutParams.setFitInsetsTypes(i);
    }
}

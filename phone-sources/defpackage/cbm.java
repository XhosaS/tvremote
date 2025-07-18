package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cbm {
    public static final cbm a = new cbm();

    private cbm() {
    }

    public final void a(View view) {
        view.clearViewTranslationCallback();
    }

    public final void b(View view) {
        view.setViewTranslationCallback(cbl.a);
    }
}

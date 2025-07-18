package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
class ahf {
    static CharSequence a(View view) {
        return view.getAccessibilityPaneTitle();
    }

    static void b(View view, boolean z) {
        view.setAccessibilityHeading(z);
    }

    static void c(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    static void d(View view, boolean z) {
        view.setScreenReaderFocusable(z);
    }

    static boolean e(View view) {
        return view.isAccessibilityHeading();
    }

    static boolean f(View view) {
        return view.isScreenReaderFocusable();
    }
}

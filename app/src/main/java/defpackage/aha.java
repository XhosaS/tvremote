package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* compiled from: PG */
/* loaded from: classes.dex */
public class aha {
    static WindowInsets a(View view, WindowInsets windowInsets) {
        int i = ahn.a;
        return view.dispatchApplyWindowInsets(windowInsets);
    }

    static WindowInsets b(View view, WindowInsets windowInsets) {
        return view.onApplyWindowInsets(windowInsets);
    }

    public static void c(View view) {
        view.requestApplyInsets();
    }
}

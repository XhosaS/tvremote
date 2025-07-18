package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mex {
    public static void a(View view) {
        view.setOutlineProvider(null);
    }

    public static void b(ViewGroup viewGroup, int i) {
        viewGroup.setVisibility(i);
        viewGroup.jumpDrawablesToCurrentState();
    }

    public static void c(View view, boolean z) {
        if (view != null) {
            view.setVisibility(true != z ? 8 : 0);
        }
    }
}

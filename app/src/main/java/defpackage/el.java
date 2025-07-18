package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class el {
    public final int a(View view) {
        if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
            return 4;
        }
        return b(view.getVisibility());
    }

    public final int b(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 4) {
            return 4;
        }
        if (i == 8) {
            return 3;
        }
        throw new IllegalArgumentException(a.b(i, "Unknown visibility "));
    }
}

package defpackage;

import android.os.Build;
import android.util.TypedValue;
import android.view.ActionMode;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alc {
    public static void a(TextView textView, int i) {
        afk.c(i);
        if (i != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i - r0, 1.0f);
        }
    }

    public static void b(TextView textView, int i, float f) {
        if (Build.VERSION.SDK_INT >= 34) {
            textView.setLineHeight(i, f);
        } else {
            a(textView, Math.round(TypedValue.applyDimension(i, f, textView.getResources().getDisplayMetrics())));
        }
    }

    public static void c(ActionMode.Callback callback) {
        if (callback instanceof alb) {
            throw null;
        }
    }
}

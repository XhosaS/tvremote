package defpackage;

import android.os.Build;
import android.os.Trace;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dmv {
    public static final AtomicBoolean a = new AtomicBoolean(false);

    public static final void a() {
        if (Build.VERSION.SDK_INT < 29 || !a.get()) {
            return;
        }
        Trace.endAsyncSection("GlanceAppWidget::update", 0);
    }
}

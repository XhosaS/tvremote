package defpackage;

import android.app.Activity;
import android.graphics.Rect;
import android.view.WindowManager;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bzx implements bzu {
    public static final bzx b = new bzx();

    private bzx() {
    }

    @Override // defpackage.bzu
    public final Rect a(Activity activity) {
        Rect bounds = ((WindowManager) activity.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return bounds;
    }
}

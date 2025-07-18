package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.WindowManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cae implements cac {
    public static final cae b = new cae();

    private cae() {
    }

    @Override // defpackage.cac
    public final byr a(Activity activity, bzy bzyVar) {
        return cad.b.a(activity, bzyVar);
    }

    @Override // defpackage.cac
    public final byr b(Context context, bzy bzyVar) {
        WindowManager windowManager = context.isUiContext() ? (WindowManager) context.getSystemService(WindowManager.class) : (WindowManager) context.getApplicationContext().getSystemService(WindowManager.class);
        Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return new byr(bounds, windowManager.getCurrentWindowMetrics().getDensity());
    }
}

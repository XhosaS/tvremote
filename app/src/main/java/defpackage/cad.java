package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.WindowManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cad implements cac {
    public static final cad b = new cad();

    private cad() {
    }

    @Override // defpackage.cac
    public final byr a(Activity activity, bzy bzyVar) {
        return new byr(new bxh(bzu.a.a().a(activity)), bzyVar.a(activity));
    }

    @Override // defpackage.cac
    public final byr b(Context context, bzy bzyVar) {
        WindowManager windowManager = (WindowManager) context.getSystemService(WindowManager.class);
        float f = context.getResources().getDisplayMetrics().density;
        Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return new byr(bounds, f);
    }
}

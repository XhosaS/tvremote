package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Point;
import android.graphics.Rect;
import android.inputmethodservice.InputMethodService;
import android.view.Display;
import android.view.WindowManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gop implements goo {
    private final /* synthetic */ int d;
    public static final gop c = new gop(2);
    public static final gop b = new gop(1);
    public static final gop a = new gop(0);

    private gop(int i) {
        this.d = i;
    }

    @Override // defpackage.goo
    public final gnt a(Activity activity, gom gomVar) {
        int i = this.d;
        if (i == 0) {
            return b.a(activity, gomVar);
        }
        if (i == 1) {
            return new gnt(new gmx(goj.a.a().a(activity)), gomVar.a(activity));
        }
        activity.getClass();
        return new gnt(new gmx(goj.a.a().a(activity)), gomVar.a(activity));
    }

    @Override // defpackage.goo
    public final gnt b(Context context, gom gomVar) {
        int i = this.d;
        if (i == 0) {
            WindowManager windowManager = context.isUiContext() ? (WindowManager) context.getSystemService(WindowManager.class) : (WindowManager) context.getApplicationContext().getSystemService(WindowManager.class);
            Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
            bounds.getClass();
            return new gnt(bounds, windowManager.getCurrentWindowMetrics().getDensity());
        }
        if (i == 1) {
            WindowManager windowManager2 = (WindowManager) context.getSystemService(WindowManager.class);
            float f = context.getResources().getDisplayMetrics().density;
            Rect bounds2 = windowManager2.getCurrentWindowMetrics().getBounds();
            bounds2.getClass();
            return new gnt(bounds2, f);
        }
        Context baseContext = context;
        while (true) {
            if (!(baseContext instanceof ContextWrapper)) {
                baseContext = context;
                break;
            }
            if (!(baseContext instanceof Activity) && !(baseContext instanceof InputMethodService)) {
                ContextWrapper contextWrapper = (ContextWrapper) baseContext;
                if (contextWrapper.getBaseContext() == null) {
                    break;
                }
                baseContext = contextWrapper.getBaseContext();
                baseContext.getClass();
            } else {
                break;
            }
        }
        if (baseContext instanceof Activity) {
            return a((Activity) baseContext, gomVar);
        }
        if (!(baseContext instanceof InputMethodService) && !(baseContext instanceof Application)) {
            throw new IllegalArgumentException("Must provide a UiContext or Application Context");
        }
        Object systemService = context.getSystemService("window");
        systemService.getClass();
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        defaultDisplay.getClass();
        Point pointL = gli.L(defaultDisplay);
        return new gnt(new Rect(0, 0, pointL.x, pointL.y), gomVar.a(context));
    }
}

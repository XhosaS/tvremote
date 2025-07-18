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
public final class caf implements cac {
    public static final caf b = new caf();

    private caf() {
    }

    @Override // defpackage.cac
    public final byr a(Activity activity, bzy bzyVar) {
        activity.getClass();
        return new byr(new bxh(bzu.a.a().a(activity)), bzyVar.a(activity));
    }

    @Override // defpackage.cac
    public final byr b(Context context, bzy bzyVar) {
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
            return a((Activity) baseContext, bzyVar);
        }
        if (!(baseContext instanceof InputMethodService) && !(baseContext instanceof Application)) {
            throw new IllegalArgumentException("Must provide a UiContext or Application Context");
        }
        Object systemService = context.getSystemService("window");
        systemService.getClass();
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        defaultDisplay.getClass();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        return new byr(new Rect(0, 0, point.x, point.y), bzyVar.a(context));
    }
}

package defpackage;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.WindowManager;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gol implements goj {
    private final /* synthetic */ int d;
    public static final gol c = new gol(1);
    public static final gol b = new gol(0);

    private gol(int i) {
        this.d = i;
    }

    @Override // defpackage.goj
    public final Rect a(Activity activity) {
        if (this.d == 0) {
            Rect bounds = ((WindowManager) activity.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getBounds();
            bounds.getClass();
            return bounds;
        }
        Rect rect = new Rect();
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        defaultDisplay.getRectSize(rect);
        if (!activity.isInMultiWindowMode()) {
            defaultDisplay.getClass();
            Point pointL = gli.L(defaultDisplay);
            int iM = gli.M(activity);
            if (rect.bottom + iM == pointL.y) {
                rect.bottom += iM;
                return rect;
            }
            if (rect.right + iM == pointL.x) {
                rect.right += iM;
            }
        }
        return rect;
    }
}

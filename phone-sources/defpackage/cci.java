package defpackage;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.WindowManager;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cci implements ccg {
    private final /* synthetic */ int c;
    public static final cci b = new cci(1);
    public static final cci a = new cci(0);

    private cci(int i) {
        this.c = i;
    }

    @Override // defpackage.ccg
    public final Rect a(Activity activity) {
        if (this.c == 0) {
            return ((WindowManager) activity.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getBounds();
        }
        Rect rect = new Rect();
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        defaultDisplay.getRectSize(rect);
        if (!activity.isInMultiWindowMode()) {
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            int iB = ccf.b(activity);
            if (rect.bottom + iB == point.y) {
                rect.bottom += iB;
                return rect;
            }
            if (rect.right + iB == point.x) {
                rect.right += iB;
            }
        }
        return rect;
    }
}

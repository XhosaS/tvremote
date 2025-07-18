package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hvo {
    static Integer a;
    public final View b;
    public final List c = new ArrayList();
    public hvn d;

    public hvo(View view) {
        this.b = view;
    }

    public static final boolean d(int i, int i2) {
        return f(i) && f(i2);
    }

    private final int e(int i, int i2, int i3) {
        int i4 = i2 - i3;
        if (i4 > 0) {
            return i4;
        }
        int i5 = i - i3;
        if (i5 > 0) {
            return i5;
        }
        View view = this.b;
        if (view.isLayoutRequested() || i2 != -2) {
            return 0;
        }
        Context context = view.getContext();
        if (a == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            hju.p(windowManager);
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            a = Integer.valueOf(Math.max(point.x, point.y));
        }
        return a.intValue();
    }

    private static final boolean f(int i) {
        return i > 0 || i == Integer.MIN_VALUE;
    }

    public final int a() {
        View view = this.b;
        int paddingTop = view.getPaddingTop() + view.getPaddingBottom();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return e(view.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop);
    }

    public final int b() {
        View view = this.b;
        int paddingLeft = view.getPaddingLeft() + view.getPaddingRight();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return e(view.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft);
    }

    final void c() {
        ViewTreeObserver viewTreeObserver = this.b.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this.d);
        }
        this.d = null;
        this.c.clear();
    }
}

package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.google.android.tv.remote.service.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ee {
    public View a;
    public int b;
    public PopupWindow.OnDismissListener c;
    private final Context d;
    private final du e;
    private final boolean f;
    private final int g;
    private boolean h;
    private ef i;
    private ec j;
    private final PopupWindow.OnDismissListener k;

    public ee(Context context, du duVar, View view, boolean z) {
        this(context, duVar, view, z, R.attr.actionOverflowMenuStyle);
    }

    public final ec a() {
        if (this.j == null) {
            Context context = this.d;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            ec viewOnKeyListenerC0000do = Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width) ? new ViewOnKeyListenerC0000do(context, this.a, this.g, this.f) : new em(context, this.e, this.a, this.g, this.f);
            viewOnKeyListenerC0000do.j(this.e);
            viewOnKeyListenerC0000do.p(this.k);
            viewOnKeyListenerC0000do.l(this.a);
            viewOnKeyListenerC0000do.d(this.i);
            viewOnKeyListenerC0000do.m(this.h);
            viewOnKeyListenerC0000do.n(this.b);
            this.j = viewOnKeyListenerC0000do;
        }
        return this.j;
    }

    public final void b() {
        if (g()) {
            this.j.k();
        }
    }

    protected void c() {
        this.j = null;
        PopupWindow.OnDismissListener onDismissListener = this.c;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(boolean z) {
        this.h = z;
        ec ecVar = this.j;
        if (ecVar != null) {
            ecVar.m(z);
        }
    }

    public final void e(ef efVar) {
        this.i = efVar;
        ec ecVar = this.j;
        if (ecVar != null) {
            ecVar.d(efVar);
        }
    }

    public final void f(int i, int i2, boolean z, boolean z2) {
        ec ecVarA = a();
        ecVarA.q(z2);
        if (z) {
            if ((Gravity.getAbsoluteGravity(this.b, this.a.getLayoutDirection()) & 7) == 5) {
                i -= this.a.getWidth();
            }
            ecVarA.o(i);
            ecVarA.r(i2);
            int i3 = (int) ((this.d.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            int i4 = i + i3;
            ecVarA.g = new Rect(i - i3, i2 - i3, i4, i2 + i3);
        }
        ecVarA.s();
    }

    public final boolean g() {
        ec ecVar = this.j;
        return ecVar != null && ecVar.u();
    }

    public final boolean h() {
        if (g()) {
            return true;
        }
        if (this.a == null) {
            return false;
        }
        f(0, 0, false, false);
        return true;
    }

    public ee(Context context, du duVar, View view, boolean z, int i) {
        this.b = 8388611;
        this.k = new ed(this);
        this.d = context;
        this.e = duVar;
        this.a = view;
        this.f = z;
        this.g = i;
    }
}

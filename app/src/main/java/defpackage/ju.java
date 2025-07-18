package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ju {
    public View a;
    public PopupWindow.OnDismissListener c;
    private final Context d;
    private final jj e;
    private final boolean f;
    private final int g;
    private boolean h;
    private jv i;
    private js j;
    public int b = 8388611;
    private final PopupWindow.OnDismissListener k = new jt(this);

    public ju(Context context, jj jjVar, View view, boolean z, int i) {
        this.d = context;
        this.e = jjVar;
        this.a = view;
        this.f = z;
        this.g = i;
    }

    public final js a() {
        if (this.j == null) {
            Context context = this.d;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            js jdVar = Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width) ? new jd(context, this.a, this.g, this.f) : new kd(context, this.e, this.a, this.g, this.f);
            jdVar.b(this.e);
            jdVar.p(this.k);
            jdVar.k(this.a);
            jdVar.e(this.i);
            jdVar.m(this.h);
            jdVar.n(this.b);
            this.j = jdVar;
        }
        return this.j;
    }

    public final void b() {
        if (g()) {
            this.j.f();
        }
    }

    protected void c() {
        this.j = null;
        PopupWindow.OnDismissListener onDismissListener = this.c;
        if (onDismissListener != null) {
            ((jt) onDismissListener).a.c();
        }
    }

    public final void d(boolean z) {
        this.h = z;
        js jsVar = this.j;
        if (jsVar != null) {
            jsVar.m(z);
        }
    }

    public final void e(jv jvVar) {
        this.i = jvVar;
        js jsVar = this.j;
        if (jsVar != null) {
            jsVar.e(jvVar);
        }
    }

    public final void f(int i, int i2, boolean z, boolean z2) {
        js jsVarA = a();
        jsVarA.q(z2);
        if (z) {
            if ((Gravity.getAbsoluteGravity(this.b, this.a.getLayoutDirection()) & 7) == 5) {
                i -= this.a.getWidth();
            }
            jsVarA.o(i);
            jsVarA.r(i2);
            int i3 = (int) ((this.d.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            int i4 = i + i3;
            jsVarA.g = new Rect(i - i3, i2 - i3, i4, i2 + i3);
        }
        jsVarA.s();
    }

    public final boolean g() {
        js jsVar = this.j;
        return jsVar != null && jsVar.u();
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
}

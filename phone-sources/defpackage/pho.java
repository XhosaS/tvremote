package defpackage;

import android.R;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pho {
    public phh a;
    public phq b;
    public phw c;
    public View d;
    private final Rect e = new Rect();
    private final int[] f = new int[2];

    public pho(phq phqVar) {
        this.b = phqVar;
    }

    static boolean c(View view) {
        if (view == null || !view.isShown()) {
            return false;
        }
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return view.getMeasuredHeight() == rect.height() && view.getMeasuredWidth() == rect.width();
    }

    private final Rect d(Rect rect) {
        Rect rect2 = this.e;
        rect2.set(rect);
        View view = this.d;
        int[] iArr = this.f;
        view.getLocationInWindow(iArr);
        rect2.offset(iArr[0], iArr[1]);
        return rect2;
    }

    public final void a() {
        phh phhVar = this.a;
        if (phhVar == null || !phhVar.b()) {
            return;
        }
        phhVar.a();
        if (phhVar == this.a) {
            this.a = null;
            this.b = null;
        }
    }

    public final void b(phu phuVar) {
        if (this.a == null) {
            return;
        }
        if (phuVar.b()) {
            phq phqVar = this.b;
            if (c(phqVar != null ? phqVar.a : null)) {
                if (this.a.b()) {
                    phh phhVar = this.a;
                    Rect rectD = d(phuVar.a);
                    phg phgVar = phhVar.b;
                    phgVar.a(rectD);
                    phgVar.requestLayout();
                    return;
                }
                Rect rectD2 = d(phuVar.a);
                phh phhVar2 = this.a;
                int i = phhVar2.c;
                int i2 = phhVar2.d;
                phg phgVar2 = phhVar2.b;
                View view = phhVar2.a;
                phgVar2.d(view, rectD2, i, i2);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                phgVar2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                if ((phgVar2.getMeasuredHeightAndState() & (-16777216)) == 16777216) {
                    phgVar2.d(view, rectD2, i == 1 ? 2 : 1, i2);
                }
                phgVar2.c.setClippingEnabled(false);
                phgVar2.c.setAnimationStyle(R.style.Animation.Dialog);
                phgVar2.c.setTouchable(true);
                phgVar2.c.setBackgroundDrawable(new ColorDrawable(0));
                phgVar2.c.setOutsideTouchable(phgVar2.d);
                phgVar2.c.setTouchInterceptor(new jcd(phgVar2, 4));
                if (Build.VERSION.SDK_INT >= 29) {
                    phgVar2.c();
                    phgVar2.c.setWidth(phgVar2.getMeasuredWidth());
                    phgVar2.c.setHeight(phgVar2.getMeasuredHeight());
                }
                phgVar2.c.showAtLocation(phgVar2.f, 0, phgVar2.h, phgVar2.i);
                return;
            }
        }
        a();
    }
}

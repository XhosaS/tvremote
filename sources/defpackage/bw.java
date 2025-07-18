package defpackage;

import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.support.v7.widget.ActionBarContextView;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bw implements pw {
    final /* synthetic */ cj a;

    public bw(cj cjVar) {
        this.a = cjVar;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // defpackage.pw
    public final sf a(View view, sf sfVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        sf sfVarA;
        int i;
        int i2;
        int iD = sfVar.d();
        int iD2 = sfVar.d();
        cj cjVar = this.a;
        ActionBarContextView actionBarContextView = cjVar.q;
        if (actionBarContextView != null && (actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) cjVar.q.getLayoutParams();
            if (cjVar.q.isShown()) {
                if (cjVar.I == null) {
                    cjVar.I = new Rect();
                    cjVar.J = new Rect();
                }
                Rect rect = cjVar.I;
                Rect rect2 = cjVar.J;
                rect.set(sfVar.b(), sfVar.d(), sfVar.c(), sfVar.a());
                nt ntVarF = sfVar.f(2);
                ViewGroup viewGroup = cjVar.v;
                int i3 = 1;
                if (Build.VERSION.SDK_INT >= 29) {
                    Insets systemWindowInsets = viewGroup.computeSystemWindowInsets(new WindowInsets.Builder().setSystemWindowInsets(Insets.of(rect)).build(), rect2).getSystemWindowInsets();
                    rect.set(systemWindowInsets.left, systemWindowInsets.top, systemWindowInsets.right, systemWindowInsets.bottom);
                    i2 = 0;
                } else {
                    if (kc.a) {
                        i2 = 0;
                    } else {
                        kc.a = true;
                        i2 = 0;
                        try {
                            kc.b = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                            if (!kc.b.isAccessible()) {
                                kc.b.setAccessible(true);
                            }
                        } catch (NoSuchMethodException unused) {
                            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
                        }
                    }
                    Method method = kc.b;
                    if (method != null) {
                        try {
                            Object[] objArr = new Object[2];
                            objArr[i2] = rect;
                            objArr[1] = rect2;
                            method.invoke(viewGroup, objArr);
                        } catch (Exception e) {
                            Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e);
                        }
                    }
                }
                int i4 = rect2.left;
                int i5 = rect2.top;
                int i6 = rect2.right;
                int i7 = rect2.bottom;
                int i8 = ntVarF.b - i4;
                int i9 = ntVarF.c - i5;
                int i10 = ntVarF.d - i6;
                int i11 = ntVarF.e - i7;
                int i12 = i2;
                nt ntVarD = nt.d(Math.max(i12, i8), Math.max(i12, i9), Math.max(i12, i10), Math.max(i12, i11));
                int i13 = marginLayoutParams.leftMargin;
                int i14 = ntVarD.b;
                if (i13 == i14 && marginLayoutParams.rightMargin == ntVarD.d) {
                    i3 = i12;
                } else {
                    marginLayoutParams.leftMargin = i14;
                    marginLayoutParams.rightMargin = ntVarD.d;
                }
                ActionBarContextView actionBarContextView2 = cjVar.q;
                int i15 = rect.left - i14;
                int i16 = rect.top;
                int i17 = rect.right - ntVarD.d;
                actionBarContextView2.k = i15;
                actionBarContextView2.l = i16;
                actionBarContextView2.m = i17;
                actionBarContextView2.n();
                if (!cjVar.y && rect.top > 0) {
                    iD2 = i12;
                }
                i = i3;
            } else {
                i = 0;
            }
            if (i != 0) {
                cjVar.q.setLayoutParams(marginLayoutParams);
            }
        }
        if (iD != iD2) {
            int iB = sfVar.b();
            int iC = sfVar.c();
            int iA = sfVar.a();
            ru rtVar = Build.VERSION.SDK_INT >= 34 ? new rt(sfVar) : Build.VERSION.SDK_INT >= 31 ? new rs(sfVar) : Build.VERSION.SDK_INT >= 30 ? new rr(sfVar) : Build.VERSION.SDK_INT >= 29 ? new rq(sfVar) : new rp(sfVar);
            rtVar.c(nt.d(iB, iD2, iC, iA));
            sfVarA = rtVar.a();
        } else {
            sfVarA = sfVar;
        }
        return qv.d(view, sfVarA);
    }
}

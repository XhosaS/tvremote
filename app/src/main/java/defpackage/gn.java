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
class gn implements agk {
    final /* synthetic */ hf a;

    public gn(hf hfVar) {
        this.a = hfVar;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // defpackage.agk
    public final ajc a(View view, ajc ajcVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        ajc ajcVarA;
        int i;
        int i2;
        hf hfVar = this.a;
        int iD = ajcVar.d();
        int iD2 = ajcVar.d();
        ActionBarContextView actionBarContextView = hfVar.r;
        if (actionBarContextView != null && (actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) hfVar.r.getLayoutParams();
            if (hfVar.r.isShown()) {
                if (hfVar.K == null) {
                    hfVar.K = new Rect();
                    hfVar.L = new Rect();
                }
                Rect rect = hfVar.K;
                Rect rect2 = hfVar.L;
                rect.set(ajcVar.b(), ajcVar.d(), ajcVar.c(), ajcVar.a());
                acs acsVarA = ajcVar.b.a(2);
                ViewGroup viewGroup = hfVar.x;
                int i3 = 1;
                if (Build.VERSION.SDK_INT >= 29) {
                    Insets systemWindowInsets = viewGroup.computeSystemWindowInsets(new WindowInsets.Builder().setSystemWindowInsets(Insets.of(rect)).build(), rect2).getSystemWindowInsets();
                    rect.set(systemWindowInsets.left, systemWindowInsets.top, systemWindowInsets.right, systemWindowInsets.bottom);
                    i2 = 0;
                } else {
                    if (sm.a) {
                        i2 = 0;
                    } else {
                        sm.a = true;
                        i2 = 0;
                        try {
                            sm.b = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                            if (!sm.b.isAccessible()) {
                                sm.b.setAccessible(true);
                            }
                        } catch (NoSuchMethodException unused) {
                            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
                        }
                    }
                    Method method = sm.b;
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
                int i8 = acsVarA.b - i4;
                int i9 = acsVarA.c - i5;
                int i10 = acsVarA.d - i6;
                int i11 = acsVarA.e - i7;
                int i12 = i2;
                acs acsVarD = acs.d(Math.max(i12, i8), Math.max(i12, i9), Math.max(i12, i10), Math.max(i12, i11));
                int i13 = marginLayoutParams.leftMargin;
                int i14 = acsVarD.b;
                if (i13 == i14 && marginLayoutParams.rightMargin == acsVarD.d) {
                    i3 = i12;
                } else {
                    marginLayoutParams.leftMargin = i14;
                    marginLayoutParams.rightMargin = acsVarD.d;
                }
                ActionBarContextView actionBarContextView2 = hfVar.r;
                int i15 = rect.left - i14;
                int i16 = rect.top;
                int i17 = rect.right - acsVarD.d;
                actionBarContextView2.j = i15;
                actionBarContextView2.k = i16;
                actionBarContextView2.l = i17;
                actionBarContextView2.m();
                if (!hfVar.A && rect.top > 0) {
                    iD2 = i12;
                }
                i = i3;
            } else {
                i = 0;
            }
            if (i != 0) {
                hfVar.r.setLayoutParams(marginLayoutParams);
            }
        }
        if (iD != iD2) {
            int iB = ajcVar.b();
            int iC = ajcVar.c();
            int iA = ajcVar.a();
            aiq aipVar = Build.VERSION.SDK_INT >= 34 ? new aip(ajcVar) : Build.VERSION.SDK_INT >= 31 ? new aio(ajcVar) : Build.VERSION.SDK_INT >= 30 ? new ain(ajcVar) : Build.VERSION.SDK_INT >= 29 ? new aim(ajcVar) : new ail(ajcVar);
            aipVar.c(acs.d(iB, iD2, iC, iA));
            ajcVarA = aipVar.a();
        } else {
            ajcVarA = ajcVar;
        }
        return ahj.e(view, ajcVarA);
    }
}

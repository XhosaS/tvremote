package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.tabs.TabLayout;
import com.google.common.collect.ImmutableSet;
import j$.lang.Iterable$EL;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class szg {
    public static void d(View view, float f) {
        Drawable background = view.getBackground();
        if (background instanceof szk) {
            ((szk) background).M(f);
        }
    }

    public static void e(View view) {
        Drawable background = view.getBackground();
        if (background instanceof szk) {
            f(view, (szk) background);
        }
    }

    public static void f(View view, szk szkVar) {
        sst sstVar = szkVar.s.c;
        if (sstVar == null || !sstVar.a) {
            return;
        }
        float fG = sil.g(view);
        szi sziVar = szkVar.s;
        if (sziVar.o != fG) {
            sziVar.o = fG;
            szkVar.W();
        }
    }

    public static boolean g(EditText editText) {
        return editText.getInputType() != 0;
    }

    public static RectF h(TabLayout tabLayout, View view) {
        if (view == null) {
            return new RectF();
        }
        if (tabLayout.y || !(view instanceof tbs)) {
            return new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        tbs tbsVar = (tbs) view;
        View[] viewArr = {tbsVar.a, tbsVar.b, tbsVar.c};
        int iMax = 0;
        int iMin = 0;
        boolean z = false;
        for (int i = 0; i < 3; i++) {
            View view2 = viewArr[i];
            if (view2 != null && view2.getVisibility() == 0) {
                iMin = z ? Math.min(iMin, view2.getLeft()) : view2.getLeft();
                iMax = z ? Math.max(iMax, view2.getRight()) : view2.getRight();
                z = true;
            }
        }
        int i2 = iMax - iMin;
        View[] viewArr2 = {tbsVar.a, tbsVar.b, tbsVar.c};
        int iMax2 = 0;
        int iMin2 = 0;
        boolean z2 = false;
        for (int i3 = 0; i3 < 3; i3++) {
            View view3 = viewArr2[i3];
            if (view3 != null && view3.getVisibility() == 0) {
                iMin2 = z2 ? Math.min(iMin2, view3.getTop()) : view3.getTop();
                iMax2 = z2 ? Math.max(iMax2, view3.getBottom()) : view3.getBottom();
                z2 = true;
            }
        }
        int i4 = iMax2 - iMin2;
        int iF = (int) sil.f(tbsVar.getContext(), 24);
        if (i2 < iF) {
            i2 = iF;
        }
        int left = (tbsVar.getLeft() + tbsVar.getRight()) / 2;
        int top = (tbsVar.getTop() + tbsVar.getBottom()) / 2;
        int i5 = i2 / 2;
        return new RectF(left - i5, top - (i4 / 2), left + i5, (left / 2) + top);
    }

    public static uhp j(uhp uhpVar, Class cls, ufw ufwVar, Executor executor) {
        return ues.j(uhpVar, cls, trc.c(ufwVar), executor);
    }

    public static uhp k(Callable callable, Executor executor) {
        return sfy.F(trc.g(callable), executor);
    }

    public static uhp l(uhp uhpVar, tsl tslVar, Executor executor) {
        return ufn.i(uhpVar, trc.a(tslVar), executor);
    }

    public static uhp m(uhp uhpVar, ufw ufwVar, Executor executor) {
        return ufn.j(uhpVar, trc.c(ufwVar), executor);
    }

    public static void n(uhp uhpVar, uha uhaVar, Executor executor) {
        sfy.K(uhpVar, trc.e(uhaVar), executor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [tqt] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public static tql o(String str, tqo tqoVar, boolean z) {
        boolean z2;
        ?? r0;
        tqt tqtVarG;
        yau yauVarD = tqg.d();
        Object obj = yauVarD.c;
        if (obj == tqk.a) {
            r0 = 0;
            tqg.e(yauVarD, null);
            z2 = true;
        } else {
            z2 = false;
            r0 = obj;
        }
        boolean z3 = z2;
        if (r0 == 0) {
            UUID uuidB = tqh.a.b();
            String strEy = tpw.ey(uuidB);
            tpx tpxVar = tqi.a;
            ImmutableSet immutableSetC = tqg.c();
            if (!immutableSetC.isEmpty()) {
                Iterable$EL.forEach(immutableSetC, new mig(9));
            }
            tqtVarG = new tqj(uuidB, strEy, str, tqoVar, tpxVar, z, yauVarD);
        } else {
            tqtVarG = r0 instanceof tpz ? ((tpz) r0).g(str, tqoVar, z, yauVarD) : r0.k(str, tqoVar, yauVarD);
        }
        tqg.e(yauVarD, tqtVarG);
        return new tql(tqtVarG, z3);
    }

    public static tql p(String str, tqo tqoVar) {
        return o(str, tqoVar, true);
    }

    public static tql q(String str) {
        return p(str, tqn.a);
    }

    public static uhp r(Callable callable, Executor executor, xqr xqrVar) {
        return xqrVar.a(trc.g(callable), executor);
    }

    public static sin s(int i) {
        return i != 1 ? new szo() : new szf();
    }

    public void a(float f, float f2, float f3, taa taaVar) {
        taaVar.d(f, 0.0f);
    }

    public boolean c() {
        return false;
    }

    public void i(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        RectF rectFH = h(tabLayout, view);
        RectF rectFH2 = h(tabLayout, view2);
        drawable.setBounds(sns.b((int) rectFH.left, (int) rectFH2.left, f), drawable.getBounds().top, sns.b((int) rectFH.right, (int) rectFH2.right, f), drawable.getBounds().bottom);
    }
}

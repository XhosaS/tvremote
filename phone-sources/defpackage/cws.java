package defpackage;

import android.view.View;
import android.view.ViewParent;
import android.view.WindowInsets;
import com.google.android.videos.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cws {
    static WindowInsets a(View view, WindowInsets windowInsets) {
        return view.dispatchApplyWindowInsets(windowInsets);
    }

    static CharSequence b(View view) {
        return view.getStateDescription();
    }

    static void c(View view, CharSequence charSequence) {
        view.setStateDescription(charSequence);
    }

    public static final ViewParent d(View view) {
        ViewParent parent = view.getParent();
        if (parent != null) {
            return parent;
        }
        Object tag = view.getTag(R.id.view_tree_disjoint_parent);
        if (tag instanceof ViewParent) {
            return (ViewParent) tag;
        }
        return null;
    }

    public static final dds e(ddz ddzVar, byte[] bArr) {
        if (ddzVar.b() == 0) {
            return new ddq(bArr);
        }
        throw new IllegalStateException("Did not write as much data as expected.");
    }

    public static dpj f(Object obj, long j) {
        return (dpj) dra.f(obj, j);
    }

    public static final List g(Object obj, long j) {
        dpj dpjVarF = f(obj, j);
        if (dpjVarF.c()) {
            return dpjVarF;
        }
        int size = dpjVarF.size();
        dpj dpjVarD = dpjVarF.d(size == 0 ? 10 : size + size);
        dra.r(obj, j, dpjVarD);
        return dpjVarD;
    }

    public static Object h(dox doxVar, dqa dqaVar, int i) {
        return (cwr) doxVar.c.get(new dow(dqaVar, i));
    }

    public static doz i(Object obj) {
        return ((dpd) obj).extensions;
    }

    public static doz j(Object obj) {
        throw null;
    }

    public static final void k(Object obj) {
        i(obj).c();
    }

    public static void l(dot dotVar, iom iomVar, Object obj, Object obj2) {
        Object obj3 = iomVar.d;
        doz.h(dotVar, 1, obj);
        Object obj4 = iomVar.a;
        doz.h(dotVar, 2, obj2);
    }

    public static int m(iom iomVar) {
        Object obj = iomVar.d;
        int iG = doz.g(1);
        Object obj2 = iomVar.a;
        return iG + doz.g(2);
    }
}

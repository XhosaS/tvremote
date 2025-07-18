package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import com.google.android.videos.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cxn extends cxq {
    public static final Interpolator a = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);
    public static final Interpolator b = new duo();
    public static final Interpolator c = new DecelerateInterpolator(1.5f);
    public static final Interpolator d = new AccelerateInterpolator(1.5f);

    public cxn(int i, Interpolator interpolator, long j) {
        super(i, interpolator, j);
    }

    static WindowInsets a(View view, WindowInsets windowInsets) {
        return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    static cxj b(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof cxm) {
            return ((cxm) tag).a;
        }
        return null;
    }

    static void c(View view, cyh cyhVar, List list) {
        cxj cxjVarB = b(view);
        if (cxjVarB != null) {
            cyhVar = cxjVarB.a(cyhVar, list);
            if (cxjVarB.c == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                c(viewGroup.getChildAt(i), cyhVar, list);
            }
        }
    }

    static void d(View view, nxb nxbVar) {
        cxj cxjVarB = b(view);
        if (cxjVarB != null) {
            cxjVarB.c(nxbVar);
            if (cxjVarB.c == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                d(viewGroup.getChildAt(i), nxbVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static void e(View view, nxb nxbVar, cyh cyhVar, boolean z) {
        cxj cxjVarB = b(view);
        boolean z2 = z;
        if (cxjVarB != null) {
            cxjVarB.b = cyhVar;
            z2 = z;
            if (!z) {
                cxjVarB.d(nxbVar);
                z2 = cxjVarB.c ^ 1;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                e(viewGroup.getChildAt(i), nxbVar, cyhVar, true == z2);
            }
        }
    }

    public static void f(View view, nxb nxbVar, cxi cxiVar) {
        cxj cxjVarB = b(view);
        if (cxjVarB != null) {
            cxjVarB.b(nxbVar, cxiVar);
            if (cxjVarB.c == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                f(viewGroup.getChildAt(i), nxbVar, cxiVar);
            }
        }
    }
}

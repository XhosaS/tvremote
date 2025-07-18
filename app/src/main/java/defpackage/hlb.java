package defpackage;

import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hlb implements ViewTreeObserver.OnGlobalLayoutListener {
    private static final zdy b = zdy.h("com/google/android/apps/tvsearch/results/motion/DetectChildHeightChange");
    public final View a;
    private final View c;
    private int d;
    private final hle e;

    public hlb(hle hleVar, View view, View view2) {
        this.e = hleVar;
        this.c = view;
        this.a = view2;
    }

    public final void a() {
        this.a.measure(View.MeasureSpec.makeMeasureSpec(this.c.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(8388608, Integer.MIN_VALUE));
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        View view = this.a;
        if (view.getMeasuredHeight() != this.d) {
            this.d = view.getMeasuredHeight();
            if (view.getMeasuredHeight() == 0) {
                ((zdv) b.b().q("com/google/android/apps/tvsearch/results/motion/DetectChildHeightChange", "onGlobalLayout", 33, "DetectChildHeightChange.kt")).u("Fragment view unexpectedly reset to zero height. Re-measuring.");
                a();
            }
            View view2 = this.c;
            ViewParent parent = view2.getParent();
            if (parent instanceof hla) {
                ((hla) parent).a(view2);
            } else {
                this.e.d();
            }
        }
    }
}

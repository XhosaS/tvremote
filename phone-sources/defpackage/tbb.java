package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.material.snackbar.SnackbarContentLayout;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tbb extends taz {
    private static final int[] w = {R.attr.snackbarButtonStyle, R.attr.snackbarTextViewStyle};
    private final AccessibilityManager x;
    private boolean y;

    private tbb(Context context, ViewGroup viewGroup, View view, SnackbarContentLayout snackbarContentLayout) {
        super(context, viewGroup, view, snackbarContentLayout);
        this.x = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x002c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x002a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[LOOP:0: B:3:0x0002->B:34:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.tbb n(android.view.View r7, java.lang.CharSequence r8, int r9) {
        /*
            r0 = 0
            r1 = r0
        L2:
            boolean r2 = r7 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout
            if (r2 == 0) goto L9
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            goto L2d
        L9:
            boolean r2 = r7 instanceof android.widget.FrameLayout
            if (r2 == 0) goto L1c
            int r1 = r7.getId()
            r2 = 16908290(0x1020002, float:2.3877235E-38)
            if (r1 != r2) goto L19
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            goto L2d
        L19:
            r1 = r7
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
        L1c:
            if (r7 == 0) goto L2a
            android.view.ViewParent r7 = r7.getParent()
            boolean r2 = r7 instanceof android.view.View
            if (r2 == 0) goto L29
            android.view.View r7 = (android.view.View) r7
            goto L2a
        L29:
            r7 = r0
        L2a:
            if (r7 != 0) goto L2
            r7 = r1
        L2d:
            if (r7 == 0) goto L66
            android.content.Context r0 = r7.getContext()
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r0)
            int[] r2 = defpackage.tbb.w
            android.content.res.TypedArray r2 = r0.obtainStyledAttributes(r2)
            r3 = 0
            r4 = -1
            int r5 = r2.getResourceId(r3, r4)
            r6 = 1
            int r6 = r2.getResourceId(r6, r4)
            r2.recycle()
            r2 = 2131624346(0x7f0e019a, float:1.887587E38)
            if (r5 == r4) goto L55
            if (r6 == r4) goto L55
            r2 = 2131624990(0x7f0e041e, float:1.8877175E38)
        L55:
            android.view.View r1 = r1.inflate(r2, r7, r3)
            com.google.android.material.snackbar.SnackbarContentLayout r1 = (com.google.android.material.snackbar.SnackbarContentLayout) r1
            tbb r2 = new tbb
            r2.<init>(r0, r7, r1, r1)
            r2.s(r8)
            r2.k = r9
            return r2
        L66:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "No suitable parent found from the given view. Please provide a valid view."
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tbb.n(android.view.View, java.lang.CharSequence, int):tbb");
    }

    private final SnackbarContentLayout t() {
        return (SnackbarContentLayout) this.j.getChildAt(0);
    }

    @Override // defpackage.taz
    public final int a() {
        int i = this.k;
        if (i == -2) {
            return -2;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            return this.x.getRecommendedTimeoutMillis(i, (true != this.y ? 0 : 4) | 3);
        }
        if (this.y && this.x.isTouchExplorationEnabled()) {
            return -2;
        }
        return i;
    }

    public final TextView m() {
        return t().a;
    }

    public final void o(int i, View.OnClickListener onClickListener) {
        p(this.i.getText(i), onClickListener);
    }

    public final void p(CharSequence charSequence, View.OnClickListener onClickListener) {
        Button button = t().b;
        byte[] bArr = null;
        if (TextUtils.isEmpty(charSequence)) {
            button.setVisibility(8);
            button.setOnClickListener(null);
            this.y = false;
        } else {
            this.y = true;
            button.setVisibility(0);
            button.setText(charSequence);
            button.setOnClickListener(new nay(this, onClickListener, 16, bArr));
        }
    }

    public final void q(int i) {
        this.j.setBackgroundTintList(ColorStateList.valueOf(i));
    }

    public final void r(int i) {
        s(this.i.getText(i));
    }

    public final void s(CharSequence charSequence) {
        m().setText(charSequence);
    }
}

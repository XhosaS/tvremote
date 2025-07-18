package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.SnackbarContentLayout;
import com.google.android.videos.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class taz {
    private final TimeInterpolator A;
    private final AccessibilityManager C;
    public final int c;
    public final int d;
    public final int e;
    public final TimeInterpolator f;
    public final TimeInterpolator g;
    public final ViewGroup h;
    public final Context i;
    public final tay j;
    public int k;
    public taw l;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public boolean t;
    public final SnackbarContentLayout u;
    private static final TimeInterpolator w = sns.b;
    private static final TimeInterpolator x = sns.a;
    private static final TimeInterpolator y = sns.d;
    private static final int[] z = {R.attr.snackbarStyle};
    public static final String b = "taz";
    static final Handler a = new Handler(Looper.getMainLooper(), new tas());
    public final boolean m = false;
    private final Runnable B = new slt(this, 18, null);
    public final zft v = new zft(this, null);

    protected taz(Context context, ViewGroup viewGroup, View view, SnackbarContentLayout snackbarContentLayout) {
        if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        }
        if (snackbarContentLayout == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
        this.h = viewGroup;
        this.u = snackbarContentLayout;
        this.i = context;
        suy.c(context);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(z);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        tay tayVar = (tay) layoutInflaterFrom.inflate(resourceId != -1 ? R.layout.mtrl_layout_snackbar : R.layout.design_layout_snackbar, viewGroup, false);
        this.j = tayVar;
        tayVar.a = this;
        float f = tayVar.d;
        if (f != 1.0f) {
            SnackbarContentLayout snackbarContentLayout2 = (SnackbarContentLayout) view;
            snackbarContentLayout2.b.setTextColor(sip.f(sip.c(view, R.attr.colorSurface), snackbarContentLayout2.b.getCurrentTextColor(), f));
        }
        ((SnackbarContentLayout) view).d = tayVar.e;
        tayVar.addView(view);
        tayVar.setAccessibilityLiveRegion(1);
        tayVar.setImportantForAccessibility(1);
        tayVar.setFitsSystemWindows(true);
        tat tatVar = new tat(this, 0);
        int[] iArr = cww.a;
        cwm.l(tayVar, tatVar);
        cww.p(tayVar, new tau(this));
        this.C = (AccessibilityManager) context.getSystemService("accessibility");
        this.e = sim.b(context, R.attr.motionDurationLong2, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION);
        this.c = sim.b(context, R.attr.motionDurationLong2, 150);
        this.d = sim.b(context, R.attr.motionDurationMedium1, 75);
        this.A = sim.k(context, R.attr.motionEasingEmphasizedInterpolator, x);
        this.g = sim.k(context, R.attr.motionEasingEmphasizedInterpolator, y);
        this.f = sim.k(context, R.attr.motionEasingEmphasizedInterpolator, w);
    }

    public int a() {
        throw null;
    }

    public final int b() {
        tay tayVar = this.j;
        int height = tayVar.getHeight();
        ViewGroup.LayoutParams layoutParams = tayVar.getLayoutParams();
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? height + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : height;
    }

    public final ValueAnimator c(float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.A);
        valueAnimatorOfFloat.addUpdateListener(new spv(this, 3));
        return valueAnimatorOfFloat;
    }

    public final View d() {
        taw tawVar = this.l;
        if (tawVar == null) {
            return null;
        }
        return (View) tawVar.a.get();
    }

    public final void e() {
        f(3);
    }

    public final void f(int i) {
        tbe tbeVarA = tbe.a();
        Object obj = tbeVarA.a;
        zft zftVar = this.v;
        synchronized (obj) {
            if (tbeVarA.g(zftVar)) {
                tbeVarA.d(tbeVarA.c, i);
            } else if (tbeVarA.h(zftVar)) {
                tbeVarA.d(tbeVarA.d, i);
            }
        }
    }

    final void g() {
        tbe tbeVarA = tbe.a();
        Object obj = tbeVarA.a;
        zft zftVar = this.v;
        synchronized (obj) {
            if (tbeVarA.g(zftVar)) {
                tbeVarA.b(tbeVarA.c);
            }
        }
    }

    public final void h() {
        tbe tbeVarA = tbe.a();
        Object obj = tbeVarA.a;
        int iA = a();
        zft zftVar = this.v;
        synchronized (obj) {
            if (tbeVarA.g(zftVar)) {
                tbd tbdVar = tbeVarA.c;
                tbdVar.a = iA;
                tbeVarA.b.removeCallbacksAndMessages(tbdVar);
                tbeVarA.b(tbeVarA.c);
                return;
            }
            if (tbeVarA.h(zftVar)) {
                tbeVarA.d.a = iA;
            } else {
                tbeVarA.d = new tbd(iA, zftVar);
            }
            tbd tbdVar2 = tbeVarA.c;
            if (tbdVar2 == null || !tbeVarA.d(tbdVar2, 4)) {
                tbeVarA.c = null;
                tbeVarA.c();
            }
        }
    }

    public final void i() {
        if (k()) {
            this.j.post(new slt(this, 20, null));
            return;
        }
        tay tayVar = this.j;
        if (tayVar.getParent() != null) {
            tayVar.setVisibility(0);
        }
        g();
    }

    public final void j() {
        tay tayVar = this.j;
        ViewGroup.LayoutParams layoutParams = tayVar.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            Log.w(b, "Unable to update margins because layout params are not MarginLayoutParams");
            return;
        }
        if (tayVar.f == null) {
            Log.w(b, "Unable to update margins because original view margins are not set");
            return;
        }
        if (tayVar.getParent() == null) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i = tayVar.f.bottom + (d() != null ? this.q : this.n);
        int i2 = tayVar.f.left + this.o;
        int i3 = tayVar.f.right + this.p;
        int i4 = tayVar.f.top;
        if (marginLayoutParams.bottomMargin != i || marginLayoutParams.leftMargin != i2 || marginLayoutParams.rightMargin != i3 || marginLayoutParams.topMargin != i4) {
            marginLayoutParams.bottomMargin = i;
            marginLayoutParams.leftMargin = i2;
            marginLayoutParams.rightMargin = i3;
            marginLayoutParams.topMargin = i4;
            tayVar.requestLayout();
        } else if (this.s == this.r) {
            return;
        }
        if (Build.VERSION.SDK_INT < 29 || this.r <= 0) {
            return;
        }
        ViewGroup.LayoutParams layoutParams2 = tayVar.getLayoutParams();
        if ((layoutParams2 instanceof cqx) && (((cqx) layoutParams2).a instanceof SwipeDismissBehavior)) {
            Runnable runnable = this.B;
            tayVar.removeCallbacks(runnable);
            tayVar.post(runnable);
        }
    }

    final boolean k() {
        AccessibilityManager accessibilityManager = this.C;
        if (accessibilityManager == null) {
            return true;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1);
        return enabledAccessibilityServiceList != null && enabledAccessibilityServiceList.isEmpty();
    }

    public final void l() {
        tbe tbeVarA = tbe.a();
        Object obj = tbeVarA.a;
        zft zftVar = this.v;
        synchronized (obj) {
            if (tbeVarA.g(zftVar)) {
                tbeVarA.c = null;
                if (tbeVarA.d != null) {
                    tbeVarA.c();
                }
            }
        }
        tay tayVar = this.j;
        ViewParent parent = tayVar.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(tayVar);
        }
    }
}

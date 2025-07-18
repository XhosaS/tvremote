package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.widget.ActivityChooserView;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.google.android.videos.R;
import java.lang.reflect.Field;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tgh extends RecyclerView.LayoutParams {
    static Field a;
    public final int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public float g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;

    public tgh() {
        super(-2, -2);
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = 0.0f;
        this.h = 0;
        this.i = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.j = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.k = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.l = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.m = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.n = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.o = 0;
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = -1;
        this.v = -1;
        this.w = 0;
        this.b = -2;
        this.c = -2;
    }

    public static final int j(String str, int i, float f, boolean z) {
        if (!thl.b(i) || (z && i < 0)) {
            return i;
        }
        if (Float.isNaN(f)) {
            throw new IllegalArgumentException(str.concat(" uses grid-based measurement, which is disabled"));
        }
        return (int) (f * Float.intBitsToFloat(i));
    }

    private static int k(TypedArray typedArray, String str, int i, int i2) {
        if (typedArray.hasValue(i) || i2 == Integer.MAX_VALUE) {
            return thl.a(typedArray, str, i, true);
        }
        if (i2 < -2 || i2 > 16777215) {
            throw new IllegalArgumentException(hhh.d(str, typedArray, ": out-of-range dimension length for "));
        }
        return i2;
    }

    private static int l(TypedArray typedArray, String str, int i, int i2) {
        return typedArray.hasValue(i) ? thl.a(typedArray, str, i, false) : i2;
    }

    public final int a(float f) {
        int i = this.l;
        return i == Integer.MAX_VALUE ? this.bottomMargin : j("layout_flmMarginBottom", i, f, false);
    }

    public final int b() {
        if (this.b == -1 || this.p != 0) {
            return 2;
        }
        return this.w & 3;
    }

    public final int c(float f) {
        return j("layout_flmFlowHeight", this.v, f, true);
    }

    public final int d(float f) {
        return j("layout_flmFlowInsetBottom", this.t, f, false);
    }

    public final int e(float f) {
        return j("layout_flmFlowInsetTop", this.q, f, false);
    }

    public final int f() {
        return this.w & 12;
    }

    public final int g(float f) {
        int i = this.i;
        return i == Integer.MAX_VALUE ? this.topMargin : j("layout_flmMarginTop", i, f, false);
    }

    public final String h() {
        if (a == null) {
            try {
                Field declaredField = RecyclerView.LayoutParams.class.getDeclaredField("mViewHolder");
                declaredField.setAccessible(true);
                a = declaredField;
            } catch (Exception e) {
                return "failed: ".concat(String.valueOf(e.getMessage()));
            }
        }
        try {
            return String.valueOf(a.get(this));
        } catch (Exception e2) {
            return "failed: ".concat(String.valueOf(e2.getMessage()));
        }
    }

    public final boolean i() {
        return b() == 2 && f() == 8;
    }

    @Override // android.view.ViewGroup.LayoutParams
    protected final void setBaseAttributes(TypedArray typedArray, int i, int i2) {
        this.width = typedArray.getLayoutDimension(i, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
        this.height = typedArray.getLayoutDimension(i2, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
    }

    public tgh(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = 0.0f;
        this.h = 0;
        this.i = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.j = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.k = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.l = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.m = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.n = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.o = 0;
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = -1;
        this.v = -1;
        this.w = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, tdk.d);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, R.style.FlowLayoutManager_Layout_Default);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, tdk.c, 0, resourceId);
        this.b = k(typedArrayObtainStyledAttributes2, "layout_flmWidth", 22, this.width);
        this.c = k(typedArrayObtainStyledAttributes2, "layout_flmHeight", 11, this.height);
        this.d = typedArrayObtainStyledAttributes2.getDimensionPixelOffset(9, 0);
        this.e = typedArrayObtainStyledAttributes2.getDimensionPixelOffset(8, 0);
        this.f = typedArrayObtainStyledAttributes2.getDimensionPixelSize(20, 0);
        this.g = typedArrayObtainStyledAttributes2.getFloat(7, 0.0f);
        this.h = typedArrayObtainStyledAttributes2.getDimensionPixelSize(10, 0);
        int iA = thl.a(typedArrayObtainStyledAttributes2, "layout_flmMargin", 13, false);
        this.i = l(typedArrayObtainStyledAttributes2, "layout_flmMarginTop", 18, iA);
        this.j = l(typedArrayObtainStyledAttributes2, "layout_flmMarginStart", 17, iA);
        this.k = l(typedArrayObtainStyledAttributes2, "layout_flmMarginEnd", 16, iA);
        this.l = l(typedArrayObtainStyledAttributes2, "layout_flmMarginBottom", 14, iA);
        this.m = thl.a(typedArrayObtainStyledAttributes2, "layout_flmMarginTopForFirstLine", 19, false);
        this.n = thl.a(typedArrayObtainStyledAttributes2, "layout_flmMarginBottomForLastLine", 15, false);
        this.o = typedArrayObtainStyledAttributes2.getInteger(21, 0);
        this.p = typedArrayObtainStyledAttributes2.getInteger(0, 0);
        this.q = thl.a(typedArrayObtainStyledAttributes2, "layout_flmFlowInsetTop", 5, false);
        this.r = thl.a(typedArrayObtainStyledAttributes2, "layout_flmFlowInsetStart", 4, false);
        this.s = thl.a(typedArrayObtainStyledAttributes2, "layout_flmFlowInsetEnd", 3, false);
        this.t = thl.a(typedArrayObtainStyledAttributes2, "layout_flmFlowInsetBottom", 2, false);
        this.u = thl.a(typedArrayObtainStyledAttributes2, "layout_flmFlowWidth", 6, true);
        this.v = thl.a(typedArrayObtainStyledAttributes2, "layout_flmFlowHeight", 1, true);
        this.w = typedArrayObtainStyledAttributes2.getInteger(12, 0);
        typedArrayObtainStyledAttributes2.recycle();
    }

    public tgh(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = 0.0f;
        this.h = 0;
        this.i = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.j = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.k = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.l = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.m = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.n = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.o = 0;
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = -1;
        this.v = -1;
        this.w = 0;
        this.b = this.width;
        this.c = this.height;
    }

    public tgh(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = 0.0f;
        this.h = 0;
        this.i = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.j = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.k = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.l = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.m = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.n = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.o = 0;
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = -1;
        this.v = -1;
        this.w = 0;
        this.b = this.width;
        this.c = this.height;
    }

    public tgh(tgh tghVar) {
        super((ViewGroup.MarginLayoutParams) tghVar);
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = 0.0f;
        this.h = 0;
        this.i = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.j = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.k = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.l = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.m = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.n = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.o = 0;
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = -1;
        this.v = -1;
        this.w = 0;
        this.b = tghVar.b;
        this.c = tghVar.c;
        this.f = tghVar.f;
        this.d = tghVar.d;
        this.e = tghVar.e;
        this.g = tghVar.g;
        this.h = tghVar.h;
        this.i = tghVar.i;
        this.j = tghVar.j;
        this.k = tghVar.k;
        this.l = tghVar.l;
        this.m = tghVar.m;
        this.n = tghVar.n;
        this.o = tghVar.o;
        this.p = tghVar.p;
        this.q = tghVar.q;
        this.r = tghVar.r;
        this.s = tghVar.s;
        this.t = tghVar.t;
        this.u = tghVar.u;
        this.v = tghVar.v;
        this.w = tghVar.w;
    }
}

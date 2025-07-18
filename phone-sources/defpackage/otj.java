package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.widget.ActivityChooserView;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class otj extends RecyclerView.LayoutParams {
    public int a;
    public final int b;
    public int c;
    public int d;
    public int e;
    public float f;
    public int g;
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

    public otj() {
        super(-2, -2);
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0.0f;
        this.g = 0;
        this.h = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.i = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.j = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.k = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.l = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.m = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.n = 0;
        this.o = 0;
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = -1;
        this.u = -1;
        this.v = 0;
        this.a = -2;
        this.b = -2;
    }

    public static final int i(String str, int i, float f, boolean z) {
        if (!otd.c(i) || (z && i < 0)) {
            return i;
        }
        if (Float.isNaN(f)) {
            throw new IllegalArgumentException(str.concat(" uses grid-based measurement, which is disabled"));
        }
        return (int) (f * Float.intBitsToFloat(i));
    }

    private static int j(TypedArray typedArray, String str, int i, int i2) {
        if (typedArray.hasValue(i) || i2 == Integer.MAX_VALUE) {
            return otd.b(typedArray, str, i, true);
        }
        if (i2 < -2 || i2 > 16777215) {
            throw new IllegalArgumentException(hhh.d(str, typedArray, ": out-of-range dimension length for "));
        }
        return i2;
    }

    private static int k(TypedArray typedArray, String str, int i, int i2) {
        return typedArray.hasValue(i) ? otd.b(typedArray, str, i, false) : i2;
    }

    public final int a(float f) {
        int i = this.k;
        return i == Integer.MAX_VALUE ? this.bottomMargin : i("layout_flmMarginBottom", i, f, false);
    }

    public final int b() {
        if (this.a == -1 || this.o != 0) {
            return 2;
        }
        return this.v & 3;
    }

    public final int c(float f) {
        return i("layout_flmFlowHeight", this.u, f, true);
    }

    public final int d(float f) {
        return i("layout_flmFlowInsetBottom", this.s, f, false);
    }

    public final int e(float f) {
        return i("layout_flmFlowInsetTop", this.p, f, false);
    }

    public final int f() {
        return this.v & 12;
    }

    public final int g(float f) {
        int i = this.h;
        return i == Integer.MAX_VALUE ? this.topMargin : i("layout_flmMarginTop", i, f, false);
    }

    public final boolean h() {
        return b() == 2 && f() == 8;
    }

    @Override // android.view.ViewGroup.LayoutParams
    protected final void setBaseAttributes(TypedArray typedArray, int i, int i2) {
        this.width = typedArray.getLayoutDimension(i, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
        this.height = typedArray.getLayoutDimension(i2, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
    }

    public otj(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0.0f;
        this.g = 0;
        this.h = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.i = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.j = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.k = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.l = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.m = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.n = 0;
        this.o = 0;
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = -1;
        this.u = -1;
        this.v = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, otq.b);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, R.style.FlowLayoutManager_Layout_Default);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, otq.a, 0, resourceId);
        this.a = j(typedArrayObtainStyledAttributes2, "layout_flmWidth", 22, this.width);
        this.b = j(typedArrayObtainStyledAttributes2, "layout_flmHeight", 11, this.height);
        this.c = typedArrayObtainStyledAttributes2.getDimensionPixelOffset(9, 0);
        this.d = typedArrayObtainStyledAttributes2.getDimensionPixelOffset(8, 0);
        this.e = typedArrayObtainStyledAttributes2.getDimensionPixelSize(20, 0);
        this.f = typedArrayObtainStyledAttributes2.getFloat(7, 0.0f);
        this.g = typedArrayObtainStyledAttributes2.getDimensionPixelSize(10, 0);
        int iB = otd.b(typedArrayObtainStyledAttributes2, "layout_flmMargin", 13, false);
        this.h = k(typedArrayObtainStyledAttributes2, "layout_flmMarginTop", 18, iB);
        this.i = k(typedArrayObtainStyledAttributes2, "layout_flmMarginStart", 17, iB);
        this.j = k(typedArrayObtainStyledAttributes2, "layout_flmMarginEnd", 16, iB);
        this.k = k(typedArrayObtainStyledAttributes2, "layout_flmMarginBottom", 14, iB);
        this.l = otd.b(typedArrayObtainStyledAttributes2, "layout_flmMarginTopForFirstLine", 19, false);
        this.m = otd.b(typedArrayObtainStyledAttributes2, "layout_flmMarginBottomForLastLine", 15, false);
        this.n = typedArrayObtainStyledAttributes2.getInteger(21, 0);
        this.o = typedArrayObtainStyledAttributes2.getInteger(0, 0);
        this.p = otd.b(typedArrayObtainStyledAttributes2, "layout_flmFlowInsetTop", 5, false);
        this.q = otd.b(typedArrayObtainStyledAttributes2, "layout_flmFlowInsetStart", 4, false);
        this.r = otd.b(typedArrayObtainStyledAttributes2, "layout_flmFlowInsetEnd", 3, false);
        this.s = otd.b(typedArrayObtainStyledAttributes2, "layout_flmFlowInsetBottom", 2, false);
        this.t = otd.b(typedArrayObtainStyledAttributes2, "layout_flmFlowWidth", 6, true);
        this.u = otd.b(typedArrayObtainStyledAttributes2, "layout_flmFlowHeight", 1, true);
        this.v = typedArrayObtainStyledAttributes2.getInteger(12, 0);
        typedArrayObtainStyledAttributes2.recycle();
    }

    public otj(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0.0f;
        this.g = 0;
        this.h = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.i = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.j = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.k = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.l = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.m = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.n = 0;
        this.o = 0;
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = -1;
        this.u = -1;
        this.v = 0;
        this.a = this.width;
        this.b = this.height;
    }

    public otj(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0.0f;
        this.g = 0;
        this.h = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.i = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.j = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.k = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.l = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.m = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.n = 0;
        this.o = 0;
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = -1;
        this.u = -1;
        this.v = 0;
        this.a = this.width;
        this.b = this.height;
    }

    public otj(otj otjVar) {
        super((ViewGroup.MarginLayoutParams) otjVar);
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0.0f;
        this.g = 0;
        this.h = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.i = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.j = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.k = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.l = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.m = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.n = 0;
        this.o = 0;
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = -1;
        this.u = -1;
        this.v = 0;
        this.a = otjVar.a;
        this.b = otjVar.b;
        this.e = otjVar.e;
        this.c = otjVar.c;
        this.d = otjVar.d;
        this.f = otjVar.f;
        this.g = otjVar.g;
        this.h = otjVar.h;
        this.i = otjVar.i;
        this.j = otjVar.j;
        this.k = otjVar.k;
        this.l = otjVar.l;
        this.m = otjVar.m;
        this.n = otjVar.n;
        this.o = otjVar.o;
        this.p = otjVar.p;
        this.q = otjVar.q;
        this.r = otjVar.r;
        this.s = otjVar.s;
        this.t = otjVar.t;
        this.u = otjVar.u;
        this.v = otjVar.v;
    }
}

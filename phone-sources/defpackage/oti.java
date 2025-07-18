package defpackage;

import android.util.Log;
import android.view.View;
import com.google.android.libraries.flowlayoutmanager.FlowLayoutManager;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oti {
    public static final cuj a = new cuk(30);
    public int b;
    public int c;
    public float d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public boolean o;
    public int p;

    public oti() {
        c();
    }

    private final void c() {
        this.l = -1;
        this.m = -1;
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.h = 0;
        this.i = 0;
        this.j = 0;
        this.n = 0;
        this.k = 0;
        this.b = 0;
        this.c = 0;
        this.d = Float.NaN;
        this.p = 0;
        this.o = false;
    }

    public final void a(FlowLayoutManager flowLayoutManager, View view, boolean z) {
        int decoratedMeasuredWidth = flowLayoutManager.getDecoratedMeasuredWidth(view);
        int decoratedMeasuredHeight = flowLayoutManager.getDecoratedMeasuredHeight(view);
        int baseline = view.getBaseline();
        int topDecorationHeight = (baseline < 0 || baseline > view.getMeasuredHeight()) ? decoratedMeasuredHeight : baseline + flowLayoutManager.getTopDecorationHeight(view);
        if (z && (decoratedMeasuredWidth != this.l || decoratedMeasuredHeight != this.m || topDecorationHeight != this.n)) {
            Log.w("FlowLayoutManager", "Child measurement changed without notifying from the adapter! Some layout may be incorrect.");
        }
        this.l = decoratedMeasuredWidth;
        this.m = decoratedMeasuredHeight;
        this.n = topDecorationHeight;
        this.o = true;
    }

    public final void b() {
        c();
        a.b(this);
    }
}

package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ejt extends btl implements duj {
    public static final /* synthetic */ int q = 0;
    public final dvz m;
    public final RecyclerView n;
    public boolean o;
    public px p;
    private dtf r;

    public ejt(Context context, RecyclerView recyclerView) {
        super(context);
        this.o = false;
        this.n = recyclerView;
        ejs ejsVar = new ejs();
        if (ejsVar != recyclerView.ab) {
            recyclerView.ab = ejsVar;
            recyclerView.setChildrenDrawingOrderEnabled(recyclerView.ab != null);
        }
        recyclerView.setItemViewCacheSize(0);
        addView(recyclerView);
        dru druVar = new dru(getContext(), null, null, null);
        boolean z = ebc.a;
        dvz dvzVar = new dvz(druVar);
        this.m = dvzVar;
        dvzVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        addView(dvzVar);
    }

    @Override // defpackage.duj
    public final void a(List list) {
        list.add(this.m);
        RecyclerView recyclerView = this.n;
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (childAt instanceof dvz) {
                list.add((dvz) childAt);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        dtf dtfVar = this.r;
        if (dtfVar != null) {
            dtfVar.a(this, motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // defpackage.duh
    public dtf getDispatchTouchListener() {
        return this.r;
    }

    public RecyclerView getRecyclerView() {
        return this.n;
    }

    public dvz getStickyHeader() {
        return this.m;
    }

    @Override // defpackage.duh
    public final void i(dtf dtfVar) {
        this.r = dtfVar;
    }

    public final void n() {
        dvz dvzVar = this.m;
        dvzVar.y();
        dvzVar.setVisibility(8);
    }

    public final void o(int i) {
        measureChild(this.m, View.MeasureSpec.makeMeasureSpec(i, 1073741824), 0);
    }

    @Override // defpackage.btl, android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.o = true;
    }

    @Override // defpackage.btl, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        dvz dvzVar = this.m;
        if (dvzVar.getVisibility() == 8) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        dvzVar.layout(paddingLeft, paddingTop, dvzVar.getMeasuredWidth() + paddingLeft, dvzVar.getMeasuredHeight() + paddingTop);
    }

    @Override // defpackage.btl, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        o(View.MeasureSpec.getSize(i));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (getParent() == null || this.b.a) {
            return;
        }
        getParent().requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View
    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.n.setOnTouchListener(onTouchListener);
    }

    public void setStickyHeaderVerticalOffset(int i) {
        this.m.setTranslationY(i);
    }
}

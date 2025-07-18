package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.libraries.bind.widget.BindingFrameLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class orq extends RecyclerView.ItemDecoration {
    public orq() {
        new Rect();
        new Rect();
    }

    private static final void a(RecyclerView recyclerView) {
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (childAt instanceof BindingFrameLayout) {
            }
        }
    }

    @Override // android.support.v7.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        super.getItemOffsets(rect, view, recyclerView, state);
        if (view instanceof BindingFrameLayout) {
        }
    }

    @Override // android.support.v7.widget.RecyclerView.ItemDecoration
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        super.onDraw(canvas, recyclerView, state);
        a(recyclerView);
    }

    @Override // android.support.v7.widget.RecyclerView.ItemDecoration
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        super.onDrawOver(canvas, recyclerView, state);
        a(recyclerView);
    }
}

package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qvy extends RecyclerView.ItemDecoration {
    private final Drawable a;
    private final Rect b = new Rect();
    private final View c;

    public qvy(View view, Drawable drawable) {
        this.c = view;
        this.a = drawable;
    }

    @Override // android.support.v7.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        super.getItemOffsets(rect, view, recyclerView, state);
        if (recyclerView.getChildAt(0) == view) {
            rect.set(0, this.a.getIntrinsicHeight(), 0, 0);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.ItemDecoration
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        if (recyclerView.getChildCount() == 0) {
            return;
        }
        View childAt = recyclerView.getChildAt(0);
        Rect rect = this.b;
        recyclerView.getDecoratedBoundsWithMargins(childAt, rect);
        int iRound = rect.top + Math.round(childAt.getTranslationY());
        Drawable drawable = this.a;
        int intrinsicHeight = drawable.getIntrinsicHeight() + iRound;
        View view = this.c;
        int[] iArr = cww.a;
        if (view.getLayoutDirection() == 1) {
            drawable.setBounds(0, iRound, recyclerView.getWidth(), intrinsicHeight);
        } else {
            drawable.setBounds(0, iRound, recyclerView.getWidth(), intrinsicHeight);
        }
        drawable.draw(canvas);
    }
}

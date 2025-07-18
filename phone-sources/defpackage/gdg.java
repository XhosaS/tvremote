package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gdg extends RecyclerView.ItemDecoration {
    public Drawable a;
    public int b;
    public boolean c = true;
    final /* synthetic */ gdk d;

    public gdg(gdk gdkVar) {
        this.d = gdkVar;
    }

    private final boolean a(View view, RecyclerView recyclerView) {
        RecyclerView.ViewHolder childViewHolder = recyclerView.getChildViewHolder(view);
        if (!(childViewHolder instanceof gdw) || !((gdw) childViewHolder).d) {
            return false;
        }
        boolean z = this.c;
        int iIndexOfChild = recyclerView.indexOfChild(view);
        if (iIndexOfChild >= recyclerView.getChildCount() - 1) {
            return z;
        }
        RecyclerView.ViewHolder childViewHolder2 = recyclerView.getChildViewHolder(recyclerView.getChildAt(iIndexOfChild + 1));
        return (childViewHolder2 instanceof gdw) && ((gdw) childViewHolder2).c;
    }

    @Override // android.support.v7.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        if (a(view, recyclerView)) {
            rect.bottom = this.b;
        }
    }

    @Override // android.support.v7.widget.RecyclerView.ItemDecoration
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        if (this.a == null) {
            return;
        }
        int childCount = recyclerView.getChildCount();
        int width = recyclerView.getWidth();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (a(childAt, recyclerView)) {
                int y = ((int) childAt.getY()) + childAt.getHeight();
                this.a.setBounds(0, y, width, this.b + y);
                this.a.draw(canvas);
            }
        }
    }
}

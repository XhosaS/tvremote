package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.util.SortedList;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class reu extends RecyclerView.ItemDecoration {
    private final Drawable a;
    private final Rect b = new Rect();
    private final int c;

    public reu(Drawable drawable, int i) {
        this.a = drawable;
        this.c = i;
    }

    private final void a(RecyclerView recyclerView, View view, Canvas canvas, int i) {
        Rect rect = this.b;
        recyclerView.getDecoratedBoundsWithMargins(view, rect);
        int iRound = rect.top + Math.round(view.getTranslationY());
        Drawable drawable = this.a;
        int intrinsicHeight = drawable.getIntrinsicHeight() + iRound;
        int[] iArr = cww.a;
        int layoutDirection = view.getLayoutDirection();
        int width = recyclerView.getWidth();
        if (layoutDirection == 1) {
            width -= i;
        }
        if (layoutDirection == 1) {
            i = 0;
        }
        drawable.setBounds(i, iRound, width, intrinsicHeight);
        drawable.draw(canvas);
    }

    private static int b(View view, RecyclerView recyclerView) {
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter == null) {
            return 1;
        }
        a.ab(adapter instanceof rdz);
        rdz rdzVar = (rdz) adapter;
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition == -1) {
            return 1;
        }
        SortedList sortedList = rdzVar.a;
        tst tstVarA = rdzVar.a(((Integer) sortedList.get(childAdapterPosition)).intValue());
        if (tstVarA.f() == rej.ALWAYS_HIDE_DIVIDER_CARD || tstVarA.f() == rej.COMMON_ACTION_CARD) {
            return 1;
        }
        if (childAdapterPosition <= 0 || !tstVarA.equals(rdzVar.a(((Integer) sortedList.get(childAdapterPosition - 1)).intValue())) || !tstVarA.g()) {
            return 2;
        }
        int iOrdinal = ((rej) tstVarA.c()).ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
            return 1;
        }
        if (iOrdinal == 3) {
            return 3;
        }
        throw new RuntimeException(null, null);
    }

    @Override // android.support.v7.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        if (b(view, recyclerView) == 1) {
            return;
        }
        rect.set(0, this.a.getIntrinsicHeight(), 0, 0);
    }

    @Override // android.support.v7.widget.RecyclerView.ItemDecoration
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            int iB = b(childAt, recyclerView) - 1;
            if (iB == 1) {
                a(recyclerView, childAt, canvas, 0);
            } else if (iB == 2) {
                a(recyclerView, childAt, canvas, this.c);
            }
        }
    }
}

package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ssp extends RecyclerView.ItemDecoration {
    public int a;
    public boolean b;
    private final Drawable c;
    private int d;
    private final int e;
    private final int f;
    private final Rect g = new Rect();

    public ssp(Context context) {
        TypedArray typedArrayA = suy.a(context, null, ssq.a, R.attr.materialDividerStyle, R.style.Widget_MaterialComponents_MaterialDivider, new int[0]);
        this.d = sin.h(context, typedArrayA, 0).getDefaultColor();
        this.a = typedArrayA.getDimensionPixelSize(3, context.getResources().getDimensionPixelSize(R.dimen.material_divider_thickness));
        this.e = typedArrayA.getDimensionPixelOffset(2, 0);
        this.f = typedArrayA.getDimensionPixelOffset(1, 0);
        this.b = typedArrayA.getBoolean(4, true);
        typedArrayA.recycle();
        this.c = new ShapeDrawable();
        a(this.d);
    }

    private final boolean b(RecyclerView recyclerView, View view) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        return childAdapterPosition != -1 && (!(adapter != null && childAdapterPosition == adapter.getItemCount() + (-1)) || this.b);
    }

    public final void a(int i) {
        this.d = i;
        this.c.setTint(i);
    }

    @Override // android.support.v7.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        rect.set(0, 0, 0, 0);
        if (b(recyclerView, view)) {
            rect.bottom = this.a;
        }
    }

    @Override // android.support.v7.widget.RecyclerView.ItemDecoration
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        int width;
        int paddingLeft;
        if (recyclerView.getLayoutManager() == null) {
            return;
        }
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            paddingLeft = recyclerView.getPaddingLeft();
            width = recyclerView.getWidth() - recyclerView.getPaddingRight();
            canvas.clipRect(paddingLeft, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
        } else {
            width = recyclerView.getWidth();
            paddingLeft = 0;
        }
        boolean zP = sil.p(recyclerView);
        int i = paddingLeft + (zP ? this.f : this.e);
        int i2 = width - (zP ? this.e : this.f);
        int childCount = recyclerView.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = recyclerView.getChildAt(i3);
            if (b(recyclerView, childAt)) {
                RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                Rect rect = this.g;
                layoutManager.getDecoratedBoundsWithMargins(childAt, rect);
                int iRound = rect.bottom + Math.round(childAt.getTranslationY());
                int i4 = iRound - this.a;
                Drawable drawable = this.c;
                drawable.setBounds(i, i4, i2, iRound);
                drawable.setAlpha(Math.round(childAt.getAlpha() * 255.0f));
                drawable.draw(canvas);
            }
        }
        canvas.restore();
    }
}

package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import com.google.android.videos.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kkp extends RecyclerView.ItemDecoration {
    public SparseIntArray a;
    public boolean b;
    private final ttm c;
    private final Paint d;
    private final ArrayList e;
    private final ArrayList f;
    private final Comparator g = new acs(this, 10, null);
    private final int h;
    private final int i;
    private final int j;
    private boolean k;
    private final int l;

    public kkp(Context context, ttm ttmVar, int i, int i2, int i3, int i4) {
        this.a = new SparseIntArray();
        Resources resources = context.getResources();
        this.c = ttmVar;
        this.a = new SparseIntArray();
        this.e = new ArrayList();
        this.f = new ArrayList();
        Paint paint = new Paint();
        this.d = paint;
        this.l = resources.getDimensionPixelSize(R.dimen.gtv__fireball__outline_divider_margin);
        paint.setStrokeWidth(resources.getDimensionPixelSize(R.dimen.gtv__fireball__divider_stroke_width));
        paint.setColor(i);
        new ArrayList();
        this.h = i4;
        this.i = i3;
        this.j = Math.max(0, (resources.getDimensionPixelSize(R.dimen.gtv__fireball__outline_min_height) - i2) / 2);
    }

    private final klb a(RecyclerView recyclerView, View view, int i) {
        List list = ((klc) this.c.get()).m;
        list.getClass();
        if (i >= 0 && i < list.size()) {
            return (klb) list.get(i);
        }
        if (view == null) {
            return null;
        }
        RecyclerView.ViewHolder childViewHolder = recyclerView.getChildViewHolder(view);
        childViewHolder.getClass();
        return ((kks) childViewHolder).a;
    }

    private final void b(RecyclerView recyclerView) {
        if (this.k) {
            return;
        }
        int[] iArr = cww.a;
        this.b = recyclerView.getLayoutDirection() == 1;
        this.k = true;
    }

    private final void c(Rect rect, int i) {
        if (this.b) {
            rect.left = i;
        } else {
            rect.right = i;
        }
    }

    private final void d(Rect rect, int i) {
        if (this.b) {
            rect.right = i;
        } else {
            rect.left = i;
        }
    }

    @Override // android.support.v7.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        rect.getClass();
        view.getClass();
        recyclerView.getClass();
        state.getClass();
        b(recyclerView);
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        klb klbVarA = a(recyclerView, view, childAdapterPosition);
        int i = childAdapterPosition == 0 ? 0 : this.h;
        if (klbVarA == null) {
            return;
        }
        if (klbVarA == klc.a || klbVarA.d()) {
            int i2 = -this.j;
            d(rect, i2);
            c(rect, i2);
        } else {
            if (true != klbVarA.c()) {
                i = 0;
            }
            d(rect, i);
            c(rect, 0);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.ItemDecoration
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        View childAt;
        canvas.getClass();
        recyclerView.getClass();
        state.getClass();
        b(recyclerView);
        super.onDraw(canvas, recyclerView, state);
        ttm ttmVar = this.c;
        if (((klc) ttmVar.get()).m.isEmpty()) {
            Log.w("TagItemDecoration", "No data available!");
            return;
        }
        if (state.get(R.id.gtv__fireball__state_animation_layout) != null) {
            ((klc) ttmVar.get()).g.getClass();
        }
        state.remove(R.id.gtv__fireball__state_animation_layout);
        this.a.clear();
        ArrayList arrayList = this.e;
        arrayList.clear();
        ArrayList arrayList2 = this.f;
        arrayList2.clear();
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt2 = recyclerView.getChildAt(i);
            this.a.put(i, childAt2.getLeft());
            if (recyclerView.getChildAdapterPosition(childAt2) == -1) {
                arrayList2.add(Integer.valueOf(i));
            } else {
                arrayList.add(Integer.valueOf(i));
            }
        }
        Comparator comparator = this.g;
        Collections.sort(arrayList, comparator);
        Collections.sort(arrayList2, comparator);
        if (!recyclerView.isAnimating() && !arrayList2.isEmpty()) {
            Log.wtf("TagItemDecoration", "No pending removals expected in non-animating RecyclerView");
        }
        if (arrayList.isEmpty()) {
            return;
        }
        Object obj = arrayList.get(arrayList.size() - 1);
        obj.getClass();
        ((Number) obj).intValue();
        float fMin = 1.0f;
        for (int size = (arrayList.size() + arrayList2.size()) - 1; size >= 0; size--) {
            if (size < arrayList.size()) {
                Object obj2 = arrayList.get(size);
                obj2.getClass();
                childAt = recyclerView.getChildAt(((Number) obj2).intValue());
                childAt.getClass();
            } else {
                Object obj3 = arrayList2.get(size - arrayList.size());
                obj3.getClass();
                childAt = recyclerView.getChildAt(((Number) obj3).intValue());
                childAt.getClass();
            }
            int childAdapterPosition = recyclerView.getChildAdapterPosition(childAt);
            klb klbVarA = a(recyclerView, childAt, childAdapterPosition);
            if (klbVarA != null && klbVarA.b()) {
                recyclerView.getAdapter().getClass();
                if (childAdapterPosition != r9.getItemCount() - 1) {
                    int height = recyclerView.getHeight() - this.i;
                    float x = this.b ? childAt.getX() : childAt.getX() + childAt.getWidth();
                    int i2 = this.l;
                    fMin = Math.min(fMin, childAt.getAlpha());
                    Paint paint = this.d;
                    paint.setAlpha((int) (255.0f * fMin));
                    float f = height * 0.5f;
                    float f2 = x + 0.0f + i2;
                    canvas.drawLine(f2, f, f2, recyclerView.getHeight() - f, paint);
                }
            }
        }
    }
}

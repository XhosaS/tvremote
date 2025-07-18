package defpackage;

import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import com.google.android.videos.R;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sel extends RecyclerView.ItemDecoration {
    public final SparseIntArray a;
    public boolean b;
    private final ttm c;
    private final Rect d;
    private final RectF e;
    private final Paint f;
    private final Paint g;
    private final ko h;
    private final ko i;
    private final List j;
    private final ArgbEvaluator k;
    private final int l;
    private final int m;
    private final int[] n;
    private final ArrayList o;
    private final ArrayList p;
    private final int r;
    private final int s;
    private final int t;
    private final int u;
    private final int v;
    private float x;
    private final Comparator q = new sib(this, 1);
    private boolean w = false;
    private boolean y = false;

    public sel(Context context, ttm ttmVar, int[] iArr, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        Resources resources = context.getResources();
        this.c = ttmVar;
        this.a = new SparseIntArray();
        this.o = new ArrayList();
        this.p = new ArrayList();
        this.d = new Rect();
        this.e = new RectF();
        Paint paint = new Paint(1);
        this.f = paint;
        Paint paint2 = new Paint();
        this.g = paint2;
        paint.setStrokeWidth(resources.getDimensionPixelSize(R.dimen.play__fireball__outline_stroke_width));
        paint2.setStrokeWidth(resources.getDimensionPixelSize(R.dimen.play__fireball__divider_stroke_width));
        paint2.setColor(i2);
        this.l = i3;
        this.h = new ko();
        this.i = new ko();
        this.j = new ArrayList();
        this.k = new ArgbEvaluator();
        this.x = 0.0f;
        this.r = i4;
        this.s = i5;
        this.t = i7;
        this.u = i6;
        this.v = Math.max(0, (resources.getDimensionPixelSize(R.dimen.play__fireball__outline_min_height) - i4) / 2);
        this.n = iArr;
        this.m = i;
    }

    private final float b(View view, float f) {
        return this.b ? view.getLeft() - f : view.getRight() + f;
    }

    private final float c(View view, float f) {
        return this.b ? view.getRight() + f : view.getLeft() - f;
    }

    private final float d(View view) {
        return this.b ? view.getX() + view.getWidth() : view.getX();
    }

    private final int e(String str, int i) {
        ko koVar = this.i;
        if (!koVar.containsKey(str)) {
            Log.wtf("TagItemDecoration", "Color not found for groupId: ".concat(String.valueOf(str)));
            return 0;
        }
        int iIntValue = ((Integer) koVar.get(str)).intValue();
        for (int i2 = 0; i2 < i; i2++) {
            iIntValue = csq.f(this.l, iIntValue);
        }
        return iIntValue;
    }

    private final sfa f(RecyclerView recyclerView, View view, int i) {
        sep sepVar;
        List list = ((sfb) this.c.get()).m;
        if (i >= 0 && i < list.size()) {
            return (sfa) list.get(i);
        }
        if (view == null || (sepVar = (sep) recyclerView.getChildViewHolder(view)) == null) {
            return null;
        }
        return sepVar.b;
    }

    private final void g(String str, float f, float f2, boolean z, boolean z2, float f3, float f4, float f5, int i, boolean z3) {
        ko koVar = this.h;
        int iC = koVar.c(str);
        if (iC < 0.0f) {
            if (f5 > 0.0f) {
                koVar.put(str, new sek(str, this.b, f, f2, f3, f4, f5, i));
                return;
            }
            return;
        }
        sek sekVar = (sek) koVar.g(iC);
        if (sekVar.b) {
            return;
        }
        boolean z4 = this.b;
        float f6 = this.x;
        float f7 = true != z4 ? f : f2;
        float f8 = true == z4 ? f : f2;
        boolean z5 = true != z4 ? z : z2;
        boolean z6 = true == z4 ? z : z2;
        if (z3) {
            if (f6 >= 1.0f) {
                Log.e("TagItemDecoration", String.format("Unexpected animation fraction: %.1f", Float.valueOf(f6)));
            }
            sekVar.f = f6 >= 1.0f ? 0.0f : (sekVar.h - f7) / (1.0f - f6);
            sekVar.g = f6 >= 1.0f ? 0.0f : (sekVar.i - f8) / (1.0f - f6);
            sekVar.n = sekVar.m;
            sekVar.o = i;
        }
        sekVar.e = Math.max(f7 - sekVar.c, f8 - sekVar.d);
        sekVar.c = f7;
        sekVar.d = f8;
        sekVar.j = f3;
        sekVar.k = f4;
        if (f3 == f7 && z5) {
            sekVar.f = 0.0f;
        }
        if (f4 == f8 && z6) {
            sekVar.g = 0.0f;
        }
        if (f6 <= 0.0f || f5 > 0.0f) {
            sekVar.l = (int) (255.0f * f5);
        }
        sekVar.b = true;
    }

    private final void h(String str, Canvas canvas, float f) {
        Paint paint = this.f;
        float strokeWidth = paint.getStrokeWidth() * 0.5f;
        RectF rectF = this.e;
        rectF.inset(strokeWidth, 0.0f);
        if (rectF.right > rectF.left) {
            canvas.drawRoundRect(rectF, f, f, paint);
        } else {
            Log.e("TagItemDecoration", String.format("Skipping malformed group border %s[%s]: %s", str, Integer.toHexString(paint.getColor()), rectF.toShortString()));
        }
        rectF.left = 0.0f;
        rectF.right = 0.0f;
    }

    private final void i(List list) {
        List list2 = this.j;
        if (list2.equals(list)) {
            return;
        }
        ko koVar = this.i;
        koVar.clear();
        list2.clear();
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            int[] iArr = this.n;
            int length = iArr.length;
            koVar.put(str, Integer.valueOf(iArr[i % 5]));
        }
        list2.addAll(list);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01ec A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x023d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void j(android.support.v7.widget.RecyclerView r32, java.util.List r33, boolean r34, float r35) {
        /*
            Method dump skipped, instructions count: 626
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sel.j(android.support.v7.widget.RecyclerView, java.util.List, boolean, float):void");
    }

    private final void k(RecyclerView recyclerView) {
        if (this.w) {
            return;
        }
        int[] iArr = cww.a;
        this.b = recyclerView.getLayoutDirection() == 1;
        this.w = true;
    }

    private final void l(Rect rect, int i) {
        if (this.b) {
            rect.left = i;
        } else {
            rect.right = i;
        }
    }

    private final void m(Rect rect, int i) {
        if (this.b) {
            rect.right = i;
        } else {
            rect.left = i;
        }
    }

    private final void n(RectF rectF, float f) {
        if (this.b) {
            rectF.right = f;
        } else {
            rectF.left = f;
        }
    }

    private final float o(View view) {
        return this.b ? view.getX() + 0.0f : view.getX() + view.getWidth() + 0.0f;
    }

    public final void a(float f) {
        this.x = f;
        this.y = f == 0.0f;
    }

    @Override // android.support.v7.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        k(recyclerView);
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        sfa sfaVarF = f(recyclerView, view, childAdapterPosition);
        int i = childAdapterPosition == 0 ? 0 : this.t;
        if (sfaVarF == null) {
            return;
        }
        if (sfaVarF == sfb.a || sfaVarF.d()) {
            int i2 = -this.v;
            m(rect, i2);
            l(rect, i2);
        } else {
            if (true != sfaVarF.c()) {
                i = 0;
            }
            m(rect, i);
            l(rect, 0);
        }
        i(((sfb) this.c.get()).g);
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02b6  */
    @Override // android.support.v7.widget.RecyclerView.ItemDecoration
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onDraw(android.graphics.Canvas r24, android.support.v7.widget.RecyclerView r25, android.support.v7.widget.RecyclerView.State r26) {
        /*
            Method dump skipped, instructions count: 847
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sel.onDraw(android.graphics.Canvas, android.support.v7.widget.RecyclerView, android.support.v7.widget.RecyclerView$State):void");
    }

    @Override // android.support.v7.widget.RecyclerView.ItemDecoration
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        super.onDrawOver(canvas, recyclerView, state);
        Paint paint = this.f;
        paint.setStyle(Paint.Style.STROKE);
        int i = 0;
        while (true) {
            ko koVar = this.h;
            if (i >= koVar.d) {
                return;
            }
            sek sekVar = (sek) koVar.g(i);
            if (sekVar.b) {
                RectF rectF = this.e;
                rectF.left = sekVar.h;
                rectF.right = sekVar.i;
                paint.setColor(sekVar.m);
                paint.setAlpha(sekVar.l);
                String str = sekVar.a;
                int i2 = this.s;
                h(str, canvas, i2 < 0 ? rectF.height() / 2.0f : i2);
            }
            i++;
        }
    }
}

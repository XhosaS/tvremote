package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import androidx.leanback.widget.GridLayoutManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public class vp extends RecyclerView {
    public GridLayoutManager ab;
    public final int ac;
    private final boolean ad;
    private int ae;

    public vp(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.ad = true;
        this.ac = 4;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this);
        this.ab = gridLayoutManager;
        P(gridLayoutManager);
        this.G = false;
        setDescendantFocusability(262144);
        this.s = true;
        setChildrenDrawingOrderEnabled(true);
        setWillNotDraw(true);
        setOverScrollMode(2);
        this.C.a = false;
        this.n.add(new byj(this, null));
    }

    @Override // android.support.v7.widget.RecyclerView
    public final void P(in inVar) {
        if (inVar != null) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) inVar;
            this.ab = gridLayoutManager;
            gridLayoutManager.P(this);
            super.P(inVar);
            return;
        }
        super.P(null);
        GridLayoutManager gridLayoutManager2 = this.ab;
        if (gridLayoutManager2 != null) {
            gridLayoutManager2.P(null);
        }
        this.ab = null;
    }

    @Override // android.support.v7.widget.RecyclerView
    public final void R(int i, int i2) {
        ak(i, i2);
    }

    @Override // android.support.v7.widget.RecyclerView
    public final void S(int i) {
        GridLayoutManager gridLayoutManager = this.ab;
        if ((gridLayoutManager.m & 64) != 0) {
            gridLayoutManager.bD(i, false);
        } else {
            super.S(i);
        }
    }

    public final int a() {
        return this.ab.o;
    }

    @Override // android.support.v7.widget.RecyclerView
    public final void ai(int i, int i2) {
        ak(i, i2);
    }

    public final void an(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, we.a);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(4, false);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(3, false);
        GridLayoutManager gridLayoutManager = this.ab;
        int i = gridLayoutManager.m & (-6145);
        gridLayoutManager.m = (true != z ? 0 : 2048) | i | (true != z2 ? 0 : 4096);
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(6, true);
        boolean z4 = typedArrayObtainStyledAttributes.getBoolean(5, true);
        GridLayoutManager gridLayoutManager2 = this.ab;
        int i2 = gridLayoutManager2.m & (-24577);
        gridLayoutManager2.m = (true != z3 ? 0 : 8192) | i2 | (true != z4 ? 0 : 16384);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0));
        if (gridLayoutManager2.e == 1) {
            gridLayoutManager2.I = dimensionPixelSize;
            gridLayoutManager2.J = dimensionPixelSize;
        } else {
            gridLayoutManager2.I = dimensionPixelSize;
            gridLayoutManager2.K = dimensionPixelSize;
        }
        GridLayoutManager gridLayoutManager3 = this.ab;
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, typedArrayObtainStyledAttributes.getDimensionPixelSize(7, 0));
        if (gridLayoutManager3.e == 0) {
            gridLayoutManager3.J = dimensionPixelSize2;
        } else {
            gridLayoutManager3.K = dimensionPixelSize2;
        }
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            this.ab.L = typedArrayObtainStyledAttributes.getInt(0, 0);
            requestLayout();
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void ao(int i) {
        this.ab.bD(i, false);
    }

    public final boolean ap() {
        return isChildrenDrawingOrderEnabled();
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.View
    public final View focusSearch(int i) {
        if (isFocused()) {
            GridLayoutManager gridLayoutManager = this.ab;
            View viewM = gridLayoutManager.M(gridLayoutManager.o);
            if (viewM != null) {
                return focusSearch(viewM, i);
            }
        }
        return super.focusSearch(i);
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        int iIndexOfChild;
        GridLayoutManager gridLayoutManager = this.ab;
        View viewM = gridLayoutManager.M(gridLayoutManager.o);
        return (viewM == null || i2 < (iIndexOfChild = indexOfChild(viewM))) ? i2 : i2 >= i + (-1) ? iIndexOfChild : ((iIndexOfChild + i) - 1) - i2;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.ad;
    }

    @Override // android.view.View
    protected final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        GridLayoutManager gridLayoutManager = this.ab;
        if (!z) {
            return;
        }
        int i2 = gridLayoutManager.o;
        while (true) {
            View viewM = gridLayoutManager.M(i2);
            if (viewM == null) {
                return;
            }
            if (viewM.getVisibility() == 0 && viewM.hasFocusable()) {
                viewM.requestFocus();
                return;
            }
            i2++;
        }
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (this.ae == 1) {
            return false;
        }
        GridLayoutManager gridLayoutManager = this.ab;
        View viewM = gridLayoutManager.M(gridLayoutManager.o);
        if (viewM != null) {
            return viewM.requestFocus(i, rect);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0014  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onRtlPropertiesChanged(int r7) {
        /*
            r6 = this;
            androidx.leanback.widget.GridLayoutManager r0 = r6.ab
            if (r0 == 0) goto L2f
            int r1 = r0.e
            r2 = 0
            r3 = 1
            if (r1 != 0) goto Lf
            if (r7 != r3) goto L14
            r1 = 262144(0x40000, float:3.67342E-40)
            goto L15
        Lf:
            if (r7 != r3) goto L14
            r1 = 524288(0x80000, float:7.34684E-40)
            goto L15
        L14:
            r1 = r2
        L15:
            int r4 = r0.m
            r5 = 786432(0xc0000, float:1.102026E-39)
            r5 = r5 & r4
            if (r5 != r1) goto L1d
            goto L2f
        L1d:
            r5 = -786433(0xfffffffffff3ffff, float:NaN)
            r4 = r4 & r5
            r1 = r1 | r4
            r1 = r1 | 256(0x100, float:3.59E-43)
            r0.m = r1
            wo r0 = r0.O
            if (r7 != r3) goto L2b
            r2 = r3
        L2b:
            wn r7 = r0.c
            r7.i = r2
        L2f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vp.onRtlPropertiesChanged(int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        boolean z = view.hasFocus() && isFocusable();
        if (z) {
            this.ae = 1;
            requestFocus();
        }
        super.removeView(view);
        if (z) {
            this.ae = 0;
        }
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        boolean zHasFocus = getChildAt(i).hasFocus();
        if (zHasFocus) {
            this.ae = 1;
            requestFocus();
        }
        super.removeViewAt(i);
        if (zHasFocus) {
            this.ae = 0;
        }
    }
}

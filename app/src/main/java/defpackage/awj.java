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
public class awj extends RecyclerView {
    public GridLayoutManager ad;
    public awh ae;
    public int af;
    private boolean ag;
    private final boolean ah;
    private px ai;
    private int aj;

    public awj(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.ag = true;
        this.ah = true;
        this.af = 4;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this);
        this.ad = gridLayoutManager;
        ai(gridLayoutManager);
        this.J = false;
        setDescendantFocusability(262144);
        this.t = true;
        setChildrenDrawingOrderEnabled(true);
        setWillNotDraw(true);
        setOverScrollMode(2);
        ((re) getItemAnimator()).i = false;
        this.p.add(new awd(this));
    }

    public final void aB(boolean z) {
        if (this.ag != z) {
            this.ag = z;
            if (z) {
                super.ah(this.ai);
            } else {
                this.ai = getItemAnimator();
                super.ah(null);
            }
        }
    }

    public final void aC(boolean z) {
        super.setChildrenDrawingOrderEnabled(z);
    }

    public final void aD(boolean z) {
        GridLayoutManager gridLayoutManager = this.ad;
        gridLayoutManager.U.d.f = z;
        gridLayoutManager.bC();
        requestLayout();
    }

    public final boolean aE() {
        return isChildrenDrawingOrderEnabled();
    }

    @Override // android.support.v7.widget.RecyclerView
    public final void ae(int i) {
        if (this.ad.bM()) {
            this.ad.bO(i, false);
        } else {
            super.ae(i);
        }
    }

    @Override // android.support.v7.widget.RecyclerView
    public final void ai(qd qdVar) {
        if (qdVar != null) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) qdVar;
            this.ad = gridLayoutManager;
            gridLayoutManager.d = this;
            gridLayoutManager.R = null;
            super.ai(qdVar);
            return;
        }
        super.ai(null);
        GridLayoutManager gridLayoutManager2 = this.ad;
        if (gridLayoutManager2 != null) {
            gridLayoutManager2.d = null;
            gridLayoutManager2.R = null;
        }
        this.ad = null;
    }

    @Override // android.support.v7.widget.RecyclerView
    public final void ak(int i, int i2) {
        aA(i, i2, false);
    }

    @Override // android.support.v7.widget.RecyclerView
    public final void al(int i) {
        if (this.ad.bM()) {
            this.ad.bO(i, false);
        } else {
            super.al(i);
        }
    }

    @Override // android.support.v7.widget.RecyclerView
    public final void ay(int i, int i2) {
        aA(i, i2, false);
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void fa(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, azo.a);
        this.ad.ab(typedArrayObtainStyledAttributes.getBoolean(4, false), typedArrayObtainStyledAttributes.getBoolean(3, false));
        boolean z = typedArrayObtainStyledAttributes.getBoolean(6, true);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(5, true);
        GridLayoutManager gridLayoutManager = this.ad;
        int i = gridLayoutManager.n & (-24577);
        gridLayoutManager.n = (true != z ? 0 : 8192) | i | (true != z2 ? 0 : 16384);
        gridLayoutManager.bA(typedArrayObtainStyledAttributes.getDimensionPixelSize(2, typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0)));
        this.ad.ac(typedArrayObtainStyledAttributes.getDimensionPixelSize(1, typedArrayObtainStyledAttributes.getDimensionPixelSize(7, 0)));
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            setGravity(typedArrayObtainStyledAttributes.getInt(0, 0));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public final View focusSearch(int i) {
        if (isFocused()) {
            GridLayoutManager gridLayoutManager = this.ad;
            View viewT = gridLayoutManager.T(gridLayoutManager.p);
            if (viewT != null) {
                return focusSearch(viewT, i);
            }
        }
        return super.focusSearch(i);
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        int iIndexOfChild;
        GridLayoutManager gridLayoutManager = this.ad;
        View viewT = gridLayoutManager.T(gridLayoutManager.p);
        return (viewT == null || i2 < (iIndexOfChild = indexOfChild(viewT))) ? i2 : i2 >= i + (-1) ? iIndexOfChild : ((iIndexOfChild + i) - 1) - i2;
    }

    public int getExtraLayoutSpace() {
        return this.ad.V;
    }

    public int getFocusScrollStrategy() {
        return this.ad.S;
    }

    @Deprecated
    public int getHorizontalMargin() {
        return this.ad.L;
    }

    public int getHorizontalSpacing() {
        return this.ad.L;
    }

    public int getInitialPrefetchItemCount() {
        return this.af;
    }

    public int getItemAlignmentOffset() {
        return this.ad.U.d.d;
    }

    public float getItemAlignmentOffsetPercent() {
        return this.ad.U.d.e;
    }

    public int getItemAlignmentViewId() {
        return this.ad.U.d.b;
    }

    public awh getOnUnhandledKeyListener() {
        return this.ae;
    }

    public final int getSaveChildrenLimitNumber() {
        return this.ad.W.b;
    }

    public final int getSaveChildrenPolicy() {
        return this.ad.W.a;
    }

    public int getSelectedPosition() {
        return this.ad.p;
    }

    public int getSelectedSubPosition() {
        return this.ad.q;
    }

    public awi getSmoothScrollByBehavior() {
        return null;
    }

    public final int getSmoothScrollMaxPendingMoves() {
        return this.ad.c;
    }

    public final float getSmoothScrollSpeedFactor() {
        return this.ad.b;
    }

    @Deprecated
    public int getVerticalMargin() {
        return this.ad.M;
    }

    public int getVerticalSpacing() {
        return this.ad.M;
    }

    public int getWindowAlignment() {
        return this.ad.T.d.e;
    }

    public int getWindowAlignmentOffset() {
        return this.ad.T.d.f;
    }

    public float getWindowAlignmentOffsetPercent() {
        return this.ad.T.d.g;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.ah;
    }

    @Override // android.view.View
    protected final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        GridLayoutManager gridLayoutManager = this.ad;
        if (!z) {
            return;
        }
        int i2 = gridLayoutManager.p;
        while (true) {
            View viewT = gridLayoutManager.T(i2);
            if (viewT == null) {
                return;
            }
            if (viewT.getVisibility() == 0 && viewT.hasFocusable()) {
                viewT.requestFocus();
                return;
            }
            i2++;
        }
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        int i4;
        if (this.aj == 1) {
            return false;
        }
        GridLayoutManager gridLayoutManager = this.ad;
        int i5 = gridLayoutManager.S;
        if (i5 != 1 && i5 != 2) {
            View viewT = gridLayoutManager.T(gridLayoutManager.p);
            if (viewT == null) {
                return false;
            }
            return viewT.requestFocus(i, rect);
        }
        int iAt = gridLayoutManager.at();
        if ((i & 2) != 0) {
            i4 = 1;
            i3 = iAt;
            i2 = 0;
        } else {
            i2 = iAt - 1;
            i3 = -1;
            i4 = -1;
        }
        bbf bbfVar = gridLayoutManager.T.d;
        int i6 = bbfVar.i;
        int iB = bbfVar.b() + i6;
        while (i2 != i3) {
            View viewAI = gridLayoutManager.aI(i2);
            if (viewAI.getVisibility() == 0 && gridLayoutManager.f.d(viewAI) >= i6 && gridLayoutManager.f.a(viewAI) <= iB && viewAI.requestFocus(i, rect)) {
                return true;
            }
            i2 += i4;
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
            androidx.leanback.widget.GridLayoutManager r0 = r6.ad
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
            int r4 = r0.n
            r5 = 786432(0xc0000, float:1.102026E-39)
            r5 = r5 & r4
            if (r5 != r1) goto L1d
            goto L2f
        L1d:
            r5 = -786433(0xfffffffffff3ffff, float:NaN)
            r4 = r4 & r5
            r1 = r1 | r4
            r1 = r1 | 256(0x100, float:3.59E-43)
            r0.n = r1
            bbg r0 = r0.T
            if (r7 != r3) goto L2b
            r2 = r3
        L2b:
            bbf r7 = r0.c
            r7.k = r2
        L2f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awj.onRtlPropertiesChanged(int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        boolean z = view.hasFocus() && isFocusable();
        if (z) {
            this.aj = 1;
            requestFocus();
        }
        super.removeView(view);
        if (z) {
            this.aj = 0;
        }
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        boolean zHasFocus = getChildAt(i).hasFocus();
        if (zHasFocus) {
            this.aj = 1;
            requestFocus();
        }
        super.removeViewAt(i);
        if (zHasFocus) {
            this.aj = 0;
        }
    }

    public void setChildrenVisibility(int i) {
        GridLayoutManager gridLayoutManager = this.ad;
        gridLayoutManager.J = i;
        if (i != -1) {
            int iAt = gridLayoutManager.at();
            for (int i2 = 0; i2 < iAt; i2++) {
                gridLayoutManager.aI(i2).setVisibility(gridLayoutManager.J);
            }
        }
    }

    public void setExtraLayoutSpace(int i) {
        GridLayoutManager gridLayoutManager = this.ad;
        int i2 = gridLayoutManager.V;
        if (i2 == i) {
            return;
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("ExtraLayoutSpace must >= 0");
        }
        gridLayoutManager.V = i;
        gridLayoutManager.be();
    }

    public void setFocusScrollStrategy(int i) {
        if (i != 0 && i != 1 && i != 2) {
            throw new IllegalArgumentException("Invalid scrollStrategy");
        }
        this.ad.S = i;
        requestLayout();
    }

    public void setGravity(int i) {
        this.ad.P = i;
        requestLayout();
    }

    @Deprecated
    public void setHorizontalMargin(int i) {
        setHorizontalSpacing(i);
    }

    public void setHorizontalSpacing(int i) {
        this.ad.ac(i);
        requestLayout();
    }

    public void setInitialPrefetchItemCount(int i) {
        this.af = i;
    }

    public void setItemAlignmentOffset(int i) {
        GridLayoutManager gridLayoutManager = this.ad;
        gridLayoutManager.U.d.d = i;
        gridLayoutManager.bC();
        requestLayout();
    }

    public void setItemAlignmentOffsetPercent(float f) {
        GridLayoutManager gridLayoutManager = this.ad;
        gridLayoutManager.U.d.a(f);
        gridLayoutManager.bC();
        requestLayout();
    }

    public void setItemAlignmentViewId(int i) {
        GridLayoutManager gridLayoutManager = this.ad;
        gridLayoutManager.U.d.b = i;
        gridLayoutManager.bC();
    }

    @Deprecated
    public void setItemMargin(int i) {
        setItemSpacing(i);
    }

    public void setItemSpacing(int i) {
        GridLayoutManager gridLayoutManager = this.ad;
        gridLayoutManager.L = i;
        gridLayoutManager.M = i;
        gridLayoutManager.O = i;
        gridLayoutManager.N = i;
        requestLayout();
    }

    public final void setSaveChildrenLimitNumber(int i) {
        bbe bbeVar = this.ad.W;
        bbeVar.b = i;
        bbeVar.a();
    }

    public final void setSaveChildrenPolicy(int i) {
        bbe bbeVar = this.ad.W;
        bbeVar.a = i;
        bbeVar.a();
    }

    public void setSelectedPosition(int i) {
        this.ad.bO(i, false);
    }

    public void setSelectedPositionSmooth(int i) {
        this.ad.bO(i, true);
    }

    public final void setSmoothScrollMaxPendingMoves(int i) {
        this.ad.c = i;
    }

    public final void setSmoothScrollSpeedFactor(float f) {
        this.ad.b = f;
    }

    @Deprecated
    public void setVerticalMargin(int i) {
        setVerticalSpacing(i);
    }

    public void setVerticalSpacing(int i) {
        this.ad.bA(i);
        requestLayout();
    }

    public void setWindowAlignment(int i) {
        this.ad.T.d.e = i;
        requestLayout();
    }

    public void setWindowAlignmentOffset(int i) {
        this.ad.T.d.f = i;
        requestLayout();
    }

    public void setWindowAlignmentOffsetPercent(float f) {
        bbf bbfVar = this.ad.T.d;
        if ((f < 0.0f || f > 100.0f) && f != -1.0f) {
            throw new IllegalArgumentException();
        }
        bbfVar.g = f;
        requestLayout();
    }
}

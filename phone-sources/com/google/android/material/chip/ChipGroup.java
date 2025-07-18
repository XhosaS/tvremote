package com.google.android.material.chip;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.videos.R;
import defpackage.cxe;
import defpackage.cyq;
import defpackage.srh;
import defpackage.sri;
import defpackage.srj;
import defpackage.stx;
import defpackage.sug;
import defpackage.sui;
import defpackage.suy;
import defpackage.tde;
import defpackage.tko;
import defpackage.zft;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ChipGroup extends sug {
    public final stx a;
    public tko b;
    private int g;
    private int h;
    private final int i;
    private final sri j;

    public ChipGroup(Context context) {
        this(context, null);
    }

    public final int a() {
        return this.a.a();
    }

    public final void b(boolean z) {
        this.a.d = z;
    }

    public final void c(boolean z) {
        stx stxVar = this.a;
        if (stxVar.c != z) {
            stxVar.c = z;
            boolean zIsEmpty = stxVar.b.isEmpty();
            Iterator it = stxVar.a.values().iterator();
            while (it.hasNext()) {
                stxVar.f((sui) it.next(), false);
            }
            if (zIsEmpty) {
                return;
            }
            stxVar.d();
        }
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof srh);
    }

    public final boolean d(int i) {
        return getChildAt(i).getVisibility() == 0;
    }

    public final boolean e() {
        return this.a.c;
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new srh();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new srh(getContext(), attributeSet);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        int i = this.i;
        if (i != -1) {
            this.a.c(i);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        cyq cyqVar = new cyq(accessibilityNodeInfo);
        if (this.e) {
            i = 0;
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                if ((getChildAt(i2) instanceof Chip) && d(i2)) {
                    i++;
                }
            }
        } else {
            i = -1;
        }
        cyqVar.v(cxe.k(this.f, i, false, true != e() ? 2 : 1));
    }

    @Override // android.view.ViewGroup
    public final void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.j.a = onHierarchyChangeListener;
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.chipGroupStyle);
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new srh(layoutParams);
    }

    public ChipGroup(Context context, AttributeSet attributeSet, int i) {
        super(tde.a(context, attributeSet, i, R.style.Widget_MaterialComponents_ChipGroup), attributeSet, i);
        stx stxVar = new stx();
        this.a = stxVar;
        sri sriVar = new sri(this);
        this.j = sriVar;
        TypedArray typedArrayA = suy.a(getContext(), attributeSet, srj.b, i, R.style.Widget_MaterialComponents_ChipGroup, new int[0]);
        int dimensionPixelOffset = typedArrayA.getDimensionPixelOffset(1, 0);
        int dimensionPixelOffset2 = typedArrayA.getDimensionPixelOffset(2, dimensionPixelOffset);
        if (this.g != dimensionPixelOffset2) {
            this.g = dimensionPixelOffset2;
            this.d = dimensionPixelOffset2;
            requestLayout();
        }
        int dimensionPixelOffset3 = typedArrayA.getDimensionPixelOffset(3, dimensionPixelOffset);
        if (this.h != dimensionPixelOffset3) {
            this.h = dimensionPixelOffset3;
            this.c = dimensionPixelOffset3;
            requestLayout();
        }
        this.e = typedArrayA.getBoolean(5, false);
        c(typedArrayA.getBoolean(6, false));
        b(typedArrayA.getBoolean(4, false));
        this.i = typedArrayA.getResourceId(0, -1);
        typedArrayA.recycle();
        stxVar.e = new zft(this, null);
        super.setOnHierarchyChangeListener(sriVar);
        setImportantForAccessibility(1);
    }
}

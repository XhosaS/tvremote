package android.support.constraint;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import defpackage.b;
import defpackage.d;
import defpackage.e;
import defpackage.f;
import defpackage.p;
import defpackage.q;
import defpackage.r;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    final SparseArray a;
    final q b;
    private final ArrayList c;
    private int d;
    private int e;
    private int f;
    private int g;
    private boolean h;
    private int i;
    private d j;

    public ConstraintLayout(Context context) throws XmlPullParserException, Resources.NotFoundException, IOException {
        super(context);
        this.a = new SparseArray();
        this.c = new ArrayList(100);
        this.b = new q();
        this.d = 0;
        this.e = 0;
        this.f = Integer.MAX_VALUE;
        this.g = Integer.MAX_VALUE;
        this.h = true;
        this.i = 2;
        this.j = null;
        c(null);
    }

    private final p a(int i) {
        View view;
        if (i == 0 || (view = (View) this.a.get(i)) == this) {
            return this.b;
        }
        if (view == null) {
            return null;
        }
        return ((b) view.getLayoutParams()).Y;
    }

    private final p b(View view) {
        if (view == this) {
            return this.b;
        }
        if (view == null) {
            return null;
        }
        return ((b) view.getLayoutParams()).Y;
    }

    private final void c(AttributeSet attributeSet) throws XmlPullParserException, Resources.NotFoundException, IOException {
        q qVar = this.b;
        qVar.L = this;
        this.a.put(getId(), this);
        this.j = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, f.a);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 16) {
                    this.d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(16, this.d);
                } else if (index == 17) {
                    this.e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(17, this.e);
                } else if (index == 14) {
                    this.f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(14, this.f);
                } else if (index == 15) {
                    this.g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(15, this.g);
                } else if (index == 113) {
                    this.i = typedArrayObtainStyledAttributes.getInt(113, this.i);
                } else if (index == 34) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(34, 0);
                    d dVar = new d();
                    this.j = dVar;
                    dVar.a(getContext(), resourceId);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        qVar.ak = this.i;
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof b;
    }

    @Override // android.view.ViewGroup
    protected final /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new b();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    public int getMaxHeight() {
        return this.g;
    }

    public int getMaxWidth() {
        return this.f;
    }

    public int getMinHeight() {
        return this.e;
    }

    public int getMinWidth() {
        return this.d;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            b bVar = (b) childAt.getLayoutParams();
            if (childAt.getVisibility() != 8 || bVar.Q || zIsInEditMode) {
                p pVar = bVar.Y;
                int i6 = pVar.y + pVar.C;
                int i7 = pVar.z + pVar.D;
                childAt.layout(i6, i7, pVar.d() + i6, pVar.a() + i7);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:213:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0544  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0665  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onMeasure(int r36, int r37) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 1717
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.ConstraintLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        boolean z = view instanceof e;
        p pVarB = b(view);
        if (z && !(pVarB instanceof r)) {
            b bVar = (b) view.getLayoutParams();
            bVar.Y = new r();
            bVar.Q = true;
            ((r) bVar.Y).w(bVar.M);
            p pVar = bVar.Y;
        }
        this.a.put(view.getId(), view);
        this.h = true;
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.a.remove(view.getId());
        this.b.B(b(view));
        this.h = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        super.requestLayout();
        this.h = true;
    }

    @Override // android.view.View
    public void setId(int i) {
        SparseArray sparseArray = this.a;
        sparseArray.remove(getId());
        super.setId(i);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.g) {
            return;
        }
        this.g = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.f) {
            return;
        }
        this.f = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.e) {
            return;
        }
        this.e = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.d) {
            return;
        }
        this.d = i;
        requestLayout();
    }

    public void setOptimizationLevel(int i) {
        this.b.ak = i;
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) throws XmlPullParserException, Resources.NotFoundException, IOException {
        super(context, attributeSet);
        this.a = new SparseArray();
        this.c = new ArrayList(100);
        this.b = new q();
        this.d = 0;
        this.e = 0;
        this.f = Integer.MAX_VALUE;
        this.g = Integer.MAX_VALUE;
        this.h = true;
        this.i = 2;
        this.j = null;
        c(attributeSet);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) throws XmlPullParserException, Resources.NotFoundException, IOException {
        super(context, attributeSet, i);
        this.a = new SparseArray();
        this.c = new ArrayList(100);
        this.b = new q();
        this.d = 0;
        this.e = 0;
        this.f = Integer.MAX_VALUE;
        this.g = Integer.MAX_VALUE;
        this.h = true;
        this.i = 2;
        this.j = null;
        c(attributeSet);
    }
}

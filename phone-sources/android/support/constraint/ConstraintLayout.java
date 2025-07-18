package android.support.constraint;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.v7.appcompat.R;
import android.support.v7.widget.ActivityChooserView;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import defpackage.ac;
import defpackage.ae;
import defpackage.af;
import defpackage.am;
import defpackage.an;
import defpackage.ao;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    final SparseArray a;
    final an b;
    private final ArrayList c;
    private int d;
    private int e;
    private int f;
    private int g;
    private boolean h;
    private int i;
    private ae j;

    public ConstraintLayout(Context context) throws XmlPullParserException, Resources.NotFoundException, IOException {
        super(context);
        this.a = new SparseArray();
        this.c = new ArrayList(100);
        this.b = new an();
        this.d = 0;
        this.e = 0;
        this.f = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.g = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.h = true;
        this.i = 2;
        this.j = null;
        d(null);
    }

    private final am b(int i) {
        View view;
        if (i == 0 || (view = (View) this.a.get(i)) == this) {
            return this.b;
        }
        if (view == null) {
            return null;
        }
        return ((ac) view.getLayoutParams()).Y;
    }

    private final am c(View view) {
        if (view == this) {
            return this.b;
        }
        if (view == null) {
            return null;
        }
        return ((ac) view.getLayoutParams()).Y;
    }

    private final void d(AttributeSet attributeSet) throws XmlPullParserException, Resources.NotFoundException, IOException {
        an anVar = this.b;
        anVar.J = this;
        this.a.put(getId(), this);
        this.j = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, af.a);
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
                    this.i = typedArrayObtainStyledAttributes.getInt(R.styleable.AppCompatTheme_toolbarStyle, this.i);
                } else if (index == 34) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(34, 0);
                    ae aeVar = new ae();
                    this.j = aeVar;
                    aeVar.a(getContext(), resourceId);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        anVar.ai = this.i;
    }

    protected final void a() {
        this.b.D();
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ac;
    }

    @Override // android.view.ViewGroup
    protected final /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ac();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ac(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            ac acVar = (ac) childAt.getLayoutParams();
            if (childAt.getVisibility() != 8 || acVar.Q || zIsInEditMode) {
                am amVar = acVar.Y;
                int iB = amVar.b();
                int iC = amVar.c();
                childAt.layout(iB, iC, amVar.h() + iB, amVar.d() + iC);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:213:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0546  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x054a  */
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
        boolean z = view instanceof Guideline;
        am amVarC = c(view);
        if (z && !(amVarC instanceof ao)) {
            ac acVar = (ac) view.getLayoutParams();
            acVar.Y = new ao();
            acVar.Q = true;
            ((ao) acVar.Y).A(acVar.M);
            am amVar = acVar.Y;
        }
        this.a.put(view.getId(), view);
        this.h = true;
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.a.remove(view.getId());
        this.b.F(c(view));
        this.h = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        super.requestLayout();
        this.h = true;
    }

    @Override // android.view.View
    public final void setId(int i) {
        SparseArray sparseArray = this.a;
        sparseArray.remove(getId());
        super.setId(i);
        sparseArray.put(getId(), this);
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ac(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) throws XmlPullParserException, Resources.NotFoundException, IOException {
        super(context, attributeSet);
        this.a = new SparseArray();
        this.c = new ArrayList(100);
        this.b = new an();
        this.d = 0;
        this.e = 0;
        this.f = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.g = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.h = true;
        this.i = 2;
        this.j = null;
        d(attributeSet);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) throws XmlPullParserException, Resources.NotFoundException, IOException {
        super(context, attributeSet, i);
        this.a = new SparseArray();
        this.c = new ArrayList(100);
        this.b = new an();
        this.d = 0;
        this.e = 0;
        this.f = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.g = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.h = true;
        this.i = 2;
        this.j = null;
        d(attributeSet);
    }
}

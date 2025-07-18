package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.v7.appcompat.R;
import android.support.v7.widget.ActivityChooserView;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import defpackage.cpd;
import defpackage.cpe;
import defpackage.cph;
import defpackage.cqc;
import defpackage.cqe;
import defpackage.cqf;
import defpackage.cqn;
import defpackage.cqr;
import defpackage.cqv;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    final SparseArray a;
    public final ArrayList b;
    protected final cpe c;
    public int d;
    public int e;
    protected boolean f;
    public int g;
    public cqn h;
    final cqf i;
    private int j;
    private int k;
    private int l;
    private HashMap m;
    private final SparseArray n;

    public ConstraintLayout(Context context) throws XmlPullParserException, IOException, NumberFormatException {
        super(context);
        this.a = new SparseArray();
        this.b = new ArrayList(4);
        this.c = new cpe();
        this.d = 0;
        this.e = 0;
        this.j = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.k = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.f = true;
        this.g = 257;
        this.h = null;
        this.l = -1;
        this.m = new HashMap();
        this.n = new SparseArray();
        this.i = new cqf(this, this);
        e(null, 0, 0);
    }

    private final void e(AttributeSet attributeSet, int i, int i2) throws XmlPullParserException, IOException, NumberFormatException {
        cpe cpeVar = this.c;
        cpeVar.ah = this;
        cqf cqfVar = this.i;
        cpeVar.aH = cqfVar;
        cpeVar.a.g = cqfVar;
        this.a.put(getId(), this);
        this.h = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, cqr.b, i, i2);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i3);
                if (index == 16) {
                    this.d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(16, this.d);
                } else if (index == 17) {
                    this.e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(17, this.e);
                } else if (index == 14) {
                    this.j = typedArrayObtainStyledAttributes.getDimensionPixelOffset(14, this.j);
                } else if (index == 15) {
                    this.k = typedArrayObtainStyledAttributes.getDimensionPixelOffset(15, this.k);
                } else if (index == 113) {
                    this.g = typedArrayObtainStyledAttributes.getInt(R.styleable.AppCompatTheme_toolbarStyle, this.g);
                } else if (index == 56) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(56, 0);
                    if (resourceId != 0) {
                        try {
                            cqv.t(getContext(), resourceId, new SparseArray(), new SparseArray());
                        } catch (Resources.NotFoundException unused) {
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(34, 0);
                    try {
                        cqn cqnVar = new cqn();
                        this.h = cqnVar;
                        cqnVar.h(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.h = null;
                    }
                    this.l = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.c.X(this.g);
    }

    private final void f() {
        this.f = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:258:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x04a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void g() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.g():void");
    }

    private final void h(cpd cpdVar, cqe cqeVar, SparseArray sparseArray, int i, int i2) {
        View view = (View) this.a.get(i);
        cpd cpdVar2 = (cpd) sparseArray.get(i);
        if (cpdVar2 == null || view == null || !(view.getLayoutParams() instanceof cqe)) {
            return;
        }
        cqeVar.ag = true;
        if (i2 == 6) {
            cqe cqeVar2 = (cqe) view.getLayoutParams();
            cqeVar2.ag = true;
            cqeVar2.av.G = true;
        }
        cpdVar.M(6).n(cpdVar2.M(i2), cqeVar.D, cqeVar.C, true);
        cpdVar.G = true;
        cpdVar.M(3).e();
        cpdVar.M(5).e();
    }

    public final View a(int i) {
        return (View) this.a.get(i);
    }

    protected final boolean c() {
        return (getContext().getApplicationInfo().flags & 4194304) != 0 && getLayoutDirection() == 1;
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof cqe;
    }

    public final Object d(Object obj) {
        HashMap map;
        if ((obj instanceof String) && (map = this.m) != null && map.containsKey(obj)) {
            return this.m.get(obj);
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchDraw(Canvas canvas) throws NumberFormatException {
        Object tag;
        int size;
        ArrayList arrayList = this.b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i3 = Integer.parseInt(strArrSplit[0]);
                        int i4 = Integer.parseInt(strArrSplit[1]);
                        int i5 = Integer.parseInt(strArrSplit[2]);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        int i6 = (int) ((i4 / 1920.0f) * height);
                        int i7 = (int) ((i3 / 1080.0f) * width);
                        float f = ((int) ((i5 / 1080.0f) * width)) + i7;
                        float f2 = i7;
                        float f3 = i6;
                        canvas.drawLine(f2, f3, f, f3, paint);
                        float f4 = i6 + ((int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height));
                        canvas.drawLine(f, f3, f, f4, paint);
                        canvas.drawLine(f, f4, f2, f4, paint);
                        canvas.drawLine(f2, f4, f2, f3, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f2, f3, f, f4, paint);
                        canvas.drawLine(f2, f4, f, f3, paint);
                    }
                }
            }
        }
    }

    public final cpd es(View view) {
        if (view == this) {
            return this.c;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof cqe) {
            return ((cqe) view.getLayoutParams()).av;
        }
        view.setLayoutParams(new cqe(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof cqe) {
            return ((cqe) view.getLayoutParams()).av;
        }
        return null;
    }

    @Override // android.view.View
    public final void forceLayout() {
        f();
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    protected final /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new cqe();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new cqe(getContext(), attributeSet);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onLayout(boolean r5, int r6, int r7, int r8, int r9) {
        /*
            r4 = this;
            int r5 = r4.getChildCount()
            boolean r6 = r4.isInEditMode()
            r7 = 0
            r8 = r7
        La:
            if (r8 >= r5) goto L4f
            android.view.View r9 = r4.getChildAt(r8)
            android.view.ViewGroup$LayoutParams r0 = r9.getLayoutParams()
            cqe r0 = (defpackage.cqe) r0
            cpd r1 = r0.av
            int r2 = r9.getVisibility()
            r3 = 8
            if (r2 != r3) goto L2d
            boolean r2 = r0.ah
            if (r2 != 0) goto L2d
            boolean r2 = r0.ai
            if (r2 != 0) goto L2d
            boolean r2 = r0.ak
            if (r6 != 0) goto L2d
            goto L48
        L2d:
            boolean r0 = r0.aj
            int r0 = r1.k()
            int r2 = r1.l()
            int r3 = r1.j()
            int r3 = r3 + r0
            int r1 = r1.h()
            int r1 = r1 + r2
            r9.layout(r0, r2, r3, r1)
            boolean r0 = r9 instanceof defpackage.cqp
            if (r0 != 0) goto L4b
        L48:
            int r8 = r8 + 1
            goto La
        L4b:
            cqp r9 = (defpackage.cqp) r9
            r5 = 0
            throw r5
        L4f:
            java.util.ArrayList r5 = r4.b
            int r6 = r5.size()
            if (r6 <= 0) goto L65
        L57:
            if (r7 >= r6) goto L65
            java.lang.Object r8 = r5.get(r7)
            cqc r8 = (defpackage.cqc) r8
            r8.l()
            int r7 = r7 + 1
            goto L57
        L65:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0220 A[PHI: r2 r6 r11
  0x0220: PHI (r2v5 int[]) = (r2v4 int[]), (r2v74 int[]) binds: [B:73:0x01c3, B:401:0x0220] A[DONT_GENERATE, DONT_INLINE]
  0x0220: PHI (r6v6 boolean) = (r6v5 boolean), (r6v71 boolean) binds: [B:73:0x01c3, B:401:0x0220] A[DONT_GENERATE, DONT_INLINE]
  0x0220: PHI (r11v4 int) = (r11v3 int), (r11v80 int) binds: [B:73:0x01c3, B:401:0x0220] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0235 A[PHI: r7
  0x0235: PHI (r7v1 int) = (r7v0 int), (r7v15 int) binds: [B:102:0x0228, B:104:0x022c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x054d  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x05cc  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x05d2  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0763  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x07a1  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x07a4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01c5  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r30, int r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1961
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        boolean z = view instanceof Guideline;
        cpd cpdVarEs = es(view);
        if (z && !(cpdVarEs instanceof cph)) {
            cqe cqeVar = (cqe) view.getLayoutParams();
            cqeVar.av = new cph();
            cqeVar.ah = true;
            ((cph) cqeVar.av).c(cqeVar.Z);
        }
        if (view instanceof cqc) {
            cqc cqcVar = (cqc) view;
            cqcVar.k();
            ((cqe) view.getLayoutParams()).ai = true;
            ArrayList arrayList = this.b;
            if (!arrayList.contains(cqcVar)) {
                arrayList.add(cqcVar);
            }
        }
        this.a.put(view.getId(), view);
        this.f = true;
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.a.remove(view.getId());
        this.c.ab(es(view));
        this.b.remove(view);
        this.f = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        f();
        super.requestLayout();
    }

    @Override // android.view.View
    public final void setId(int i) {
        SparseArray sparseArray = this.a;
        sparseArray.remove(getId());
        super.setId(i);
        sparseArray.put(getId(), this);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new cqe(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) throws XmlPullParserException, IOException, NumberFormatException {
        super(context, attributeSet);
        this.a = new SparseArray();
        this.b = new ArrayList(4);
        this.c = new cpe();
        this.d = 0;
        this.e = 0;
        this.j = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.k = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.f = true;
        this.g = 257;
        this.h = null;
        this.l = -1;
        this.m = new HashMap();
        this.n = new SparseArray();
        this.i = new cqf(this, this);
        e(attributeSet, 0, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) throws XmlPullParserException, IOException, NumberFormatException {
        super(context, attributeSet, i);
        this.a = new SparseArray();
        this.b = new ArrayList(4);
        this.c = new cpe();
        this.d = 0;
        this.e = 0;
        this.j = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.k = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.f = true;
        this.g = 257;
        this.h = null;
        this.l = -1;
        this.m = new HashMap();
        this.n = new SparseArray();
        this.i = new cqf(this, this);
        e(attributeSet, i, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i, int i2) throws XmlPullParserException, IOException, NumberFormatException {
        super(context, attributeSet, i, i2);
        this.a = new SparseArray();
        this.b = new ArrayList(4);
        this.c = new cpe();
        this.d = 0;
        this.e = 0;
        this.j = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.k = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.f = true;
        this.g = 257;
        this.h = null;
        this.l = -1;
        this.m = new HashMap();
        this.n = new SparseArray();
        this.i = new cqf(this, this);
        e(attributeSet, i, i2);
    }
}

package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import defpackage.aac;
import defpackage.aag;
import defpackage.aah;
import defpackage.yn;
import defpackage.yo;
import defpackage.yr;
import defpackage.zp;
import defpackage.zr;
import defpackage.zs;
import defpackage.zv;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    private static aah h;
    final SparseArray a;
    public final ArrayList b;
    protected final yo c;
    protected boolean d;
    public int e;
    public aac f;
    final zs g;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private HashMap n;
    private final SparseArray o;

    public ConstraintLayout(Context context) throws XmlPullParserException, IOException, NumberFormatException {
        super(context);
        this.a = new SparseArray();
        this.b = new ArrayList(4);
        this.c = new yo();
        this.i = 0;
        this.j = 0;
        this.k = Integer.MAX_VALUE;
        this.l = Integer.MAX_VALUE;
        this.d = true;
        this.e = 257;
        this.f = null;
        this.m = -1;
        this.n = new HashMap();
        this.o = new SparseArray();
        this.g = new zs(this, this);
        e(null, 0, 0);
    }

    private final void e(AttributeSet attributeSet, int i, int i2) throws XmlPullParserException, IOException, NumberFormatException {
        yo yoVar = this.c;
        yoVar.ah = this;
        zs zsVar = this.g;
        yoVar.aI = zsVar;
        yoVar.b.g = zsVar;
        this.a.put(getId(), this);
        this.f = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, aag.b, i, i2);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i3);
                if (index == 16) {
                    this.i = typedArrayObtainStyledAttributes.getDimensionPixelOffset(16, this.i);
                } else if (index == 17) {
                    this.j = typedArrayObtainStyledAttributes.getDimensionPixelOffset(17, this.j);
                } else if (index == 14) {
                    this.k = typedArrayObtainStyledAttributes.getDimensionPixelOffset(14, this.k);
                } else if (index == 15) {
                    this.l = typedArrayObtainStyledAttributes.getDimensionPixelOffset(15, this.l);
                } else if (index == 113) {
                    this.e = typedArrayObtainStyledAttributes.getInt(113, this.e);
                } else if (index == 56) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(56, 0);
                    if (resourceId != 0) {
                        try {
                            zv.a(getContext(), resourceId, new SparseArray(), new SparseArray());
                        } catch (Resources.NotFoundException unused) {
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(34, 0);
                    try {
                        aac aacVar = new aac();
                        this.f = aacVar;
                        aacVar.e(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f = null;
                    }
                    this.m = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.c.M(this.e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:256:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x04ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void f() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1312
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.f():void");
    }

    private final void g(yn ynVar, zr zrVar, SparseArray sparseArray, int i, int i2) {
        View view = (View) this.a.get(i);
        yn ynVar2 = (yn) sparseArray.get(i);
        if (ynVar2 == null || view == null || !(view.getLayoutParams() instanceof zr)) {
            return;
        }
        zrVar.ag = true;
        if (i2 == 6) {
            zr zrVar2 = (zr) view.getLayoutParams();
            zrVar2.ag = true;
            zrVar2.av.G = true;
        }
        ynVar.K(6).j(ynVar2.K(i2), zrVar.D, zrVar.C);
        ynVar.G = true;
        ynVar.K(3).d();
        ynVar.K(5).d();
    }

    public static aah getSharedValues() {
        if (h == null) {
            h = new aah();
        }
        return h;
    }

    public final View a(int i) {
        return (View) this.a.get(i);
    }

    public final yn b(View view) {
        if (view == this) {
            return this.c;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof zr) {
            return ((zr) view.getLayoutParams()).av;
        }
        view.setLayoutParams(new zr(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof zr) {
            return ((zr) view.getLayoutParams()).av;
        }
        return null;
    }

    protected final boolean c() {
        return (getContext().getApplicationInfo().flags & 4194304) != 0 && getLayoutDirection() == 1;
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof zr;
    }

    public final Object d(Object obj) {
        HashMap map;
        if ((obj instanceof String) && (map = this.n) != null && map.containsKey(obj)) {
            return this.n.get(obj);
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

    @Override // android.view.View
    public final void forceLayout() {
        this.d = true;
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    protected final /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new zr(-2, -2);
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new zr(getContext(), attributeSet);
    }

    public int getMaxHeight() {
        return this.l;
    }

    public int getMaxWidth() {
        return this.k;
    }

    public int getMinHeight() {
        return this.j;
    }

    public int getMinWidth() {
        return this.i;
    }

    public int getOptimizationLevel() {
        return this.c.az;
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        yo yoVar = this.c;
        if (yoVar.m == null) {
            int id2 = getId();
            if (id2 != -1) {
                yoVar.m = getContext().getResources().getResourceEntryName(id2);
            } else {
                yoVar.m = "parent";
            }
        }
        if (yoVar.aj == null) {
            yoVar.aj = yoVar.m;
            Log.v("ConstraintLayout", " setDebugName ".concat(String.valueOf(yoVar.aj)));
        }
        ArrayList arrayList = yoVar.aJ;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            yn ynVar = (yn) arrayList.get(i);
            Object obj = ynVar.ah;
            if (obj != null) {
                if (ynVar.m == null && (id = ((View) obj).getId()) != -1) {
                    ynVar.m = getContext().getResources().getResourceEntryName(id);
                }
                if (ynVar.aj == null) {
                    ynVar.aj = ynVar.m;
                    Log.v("ConstraintLayout", " setDebugName ".concat(String.valueOf(ynVar.aj)));
                }
            }
        }
        yoVar.q(sb);
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onLayout(boolean r6, int r7, int r8, int r9, int r10) {
        /*
            r5 = this;
            int r6 = r5.getChildCount()
            boolean r7 = r5.isInEditMode()
            r8 = 0
            r9 = r8
        La:
            if (r9 >= r6) goto L59
            android.view.View r10 = r5.getChildAt(r9)
            android.view.ViewGroup$LayoutParams r0 = r10.getLayoutParams()
            zr r0 = (defpackage.zr) r0
            yn r1 = r0.av
            int r2 = r10.getVisibility()
            r3 = 8
            if (r2 != r3) goto L2d
            boolean r2 = r0.ah
            if (r2 != 0) goto L2d
            boolean r2 = r0.ai
            if (r2 != 0) goto L2d
            boolean r2 = r0.ak
            if (r7 != 0) goto L2d
            goto L56
        L2d:
            boolean r0 = r0.aj
            int r0 = r1.i()
            int r2 = r1.j()
            int r3 = r1.h()
            int r3 = r3 + r0
            int r1 = r1.g()
            int r1 = r1 + r2
            r10.layout(r0, r2, r3, r1)
            boolean r4 = r10 instanceof defpackage.aae
            if (r4 == 0) goto L56
            aae r10 = (defpackage.aae) r10
            android.view.View r10 = r10.getContent()
            if (r10 == 0) goto L56
            r10.setVisibility(r8)
            r10.layout(r0, r2, r3, r1)
        L56:
            int r9 = r9 + 1
            goto La
        L59:
            java.util.ArrayList r6 = r5.b
            int r7 = r6.size()
            if (r7 <= 0) goto L6f
        L61:
            if (r8 >= r7) goto L6f
            java.lang.Object r9 = r6.get(r8)
            zp r9 = (defpackage.zp) r9
            r9.k()
            int r8 = r8 + 1
            goto L61
        L6f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x021c A[PHI: r6 r13
  0x021c: PHI (r6v6 boolean) = (r6v5 boolean), (r6v41 boolean) binds: [B:75:0x01bd, B:401:0x021c] A[DONT_GENERATE, DONT_INLINE]
  0x021c: PHI (r13v13 int) = (r13v12 int), (r13v55 int) binds: [B:75:0x01bd, B:401:0x021c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x022f A[PHI: r7
  0x022f: PHI (r7v1 int) = (r7v0 int), (r7v46 int) binds: [B:104:0x0222, B:106:0x0226] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x05a4  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x05a9  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0748  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x0785  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x0788  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01bf  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onMeasure(int r31, int r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1933
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        boolean z = view instanceof Guideline;
        yn ynVarB = b(view);
        if (z && !(ynVarB instanceof yr)) {
            zr zrVar = (zr) view.getLayoutParams();
            zrVar.av = new yr();
            zrVar.ah = true;
            ((yr) zrVar.av).c(zrVar.Z);
        }
        if (view instanceof zp) {
            zp zpVar = (zp) view;
            zpVar.j();
            ((zr) view.getLayoutParams()).ai = true;
            ArrayList arrayList = this.b;
            if (!arrayList.contains(zpVar)) {
                arrayList.add(zpVar);
            }
        }
        this.a.put(view.getId(), view);
        this.d = true;
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.a.remove(view.getId());
        this.c.P(b(view));
        this.b.remove(view);
        this.d = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.d = true;
        super.requestLayout();
    }

    @Override // android.view.View
    public void setId(int i) {
        SparseArray sparseArray = this.a;
        sparseArray.remove(getId());
        super.setId(i);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.l) {
            return;
        }
        this.l = i;
        this.d = true;
        super.requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.k) {
            return;
        }
        this.k = i;
        this.d = true;
        super.requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.j) {
            return;
        }
        this.j = i;
        this.d = true;
        super.requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.i) {
            return;
        }
        this.i = i;
        this.d = true;
        super.requestLayout();
    }

    public void setOptimizationLevel(int i) {
        this.e = i;
        this.c.M(i);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new zr(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) throws XmlPullParserException, IOException, NumberFormatException {
        super(context, attributeSet);
        this.a = new SparseArray();
        this.b = new ArrayList(4);
        this.c = new yo();
        this.i = 0;
        this.j = 0;
        this.k = Integer.MAX_VALUE;
        this.l = Integer.MAX_VALUE;
        this.d = true;
        this.e = 257;
        this.f = null;
        this.m = -1;
        this.n = new HashMap();
        this.o = new SparseArray();
        this.g = new zs(this, this);
        e(attributeSet, 0, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) throws XmlPullParserException, IOException, NumberFormatException {
        super(context, attributeSet, i);
        this.a = new SparseArray();
        this.b = new ArrayList(4);
        this.c = new yo();
        this.i = 0;
        this.j = 0;
        this.k = Integer.MAX_VALUE;
        this.l = Integer.MAX_VALUE;
        this.d = true;
        this.e = 257;
        this.f = null;
        this.m = -1;
        this.n = new HashMap();
        this.o = new SparseArray();
        this.g = new zs(this, this);
        e(attributeSet, i, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i, int i2) throws XmlPullParserException, IOException, NumberFormatException {
        super(context, attributeSet, i, i2);
        this.a = new SparseArray();
        this.b = new ArrayList(4);
        this.c = new yo();
        this.i = 0;
        this.j = 0;
        this.k = Integer.MAX_VALUE;
        this.l = Integer.MAX_VALUE;
        this.d = true;
        this.e = 257;
        this.f = null;
        this.m = -1;
        this.n = new HashMap();
        this.o = new SparseArray();
        this.g = new zs(this, this);
        e(attributeSet, i, i2);
    }
}

package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cqc extends View {
    public int[] c;
    public int d;
    protected final Context e;
    public String f;
    protected String g;
    public final HashMap h;
    public cpi i;

    public cqc(Context context) {
        super(context);
        this.c = new int[32];
        this.h = new HashMap();
        this.e = context;
        a(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void b(java.lang.String r6) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException {
        /*
            r5 = this;
            if (r6 == 0) goto L82
            int r0 = r6.length()
            if (r0 != 0) goto La
            goto L82
        La:
            android.content.Context r0 = r5.e
            if (r0 == 0) goto L82
            java.lang.String r6 = r6.trim()
            android.view.ViewParent r0 = r5.getParent()
            boolean r0 = r0 instanceof androidx.constraintlayout.widget.ConstraintLayout
            r1 = 0
            if (r0 == 0) goto L22
            android.view.ViewParent r0 = r5.getParent()
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            goto L23
        L22:
            r0 = r1
        L23:
            boolean r2 = r5.isInEditMode()
            r3 = 0
            if (r2 == 0) goto L3b
            if (r0 == 0) goto L3b
            java.lang.Object r2 = r0.d(r6)
            boolean r4 = r2 instanceof java.lang.Integer
            if (r4 == 0) goto L3b
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            goto L3c
        L3b:
            r2 = r3
        L3c:
            if (r2 != 0) goto L46
            if (r0 == 0) goto L45
            int r2 = r5.d(r0, r6)
            goto L46
        L45:
            r2 = r3
        L46:
            if (r2 != 0) goto L53
            java.lang.Class<cqq> r0 = defpackage.cqq.class
            java.lang.reflect.Field r0 = r0.getField(r6)     // Catch: java.lang.Exception -> L54
            int r3 = r0.getInt(r1)     // Catch: java.lang.Exception -> L54
            goto L54
        L53:
            r3 = r2
        L54:
            if (r3 != 0) goto L66
            android.content.Context r0 = r5.e
            android.content.res.Resources r1 = r0.getResources()
            java.lang.String r2 = "id"
            java.lang.String r0 = r0.getPackageName()
            int r3 = r1.getIdentifier(r6, r2, r0)
        L66:
            if (r3 == 0) goto L75
            java.util.HashMap r0 = r5.h
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            r0.put(r1, r6)
            r5.m(r3)
            return
        L75:
            java.lang.String r0 = "Could not find id of \""
            java.lang.String r1 = "\""
            java.lang.String r6 = defpackage.a.cg(r6, r0, r1)
            java.lang.String r0 = "ConstraintHelper"
            android.util.Log.w(r0, r6)
        L82:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqc.b(java.lang.String):void");
    }

    private final void m(int i) {
        if (i == getId()) {
            return;
        }
        int i2 = this.d + 1;
        int[] iArr = this.c;
        int length = iArr.length;
        if (i2 > length) {
            this.c = Arrays.copyOf(iArr, length + length);
        }
        int[] iArr2 = this.c;
        int i3 = this.d;
        iArr2[i3] = i;
        this.d = i3 + 1;
    }

    private final void n(String str) {
        if (str == null || str.length() == 0 || this.e == null) {
            return;
        }
        String strTrim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof cqe) && strTrim.equals(((cqe) layoutParams).ac)) {
                if (childAt.getId() == -1) {
                    Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                } else {
                    m(childAt.getId());
                }
            }
        }
    }

    protected void a(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, cqr.b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 35) {
                    String string = typedArrayObtainStyledAttributes.getString(35);
                    this.f = string;
                    h(string);
                } else if (index == 36) {
                    String string2 = typedArrayObtainStyledAttributes.getString(36);
                    this.g = string2;
                    i(string2);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final int d(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String resourceEntryName;
        if (str != null && (resources = this.e.getResources()) != null) {
            int childCount = constraintLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = constraintLayout.getChildAt(i);
                if (childAt.getId() != -1) {
                    try {
                        resourceEntryName = resources.getResourceEntryName(childAt.getId());
                    } catch (Resources.NotFoundException unused) {
                        resourceEntryName = null;
                    }
                    if (str.equals(resourceEntryName)) {
                        return childAt.getId();
                    }
                }
            }
        }
        return 0;
    }

    protected final void e() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        f((ConstraintLayout) parent);
    }

    protected void f(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i = 0; i < this.d; i++) {
            View viewA = constraintLayout.a(this.c[i]);
            if (viewA != null) {
                viewA.setVisibility(visibility);
                if (elevation > 0.0f) {
                    viewA.setTranslationZ(viewA.getTranslationZ() + elevation);
                }
            }
        }
    }

    public final void h(String str) {
        this.f = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.d = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                b(str.substring(i));
                return;
            } else {
                b(str.substring(i, iIndexOf));
                i = iIndexOf + 1;
            }
        }
    }

    protected final void i(String str) {
        this.g = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.d = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                n(str.substring(i));
                return;
            } else {
                n(str.substring(i, iIndexOf));
                i = iIndexOf + 1;
            }
        }
    }

    public final void j(int[] iArr) {
        this.f = null;
        this.d = 0;
        for (int i : iArr) {
            m(i);
        }
    }

    public final void k() {
        if (this.i == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof cqe) {
            ((cqe) layoutParams).av = this.i;
        }
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f;
        if (str != null) {
            h(str);
        }
        String str2 = this.g;
        if (str2 != null) {
            i(str2);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void setTag(int i, Object obj) {
        super.setTag(i, obj);
        if (obj == null && this.f == null) {
            m(i);
        }
    }

    public cqc(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = new int[32];
        this.h = new HashMap();
        this.e = context;
        a(attributeSet);
    }

    public cqc(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = new int[32];
        this.h = new HashMap();
        this.e = context;
        a(attributeSet);
    }

    public void l() {
    }

    protected void g(ConstraintLayout constraintLayout) {
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    public void c(cpd cpdVar, boolean z) {
    }
}

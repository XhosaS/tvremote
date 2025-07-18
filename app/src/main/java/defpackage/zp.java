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
public class zp extends View {
    public int[] b;
    public int c;
    protected final Context d;
    public String e;
    protected String f;
    public final HashMap g;
    public ys h;

    public zp(Context context) {
        super(context);
        this.b = new int[32];
        this.g = new HashMap();
        this.d = context;
        a(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void l(java.lang.String r6) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException {
        /*
            r5 = this;
            if (r6 == 0) goto L82
            int r0 = r6.length()
            if (r0 != 0) goto La
            goto L82
        La:
            android.content.Context r0 = r5.d
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
            int r2 = r5.c(r0, r6)
            goto L46
        L45:
            r2 = r3
        L46:
            if (r2 != 0) goto L53
            java.lang.Class<aaf> r0 = defpackage.aaf.class
            java.lang.reflect.Field r0 = r0.getField(r6)     // Catch: java.lang.Exception -> L54
            int r3 = r0.getInt(r1)     // Catch: java.lang.Exception -> L54
            goto L54
        L53:
            r3 = r2
        L54:
            if (r3 != 0) goto L66
            android.content.Context r0 = r5.d
            android.content.res.Resources r1 = r0.getResources()
            java.lang.String r2 = "id"
            java.lang.String r0 = r0.getPackageName()
            int r3 = r1.getIdentifier(r6, r2, r0)
        L66:
            if (r3 == 0) goto L75
            java.util.HashMap r0 = r5.g
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            r0.put(r1, r6)
            r5.m(r3)
            return
        L75:
            java.lang.String r0 = "Could not find id of \""
            java.lang.String r1 = "\""
            java.lang.String r6 = defpackage.a.e(r6, r0, r1)
            java.lang.String r0 = "ConstraintHelper"
            android.util.Log.w(r0, r6)
        L82:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zp.l(java.lang.String):void");
    }

    private final void m(int i) {
        if (i == getId()) {
            return;
        }
        int i2 = this.c + 1;
        int[] iArr = this.b;
        int length = iArr.length;
        if (i2 > length) {
            this.b = Arrays.copyOf(iArr, length + length);
        }
        int[] iArr2 = this.b;
        int i3 = this.c;
        iArr2[i3] = i;
        this.c = i3 + 1;
    }

    private final void n(String str) {
        if (str == null || str.length() == 0 || this.d == null) {
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
            if ((layoutParams instanceof zr) && strTrim.equals(((zr) layoutParams).ac)) {
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
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, aag.b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 35) {
                    String string = typedArrayObtainStyledAttributes.getString(35);
                    this.e = string;
                    g(string);
                } else if (index == 36) {
                    String string2 = typedArrayObtainStyledAttributes.getString(36);
                    this.f = string2;
                    h(string2);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final int c(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String resourceEntryName;
        if (str != null && (resources = this.d.getResources()) != null) {
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

    protected final void d() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        e((ConstraintLayout) parent);
    }

    protected final void e(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i = 0; i < this.c; i++) {
            View viewA = constraintLayout.a(this.b[i]);
            if (viewA != null) {
                viewA.setVisibility(visibility);
                if (elevation > 0.0f) {
                    viewA.setTranslationZ(viewA.getTranslationZ() + elevation);
                }
            }
        }
    }

    public final void g(String str) {
        this.e = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.c = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                l(str.substring(i));
                return;
            } else {
                l(str.substring(i, iIndexOf));
                i = iIndexOf + 1;
            }
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.b, this.c);
    }

    protected final void h(String str) {
        this.f = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.c = 0;
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

    public final void i(int[] iArr) {
        this.e = null;
        this.c = 0;
        for (int i : iArr) {
            m(i);
        }
    }

    public final void j() {
        if (this.h == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof zr) {
            ((zr) layoutParams).av = this.h;
        }
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.e;
        if (str != null) {
            g(str);
        }
        String str2 = this.f;
        if (str2 != null) {
            h(str2);
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void setTag(int i, Object obj) {
        super.setTag(i, obj);
        if (obj == null && this.e == null) {
            m(i);
        }
    }

    public zp(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new int[32];
        this.g = new HashMap();
        this.d = context;
        a(attributeSet);
    }

    public zp(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = new int[32];
        this.g = new HashMap();
        this.d = context;
        a(attributeSet);
    }

    public void k() {
    }

    protected void f(ConstraintLayout constraintLayout) {
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    public void b(yn ynVar, boolean z) {
    }
}

package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.widget.ActivityChooserView;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ors {
    protected final View a;
    private final Integer b;
    private final Integer c;
    private final Integer d;
    private final Integer e;
    private final Integer f;
    private final Integer g;
    private final Integer h;
    private final Integer i;
    private final Integer j;
    private final Integer k;
    private final int l;

    static {
        ory.a(ors.class);
    }

    public ors(Context context, AttributeSet attributeSet, View view) {
        this.a = view;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, orf.e);
        this.b = b(typedArrayObtainStyledAttributes, 0);
        this.c = b(typedArrayObtainStyledAttributes, 1);
        this.d = b(typedArrayObtainStyledAttributes, 3);
        this.e = b(typedArrayObtainStyledAttributes, 2);
        this.i = b(typedArrayObtainStyledAttributes, 7);
        this.f = b(typedArrayObtainStyledAttributes, 4);
        this.g = b(typedArrayObtainStyledAttributes, 6);
        this.h = b(typedArrayObtainStyledAttributes, 5);
        this.k = b(typedArrayObtainStyledAttributes, 9);
        this.j = b(typedArrayObtainStyledAttributes, 8);
        this.l = typedArrayObtainStyledAttributes.getInteger(10, 8);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static ort a(TypedArray typedArray, int i) {
        int resourceId = typedArray.getResourceId(i, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
        if (resourceId == Integer.MAX_VALUE) {
            return null;
        }
        return new ort(resourceId);
    }

    public static Integer b(TypedArray typedArray, int i) {
        int resourceId = typedArray.getResourceId(i, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
        if (resourceId == Integer.MAX_VALUE) {
            return null;
        }
        return Integer.valueOf(resourceId);
    }

    private static int d(Integer num, Integer num2, boolean z) {
        if (num == null) {
            return -1;
        }
        int iIntValue = num2.intValue();
        if (!z) {
            return iIntValue;
        }
        if (iIntValue == 0) {
            return num2.intValue();
        }
        return 0;
    }

    public final void c() {
        Integer num = 0;
        if (this.b != null) {
            this.a.setBackgroundResource(0);
        }
        if (this.c != null) {
            this.a.setContentDescription(null);
        }
        if (this.d != null) {
            View view = this.a;
            int[] iArr = cww.a;
            view.setImportantForAccessibility(0);
        }
        if (this.e != null) {
            this.a.setEnabled(false);
        }
        Integer num2 = this.f;
        Integer numValueOf = Integer.valueOf(this.l);
        int iD = d(num2, numValueOf, true);
        if (iD >= 0) {
            this.a.setVisibility(iD);
        }
        if (this.g != null) {
            this.a.setMinimumHeight(num.intValue());
        }
        if (this.h != null) {
            View view2 = this.a;
            if (view2.getLayoutParams() instanceof LinearLayout.LayoutParams) {
                ((LinearLayout.LayoutParams) view2.getLayoutParams()).weight = num.intValue();
            }
        }
        if (this.i != null) {
            View view3 = this.a;
            view3.setOnClickListener(null);
            view3.setClickable(false);
        }
        if (this.j != null) {
            this.a.setTransitionName(null);
        }
        int iD2 = d(this.k, numValueOf, false);
        if (iD2 >= 0) {
            this.a.setVisibility(iD2);
        }
    }
}

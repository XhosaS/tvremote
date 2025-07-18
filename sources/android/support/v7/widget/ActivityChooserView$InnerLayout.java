package android.support.v7.widget;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import defpackage.aps;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ActivityChooserView$InnerLayout extends LinearLayout {
    private static final int[] a = {R.attr.background};

    public ActivityChooserView$InnerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        aps apsVarQ = aps.q(context, attributeSet, a);
        setBackgroundDrawable(apsVarQ.i(0));
        apsVarQ.m();
    }
}

package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.videos.R;
import defpackage.glh;
import defpackage.swt;
import defpackage.swu;
import defpackage.swv;
import defpackage.sxa;
import defpackage.sxf;
import defpackage.sxg;
import defpackage.sxi;
import defpackage.sxp;
import defpackage.sxq;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class CircularProgressIndicator extends swt<sxg> {
    public CircularProgressIndicator(Context context) {
        this(context, null);
    }

    @Override // defpackage.swt
    public final /* synthetic */ swu a(Context context, AttributeSet attributeSet) {
        return new sxg(context, attributeSet);
    }

    public CircularProgressIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.circularProgressIndicatorStyle);
    }

    public CircularProgressIndicator(Context context, AttributeSet attributeSet, int i) {
        sxp sxaVar;
        super(context, attributeSet, i, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        swv swvVar = new swv((sxg) this.a);
        Context context2 = getContext();
        sxg sxgVar = (sxg) this.a;
        if (sxgVar.o == 1) {
            sxaVar = new sxf(context2, sxgVar);
        } else {
            sxaVar = new sxa(sxgVar);
        }
        sxq sxqVar = new sxq(context2, sxgVar, swvVar, sxaVar);
        sxqVar.c = glh.b(context2.getResources(), R.drawable.indeterminate_static, null);
        setIndeterminateDrawable(sxqVar);
        setProgressDrawable(new sxi(getContext(), (sxg) this.a, swvVar));
    }
}

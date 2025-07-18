package com.google.android.libraries.tv.widgets.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.agvy;
import defpackage.hgx;
import defpackage.hhd;
import defpackage.hrd;
import defpackage.hrw;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class FocusListenerConstraintLayout extends ConstraintLayout {
    public hgx h;

    public FocusListenerConstraintLayout(Context context) {
        this(context, null, 0, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        hgx hgxVar = this.h;
        if (hgxVar != null) {
            hhd hhdVar = hgxVar.a;
            hrw hrwVarF = hhdVar.F();
            ViewGroup viewGroup = null;
            if (true != (hrwVarF instanceof hrd)) {
                hrwVarF = null;
            }
            if (hrwVarF != null) {
                FocusListenerConstraintLayout focusListenerConstraintLayout = hhdVar.m;
                if (focusListenerConstraintLayout == null) {
                    agvy.b("main");
                    focusListenerConstraintLayout = null;
                }
                View focusedChild = focusListenerConstraintLayout.getFocusedChild();
                ViewGroup viewGroup2 = hhdVar.k;
                if (viewGroup2 == null) {
                    agvy.b("fullScreenContainer");
                } else {
                    viewGroup = viewGroup2;
                }
                hrwVarF.O(agvy.c(focusedChild, viewGroup));
            }
        }
    }

    public FocusListenerConstraintLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0);
    }

    public FocusListenerConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public FocusListenerConstraintLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}

package com.google.android.material.search;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.cqv;
import defpackage.sym;
import defpackage.sys;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class SearchView$Behavior extends cqv<sys> {
    public SearchView$Behavior() {
    }

    @Override // defpackage.cqv
    public final /* bridge */ /* synthetic */ void k(CoordinatorLayout coordinatorLayout, View view, View view2) throws Resources.NotFoundException {
        sys sysVar = (sys) view;
        if (sysVar.o == null && (view2 instanceof sym)) {
            sysVar.m((sym) view2);
        }
    }

    public SearchView$Behavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}

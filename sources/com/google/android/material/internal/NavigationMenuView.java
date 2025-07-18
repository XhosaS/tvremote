package com.google.android.material.internal;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import defpackage.du;
import defpackage.ei;

/* compiled from: PG */
/* loaded from: classes.dex */
public class NavigationMenuView extends RecyclerView implements ei {
    public NavigationMenuView(Context context) {
        this(context, null);
    }

    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        P(new LinearLayoutManager());
    }

    @Override // defpackage.ei
    public final void a(du duVar) {
    }
}

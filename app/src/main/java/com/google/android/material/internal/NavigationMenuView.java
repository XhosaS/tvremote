package com.google.android.material.internal;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import defpackage.jj;
import defpackage.jy;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class NavigationMenuView extends RecyclerView implements jy {
    public NavigationMenuView(Context context) {
        this(context, null);
    }

    public int getWindowAnimations() {
        return 0;
    }

    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ai(new LinearLayoutManager(1));
    }

    @Override // defpackage.jy
    public final void a(jj jjVar) {
    }
}

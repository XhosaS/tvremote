package com.google.android.material.internal;

import android.content.Context;
import android.support.v7.view.menu.MenuView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import defpackage.fb;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class NavigationMenuView extends RecyclerView implements MenuView {
    public NavigationMenuView(Context context) {
        this(context, null);
    }

    @Override // android.support.v7.view.menu.MenuView
    public final int getWindowAnimations() {
        return 0;
    }

    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setLayoutManager(new LinearLayoutManager(context, 1, false));
    }

    @Override // android.support.v7.view.menu.MenuView
    public final void initialize(fb fbVar) {
    }
}

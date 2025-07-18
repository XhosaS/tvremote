package com.google.android.libraries.bind.layout;

import android.support.v7.widget.RecyclerView;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.libraries.flowlayoutmanager.FlowLayoutManager;
import defpackage.cyu;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class BindLayoutManager extends FlowLayoutManager {
    @Override // com.google.android.libraries.flowlayoutmanager.FlowLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public final void onInitializeAccessibilityEvent(RecyclerView.Recycler recycler, RecyclerView.State state, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(recycler, state, accessibilityEvent);
        new cyu(accessibilityEvent).a();
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public final boolean supportsPredictiveItemAnimations() {
        return false;
    }
}

package com.google.android.apps.play.movies.mobile.view.ui;

import android.support.v7.widget.RecyclerView;
import com.google.android.play.layout.FlowLayoutManager;
import defpackage.krd;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class DebugFlowLayoutManager extends FlowLayoutManager {
    private final String b;

    public DebugFlowLayoutManager(String str) {
        this.b = str;
    }

    private final void a(RuntimeException runtimeException) {
        krd.b("FLM(" + this.b + ") encountered " + runtimeException.getClass().getSimpleName() + ": " + runtimeException.getMessage());
    }

    @Override // com.google.android.play.layout.FlowLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public final void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        try {
            super.onLayoutChildren(recycler, state);
        } catch (RuntimeException e) {
            a(e);
            throw e;
        }
    }

    @Override // com.google.android.play.layout.FlowLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public final int scrollVerticallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        try {
            return super.scrollVerticallyBy(i, recycler, state);
        } catch (RuntimeException e) {
            a(e);
            throw e;
        }
    }
}

package com.google.android.libraries.play.movies.symbian.recyclerview;

import android.content.Context;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import defpackage.scu;
import defpackage.sdc;
import defpackage.sdd;
import defpackage.sdh;
import defpackage.yks;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ModelAwareRecyclerView extends RecyclerView {
    private sdh a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ModelAwareRecyclerView(Context context) {
        this(context, null);
        context.getClass();
    }

    public sdc a() {
        return new sdc(null);
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof scu)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        scu scuVar = (scu) parcelable;
        sdh sdhVar = scuVar.b;
        if (sdhVar == null) {
            sdhVar = this.a;
        }
        this.a = sdhVar;
        RecyclerView.Adapter adapter = getAdapter();
        sdc sdcVar = adapter instanceof sdc ? (sdc) adapter : null;
        if (sdcVar != null) {
            sdcVar.e(this.a);
            requestLayout();
        }
        super.onRestoreInstanceState(scuVar.a);
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.View
    protected final Parcelable onSaveInstanceState() {
        scu scuVar = new scu(super.onSaveInstanceState());
        RecyclerView.Adapter adapter = getAdapter();
        sdh sdhVar = null;
        sdc sdcVar = adapter instanceof sdc ? (sdc) adapter : null;
        if (sdcVar != null) {
            RecyclerView recyclerView = sdcVar.b;
            if (recyclerView == null) {
                yks.c("recyclerView");
                recyclerView = null;
            }
            int childCount = recyclerView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                RecyclerView recyclerView2 = sdcVar.b;
                if (recyclerView2 == null) {
                    yks.c("recyclerView");
                    recyclerView2 = null;
                }
                RecyclerView recyclerView3 = sdcVar.b;
                if (recyclerView3 == null) {
                    yks.c("recyclerView");
                    recyclerView3 = null;
                }
                RecyclerView.ViewHolder childViewHolder = recyclerView2.getChildViewHolder(recyclerView3.getChildAt(i));
                sdd sddVar = childViewHolder instanceof sdd ? (sdd) childViewHolder : null;
                if (sddVar != null && sddVar.b()) {
                    sdcVar.c.a(sddVar);
                }
            }
            sdhVar = sdcVar.c;
        }
        scuVar.b = sdhVar;
        return scuVar;
    }

    @Override // android.support.v7.widget.RecyclerView
    public void setAdapter(RecyclerView.Adapter<?> adapter) {
        super.setAdapter(adapter);
        sdc sdcVar = adapter instanceof sdc ? (sdc) adapter : null;
        if (sdcVar != null) {
            sdcVar.e(this.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModelAwareRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.a = new sdh();
    }
}

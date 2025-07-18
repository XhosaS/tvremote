package com.google.android.libraries.onegoogle.accountmenu.bento.viewbindings.cards;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SimpleItemAnimator;
import android.util.AttributeSet;
import com.google.android.libraries.onegoogle.accountmenu.bento.common.BentoRecyclerView;
import com.google.android.videos.R;
import defpackage.sip;
import defpackage.ssp;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class CardStackRecyclerView extends BentoRecyclerView {

    /* compiled from: PG */
    public final class LayoutManagerWithoutAccessibilityIndication extends LinearLayoutManager {
        public LayoutManagerWithoutAccessibilityIndication(Context context) {
            super(context);
        }

        @Override // android.support.v7.widget.RecyclerView.LayoutManager
        public final int getRowCountForAccessibility(RecyclerView.Recycler recycler, RecyclerView.State state) {
            recycler.getClass();
            state.getClass();
            return 0;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardStackRecyclerView(Context context) {
        super(context);
        context.getClass();
        ssp sspVar = new ssp(getContext());
        sspVar.a(sip.d(getContext(), R.attr.colorSurfaceContainer, 0));
        sspVar.b = false;
        sspVar.a = getContext().getResources().getDimensionPixelSize(R.dimen.og_bento_card_stack_divider_width);
        addItemDecoration(sspVar);
        Context context2 = getContext();
        context2.getClass();
        setLayoutManager(new LayoutManagerWithoutAccessibilityIndication(context2));
        setNestedScrollingEnabled(false);
        RecyclerView.ItemAnimator itemAnimator = getItemAnimator();
        SimpleItemAnimator simpleItemAnimator = itemAnimator instanceof SimpleItemAnimator ? (SimpleItemAnimator) itemAnimator : null;
        if (simpleItemAnimator != null) {
            simpleItemAnimator.setSupportsChangeAnimations(false);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardStackRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        ssp sspVar = new ssp(getContext());
        sspVar.a(sip.d(getContext(), R.attr.colorSurfaceContainer, 0));
        sspVar.b = false;
        sspVar.a = getContext().getResources().getDimensionPixelSize(R.dimen.og_bento_card_stack_divider_width);
        addItemDecoration(sspVar);
        Context context2 = getContext();
        context2.getClass();
        setLayoutManager(new LayoutManagerWithoutAccessibilityIndication(context2));
        setNestedScrollingEnabled(false);
        RecyclerView.ItemAnimator itemAnimator = getItemAnimator();
        SimpleItemAnimator simpleItemAnimator = itemAnimator instanceof SimpleItemAnimator ? (SimpleItemAnimator) itemAnimator : null;
        if (simpleItemAnimator != null) {
            simpleItemAnimator.setSupportsChangeAnimations(false);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardStackRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        ssp sspVar = new ssp(getContext());
        sspVar.a(sip.d(getContext(), R.attr.colorSurfaceContainer, 0));
        sspVar.b = false;
        sspVar.a = getContext().getResources().getDimensionPixelSize(R.dimen.og_bento_card_stack_divider_width);
        addItemDecoration(sspVar);
        Context context2 = getContext();
        context2.getClass();
        setLayoutManager(new LayoutManagerWithoutAccessibilityIndication(context2));
        setNestedScrollingEnabled(false);
        RecyclerView.ItemAnimator itemAnimator = getItemAnimator();
        SimpleItemAnimator simpleItemAnimator = itemAnimator instanceof SimpleItemAnimator ? (SimpleItemAnimator) itemAnimator : null;
        if (simpleItemAnimator != null) {
            simpleItemAnimator.setSupportsChangeAnimations(false);
        }
    }
}

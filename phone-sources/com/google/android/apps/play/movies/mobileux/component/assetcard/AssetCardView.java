package com.google.android.apps.play.movies.mobileux.component.assetcard;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.libraries.play.widget.cardimageview.CardImageView;
import com.google.android.videos.R;
import defpackage.hjr;
import defpackage.hke;
import defpackage.htc;
import defpackage.hvc;
import defpackage.ieg;
import defpackage.krd;
import defpackage.muj;
import defpackage.nbo;
import defpackage.sij;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class AssetCardView extends LinearLayout implements nbo {
    private TextView a;
    private TextView b;
    private CardImageView c;

    public AssetCardView(Context context) {
        super(context);
    }

    @Override // defpackage.nbo
    public final /* synthetic */ void a(Object obj) {
        muj mujVar = (muj) obj;
        this.b.setVisibility(8);
        this.a.setVisibility(8);
        int iIntValue = ((Integer) mujVar.h.a()).intValue();
        float f = iIntValue / mujVar.i;
        Uri uri = mujVar.d;
        ViewGroup.LayoutParams layoutParams = this.c.getLayoutParams();
        layoutParams.height = (int) f;
        layoutParams.width = iIntValue;
        this.c.setLayoutParams(layoutParams);
        ((hke) hjr.c(getContext()).e(uri).g(htc.b()).h(hvc.d(R.color.play_movies_thumbnail_placeholder)).m()).k(this.c);
        ieg iegVar = mujVar.e;
        if (iegVar.m() && !sij.F((String) iegVar.g())) {
            this.a.setVisibility(0);
            this.a.setText((CharSequence) iegVar.g());
        }
        SpannableStringBuilder spannableStringBuilder = mujVar.f;
        if (TextUtils.isEmpty(spannableStringBuilder)) {
            this.b.setVisibility(8);
            return;
        }
        this.b.setVisibility(0);
        this.b.setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
        this.b.setContentDescription(mujVar.g);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (TextView) findViewById(R.id.title);
        this.b = (TextView) findViewById(R.id.subtitle_text);
        this.c = (CardImageView) findViewById(R.id.thumbnail_frame);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        boolean zPerformAccessibilityAction = super.performAccessibilityAction(i, bundle);
        if (!zPerformAccessibilityAction || i != 64) {
            return zPerformAccessibilityAction;
        }
        ViewParent parent = getParent();
        if (parent instanceof RecyclerView) {
            RecyclerView recyclerView = (RecyclerView) parent;
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            int decoratedLeft = layoutManager.getDecoratedLeft(this) - ((recyclerView.getWidth() - layoutManager.getDecoratedMeasuredWidth(this)) / 2);
            recyclerView.setTag(R.id.suppress_item_accessibility_event_tag, true);
            recyclerView.scrollBy(decoratedLeft, 0);
            recyclerView.setTag(R.id.suppress_item_accessibility_event_tag, null);
        }
        ViewParent parent2 = getParent();
        while (parent2 != 0) {
            ViewParent parent3 = parent2.getParent();
            if (!(parent3 instanceof View)) {
                break;
            }
            if ((parent3 instanceof RecyclerView) && ((RecyclerView) parent3).getLayoutManager().canScrollVertically()) {
                break;
            }
            parent2 = parent3;
        }
        if (parent2 == 0) {
            krd.c("Could not find parent that is a vertically scrolling RecyclerView");
        } else {
            RecyclerView recyclerView2 = (RecyclerView) parent2.getParent();
            RecyclerView.LayoutManager layoutManager2 = recyclerView2.getLayoutManager();
            View view = (View) parent2;
            int decoratedTop = layoutManager2.getDecoratedTop(view) - ((recyclerView2.getHeight() - layoutManager2.getDecoratedMeasuredHeight(view)) / 2);
            recyclerView2.setTag(R.id.suppress_item_accessibility_event_tag, true);
            recyclerView2.scrollBy(0, decoratedTop);
            recyclerView2.setTag(R.id.suppress_item_accessibility_event_tag, null);
        }
        return true;
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        Object parent = getParent();
        if (!(parent instanceof View) || ((View) parent).getTag(R.id.suppress_item_accessibility_event_tag) == null) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        }
    }

    public AssetCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AssetCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

package com.google.android.play.search;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import com.google.android.videos.R;
import defpackage.cur;
import defpackage.nay;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class PlaySearchToolbar extends Toolbar {
    private final Map a;
    public PlaySearch b;
    public PlaySearch c;
    public View d;
    public Drawable e;
    public cur f;
    public MenuItem g;
    public final int h;
    public int i;
    public Toolbar.LayoutParams j;
    private int k;
    private int l;
    private int m;
    private int n;

    public PlaySearchToolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new HashMap();
        Resources resources = getContext().getResources();
        this.h = resources.getDimensionPixelSize(R.dimen.play_search_toolbar_padding_top) + resources.getDimensionPixelSize(R.dimen.play_card_default_inset);
    }

    public static int a(Context context) {
        return context.getResources().getDimensionPixelSize(R.dimen.play_search_toolbar_height);
    }

    public final void b() {
        c(d());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(boolean r6) {
        /*
            r5 = this;
            android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
            if (r0 == 0) goto L6d
            if (r6 == 0) goto La
            r1 = -2
            goto L12
        La:
            android.content.Context r1 = r5.getContext()
            int r1 = a(r1)
        L12:
            r2 = 0
            if (r6 == 0) goto L17
            r3 = r2
            goto L1f
        L17:
            android.content.Context r3 = r5.getContext()
            int r3 = a(r3)
        L1f:
            int r4 = r0.height
            if (r4 != r1) goto L2b
            int[] r4 = defpackage.cww.a
            int r4 = r5.getMinimumHeight()
            if (r4 == r3) goto L30
        L2b:
            r0.height = r1
            r5.setMinimumHeight(r3)
        L30:
            if (r6 == 0) goto L60
            int[] r6 = defpackage.cww.a
            int r6 = r5.getPaddingStart()
            int r0 = r5.getPaddingEnd()
            if (r6 == 0) goto L40
            r5.k = r6
        L40:
            if (r0 == 0) goto L44
            r5.l = r0
        L44:
            int r6 = r5.getPaddingTop()
            if (r6 == 0) goto L50
            int r6 = r5.getPaddingTop()
            r5.m = r6
        L50:
            int r6 = r5.getPaddingBottom()
            if (r6 == 0) goto L5c
            int r6 = r5.getPaddingBottom()
            r5.n = r6
        L5c:
            r5.setPadding(r2, r2, r2, r2)
            return
        L60:
            int r6 = r5.k
            int r0 = r5.m
            int r1 = r5.l
            int r2 = r5.n
            int[] r3 = defpackage.cww.a
            r5.setPaddingRelative(r6, r0, r1, r2)
        L6d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.search.PlaySearchToolbar.c(boolean):void");
    }

    public final boolean d() {
        return hasExpandedActionView();
    }

    @Override // android.support.v7.widget.Toolbar, android.view.View
    protected final void onMeasure(int i, int i2) {
        if (d()) {
            if (hasExpandedActionView()) {
                Toolbar.LayoutParams layoutParams = (Toolbar.LayoutParams) this.c.getLayoutParams();
                if (layoutParams.width != -1) {
                    layoutParams.width = -1;
                    this.c.setLayoutParams(layoutParams);
                }
            }
            PlaySearch playSearch = hasExpandedActionView() ? this.c : this.b;
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt != null && childAt != playSearch && childAt.getVisibility() != 8) {
                    this.a.put(childAt, Integer.valueOf(childAt.getVisibility()));
                    childAt.setVisibility(8);
                }
            }
        } else {
            Map map = this.a;
            if (map.size() != 0) {
                for (Map.Entry entry : map.entrySet()) {
                    if (entry.getKey() != null) {
                        ((View) entry.getKey()).setVisibility(((Integer) entry.getValue()).intValue());
                    }
                }
                map.clear();
            }
        }
        this.b.setVisibility(8);
        super.onMeasure(i, i2);
    }

    @Override // android.support.v7.widget.Toolbar, android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        this.i = bundle.getInt("play_search_toolbar.expanded_menu_item_id");
        this.b.onRestoreInstanceState(bundle.getParcelable("play_search_toolbar.search_view_state"));
        super.onRestoreInstanceState(bundle.getParcelable("play_search_toolbar.parent_instance_state"));
    }

    @Override // android.support.v7.widget.Toolbar, android.view.View
    protected final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("play_search_toolbar.parent_instance_state", super.onSaveInstanceState());
        bundle.putInt("play_search_toolbar.expanded_menu_item_id", this.i);
        bundle.putParcelable("play_search_toolbar.search_view_state", this.b.onSaveInstanceState());
        return bundle;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        this.e = drawable;
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.support.v7.widget.Toolbar
    public final void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        super.setNavigationOnClickListener(onClickListener);
        PlaySearch playSearch = this.b;
        if (playSearch != null) {
            playSearch.b.e = new nay(this, onClickListener, 18);
        }
    }
}

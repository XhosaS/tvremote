package com.google.android.play.search;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.videos.R;
import defpackage.tgw;
import defpackage.tgx;
import defpackage.tha;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class PlaySearchActionButtonsContainer extends LinearLayout implements tgx {
    public tgw a;
    public PlaySearchActionButton b;

    public PlaySearchActionButtonsContainer(Context context) {
        this(context, null);
    }

    @Override // defpackage.tgx
    public final void d(int i) {
        if (getChildCount() != 1) {
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                View childAt = getChildAt(i2);
                if (childAt != this.b) {
                    childAt.setVisibility(i == 1 ? 0 : 8);
                }
            }
        }
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.b = (PlaySearchActionButton) findViewById(R.id.action_button);
    }

    public PlaySearchActionButtonsContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PlaySearchActionButtonsContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // defpackage.tgx
    public final void m() {
    }

    @Override // defpackage.tgx
    public final void a(String str) {
    }

    @Override // defpackage.tgx
    public final void b(tha thaVar) {
    }

    @Override // defpackage.tgx
    public final void e(String str, boolean z) {
    }
}

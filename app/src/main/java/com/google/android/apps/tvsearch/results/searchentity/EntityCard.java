package com.google.android.apps.tvsearch.results.searchentity;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.hnl;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class EntityCard extends ConstraintLayout {
    public hnl h;

    public EntityCard(Context context) {
        this(context, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        hnl hnlVar = this.h;
        if (hnlVar != null) {
            TextView textView = hnlVar.a.y;
            if (textView.isFocusable() && rect == null && textView.requestFocus()) {
                return true;
            }
        }
        return super.requestFocus(i, rect);
    }

    public EntityCard(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public EntityCard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

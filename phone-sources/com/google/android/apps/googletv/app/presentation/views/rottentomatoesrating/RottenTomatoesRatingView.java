package com.google.android.apps.googletv.app.presentation.views.rottentomatoesrating;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.videos.R;
import defpackage.kih;
import defpackage.kkc;
import defpackage.yft;
import defpackage.yga;
import defpackage.ykn;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class RottenTomatoesRatingView extends LinearLayout {
    public final yft a;
    public final yft b;
    private final yft c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RottenTomatoesRatingView(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public final TextView a() {
        Object objA = this.c.a();
        objA.getClass();
        return (TextView) objA;
    }

    public final void b(String str) {
        a().setText(str);
        requestLayout();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RottenTomatoesRatingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RottenTomatoesRatingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.a = new yga(new kih(this, 5));
        this.c = new yga(new kih(this, 6));
        this.b = new yga(new kih(this, 7));
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, kkc.a);
            typedArrayObtainStyledAttributes.getClass();
            try {
                int i2 = typedArrayObtainStyledAttributes.getInt(0, 1);
                int i3 = R.layout.rotten_tomatoes_rating_layout_stream_page_view;
                if (i2 != 1) {
                    if (i2 == 2) {
                        i3 = R.layout.rotten_tomatoes_rating_layout_entity_page_view;
                    } else if (i2 == 3) {
                        i3 = R.layout.rotten_tomatoes_rating_layout_entity_page_more_info_view;
                    }
                }
                View.inflate(context, i3, this);
                return;
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
        throw new IllegalStateException("RottenTomatoesRatingView need to have attributes");
    }

    public /* synthetic */ RottenTomatoesRatingView(Context context, AttributeSet attributeSet, int i, int i2, ykn yknVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}

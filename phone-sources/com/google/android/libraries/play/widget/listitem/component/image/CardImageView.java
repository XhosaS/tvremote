package com.google.android.libraries.play.widget.listitem.component.image;

import android.content.Context;
import android.util.AttributeSet;
import defpackage.cww;
import defpackage.sfc;
import defpackage.sfy;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class CardImageView extends com.google.android.libraries.play.widget.cardimageview.CardImageView implements sfc {
    private float c;

    public CardImageView(Context context) {
        this(context, null);
    }

    @Override // defpackage.sfc
    public final int a() {
        int[] iArr = cww.a;
        return getPaddingEnd();
    }

    @Override // defpackage.sfc
    public final /* synthetic */ int b() {
        return 48;
    }

    @Override // defpackage.sfc
    public final int c() {
        int[] iArr = cww.a;
        return getPaddingStart();
    }

    public CardImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = 1.0f;
        int iD = sfy.d(getResources(), 1);
        float f = this.c;
        if (f <= 0.0f) {
            return;
        }
        int i = (int) (iD / f);
        if (this.a == iD && this.b == i) {
            return;
        }
        this.a = iD;
        this.b = i;
        requestLayout();
    }
}

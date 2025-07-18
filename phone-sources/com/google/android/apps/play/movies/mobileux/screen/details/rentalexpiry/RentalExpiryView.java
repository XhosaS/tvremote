package com.google.android.apps.play.movies.mobileux.screen.details.rentalexpiry;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.videos.R;
import defpackage.mze;
import defpackage.nbo;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class RentalExpiryView extends LinearLayout implements nbo<mze> {
    private ImageView a;
    private TextView b;

    public RentalExpiryView(Context context) {
        super(context);
    }

    @Override // defpackage.nbo
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void a(mze mzeVar) {
        this.a.setVisibility(true != mzeVar.a ? 8 : 0);
        this.b.setVisibility(0);
        String str = mzeVar.b;
        this.b.setText(str);
        this.b.setContentDescription(str);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (ImageView) findViewById(R.id.rental_icon);
        this.b = (TextView) findViewById(R.id.rental_message);
    }

    public RentalExpiryView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RentalExpiryView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public RentalExpiryView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}

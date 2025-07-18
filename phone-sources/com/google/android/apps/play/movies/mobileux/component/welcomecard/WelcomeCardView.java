package com.google.android.apps.play.movies.mobileux.component.welcomecard;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import com.google.android.play.layout.ForegroundRelativeLayout;
import com.google.android.videos.R;
import defpackage.jyr;
import defpackage.mwf;
import defpackage.mwg;
import defpackage.mwh;
import defpackage.nbo;
import defpackage.tst;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class WelcomeCardView extends ForegroundRelativeLayout implements nbo<mwh> {
    private TextView a;
    private TextView b;
    private ImageView c;
    private MaterialButton d;
    private MaterialButton e;

    public WelcomeCardView(Context context) {
        this(context, null, 0);
    }

    @Override // defpackage.nbo
    public final /* synthetic */ void a(Object obj) {
        mwh mwhVar = (mwh) obj;
        this.a.setText(mwhVar.a);
        this.b.setText(mwhVar.b);
        tst tstVar = mwhVar.c;
        if (tstVar.g()) {
            this.c.setVisibility(0);
            ImageView imageView = this.c;
            ((Integer) tstVar.c()).intValue();
            imageView.setImageResource(R.drawable.ic_family_library_welcome_card);
        } else {
            this.c.setVisibility(8);
        }
        tst tstVar2 = mwhVar.d;
        if (tstVar2.g()) {
            this.d.setVisibility(0);
            CharSequence charSequence = ((mwf) tstVar2.c()).a;
            this.d.setText(charSequence);
            this.d.setContentDescription(charSequence);
            this.d.setOnClickListener(new jyr(new mwg((mwf) tstVar2.c()), 20));
        } else {
            this.d.setVisibility(8);
        }
        tst tstVar3 = mwhVar.e;
        if (!tstVar3.g()) {
            this.e.setVisibility(8);
            return;
        }
        this.e.setVisibility(0);
        CharSequence charSequence2 = ((mwf) tstVar3.c()).a;
        this.e.setText(charSequence2);
        this.e.setContentDescription(charSequence2);
        this.e.setOnClickListener(new jyr(new mwg((mwf) tstVar3.c()), 20));
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (TextView) findViewById(R.id.welcome_title);
        this.b = (TextView) findViewById(R.id.welcome_detail_message);
        this.c = (ImageView) findViewById(R.id.welcome_image);
        this.d = (MaterialButton) findViewById(R.id.welcome_button_primary);
        this.e = (MaterialButton) findViewById(R.id.welcome_button_secondary);
    }

    @Override // com.google.android.play.layout.ForegroundRelativeLayout, android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.d.getVisibility() == 0 && this.e.getVisibility() == 0) {
            int iMax = Math.max(this.d.getHeight(), this.e.getHeight());
            this.d.setHeight(iMax);
            this.e.setHeight(iMax);
        }
    }

    public WelcomeCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public WelcomeCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

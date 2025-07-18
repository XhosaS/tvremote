package com.google.android.apps.googletv.app.presentation.pages.qs;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.BulletSpan;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.videos.R;
import defpackage.cxe;
import defpackage.jbr;
import defpackage.jxs;
import defpackage.jyr;
import defpackage.sru;
import defpackage.srv;
import defpackage.xlj;
import defpackage.xlk;
import defpackage.xzg;
import defpackage.yks;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class QSActivity extends jxs {
    public xlj a;

    @Override // defpackage.xcf, defpackage.by, defpackage.fl, defpackage.ds, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        xlj xljVar = this.a;
        if (xljVar == null) {
            yks.c("qsStandaloneFeatureFlags");
            xljVar = null;
        }
        if (!((Boolean) xlk.a.et(((xlk) xljVar).b)).booleanValue()) {
            startActivity(jbr.T(this, new Intent()));
            finish();
            return;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            int i = sru.a;
            sru.b(this, new srv(new xzg()));
            getDelegate().setLocalNightMode(-1);
        }
        setContentView(R.layout.qs_page);
        cxe cxeVar = new cxe(getWindow(), getWindow().getDecorView());
        int i2 = getResources().getConfiguration().uiMode & 48;
        int i3 = 16;
        if (i2 == 16 || i2 != 32) {
            cxeVar.i(true);
        } else {
            cxeVar.i(false);
        }
        MaterialCardView materialCardView = (MaterialCardView) findViewById(R.id.qs_home_button);
        MaterialCardView materialCardView2 = (MaterialCardView) findViewById(R.id.qs_remote_button);
        MaterialButton materialButton = (MaterialButton) findViewById(R.id.exit_button);
        materialCardView.setOnClickListener(new jyr(this, 15));
        materialCardView2.setOnClickListener(new jyr(this, i3));
        materialButton.setOnClickListener(new jyr(this, 17));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append("Access your watchlist, library, and recommendations from anywhere\n", new BulletSpan(30), 33);
        spannableStringBuilder.append("Use your phone as a TV remote\n", new BulletSpan(30), 33);
        spannableStringBuilder.append("Get a personalized feed of news about the movies and shows you watch", new BulletSpan(30), 33);
        ((TextView) findViewById(R.id.listed_content)).setText(spannableStringBuilder);
    }
}

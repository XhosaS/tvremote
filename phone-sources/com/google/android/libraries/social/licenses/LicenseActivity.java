package com.google.android.libraries.social.licenses;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Layout;
import android.view.MenuItem;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.videos.R;
import defpackage.fk;
import defpackage.fn;
import defpackage.sgu;
import defpackage.sij;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class LicenseActivity extends AppCompatActivity {
    public static /* synthetic */ void $r8$lambda$E_2H7zYGR83Q8kZwDeH_WtL2gms(LicenseActivity licenseActivity, int i, ScrollView scrollView) {
        Layout layout = ((TextView) licenseActivity.findViewById(R.id.license_activity_textview)).getLayout();
        if (layout != null) {
            scrollView.scrollTo(0, layout.getLineTop(layout.getLineForOffset(i)));
        }
    }

    @Override // defpackage.by, defpackage.fl, defpackage.ds, android.app.Activity
    public final void onCreate(Bundle bundle) throws Resources.NotFoundException, IOException {
        fn.a(this);
        super.onCreate(bundle);
        setContentView(R.layout.libraries_social_licenses_license_activity);
        sgu sguVar = (sgu) getIntent().getParcelableExtra("license");
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(sguVar.a);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setLogo((Drawable) null);
        }
        TextView textView = (TextView) findViewById(R.id.license_activity_textview);
        String strH = sij.h(this, "third_party_licenses", sguVar.b, sguVar.c);
        if (strH == null) {
            finish();
        } else {
            textView.setText(strH);
        }
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }

    @Override // android.app.Activity
    public final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        ScrollView scrollView = (ScrollView) findViewById(R.id.license_activity_scrollview);
        int i = bundle.getInt("scroll_pos");
        if (i != 0) {
            scrollView.post(new fk(this, i, scrollView, 11));
        }
    }

    @Override // defpackage.fl, defpackage.ds, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ScrollView scrollView = (ScrollView) findViewById(R.id.license_activity_scrollview);
        Layout layout = ((TextView) findViewById(R.id.license_activity_textview)).getLayout();
        if (layout != null) {
            bundle.putInt("scroll_pos", layout.getLineStart(layout.getLineForVertical(scrollView.getScrollY())));
        }
    }
}

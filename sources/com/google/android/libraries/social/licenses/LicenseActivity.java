package com.google.android.libraries.social.licenses;

import android.content.res.Resources;
import android.os.Bundle;
import android.text.Layout;
import android.view.MenuItem;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.tv.remote.service.R;
import defpackage.bed;
import defpackage.bee;
import defpackage.bk;
import defpackage.bs;
import defpackage.ct;
import defpackage.km;
import defpackage.tk;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class LicenseActivity extends bs {
    @Override // defpackage.t, defpackage.kk, defpackage.bh, android.app.Activity
    public final void onCreate(Bundle bundle) throws Resources.NotFoundException, IOException {
        km.a(this);
        super.onCreate(bundle);
        setContentView(R.layout.libraries_social_licenses_license_activity);
        bed bedVar = (bed) getIntent().getParcelableExtra("license");
        if (e() != null) {
            bk bkVarE = e();
            ((ct) bkVarE).p.d(bedVar.a);
            ((ct) e()).h(2, 2);
            e().d(true);
            ((ct) e()).p.c(null);
        }
        TextView textView = (TextView) findViewById(R.id.license_activity_textview);
        String strI = tk.i(this, "third_party_licenses", bedVar.b, bedVar.c);
        if (strI == null) {
            finish();
        } else {
            textView.setText(strI);
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
            scrollView.post(new bee(this, i, scrollView, 0));
        }
    }

    @Override // defpackage.kk, defpackage.bh, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ScrollView scrollView = (ScrollView) findViewById(R.id.license_activity_scrollview);
        Layout layout = ((TextView) findViewById(R.id.license_activity_textview)).getLayout();
        if (layout != null) {
            bundle.putInt("scroll_pos", layout.getLineStart(layout.getLineForVertical(scrollView.getScrollY())));
        }
    }
}

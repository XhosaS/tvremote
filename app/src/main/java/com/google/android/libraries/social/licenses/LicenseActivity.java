package com.google.android.libraries.social.licenses;

import android.content.res.Resources;
import android.os.Bundle;
import android.text.Layout;
import android.view.MenuItem;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.katniss.R;
import defpackage.fs;
import defpackage.gf;
import defpackage.hf;
import defpackage.hr;
import defpackage.tqd;
import defpackage.tw;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class LicenseActivity extends gf {
    @Override // defpackage.bw, defpackage.tt, defpackage.eq, android.app.Activity
    public final void onCreate(Bundle bundle) throws Resources.NotFoundException, IOException {
        tw.a(this);
        super.onCreate(bundle);
        setContentView(R.layout.libraries_social_licenses_license_activity);
        License license = (License) getIntent().getParcelableExtra("license");
        hf hfVar = (hf) cT();
        hfVar.B();
        if (hfVar.n != null) {
            hf hfVar2 = (hf) cT();
            hfVar2.B();
            fs fsVar = hfVar2.n;
            ((hr) fsVar).d.n(license.a);
            hf hfVar3 = (hf) cT();
            hfVar3.B();
            ((hr) hfVar3.n).l(2, 2);
            hf hfVar4 = (hf) cT();
            hfVar4.B();
            hfVar4.n.d(true);
            hf hfVar5 = (hf) cT();
            hfVar5.B();
            ((hr) hfVar5.n).d.B();
        }
        TextView textView = (TextView) cT().b(R.id.license_activity_textview);
        String strA = tqd.a(this, "third_party_licenses", license.b, license.c);
        if (strA == null) {
            finish();
        } else {
            textView.setText(strA);
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
        final ScrollView scrollView = (ScrollView) cT().b(R.id.license_activity_scrollview);
        final int i = bundle.getInt("scroll_pos");
        if (i != 0) {
            scrollView.post(new Runnable() { // from class: tpy
                @Override // java.lang.Runnable
                public final void run() {
                    Layout layout = ((TextView) this.a.cT().b(R.id.license_activity_textview)).getLayout();
                    if (layout != null) {
                        scrollView.scrollTo(0, layout.getLineTop(layout.getLineForOffset(i)));
                    }
                }
            });
        }
    }

    @Override // defpackage.tt, defpackage.eq, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ScrollView scrollView = (ScrollView) cT().b(R.id.license_activity_scrollview);
        Layout layout = ((TextView) cT().b(R.id.license_activity_textview)).getLayout();
        if (layout != null) {
            bundle.putInt("scroll_pos", layout.getLineStart(layout.getLineForVertical(scrollView.getScrollY())));
        }
    }
}

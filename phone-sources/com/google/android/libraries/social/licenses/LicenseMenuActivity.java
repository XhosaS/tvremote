package com.google.android.libraries.social.licenses;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import com.google.android.videos.R;
import defpackage.at;
import defpackage.cr;
import defpackage.fn;
import defpackage.sgw;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class LicenseMenuActivity extends AppCompatActivity {
    @Override // defpackage.by, defpackage.fl, defpackage.ds, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        fn.a(this);
        super.onCreate(bundle);
        setContentView(R.layout.libraries_social_licenses_license_menu_activity);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        cr supportFragmentManager = getSupportFragmentManager();
        if (supportFragmentManager.e(R.id.license_menu_fragment_container) instanceof sgw) {
            return;
        }
        sgw sgwVar = new sgw();
        at atVar = new at(supportFragmentManager);
        atVar.p(R.id.license_menu_fragment_container, sgwVar);
        atVar.e();
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }
}

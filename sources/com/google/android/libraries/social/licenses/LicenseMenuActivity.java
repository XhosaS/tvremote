package com.google.android.libraries.social.licenses;

import android.os.Bundle;
import android.view.MenuItem;
import com.google.android.tv.remote.service.R;
import defpackage.am;
import defpackage.beg;
import defpackage.bs;
import defpackage.c;
import defpackage.km;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class LicenseMenuActivity extends bs {
    @Override // defpackage.t, defpackage.kk, defpackage.bh, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        km.a(this);
        super.onCreate(bundle);
        setContentView(R.layout.libraries_social_licenses_license_menu_activity);
        if (e() != null) {
            e().d(true);
        }
        am amVarA = a();
        if (amVarA.c(R.id.license_menu_fragment_container) instanceof beg) {
            return;
        }
        beg begVar = new beg();
        c cVar = new c(amVarA);
        cVar.f(R.id.license_menu_fragment_container, begVar, null);
        cVar.i();
        cVar.a.D(cVar, false);
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

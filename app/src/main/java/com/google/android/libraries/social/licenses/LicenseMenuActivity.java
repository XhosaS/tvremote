package com.google.android.libraries.social.licenses;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import com.google.android.katniss.R;
import defpackage.ab;
import defpackage.bw;
import defpackage.de;
import defpackage.gf;
import defpackage.hf;
import defpackage.tqb;
import defpackage.tqc;
import defpackage.tw;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class LicenseMenuActivity extends gf implements tqb {
    @Override // defpackage.tqb
    public final void C(License license) {
        Intent intent = new Intent(this, (Class<?>) LicenseActivity.class);
        intent.putExtra("license", license);
        startActivity(intent);
    }

    @Override // defpackage.bw, defpackage.tt, defpackage.eq, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        tw.a(this);
        super.onCreate(bundle);
        setContentView(R.layout.libraries_social_licenses_license_menu_activity);
        hf hfVar = (hf) cT();
        hfVar.B();
        if (hfVar.n != null) {
            hf hfVar2 = (hf) cT();
            hfVar2.B();
            hfVar2.n.d(true);
        }
        de deVar = ((bw) this).a.a.e;
        if (deVar.b.c(R.id.license_menu_fragment_container) instanceof tqc) {
            return;
        }
        tqc tqcVar = new tqc();
        ab abVar = new ab(deVar);
        abVar.f(R.id.license_menu_fragment_container, tqcVar, null, 1);
        abVar.e();
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

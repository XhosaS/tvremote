package com.google.android.apps.play.movies.common.presenter.activity;

import android.accounts.Account;
import android.content.Intent;
import android.widget.Toast;
import defpackage.a;
import defpackage.by;
import defpackage.csl;
import defpackage.idr;
import defpackage.idy;
import defpackage.iea;
import defpackage.ieg;
import defpackage.kri;
import defpackage.ksk;
import defpackage.ksn;
import defpackage.ldg;
import defpackage.ldv;
import defpackage.lid;
import defpackage.mie;
import defpackage.xby;
import defpackage.xcd;
import defpackage.xce;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class AuxiliaryActivity extends by implements xce, idy {
    private static final String d = ldg.class.getName();
    public iea a;
    public xcd b;
    public ldv c;
    private idr e;
    private kri f;

    public static /* synthetic */ void $r8$lambda$0dADJKIjHmoFveCNfNCVJkeAWhs(AuxiliaryActivity auxiliaryActivity) {
        int i = 0;
        for (Account account : auxiliaryActivity.c.u()) {
            try {
                auxiliaryActivity.c.n(auxiliaryActivity.c.j(ksn.a(account.name)));
                i++;
            } catch (Exception unused) {
            }
        }
        ksk.g(new csl(auxiliaryActivity, i, 7));
    }

    public static /* synthetic */ void $r8$lambda$XjBYy1K55Jq7jmh5Trdx0Dr0BDE(AuxiliaryActivity auxiliaryActivity, int i) {
        Toast.makeText(auxiliaryActivity, a.cf(i, "Done "), 0).show();
        auxiliaryActivity.finish();
    }

    @Override // defpackage.xce
    public final xby<Object> androidInjector() {
        return this.b;
    }

    @Override // defpackage.idy
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        if (((ieg) obj).l()) {
            return;
        }
        if (getIntent().getBooleanExtra("enable_guide", false)) {
            Intent intent = new Intent();
            lid lidVar = lid.a;
            mie.l(this, intent);
        }
        finish();
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x019c  */
    @Override // defpackage.by, defpackage.fl, defpackage.ds, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onCreate(android.os.Bundle r13) throws android.content.pm.PackageManager.NameNotFoundException {
        /*
            Method dump skipped, instructions count: 431
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.play.movies.common.presenter.activity.AuxiliaryActivity.onCreate(android.os.Bundle):void");
    }

    @Override // defpackage.by, android.app.Activity
    protected final void onStart() {
        super.onStart();
        this.f.a();
    }

    @Override // defpackage.by, android.app.Activity
    protected final void onStop() {
        super.onStop();
        this.f.b();
    }
}

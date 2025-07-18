package com.google.android.apps.play.movies.common.activity;

import android.content.Context;
import android.content.Intent;
import android.content.pm.FeatureInfo;
import android.net.Uri;
import android.text.TextUtils;
import defpackage.idb;
import defpackage.ieg;
import defpackage.ieh;
import defpackage.jbj;
import defpackage.kpz;
import defpackage.krd;
import defpackage.ksh;
import defpackage.ksn;
import defpackage.kud;
import defpackage.ldv;
import defpackage.ldy;
import defpackage.lfn;
import defpackage.lid;
import defpackage.lie;
import defpackage.lkt;
import defpackage.lys;
import defpackage.mie;
import defpackage.sij;
import defpackage.xbz;
import defpackage.xil;
import defpackage.xml;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class LauncherActivity extends xbz {
    public lfn a;
    public lie b;
    public ldv c;
    public ieh d;
    public ieh e;
    public idb f;
    public xil g;
    public xml h;
    public lys i;
    public lkt j;
    private String k = "";
    private kpz l;
    private lid n;

    private final ieg a(Intent intent) {
        String stringExtra = intent.getStringExtra("intent_extra_data_key");
        if (!TextUtils.isEmpty(stringExtra)) {
            return ieg.f(ksn.b(stringExtra));
        }
        String stringExtra2 = intent.getStringExtra("authAccount");
        if (!TextUtils.isEmpty(stringExtra2)) {
            return ieg.f(ksn.b(stringExtra2));
        }
        Uri data = intent.getData();
        if (data != null) {
            stringExtra2 = data.getQueryParameter("u");
        }
        return TextUtils.isEmpty(stringExtra2) ? ((ldy) this.d).a() : ksn.a(stringExtra2);
    }

    private final void b(Intent intent, Uri uri) {
        if (!this.a.bP() || uri == null) {
            krd.f("Unexpected intent ".concat(String.valueOf(String.valueOf(intent))));
            return;
        }
        String queryParameter = uri.getQueryParameter("promo");
        String queryParameter2 = uri.getQueryParameter("t");
        String queryParameter3 = uri.getQueryParameter("d");
        if (TextUtils.isEmpty(queryParameter)) {
            return;
        }
        kud.b(queryParameter, queryParameter2, queryParameter3, "");
    }

    private final void c(Intent intent, Uri uri) {
        ieg iegVarA = ksn.a(intent.getStringExtra("authAccount"));
        ldv ldvVar = this.c;
        ldvVar.getClass();
        iegVarA.o(new jbj(ldvVar, 4));
        String queryParameter = uri.getQueryParameter("v");
        String strD = ksh.d(uri.getQueryParameter("pv"));
        uri.getQueryParameter("mid");
        if (sij.F(queryParameter)) {
            mie.l(this, intent);
        } else {
            this.l.j(this, queryParameter, strD, this.k, true, this.n);
        }
    }

    private static boolean d(Context context, String str) {
        for (FeatureInfo featureInfo : context.getPackageManager().getSystemAvailableFeatures()) {
            if (str.equals(featureInfo.name)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:200:0x04d9  */
    @Override // defpackage.xbz, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onCreate(android.os.Bundle r18) {
        /*
            Method dump skipped, instructions count: 1670
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.play.movies.common.activity.LauncherActivity.onCreate(android.os.Bundle):void");
    }
}

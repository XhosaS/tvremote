package com.google.android.apps.play.movies.common.presenter.activity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import defpackage.jwq;
import defpackage.nvj;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class GmsErrorActivity extends AppCompatActivity implements DialogInterface.OnCancelListener {
    public static boolean startIfNecessary(Context context) {
        int iH = nvj.a.h(context, 14700000);
        if (iH == 0) {
            return false;
        }
        context.startActivity(new Intent(context, (Class<?>) GmsErrorActivity.class).putExtra("errorCode", iH));
        return true;
    }

    @Override // defpackage.by, defpackage.fl, android.app.Activity
    protected final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 906) {
            finish();
        } else {
            super.onActivityResult(i, i2, intent);
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        finish();
    }

    @Override // defpackage.by, defpackage.fl, defpackage.ds, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        jwq.R(this);
    }

    @Override // defpackage.by
    protected final void onResumeFragments() {
        super.onResumeFragments();
        if (nvj.a.d(this, getIntent().getIntExtra("errorCode", 0), 906, this)) {
            return;
        }
        finish();
    }
}

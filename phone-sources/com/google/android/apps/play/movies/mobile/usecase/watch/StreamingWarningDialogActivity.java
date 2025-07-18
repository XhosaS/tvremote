package com.google.android.apps.play.movies.mobile.usecase.watch;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AlertDialog;
import com.google.android.videos.R;
import defpackage.gcu;
import defpackage.hjt;
import defpackage.ids;
import defpackage.kee;
import defpackage.lll;
import defpackage.mem;
import defpackage.mil;
import defpackage.mrw;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class StreamingWarningDialogActivity extends mil {
    public static final int STREAMING_WARNING_REQUEST_CODE = 100;
    public mem b;
    public SharedPreferences c;
    private ids d;
    private final lll e = new lll(this, 13);

    public static Intent createIntent(Context context) {
        return new Intent(context, (Class<?>) StreamingWarningDialogActivity.class).setFlags(131072);
    }

    @Override // defpackage.by, android.app.Activity
    protected final void onStart() {
        super.onStart();
        ids idsVarF = hjt.f(hjt.g(hjt.i(this.b.a()), this.b.b()), this.b);
        this.d = idsVarF;
        idsVarF.ea(this.e);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(R.string.warning_movie_bandwidth_title);
        builder.setMessage(R.string.warning_movie_bandwidth);
        builder.setNegativeButton(R.string.wifi_settings, new gcu(this, 18));
        builder.setPositiveButton(android.R.string.ok, new gcu(this, 19));
        builder.setNeutralButton(R.string.always, new mrw(this, this.c));
        builder.setOnDismissListener(new kee((Object) this, 3));
        builder.create().show();
    }

    @Override // defpackage.by, android.app.Activity
    protected final void onStop() {
        super.onStop();
        this.d.ee(this.e);
    }
}

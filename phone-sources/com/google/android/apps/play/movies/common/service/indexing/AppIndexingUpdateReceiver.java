package com.google.android.apps.play.movies.common.service.indexing;

import android.content.Context;
import android.content.Intent;
import defpackage.krd;
import defpackage.kuw;
import defpackage.ufb;
import defpackage.wae;
import defpackage.xca;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class AppIndexingUpdateReceiver extends xca {
    public kuw a;

    @Override // defpackage.xca, android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        wae.B(this, context);
        try {
            ((ufb) this.a.b(true)).s();
        } catch (Exception unused) {
            krd.f("Unable to rebuild indices");
        }
    }
}

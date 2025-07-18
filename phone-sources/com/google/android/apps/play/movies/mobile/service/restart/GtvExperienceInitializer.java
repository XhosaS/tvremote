package com.google.android.apps.play.movies.mobile.service.restart;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import defpackage.czi;
import defpackage.iea;
import defpackage.kpx;
import defpackage.krd;
import defpackage.ksn;
import defpackage.kwy;
import defpackage.lcz;
import defpackage.ldy;
import defpackage.lfn;
import defpackage.lge;
import defpackage.lys;
import defpackage.pjb;
import defpackage.uhl;
import defpackage.uhp;
import defpackage.wae;
import defpackage.xca;
import defpackage.xms;
import defpackage.yks;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class GtvExperienceInitializer extends xca {
    public iea a;
    public lcz b;
    public SharedPreferences c;
    public lge d;
    public lfn e;
    public Executor f;
    public xms g;
    public lys h;
    public kwy i;

    @Override // defpackage.xca, android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        wae.B(this, context);
        if (context == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 33 && czi.b(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            krd.b("Revoking permissions for ACCESS_FINE_LOCATION");
            context.revokeSelfPermissionOnKill("android.permission.ACCESS_FINE_LOCATION");
        }
        context.getApplicationContext();
        int i = pjb.a;
        uhp uhpVar = uhl.a;
        iea ieaVar = this.a;
        lcz lczVar = null;
        if (ieaVar == null) {
            yks.c("accountRepository");
            ieaVar = null;
        }
        ksn ksnVar = (ksn) ((ldy) ieaVar).a().c;
        if (ksnVar != null) {
            lcz lczVar2 = this.b;
            if (lczVar2 == null) {
                yks.c("phenotypeFlagCommitter");
            } else {
                lczVar = lczVar2;
            }
            lczVar.b(ksnVar, new kpx(this, ksnVar, 3));
        }
    }
}

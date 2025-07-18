package com.google.android.apps.tvsearch.app.modeutils.tvts;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import defpackage.aeii;
import defpackage.agow;
import defpackage.agvy;
import defpackage.ahal;
import defpackage.ahbt;
import defpackage.ezj;
import defpackage.ezk;
import defpackage.ezl;
import defpackage.fmg;
import defpackage.zdv;
import defpackage.zdy;
import defpackage.ztw;
import j$.time.Duration;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class TvtsBroadcastReceiver extends ezj {
    private static final zdy g = zdy.h("com/google/android/apps/tvsearch/app/modeutils/tvts/TvtsBroadcastReceiver");
    private static final Duration h;
    public ahbt c;
    public agow d;
    public fmg e;
    public ztw f;

    static {
        Duration durationOfDays = Duration.ofDays(1L);
        durationOfDays.getClass();
        h = durationOfDays;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.katniss.action.ENABLE_TVTS_MODE");
        intentFilter.addAction("com.google.android.katniss.action.DISABLE_TVTS_MODE");
    }

    public final fmg a() {
        fmg fmgVar = this.e;
        if (fmgVar != null) {
            return fmgVar;
        }
        agvy.b("testingDataAccessor");
        return null;
    }

    public final agow b() {
        agow agowVar = this.d;
        if (agowVar != null) {
            return agowVar;
        }
        agvy.b("fakeS3InTvtsModeAllowed");
        return null;
    }

    @Override // defpackage.ezj, android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Instant instantPlus;
        String stringExtra;
        context.getClass();
        intent.getClass();
        zdy zdyVar = g;
        ((zdv) zdyVar.b().q("com/google/android/apps/tvsearch/app/modeutils/tvts/TvtsBroadcastReceiver", "onReceive", 41, "TvtsBroadcastReceiver.kt")).u("onReceive, to set expiry for LocalStorageTransmitter usage.");
        if (!this.a) {
            synchronized (this.b) {
                if (!this.a) {
                    ((ezl) aeii.a(context)).ha(this);
                    this.a = true;
                }
            }
        }
        boolean zC = agvy.c(intent.getAction(), "com.google.android.katniss.action.ENABLE_TVTS_MODE");
        if (zC) {
            ztw ztwVar = this.f;
            if (ztwVar == null) {
                agvy.b("timeSource");
                ztwVar = null;
            }
            instantPlus = ztwVar.a().plus(h);
        } else {
            instantPlus = Instant.EPOCH;
        }
        instantPlus.getClass();
        if (!zC || (stringExtra = intent.getStringExtra("CUSTOM_S3_ADDRESS")) == null) {
            stringExtra = "";
        }
        if (stringExtra.length() > 0 && !((Boolean) b().a()).booleanValue()) {
            ((zdv) zdyVar.d().q("com/google/android/apps/tvsearch/app/modeutils/tvts/TvtsBroadcastReceiver", "onReceive", 59, "TvtsBroadcastReceiver.kt")).u("ENABLE_TVTS_MODE_INTENT_ACTION with CUSTOM_S3_ADDRESS not allowed.");
        }
        ahbt ahbtVar = this.c;
        if (ahbtVar == null) {
            agvy.b("coroutineScope");
            ahbtVar = null;
        }
        ahal.e(ahbtVar, null, 0, new ezk(this, instantPlus, stringExtra, null), 3);
    }
}

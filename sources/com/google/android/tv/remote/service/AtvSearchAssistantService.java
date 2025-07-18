package com.google.android.tv.remote.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.text.TextUtils;
import defpackage.ali;
import defpackage.bph;
import defpackage.btt;
import defpackage.cbs;
import defpackage.cbt;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AtvSearchAssistantService extends Service {
    public static final cbt a = cbt.k("com/google/android/tv/remote/service/AtvSearchAssistantService");
    public RemoteService b;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        if (TextUtils.equals(intent.getAction(), AtvSearchAssistantService.class.getName())) {
            ((cbs) ((cbs) a.b().g(btt.a)).j("com/google/android/tv/remote/service/AtvSearchAssistantService", "onBind", 51, "AtvSearchAssistantService.java")).t("SEARCH_ASSIST_SERVICE_INTERFACE: %s", intent.getAction());
            return new ali(this, 2);
        }
        if (!TextUtils.equals(intent.getAction(), "AtvSearchAssistantService.localService")) {
            return null;
        }
        ((cbs) ((cbs) a.b().g(btt.a)).j("com/google/android/tv/remote/service/AtvSearchAssistantService", "onBind", 54, "AtvSearchAssistantService.java")).t("LOCAL_SERVICE_INTERFACE: %s", intent.getAction());
        return new bph(this);
    }

    @Override // android.app.Service
    public final void onCreate() {
        ((cbs) ((cbs) a.e().g(btt.a)).j("com/google/android/tv/remote/service/AtvSearchAssistantService", "onCreate", 31, "AtvSearchAssistantService.java")).p("Starting AtvSearchAssistantService");
    }
}

package com.google.android.tv.remote.service;

import android.content.Intent;
import android.os.IBinder;
import defpackage.bid;
import defpackage.bph;
import defpackage.bsi;
import defpackage.btm;
import defpackage.btt;
import defpackage.bue;
import defpackage.cbs;
import defpackage.cbt;
import defpackage.cpa;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AtvRemoteProviderService extends cpa {
    public static final cbt a = cbt.k("com/google/android/tv/remote/service/AtvRemoteProviderService");
    public bue b;
    public int c;
    public int d;
    public bsi e;

    @Override // android.app.Service
    protected final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.printf(Locale.ENGLISH, "Remote bridges opened: %d/%d%n", Integer.valueOf(this.d), Integer.valueOf(this.c));
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        String action = intent.getAction();
        cbt cbtVar = a;
        ((cbs) ((cbs) cbtVar.b().g(btt.a)).j("com/google/android/tv/remote/service/AtvRemoteProviderService", "onBind", 55, "AtvRemoteProviderService.java")).t("Binding to: %s", action);
        if (AtvRemoteProviderService.class.getName().equals(action)) {
            return new bph(this);
        }
        if (!"com.android.media.tv.remoteprovider.TvRemoteProvider".equals(action)) {
            return null;
        }
        if (this.b != null) {
            btm.a(this, new bid(this, 4));
            return this.b.b.getBinder();
        }
        ((cbs) cbtVar.g().j("com/google/android/tv/remote/service/AtvRemoteProviderService", "onBind", 61, "AtvRemoteProviderService.java")).t("Binding to missing framework class %s", action);
        this.e.a(1004, 1L);
        return null;
    }

    @Override // defpackage.cpa, android.app.Service
    public final void onCreate() throws ClassNotFoundException {
        ((cbs) ((cbs) a.e().g(btt.a)).j("com/google/android/tv/remote/service/AtvRemoteProviderService", "onCreate", 42, "AtvRemoteProviderService.java")).p("Starting AtvRemoteProviderService");
        super.onCreate();
        try {
            Class.forName("com.android.media.tv.remoteprovider.TvRemoteProvider", false, bue.class.getClassLoader());
            this.b = new bue(this);
        } catch (ClassNotFoundException unused) {
            ((cbs) bue.a.g().j("com/google/android/tv/remote/service/remoteprovider/LocalTvRemoteProvider", "isAvailable", 27, "LocalTvRemoteProvider.java")).t("Framework class %s cannot be found", "com.android.media.tv.remoteprovider.TvRemoteProvider");
            this.e.a(1004, 0L);
        }
    }
}

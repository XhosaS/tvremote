package com.google.android.apps.play.movies.common.store.sync;

import android.accounts.Account;
import android.content.ContentProvider;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Intent;
import android.content.PeriodicSync;
import android.content.SharedPreferences;
import android.content.SyncResult;
import android.database.Cursor;
import android.net.Uri;
import android.os.IBinder;
import defpackage.a;
import defpackage.ieg;
import defpackage.krd;
import defpackage.krh;
import defpackage.ksn;
import defpackage.ldv;
import defpackage.lie;
import defpackage.mab;
import defpackage.mbg;
import defpackage.mbl;
import defpackage.mcw;
import defpackage.mfl;
import defpackage.mfm;
import defpackage.xcb;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class SyncService extends xcb {
    public static final Object a = new Object();
    public ldv b;
    public mab c;
    public mcw d;
    public SharedPreferences e;
    public Runnable f;
    public lie g;
    public volatile mfm h;
    private mbl i;

    /* compiled from: PG */
    public class DummyContentProvider extends ContentProvider {
        @Override // android.content.ContentProvider
        public final int delete(Uri uri, String str, String[] strArr) {
            return 0;
        }

        @Override // android.content.ContentProvider
        public final String getType(Uri uri) {
            return null;
        }

        @Override // android.content.ContentProvider
        public final Uri insert(Uri uri, ContentValues contentValues) {
            return null;
        }

        @Override // android.content.ContentProvider
        public final boolean onCreate() {
            return true;
        }

        @Override // android.content.ContentProvider
        public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
            return null;
        }

        @Override // android.content.ContentProvider
        public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
            return 0;
        }
    }

    public static String a(Account account) {
        return krh.LAST_SYNC_WAS_SUCCESS_PREFIX.concat(String.valueOf(krh.e(account.name)));
    }

    public static boolean b(Account account, SharedPreferences sharedPreferences) {
        if (ContentResolver.getIsSyncable(account, "com.google.android.videos.sync") >= 0) {
            return false;
        }
        ContentResolver.setIsSyncable(account, "com.google.android.videos.sync", 1);
        ContentResolver.setSyncAutomatically(account, "com.google.android.videos.sync", true);
        for (PeriodicSync periodicSync : ContentResolver.getPeriodicSyncs(account, "com.google.android.videos.sync")) {
            ContentResolver.removePeriodicSync(periodicSync.account, periodicSync.authority, periodicSync.extras);
        }
        sharedPreferences.edit().remove(a(account)).commit();
        return true;
    }

    public static final boolean d(mfl mflVar, String str, SyncResult syncResult, mfm mfmVar) {
        ieg iegVarB = mflVar.b(120000L);
        if (iegVarB.k()) {
            Throwable thI = iegVarB.i();
            if (mfm.b(mfmVar)) {
                krd.e("Sync canceled for ".concat(str));
            } else if (thI instanceof TimeoutException) {
                krd.e("Sync timeout for ".concat(str));
            } else if (thI instanceof mbg) {
                krd.a(a.cg(str, "Sync failed for ", " : "), thI);
                syncResult.stats.numIoExceptions++;
            } else {
                krd.a(a.cg(str, "Sync completed for ", " with failure to sync optional data: "), thI);
            }
        }
        return iegVarB.m();
    }

    public final boolean c(ksn ksnVar, SyncResult syncResult) {
        mfl mflVar = new mfl();
        mfm mfmVar = this.h;
        this.d.b(ksnVar, mflVar, mfmVar);
        return d(mflVar, ksnVar.toString().concat(" wishlist"), syncResult, mfmVar);
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        if ("android.content.SyncAdapter".equals(intent.getAction())) {
            return this.i.getSyncAdapterBinder();
        }
        return null;
    }

    @Override // defpackage.xcb, android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.i = new mbl(this);
    }
}

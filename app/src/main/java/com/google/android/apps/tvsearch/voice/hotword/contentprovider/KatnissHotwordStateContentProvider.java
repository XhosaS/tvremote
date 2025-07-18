package com.google.android.apps.tvsearch.voice.hotword.contentprovider;

import android.content.ContentProvider;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteQueryBuilder;
import android.net.Uri;
import com.google.android.apps.tvsearch.voice.hotword.contentprovider.KatnissHotwordStateContentProvider;
import defpackage.aehg;
import defpackage.agpc;
import defpackage.agpi;
import defpackage.agpn;
import defpackage.agrj;
import defpackage.agum;
import defpackage.agvy;
import defpackage.jdf;
import defpackage.zdy;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class KatnissHotwordStateContentProvider extends ContentProvider {
    public static final zdy a = zdy.h("com/google/android/apps/tvsearch/voice/hotword/contentprovider/KatnissHotwordStateContentProvider");
    public static final Uri b;
    private static final Map d;
    private ContentResolver e;
    public final agpc c = new agpn(new agum() { // from class: jdc
        @Override // defpackage.agum
        public final Object a() {
            Context context = this.a.getContext();
            if (context != null) {
                return new jde(context);
            }
            throw new IllegalStateException("Required value was null.");
        }
    });
    private final agpc f = new agpn(new agum() { // from class: jdd
        @Override // defpackage.agum
        public final Object a() {
            try {
                return ((jde) this.a.c.a()).getWritableDatabase();
            } catch (SQLiteException e) {
                ((zdv) ((zdv) KatnissHotwordStateContentProvider.a.d()).p(e).q("com/google/android/apps/tvsearch/voice/hotword/contentprovider/KatnissHotwordStateContentProvider", "database_delegate$lambda$1", 37, "KatnissHotwordStateContentProvider.kt")).u("Failed to get writeable database.");
                return null;
            }
        }
    });

    static {
        Uri uriBuild = new Uri.Builder().scheme("content").authority("com.google.android.katniss.search.searchapi.VoiceInteractionProvider").appendPath("sharedvalue").build();
        uriBuild.getClass();
        b = uriBuild;
        d = agrj.d(new agpi("_id", "_id"), new agpi("key", "key"), new agpi("value", "value"));
    }

    private final SQLiteDatabase a() {
        return (SQLiteDatabase) this.f.a();
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        uri.getClass();
        return 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        uri.getClass();
        return null;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        uri.getClass();
        SQLiteDatabase sQLiteDatabaseA = a();
        if (sQLiteDatabaseA == null) {
            return null;
        }
        sQLiteDatabaseA.insert("sharedvalue", null, contentValues);
        ContentResolver contentResolver = this.e;
        if (contentResolver == null) {
            agvy.b("contentResolver");
            contentResolver = null;
        }
        contentResolver.notifyChange(uri, null);
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        Context context = getContext();
        if (context == null) {
            throw new IllegalStateException("KatnissHotwordStateContentProvider is not attached to a context");
        }
        Object objA = aehg.a(context.getApplicationContext(), jdf.class);
        objA.getClass();
        this.e = ((jdf) objA).i();
        return true;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        uri.getClass();
        SQLiteDatabase sQLiteDatabaseA = a();
        if (sQLiteDatabaseA == null) {
            return null;
        }
        SQLiteQueryBuilder sQLiteQueryBuilder = new SQLiteQueryBuilder();
        sQLiteQueryBuilder.setStrict(true);
        sQLiteQueryBuilder.setProjectionMap(d);
        sQLiteQueryBuilder.setTables("sharedvalue");
        return sQLiteQueryBuilder.query(sQLiteDatabaseA, null, str, strArr2, null, null, str2);
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        uri.getClass();
        SQLiteDatabase sQLiteDatabaseA = a();
        if (sQLiteDatabaseA == null) {
            return 0;
        }
        int iUpdate = sQLiteDatabaseA.update("sharedvalue", contentValues, str, strArr);
        ContentResolver contentResolver = this.e;
        if (contentResolver == null) {
            agvy.b("contentResolver");
            contentResolver = null;
        }
        contentResolver.notifyChange(uri, null);
        return iUpdate;
    }
}

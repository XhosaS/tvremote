package com.google.android.libraries.geller.portable;

import android.content.Context;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.google.android.libraries.geller.portable.database.GellerDatabase;
import defpackage.acdh;
import defpackage.acgd;
import defpackage.onp;
import defpackage.ooe;
import defpackage.ooh;
import defpackage.ook;
import defpackage.yqi;
import defpackage.yqt;
import defpackage.yqv;
import defpackage.yrl;
import defpackage.yzq;
import defpackage.zar;
import defpackage.zdv;
import defpackage.zdy;
import defpackage.zua;
import defpackage.zyd;
import java.io.File;
import java.io.FileFilter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class GellerDatabaseManagerImpl implements onp {
    private static final zdy a = zdy.h("com/google/android/libraries/geller/portable/GellerDatabaseManagerImpl");
    private final Map b = new HashMap();
    private final Map c = new HashMap();
    private final yqt d;
    private final Map e;
    private final Map f;
    private final Map g;
    private final Context h;
    private final acdh i;

    public GellerDatabaseManagerImpl(Context context, acdh acdhVar, yqt yqtVar, Map map, Map map2, Map map3) {
        new HashMap();
        new HashMap();
        this.h = context;
        this.i = acdhVar;
        this.d = yqtVar;
        this.e = map;
        this.f = map2;
        this.g = map3;
    }

    private final synchronized void d(String str, GellerDatabase gellerDatabase) {
        Map map = this.b;
        if (map.containsKey(str)) {
            long jLongValue = ((Long) map.get(str)).longValue();
            map.remove(str);
            nativeDestroyDatabase(jLongValue);
        }
        if (gellerDatabase != null) {
            gellerDatabase.c();
        }
    }

    private final synchronized boolean e(String str) {
        boolean z;
        z = false;
        for (Map.Entry entry : this.e.entrySet()) {
            acgd acgdVar = (acgd) entry.getKey();
            if (!((Map) entry.getValue()).containsKey(str)) {
                try {
                    ((Map) entry.getValue()).put(str, (ooe) ((zyd) ((yqi) this.f.get(acgdVar)).apply(str)).get(3000L, TimeUnit.MILLISECONDS));
                    z = true;
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    ((zdv) ((zdv) ((zdv) a.c()).p(e)).q("com/google/android/libraries/geller/portable/GellerDatabaseManagerImpl", "maybeUpdateCustomStorageMap", 130, "GellerDatabaseManagerImpl.java")).F("Failed to create custom Geller storage for corpus %s and user %s", acgdVar.name(), str);
                } catch (ExecutionException e2) {
                    e = e2;
                    ((zdv) ((zdv) ((zdv) a.c()).p(e)).q("com/google/android/libraries/geller/portable/GellerDatabaseManagerImpl", "maybeUpdateCustomStorageMap", 124, "GellerDatabaseManagerImpl.java")).F("Failed to create custom Geller storage for corpus %s and user %s", acgdVar.name(), str);
                } catch (TimeoutException e3) {
                    e = e3;
                    ((zdv) ((zdv) ((zdv) a.c()).p(e)).q("com/google/android/libraries/geller/portable/GellerDatabaseManagerImpl", "maybeUpdateCustomStorageMap", 124, "GellerDatabaseManagerImpl.java")).F("Failed to create custom Geller storage for corpus %s and user %s", acgdVar.name(), str);
                }
            }
        }
        return z;
    }

    private final synchronized GellerDatabase f(String str) {
        boolean z;
        Context context;
        yqt yqtVar;
        acdh acdhVar;
        HashMap map;
        SQLiteDatabase sQLiteDatabaseOpenOrCreateDatabase = SQLiteDatabase.openOrCreateDatabase(":memory:", (SQLiteDatabase.CursorFactory) null);
        String strStringForQuery = DatabaseUtils.stringForQuery(sQLiteDatabaseOpenOrCreateDatabase, "SELECT sqlite_version()", null);
        sQLiteDatabaseOpenOrCreateDatabase.close();
        boolean z2 = false;
        try {
            Iterator it = yrl.c(".").e(strStringForQuery).iterator();
            Iterator it2 = yrl.c(".").e("3.25.0").iterator();
            while (true) {
                if (!it.hasNext() && !it2.hasNext()) {
                    break;
                }
                try {
                    int iCompare = Integer.compare(Integer.parseInt((String) zar.e(it, "0")), Integer.parseInt((String) zar.e(it2, "0")));
                    if (iCompare != 0) {
                        if (iCompare < 0) {
                            z2 = true;
                        }
                    }
                } catch (NumberFormatException e) {
                    throw new IllegalArgumentException(e);
                }
            }
        } catch (IllegalArgumentException unused) {
            ((zdv) ((zdv) ooh.c.d()).q("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "isLegacySQLite", 1736, "GellerDatabaseImpl.java")).x("Unable to parse SQLite version %s. Assuming legacy version.", strStringForQuery);
        }
        z = z2;
        context = this.h;
        if (context == null) {
            throw new NullPointerException("Null context");
        }
        if (str == null) {
            throw new NullPointerException("Null databaseId");
        }
        yqtVar = this.d;
        acdhVar = this.i;
        if (acdhVar == null) {
            throw new NullPointerException("Null flags");
        }
        map = new HashMap();
        for (Map.Entry entry : this.e.entrySet()) {
            if (((Map) entry.getValue()).containsKey(str)) {
                map.put(((acgd) entry.getKey()).name(), (ooe) ((Map) entry.getValue()).get(str));
            }
        }
        for (Map.Entry entry2 : this.g.entrySet()) {
            map.put(((acgd) entry2.getKey()).name(), (ooe) entry2.getValue());
        }
        return new ooh(context, str, true, z, 9, yqtVar, map, acdhVar);
    }

    private native long nativeCreateDatabase(GellerDatabase gellerDatabase, String str);

    private native void nativeDestroyDatabase(long j);

    @Override // defpackage.onp
    public final synchronized long a(String str) {
        Long l;
        Map map = this.b;
        String strB = yqv.b(str);
        l = (Long) map.get(strB);
        if (l == null) {
            long jNativeCreateDatabase = nativeCreateDatabase(b(strB), strB);
            Long lValueOf = Long.valueOf(jNativeCreateDatabase);
            lValueOf.getClass();
            if (jNativeCreateDatabase != 0) {
                map.put(strB, lValueOf);
            } else {
                ((zdv) ((zdv) a.c()).q("com/google/android/libraries/geller/portable/GellerDatabaseManagerImpl", "getNativeGellerDatabase", 174, "GellerDatabaseManagerImpl.java")).u("Failed to create native geller database, returning empty response/default value.");
            }
            l = lValueOf;
        }
        return l.longValue();
    }

    @Override // defpackage.onp
    public final synchronized GellerDatabase b(String str) {
        Throwable th;
        GellerDatabase gellerDatabaseF;
        Map map = this.c;
        GellerDatabase gellerDatabase = (GellerDatabase) map.get(str);
        if (!e(str) && gellerDatabase != null) {
            return gellerDatabase;
        }
        d(str, gellerDatabase);
        try {
            gellerDatabaseF = f(str);
        } catch (SQLiteException | IllegalStateException e) {
            th = e;
            gellerDatabaseF = null;
        }
        try {
            map.put(str, gellerDatabaseF);
        } catch (SQLiteException | IllegalStateException e2) {
            th = e2;
            ((zdv) ((zdv) ((zdv) a.c()).p(th)).q("com/google/android/libraries/geller/portable/GellerDatabaseManagerImpl", "getGellerDatabase", 'g', "GellerDatabaseManagerImpl.java")).u("Failed to create/open geller database, returning empty response/default value.");
            return gellerDatabaseF;
        }
        return gellerDatabaseF;
    }

    @Override // defpackage.onp
    public final synchronized void c(yzq yzqVar) {
        Context context = this.h;
        File parentFile = context.getDatabasePath("geller").getParentFile();
        if (parentFile == null) {
            ((zdv) ((zdv) a.d()).q("com/google/android/libraries/geller/portable/GellerDatabaseManagerImpl", "removeDataIfUserNotExist", 223, "GellerDatabaseManagerImpl.java")).u("Cannot get database directory.");
            return;
        }
        File[] fileArrListFiles = parentFile.listFiles(new FileFilter() { // from class: onq
            @Override // java.io.FileFilter
            public final boolean accept(File file) {
                return file.getName().startsWith("portable_geller_") && file.getName().endsWith(".db");
            }
        });
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                String strSubstring = file.getName().substring(0, file.getName().indexOf(".db"));
                String strSubstring2 = strSubstring.substring(16);
                Object objReplace = strSubstring2.replace("_", File.separator);
                if (!yzqVar.contains(strSubstring2) && !yzqVar.contains(objReplace)) {
                    context.deleteDatabase(String.valueOf(strSubstring).concat(".db"));
                    Map map = this.c;
                    map.remove(strSubstring2);
                    map.remove(objReplace);
                    Map map2 = this.b;
                    map2.remove(strSubstring2);
                    map2.remove(objReplace);
                    ook.k(new File(context.getFilesDir(), zua.a("geller", strSubstring2)));
                }
            }
        }
    }
}

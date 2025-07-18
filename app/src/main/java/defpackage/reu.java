package defpackage;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class reu implements rez {
    public final ContentResolver b;
    public final Uri c;
    public final Runnable d;
    public volatile Map f;
    private final ContentObserver i;
    private static final Map h = new we();
    public static final String[] a = {"key", "value"};
    public final Object e = new Object();
    public final List g = new ArrayList();

    private reu(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        contentResolver.getClass();
        uri.getClass();
        this.b = contentResolver;
        this.c = uri;
        this.d = runnable;
        this.i = new ret(this);
    }

    public static reu a(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        reu reuVar;
        synchronized (reu.class) {
            Map map = h;
            reuVar = (reu) map.get(uri);
            if (reuVar == null) {
                try {
                    reu reuVar2 = new reu(contentResolver, uri, runnable);
                    try {
                        contentResolver.registerContentObserver(uri, false, reuVar2.i);
                        map.put(uri, reuVar2);
                    } catch (SecurityException unused) {
                    }
                    reuVar = reuVar2;
                } catch (SecurityException unused2) {
                }
            }
        }
        return reuVar;
    }

    static synchronized void d() {
        Map map = h;
        for (reu reuVar : map.values()) {
            reuVar.b.unregisterContentObserver(reuVar.i);
        }
        map.clear();
    }

    @Override // defpackage.rez
    public final /* bridge */ /* synthetic */ Object b(String str) {
        return (String) c().get(str);
    }

    public final Map c() {
        Map map;
        Map map2 = this.f;
        if (map2 == null) {
            synchronized (this.e) {
                map2 = this.f;
                if (map2 == null) {
                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        try {
                            map = (Map) rex.a(new rey() { // from class: res
                                @Override // defpackage.rey
                                public final Object a() {
                                    reu reuVar = this.a;
                                    ContentResolver contentResolver = reuVar.b;
                                    Uri uri = reuVar.c;
                                    ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
                                    try {
                                        if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                                            Log.w("ConfigurationContentLdr", "Unable to acquire ContentProviderClient, using default values");
                                            return Collections.EMPTY_MAP;
                                        }
                                        Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uri, reu.a, null, null, null);
                                        try {
                                            if (cursorQuery == null) {
                                                Log.w("ConfigurationContentLdr", "ContentProvider query returned null cursor, using default values");
                                                return Collections.EMPTY_MAP;
                                            }
                                            int count = cursorQuery.getCount();
                                            if (count == 0) {
                                                Map map3 = Collections.EMPTY_MAP;
                                                cursorQuery.close();
                                                return map3;
                                            }
                                            Map weVar = count <= 256 ? new we(count) : new HashMap(count, 1.0f);
                                            while (cursorQuery.moveToNext()) {
                                                weVar.put(cursorQuery.getString(0), cursorQuery.getString(1));
                                            }
                                            if (cursorQuery.isAfterLast()) {
                                                cursorQuery.close();
                                                return weVar;
                                            }
                                            Log.w("ConfigurationContentLdr", "Cursor read incomplete (ContentProvider dead?), using default values");
                                            Map map4 = Collections.EMPTY_MAP;
                                            cursorQuery.close();
                                            return map4;
                                        } finally {
                                        }
                                    } catch (RemoteException e) {
                                        Log.w("ConfigurationContentLdr", "ContentProvider query failed, using default values", e);
                                        return Collections.EMPTY_MAP;
                                    } finally {
                                        contentProviderClientAcquireUnstableContentProviderClient.release();
                                    }
                                }
                            });
                        } catch (SQLiteException | IllegalStateException | SecurityException e) {
                            Log.w("ConfigurationContentLdr", "Unable to query ContentProvider, using default values", e);
                            map = Collections.EMPTY_MAP;
                        }
                        this.f = map;
                        map2 = map;
                    } finally {
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    }
                }
            }
        }
        return map2 != null ? map2 : Collections.EMPTY_MAP;
    }
}

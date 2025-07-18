package defpackage;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anq {
    public final AtomicBoolean a = new AtomicBoolean();
    private HashMap f = null;
    public final HashMap b = new HashMap(16, 1.0f);
    public final HashMap c = new HashMap(16, 1.0f);
    public final HashMap d = new HashMap(16, 1.0f);
    private final HashMap g = new HashMap(16, 1.0f);
    public Object e = null;
    private boolean h = false;
    private final String[] i = new String[0];

    public static final void c(ContentResolver contentResolver) {
        if (contentResolver == null) {
            throw new IllegalStateException("ContentResolver needed with GservicesDelegateSupplier.init()");
        }
    }

    public static final Object e(Map map, String str, Object obj) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj2 = map.get(str);
        return obj2 != null ? obj2 : obj;
    }

    public final void a(ContentResolver contentResolver) {
        if (this.f == null) {
            this.a.set(false);
            this.f = new HashMap(16, 1.0f);
            this.e = new Object();
            contentResolver.registerContentObserver(anm.a, true, new ano(this));
            return;
        }
        if (this.a.getAndSet(false)) {
            this.f.clear();
            this.b.clear();
            this.c.clear();
            this.d.clear();
            this.g.clear();
            this.e = new Object();
            this.h = false;
        }
    }

    public final void b(Object obj, Map map, String str, Object obj2) {
        if (obj == this.e) {
            map.put(str, obj2);
            this.f.remove(str);
        }
    }

    public final String d(ContentResolver contentResolver, String str) throws anp {
        String string;
        c(contentResolver);
        synchronized (this) {
            a(contentResolver);
            Object obj = this.e;
            String str2 = null;
            if (this.f.containsKey(str)) {
                String str3 = (String) this.f.get(str);
                if (str3 != null) {
                    str2 = str3;
                }
                return str2;
            }
            try {
                Uri uri = anm.a;
                ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
                try {
                    if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                        throw new anp("Unable to acquire ContentProviderClient");
                    }
                    try {
                        Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uri, null, null, new String[]{str}, null);
                        try {
                            if (cursorQuery == null) {
                                throw new anp("ContentProvider query returned null cursor");
                            }
                            if (cursorQuery.moveToFirst()) {
                                string = cursorQuery.getString(1);
                                cursorQuery.close();
                                contentProviderClientAcquireUnstableContentProviderClient.release();
                            } else {
                                cursorQuery.close();
                                contentProviderClientAcquireUnstableContentProviderClient.release();
                                string = null;
                            }
                            if (string != null && string.equals(null)) {
                                string = null;
                            }
                            synchronized (this) {
                                if (obj == this.e) {
                                    this.f.put(str, string);
                                }
                            }
                            if (string != null) {
                                return string;
                            }
                            return null;
                        } finally {
                        }
                    } catch (RemoteException e) {
                        throw new anp(e);
                    }
                } catch (Throwable th) {
                    contentProviderClientAcquireUnstableContentProviderClient.release();
                    throw th;
                }
            } catch (anp unused) {
                return null;
            }
        }
    }
}

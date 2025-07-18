package defpackage;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public class lxe implements lxa {
    public final AtomicBoolean a = new AtomicBoolean();
    private HashMap h = null;
    public final HashMap b = new HashMap(16, 1.0f);
    public final HashMap c = new HashMap(16, 1.0f);
    public final HashMap d = new HashMap(16, 1.0f);
    private final HashMap i = new HashMap(16, 1.0f);
    public Object e = null;
    public boolean f = false;
    public String[] g = new String[0];

    @Override // defpackage.lxa
    public final String a(ContentResolver contentResolver, String str, String str2) throws lxd {
        Uri uri;
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient;
        String string;
        f(contentResolver);
        synchronized (this) {
            d(contentResolver);
            Object obj = this.e;
            if (this.h.containsKey(str)) {
                String str3 = (String) this.h.get(str);
                if (str3 != null) {
                    str2 = str3;
                }
                return str2;
            }
            for (String str4 : this.g) {
                if (str.startsWith(str4)) {
                    if (!this.f) {
                        c(contentResolver, this.g);
                        if (this.h.containsKey(str)) {
                            String str5 = (String) this.h.get(str);
                            if (str5 != null) {
                                str2 = str5;
                            }
                            return str2;
                        }
                    }
                    return str2;
                }
            }
            try {
                uri = lwz.a;
                contentProviderClientAcquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
            } catch (lxd unused) {
            }
            try {
                if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                    throw new lxd("Unable to acquire ContentProviderClient");
                }
                try {
                    Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uri, null, null, new String[]{str}, null);
                    try {
                        if (cursorQuery == null) {
                            throw new lxd("ContentProvider query returned null cursor");
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
                        if (string != null && string.equals(str2)) {
                            string = str2;
                        }
                        synchronized (this) {
                            if (obj == this.e) {
                                this.h.put(str, string);
                            }
                        }
                        return string != null ? string : str2;
                    } finally {
                    }
                } catch (RemoteException e) {
                    throw new lxd(e);
                }
            } catch (Throwable th) {
                contentProviderClientAcquireUnstableContentProviderClient.release();
                throw th;
            }
        }
    }

    public final Object b(Map map, String str, Object obj) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj2 = map.get(str);
        return obj2 != null ? obj2 : obj;
    }

    public final void c(ContentResolver contentResolver, String[] strArr) throws lxd {
        try {
            Uri uri = lwz.b;
            ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
            if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                throw new lxd("Unable to acquire ContentProviderClient");
            }
            try {
                try {
                    Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uri, null, null, strArr, null);
                    try {
                        if (cursorQuery == null) {
                            throw new lxd("ContentProvider query returned null cursor");
                        }
                        HashMap map = new HashMap(cursorQuery.getCount(), 1.0f);
                        while (cursorQuery.moveToNext()) {
                            map.put(cursorQuery.getString(0), cursorQuery.getString(1));
                        }
                        if (!cursorQuery.isAfterLast()) {
                            throw new lxd("Cursor read incomplete (ContentProvider dead?)");
                        }
                        cursorQuery.close();
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        if (!map.isEmpty()) {
                            Set setKeySet = map.keySet();
                            setKeySet.removeAll(this.b.keySet());
                            setKeySet.removeAll(this.c.keySet());
                            setKeySet.removeAll(this.d.keySet());
                            setKeySet.removeAll(this.i.keySet());
                        }
                        if (!map.isEmpty()) {
                            if (this.h.isEmpty()) {
                                this.h = map;
                            } else {
                                this.h.putAll(map);
                            }
                        }
                        this.f = true;
                    } finally {
                    }
                } catch (RemoteException e) {
                    throw new lxd(e);
                }
            } catch (Throwable th) {
                contentProviderClientAcquireUnstableContentProviderClient.release();
                throw th;
            }
        } catch (lxd unused) {
        }
    }

    public final void d(ContentResolver contentResolver) {
        if (this.h == null) {
            this.a.set(false);
            this.h = new HashMap(16, 1.0f);
            this.e = new Object();
            contentResolver.registerContentObserver(lwz.a, true, new lxc(this));
            return;
        }
        if (this.a.getAndSet(false)) {
            this.h.clear();
            this.b.clear();
            this.c.clear();
            this.d.clear();
            this.i.clear();
            this.e = new Object();
            this.f = false;
        }
    }

    public final void e(Object obj, Map map, String str, Object obj2) {
        if (obj == this.e) {
            map.put(str, obj2);
            this.h.remove(str);
        }
    }

    public final void f(ContentResolver contentResolver) {
        if (contentResolver == null) {
            throw new IllegalStateException("ContentResolver needed with GservicesDelegateSupplier.init()");
        }
    }
}

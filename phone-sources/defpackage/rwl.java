package defpackage;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rwl {
    public static final Map a = new ir();
    public static final String[] b = {"key", "value"};
    public final ContentResolver c;
    public final Uri d;
    public final ContentObserver e;
    public volatile Map g;
    public final Object f = new Object();
    private final List h = new ArrayList();

    public rwl(ContentResolver contentResolver, Uri uri) {
        contentResolver.getClass();
        uri.getClass();
        this.c = contentResolver;
        this.d = uri;
        this.e = new rwk(this);
    }

    static synchronized void a() {
        Map map = a;
        for (rwl rwlVar : map.values()) {
            rwlVar.c.unregisterContentObserver(rwlVar.e);
        }
        map.clear();
    }

    @Deprecated
    public static void b() {
        synchronized (rwl.class) {
            Iterator it = a.values().iterator();
            while (it.hasNext()) {
                ((rwl) it.next()).c();
            }
        }
    }

    public final void c() {
        synchronized (this.f) {
            this.g = null;
            rxa.e();
        }
        synchronized (this) {
            Iterator it = this.h.iterator();
            while (it.hasNext()) {
                ((rwm) it.next()).a();
            }
        }
    }
}

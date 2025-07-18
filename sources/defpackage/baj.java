package defpackage;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class baj {
    public static final Map a = new lz();
    public static final String[] b = {"key", "value"};
    public final ContentResolver c;
    public final Uri d;
    public final ContentObserver e;
    public volatile Map g;
    public final Object f = new Object();
    public final List h = new ArrayList();

    public baj(ContentResolver contentResolver, Uri uri) {
        contentResolver.getClass();
        uri.getClass();
        this.c = contentResolver;
        this.d = uri;
        this.e = new bai(this);
    }

    static synchronized void a() {
        Map map = a;
        for (baj bajVar : map.values()) {
            bajVar.c.unregisterContentObserver(bajVar.e);
        }
        map.clear();
    }
}

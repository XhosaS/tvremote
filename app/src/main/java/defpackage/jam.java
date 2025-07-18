package defpackage;

import android.util.LruCache;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jam {
    public final LruCache a = new LruCache(20);

    public final String a(String str, String str2) {
        return (agyv.n(str) || agyv.n(str2)) ? "" : a.i(str2, str, "@");
    }
}

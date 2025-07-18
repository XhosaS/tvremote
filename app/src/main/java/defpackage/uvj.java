package defpackage;

import android.content.Context;
import android.util.LruCache;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class uvj {
    public static final uvo a(uve uveVar, Context context, LruCache lruCache) {
        uvo uvcVar = (uvo) lruCache.get(uveVar);
        if (uvcVar == null) {
            yqw.L(uveVar.c == 1);
            uvcVar = new uvc(context, uveVar.c == 1 ? (uva) uveVar.d : uva.a);
            lruCache.put(uveVar, uvcVar);
        }
        return uvcVar;
    }
}

package defpackage;

import java.util.LinkedHashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class url {
    public final LinkedHashMap a = new LinkedHashMap(0, 0.75f, true);
    public int b = 0;
    final /* synthetic */ urm c;

    public url(urm urmVar) {
        this.c = urmVar;
    }

    final urk a(urw urwVar) {
        urk urkVar;
        LinkedHashMap linkedHashMap = this.a;
        synchronized (linkedHashMap) {
            urkVar = (urk) linkedHashMap.get(urwVar);
        }
        return urkVar;
    }
}

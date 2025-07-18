package defpackage;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class skz {
    private static final zdy b = zdy.h("com/google/android/libraries/search/audio/core/ref/RefManagerImpl");
    public final slj a;
    private final Map c;

    public skz(slj sljVar) {
        sljVar.getClass();
        this.a = sljVar;
        this.c = new LinkedHashMap();
    }

    private final int c(slb slbVar) {
        Set set = (Set) this.c.get(slbVar.c);
        if (set != null) {
            return set.size();
        }
        return 0;
    }

    public final synchronized sky a(slb slbVar, slb slbVar2) {
        sky skyVar;
        Map map = this.c;
        String str = slbVar.c;
        Object linkedHashSet = map.get(str);
        if (linkedHashSet == null) {
            linkedHashSet = new LinkedHashSet();
            map.put(str, linkedHashSet);
        }
        slbVar2.c.getClass();
        skyVar = new sky(!((Set) linkedHashSet).add(r0), c(slbVar));
        ((zdv) b.b().o(zfi.a, "ALT.RefManager").q("com/google/android/libraries/search/audio/core/ref/RefManagerImpl", "addRef", 68, "RefManager.kt")).I("#audio# referencing(%s) to(%s), (%s)", slbVar2.c, slbVar.c, skyVar);
        return skyVar;
    }

    public final synchronized sky b(slb slbVar, slb slbVar2) {
        sky skyVar;
        Set set = (Set) this.c.get(slbVar.c);
        skyVar = new sky(set != null ? set.remove(slbVar2.c) : false, c(slbVar));
        ((zdv) b.b().o(zfi.a, "ALT.RefManager").q("com/google/android/libraries/search/audio/core/ref/RefManagerImpl", "removeRef", 76, "RefManager.kt")).I("#audio# de-referencing(%s) from(%s), (%s)", slbVar2.c, slbVar.c, skyVar);
        return skyVar;
    }
}

package defpackage;

import java.util.LinkedHashMap;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class xc {
    public final LinkedHashMap a;

    public xc() {
        this(16);
    }

    public final Object a(Object obj) {
        obj.getClass();
        return this.a.remove(obj);
    }

    public final Set b() {
        Set setEntrySet = this.a.entrySet();
        setEntrySet.getClass();
        return setEntrySet;
    }

    public xc(int i) {
        this.a = new LinkedHashMap(i, 0.75f, true);
    }
}

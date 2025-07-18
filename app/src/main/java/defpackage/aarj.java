package defpackage;

import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class aarj {
    public static volatile aarj a;
    private final Set b = new HashSet();

    final Set a() {
        Set setUnmodifiableSet;
        Set set = this.b;
        synchronized (set) {
            setUnmodifiableSet = DesugarCollections.unmodifiableSet(set);
        }
        return setUnmodifiableSet;
    }
}

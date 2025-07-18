package defpackage;

import j$.util.DesugarCollections;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class xcj implements xcm {
    public final Map a;

    public xcj(Map map) {
        this.a = DesugarCollections.unmodifiableMap(map);
    }
}

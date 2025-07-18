package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class opf implements oph {
    private final /* synthetic */ int a;

    @Override // defpackage.oph
    public final Map a(int i) {
        return this.a != 0 ? new HashMap(i, 1.0f) : new TreeMap();
    }
}

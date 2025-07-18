package defpackage;

import java.util.Collections;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aagd implements aagc {
    private static final Set a = Collections.singleton("UTC");

    @Override // defpackage.aagc
    public final Set a() {
        return a;
    }

    @Override // defpackage.aagc
    public final aabs b(String str) {
        if ("UTC".equalsIgnoreCase(str)) {
            return aabs.b;
        }
        return null;
    }
}

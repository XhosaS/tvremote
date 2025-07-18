package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class erd {
    final List a = new ArrayList();

    protected erd() {
    }

    public abstract eqw a(String str, epp eppVar, List list);

    final eqw b(String str) {
        if (this.a.contains(epq.d(str))) {
            throw new UnsupportedOperationException("Command not implemented: ".concat(String.valueOf(str)));
        }
        throw new IllegalArgumentException("Command not supported");
    }
}

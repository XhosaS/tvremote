package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mas implements Serializable {
    private static final long serialVersionUID = 1223048561485740337L;

    private mas() {
    }

    private Object readResolve() {
        return kwx.createLegacy(null, null, null, 0, null);
    }
}

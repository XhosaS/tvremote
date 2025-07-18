package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class maq implements Serializable {
    private static final long serialVersionUID = -7560428368682267341L;

    private maq() {
    }

    private Object readResolve() {
        return kwx.createLegacy(null, null, null, 2, null);
    }
}

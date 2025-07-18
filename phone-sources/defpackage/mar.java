package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mar implements Serializable {
    private static final long serialVersionUID = 7047796719966698654L;

    private mar() {
    }

    private Object readResolve() {
        return kwx.createLegacy(null, null, null, 0, null);
    }
}

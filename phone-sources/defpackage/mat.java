package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mat implements Serializable {
    private static final long serialVersionUID = 388390596227930439L;

    private mat() {
    }

    private Object readResolve() {
        return kwx.createLegacy(null, null, null, 0, null);
    }
}

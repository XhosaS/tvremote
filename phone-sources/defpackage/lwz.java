package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lwz implements Serializable {
    private static final long serialVersionUID = 7221043144707804745L;

    private Object readResolve() {
        return new lxa(false, null, null, null);
    }
}

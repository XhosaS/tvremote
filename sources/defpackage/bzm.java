package defpackage;

import java.io.Serializable;
import java.util.EnumSet;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bzm implements Serializable {
    private static final long serialVersionUID = 0;
    final EnumSet a;

    public bzm(EnumSet enumSet) {
        this.a = enumSet;
    }

    Object readResolve() {
        return new bzn(this.a.clone());
    }
}

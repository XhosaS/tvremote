package defpackage;

import java.io.Serializable;
import java.util.EnumSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
class yyc implements Serializable {
    private static final long serialVersionUID = 0;
    final EnumSet a;

    public yyc(EnumSet enumSet) {
        this.a = enumSet;
    }

    Object readResolve() {
        return new yyd(this.a.clone());
    }
}

package defpackage;

import java.io.Serializable;
import java.util.EnumMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
class yya implements Serializable {
    private static final long serialVersionUID = 0;
    final EnumMap a;

    public yya(EnumMap enumMap) {
        this.a = enumMap;
    }

    Object readResolve() {
        return new yyb(this.a);
    }
}

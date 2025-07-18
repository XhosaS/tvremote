package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bzx implements Serializable {
    private final bzs a;

    public bzx(bzs bzsVar) {
        this.a = bzsVar;
    }

    Object readResolve() {
        bzs bzsVar = this.a;
        return bzsVar.isEmpty() ? bzy.a : biu.h(bzsVar, bzs.q(cau.a)) ? bzy.b : new bzy(bzsVar);
    }
}

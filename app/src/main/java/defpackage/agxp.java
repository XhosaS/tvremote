package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agxp implements agxs {
    public final agxs a;
    public final agux b;

    public agxp(agxs agxsVar, agux aguxVar) {
        this.a = agxsVar;
        this.b = aguxVar;
    }

    @Override // defpackage.agxs
    public final Iterator a() {
        return new agxo(this);
    }
}

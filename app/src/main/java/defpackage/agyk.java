package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agyk implements agxs {
    public final agxs a;
    public final agux b;

    public agyk(agxs agxsVar, agux aguxVar) {
        this.a = agxsVar;
        this.b = aguxVar;
    }

    @Override // defpackage.agxs
    public final Iterator a() {
        return new agyj(this);
    }
}

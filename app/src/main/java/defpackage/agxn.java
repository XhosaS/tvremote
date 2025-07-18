package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agxn implements agxs {
    public final agxs a;
    public final boolean b;
    public final agux c;

    public agxn(agxs agxsVar, boolean z, agux aguxVar) {
        this.a = agxsVar;
        this.b = z;
        this.c = aguxVar;
    }

    @Override // defpackage.agxs
    public final Iterator a() {
        return new agxm(this);
    }
}

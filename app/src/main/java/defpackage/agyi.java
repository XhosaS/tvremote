package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agyi implements agxs, agxk {
    public final agxs a;
    public final int b;

    public agyi(agxs agxsVar, int i) {
        this.a = agxsVar;
        this.b = i;
    }

    @Override // defpackage.agxs
    public final Iterator a() {
        return new agyh(this);
    }

    @Override // defpackage.agxk
    public final agxs b(int i) {
        return i >= this.b ? this : new agyi(this.a, i);
    }
}

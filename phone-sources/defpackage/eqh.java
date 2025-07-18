package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eqh extends exm {
    private final List c;
    private final long d;

    public eqh(long j, List list) {
        super(0L, list.size() - 1);
        this.d = j;
        this.c = list;
    }

    @Override // defpackage.exy
    public final long a() {
        c();
        erj erjVar = (erj) this.c.get((int) this.a);
        return this.d + erjVar.g + erjVar.e;
    }

    @Override // defpackage.exy
    public final long b() {
        c();
        return this.d + ((erj) this.c.get((int) this.a)).g;
    }
}

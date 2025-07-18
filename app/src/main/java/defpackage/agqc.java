package defpackage;

import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agqc extends agqd implements RandomAccess {
    private final agqd b;
    private final int c;
    private final int d;

    public agqc(agqd agqdVar, int i, int i2) {
        this.b = agqdVar;
        this.c = i;
        agqd.a.d(i, i2, agqdVar.a());
        this.d = i2 - i;
    }

    @Override // defpackage.agpx
    public final int a() {
        return this.d;
    }

    @Override // defpackage.agqd, java.util.List
    public final Object get(int i) {
        agqd.a.b(i, this.d);
        return this.b.get(this.c + i);
    }
}

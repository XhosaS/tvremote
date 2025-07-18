package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eob extends eoa {
    final List e;

    public eob(enw enwVar, long j, long j2, long j3, long j4, List list, long j5, List list2, long j6, long j7) {
        super(enwVar, j, j2, j3, j4, list, j5, j6, j7);
        this.e = list2;
    }

    @Override // defpackage.eoa
    public final long c(long j) {
        return this.e.size();
    }

    @Override // defpackage.eoa
    public final enw g(enz enzVar, long j) {
        return (enw) this.e.get((int) (j - this.a));
    }

    @Override // defpackage.eoa
    public final boolean h() {
        return true;
    }
}

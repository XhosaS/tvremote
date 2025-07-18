package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class yuz implements yuu {
    public final long a;
    private final long b = Long.MAX_VALUE;

    public yuz(long j) {
        this.a = j;
    }

    @Override // defpackage.yuu
    public final ysx a(yva yvaVar) {
        yuy yuyVar = new yuy(this, null);
        int i = ytx.a;
        return ytb.a(new ipi(new yvp(yuyVar, yvaVar), new dbi((yih) null, 4, (int[]) null), 16));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof yuz)) {
            return false;
        }
        yuz yuzVar = (yuz) obj;
        if (this.a != yuzVar.a) {
            return false;
        }
        long j = yuzVar.b;
        return true;
    }

    public final int hashCode() {
        return (wae.ab(this.a) * 31) + wae.ab(Long.MAX_VALUE);
    }

    public final String toString() throws IOException {
        yhp yhpVar = new yhp(2);
        long j = this.a;
        if (j > 0) {
            yhpVar.add(a.cp(j, "stopTimeout=", "ms"));
        }
        return "SharingStarted.WhileSubscribed(" + yfm.ax(yfm.o(yhpVar), null, null, null, null, 63) + ")";
    }
}

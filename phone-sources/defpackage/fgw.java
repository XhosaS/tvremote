package defpackage;

import j$.util.DesugarCollections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fgw extends fgu {
    public final long a;
    public final long b;

    public fgw(long j, long j2, List list) {
        this.a = j;
        this.b = j2;
        DesugarCollections.unmodifiableList(list);
    }

    @Override // defpackage.fgu
    public final String toString() {
        return "SCTE-35 SpliceInsertCommand { programSplicePts=" + this.a + ", programSplicePlaybackPositionUs= " + this.b + " }";
    }
}

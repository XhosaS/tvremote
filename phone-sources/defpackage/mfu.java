package defpackage;

import android.net.TrafficStats;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mfu implements mft {
    private final int a;

    public mfu(int i) {
        this.a = TrafficStats.getAndSetThreadStatsTag(i);
    }

    @Override // defpackage.mft
    public final void a() {
        TrafficStats.setThreadStatsTag(this.a);
    }
}

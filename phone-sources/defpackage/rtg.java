package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rtg {
    public final long a;
    public long b;
    public long c;
    public int d;
    public int e;
    final String f;
    final String g;
    final boolean h;
    String i;
    int j;
    public String k;
    zaf l;
    int m;
    yzi n;
    int o;
    int p;
    public int q;
    public int r;
    int u;
    public int v;
    int w = 1;
    public int s = -1;
    public tst t = trk.a;

    public rtg(String str, String str2, boolean z, long j) {
        this.g = sij.D(str);
        this.f = sij.D(str2);
        this.h = z;
        this.a = j;
    }

    public static rtg a(String str, rmp rmpVar) {
        return new rtg(str, rmp.d(rmpVar), true, SystemClock.elapsedRealtime());
    }
}

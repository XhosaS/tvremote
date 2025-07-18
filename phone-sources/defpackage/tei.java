package defpackage;

import android.app.PendingIntent;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tei {
    public final int a;
    public final int b;
    public final int c;
    public final Integer d;
    public final int e;
    public final long f;
    public final long g;
    public boolean h = false;
    private final PendingIntent i;
    private final PendingIntent j;

    public tei(int i, int i2, int i3, Integer num, int i4, long j, long j2, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = num;
        this.e = i4;
        this.f = j;
        this.g = j2;
        this.i = pendingIntent;
        this.j = pendingIntent2;
    }

    public final PendingIntent a(tej tejVar) {
        if (tejVar.a == 0) {
            PendingIntent pendingIntent = this.j;
            if (pendingIntent != null) {
                return pendingIntent;
            }
            return null;
        }
        PendingIntent pendingIntent2 = this.i;
        if (pendingIntent2 != null) {
            return pendingIntent2;
        }
        return null;
    }

    public final boolean b(int i) {
        return a(new tej(i)) != null;
    }
}

package defpackage;

import java.util.HashMap;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ehz {
    public final ezp a;
    public final long b;
    public final long c;
    public final int d;
    public final boolean e;
    public final long f;
    public final HashMap g;
    public long h;
    private final long i;
    private final long j;

    public ehz() {
        this(new ezp(65536), 50000, 50000, 1000, 2000, -1, false);
    }

    public static void b(int i, int i2, String str, String str2) {
        eci.a(i >= i2, a.cq(str2, str, " cannot be less than "));
    }

    final int a() {
        Iterator it = this.g.values().iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((tia) it.next()).a;
        }
        return i;
    }

    public final void c(elk elkVar) {
        if (this.g.remove(elkVar) != null) {
            d();
        }
    }

    public final void d() {
        if (this.g.isEmpty()) {
            this.a.b();
        } else {
            this.a.c(a());
        }
    }

    public final boolean e(ejg ejgVar) {
        tia tiaVar = (tia) this.g.get(ejgVar.a);
        tiaVar.getClass();
        float f = ejgVar.c;
        int iA = this.a.a();
        int iA2 = a();
        long jMin = this.i;
        if (f > 1.0f) {
            jMin = Math.min(edt.v(jMin, f), this.j);
        }
        long j = ejgVar.b;
        if (j < Math.max(jMin, 500000L)) {
            boolean z = this.e || iA < iA2;
            tiaVar.b = z;
            if (!z && j < 500000) {
                edb.e("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j >= this.j || iA >= iA2) {
            tiaVar.b = false;
        }
        return tiaVar.b;
    }

    public ehz(ezp ezpVar, int i, int i2, int i3, int i4, int i5, boolean z) {
        b(i3, 0, "bufferForPlaybackMs", "0");
        b(i4, 0, "bufferForPlaybackAfterRebufferMs", "0");
        b(i, i3, "minBufferMs", "bufferForPlaybackMs");
        b(i, i4, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        b(i2, i, "maxBufferMs", "minBufferMs");
        b(0, 0, "backBufferDurationMs", "0");
        this.a = ezpVar;
        this.i = edt.y(i);
        this.j = edt.y(i2);
        this.b = edt.y(i3);
        this.c = edt.y(i4);
        this.d = i5;
        this.e = z;
        this.f = edt.y(0L);
        this.g = new HashMap();
        this.h = -1L;
    }
}

package defpackage;

import android.os.Bundle;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public final class ew {
    public long a;
    private final List b;
    private int c;
    private long d;
    private long e;
    private float f;
    private int g;
    private CharSequence h;
    private long i;
    private long j;
    private Bundle k;

    public ew() {
        this.b = new ArrayList();
        this.j = -1L;
    }

    public final ey a() {
        return new ey(this.c, this.d, this.e, this.f, this.a, this.g, this.h, this.i, this.b, this.j, this.k);
    }

    public final void b(ex exVar) {
        if (exVar == null) {
            throw new IllegalArgumentException("You may not add a null CustomAction to PlaybackStateCompat");
        }
        this.b.add(exVar);
    }

    public final void c(int i, long j, float f, long j2) {
        this.c = i;
        this.d = j;
        this.i = j2;
        this.f = f;
    }

    public final void d(int i, long j) {
        c(i, j, 1.0f, SystemClock.elapsedRealtime());
    }

    public ew(ey eyVar) {
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        this.j = -1L;
        this.c = eyVar.a;
        this.d = eyVar.b;
        this.f = eyVar.d;
        this.i = eyVar.h;
        this.e = eyVar.c;
        this.a = eyVar.e;
        this.g = eyVar.f;
        this.h = eyVar.g;
        List list = eyVar.i;
        if (list != null) {
            arrayList.addAll(list);
        }
        this.j = eyVar.j;
        this.k = eyVar.k;
    }
}

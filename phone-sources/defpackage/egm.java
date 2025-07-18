package defpackage;

import java.io.InterruptedIOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class egm {
    public final egh a;
    public final egc b;
    public final eey c;
    public final String d;
    public final byte[] e;
    public long f;
    public long g;
    public long h;
    public volatile boolean i;
    public final jdv j;

    public egm(egh eghVar, eey eeyVar, byte[] bArr, jdv jdvVar) {
        this.a = eghVar;
        this.b = eghVar.a;
        this.c = eeyVar;
        this.e = bArr;
        this.j = jdvVar;
        this.d = clw.P(eeyVar);
        this.f = eeyVar.f;
    }

    public final void a(long j) {
        if (this.g == j) {
            return;
        }
        this.g = j;
        this.j.b(0L);
    }

    public final void b() {
        if (this.i) {
            throw new InterruptedIOException();
        }
    }
}

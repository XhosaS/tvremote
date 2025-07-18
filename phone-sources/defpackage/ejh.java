package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ejh {
    public long a;
    public float b;
    public long c;

    public ejh() {
        this.a = -9223372036854775807L;
        this.b = -3.4028235E38f;
        this.c = -9223372036854775807L;
    }

    public final void a(long j) {
        boolean z = true;
        if (j < 0) {
            if (j == -9223372036854775807L) {
                j = -9223372036854775807L;
            } else {
                z = false;
            }
        }
        a.H(z);
        this.c = j;
    }

    public final void b(float f) {
        boolean z = true;
        if (f <= 0.0f && f != -3.4028235E38f) {
            z = false;
        }
        a.H(z);
        this.b = f;
    }

    public ejh(eji ejiVar) {
        this.a = ejiVar.a;
        this.b = ejiVar.b;
        this.c = ejiVar.c;
    }
}

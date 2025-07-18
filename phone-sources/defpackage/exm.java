package defpackage;

import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class exm implements exy {
    public long a;
    private final long c;
    private final long d;

    public exm(long j, long j2) {
        this.c = j;
        this.d = j2;
        this.a = j - 1;
    }

    protected final void c() {
        long j = this.a;
        if (j < this.c || j > this.d) {
            throw new NoSuchElementException();
        }
    }

    @Override // defpackage.exy
    public final boolean d() {
        long j = this.a + 1;
        this.a = j;
        return j <= this.d;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class env extends enu {
    public long a;

    public env(long j) {
        if (j == 0) {
            throw new IllegalStateException("Failed to allocate native memory");
        }
        this.a = j;
    }
}

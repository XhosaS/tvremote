package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class qpt {
    public abstract qpu a();

    public abstract void b();

    public final qpu c() {
        qpu qpuVarA = a();
        yqw.P(((qoo) qpuVarA).a > 0, "Thread pool size must be less than or equal to %s", 2);
        return qpuVarA;
    }
}

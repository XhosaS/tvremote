package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class rbj {
    public abstract rbk a();

    public abstract void b(int i);

    public final rbk c() {
        rbk rbkVarA = a();
        yqw.M(true, "Rate limit per second must be >= 0");
        float f = ((rbh) rbkVarA).a;
        yqw.M(f > 0.0f && f <= 1.0f, "Sampling Probability shall be > 0 and <= 1");
        return rbkVarA;
    }
}

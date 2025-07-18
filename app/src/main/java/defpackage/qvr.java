package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class qvr {
    public abstract qvs a();

    public abstract void b(int i);

    public final qvs c() {
        qvs qvsVarA = a();
        float f = ((qvq) qvsVarA).a;
        boolean z = false;
        if (f > 0.0f && f <= 100.0f) {
            z = true;
        }
        yqw.B(z, "StartupSamplePercentage should be a floating number > 0 and <= 100.");
        return qvsVarA;
    }
}

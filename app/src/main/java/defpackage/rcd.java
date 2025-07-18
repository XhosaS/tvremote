package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class rcd {
    public abstract rce a();

    public final rce b() {
        rce rceVarA = a();
        float f = ((rbw) rceVarA).a;
        boolean z = false;
        if (f >= 0.0f && f <= 1.0f) {
            z = true;
        }
        yqw.M(z, "Probability shall be between 0 and 1.");
        return rceVarA;
    }
}

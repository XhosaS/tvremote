package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class bjm {
    public long m;
    public bjm n;

    public bjm(long j) {
        this.m = j;
    }

    public abstract bjm a();

    public abstract void b(bjm bjmVar);

    public bjm c(long j) {
        bjm bjmVarA = a();
        bjmVarA.m = j;
        return bjmVarA;
    }

    public bjm() {
        this(bjb.b().v());
    }
}

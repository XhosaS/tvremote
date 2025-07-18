package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class exw extends exp {
    public final long y;

    public exw(ees eesVar, eey eeyVar, dze dzeVar, int i, long j, long j2, long j3) {
        super(eesVar, eeyVar, 1, dzeVar, i, j, j2);
        dzeVar.getClass();
        this.y = j3;
    }

    public abstract boolean f();

    public long m() {
        long j = this.y;
        if (j != -1) {
            return j + 1;
        }
        return -1L;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class tye {
    public final int a;
    public final tvr b;

    protected tye(tvr tvrVar, int i) {
        if (tvrVar == null) {
            throw new IllegalArgumentException("format options cannot be null");
        }
        if (i < 0) {
            throw new IllegalArgumentException(a.cf(i, "invalid index: "));
        }
        this.a = i;
        this.b = tvrVar;
    }

    public abstract void a(tyi tyiVar, Object obj);
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class cfc {
    public final int a;
    public final ccy b;

    protected cfc(ccy ccyVar, int i) {
        if (ccyVar == null) {
            throw new IllegalArgumentException("format options cannot be null");
        }
        if (i < 0) {
            throw new IllegalArgumentException(b.e(i, "invalid index: "));
        }
        this.a = i;
        this.b = ccyVar;
    }

    public abstract void a(cfg cfgVar, Object obj);
}

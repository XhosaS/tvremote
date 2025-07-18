package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bbl extends bcp {
    private final bds a;

    public bbl(bds bdsVar, yjk yjkVar) {
        super(yjkVar);
        this.a = bdsVar;
    }

    @Override // defpackage.bcp
    public final bcq c(Object obj) {
        return new bcq(this, obj, obj == null, this.a, true);
    }
}

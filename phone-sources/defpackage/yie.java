package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yie implements yik {
    private final yjv a;
    private final yik b;

    public yie(yik yikVar, yjv yjvVar) {
        this.a = yjvVar;
        this.b = yikVar instanceof yie ? ((yie) yikVar).b : yikVar;
    }

    public final yij a(yij yijVar) {
        return (yij) this.a.a(yijVar);
    }

    public final boolean b(yik yikVar) {
        yikVar.getClass();
        return yikVar == this || this.b == yikVar;
    }

    public yie() {
        this(yii.k, new qyx(12));
    }
}

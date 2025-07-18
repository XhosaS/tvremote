package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class avj extends yiz implements yka {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avj(avn avnVar, yih yihVar, int i) {
        super(3, yihVar);
        this.b = i;
        this.a = avnVar;
    }

    @Override // defpackage.yka
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        if (this.b != 0) {
            return new avj((ylb) this.a, (yih) obj3, 1).invokeSuspend(ygi.a);
        }
        ((Number) obj2).floatValue();
        return new avj((avn) this.a, (yih) obj3, 0).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        if (this.b != 0) {
            ybn.f(obj);
            ((ylb) this.a).a = true;
            return ygi.a;
        }
        ybn.f(obj);
        ((avn) this.a).f.a();
        return ygi.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avj(ylb ylbVar, yih yihVar, int i) {
        super(3, yihVar);
        this.b = i;
        this.a = ylbVar;
    }
}

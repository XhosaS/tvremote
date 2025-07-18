package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajh extends yiz implements yjv {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajh(ajk ajkVar, yih yihVar, int i) {
        super(1, yihVar);
        this.b = i;
        this.a = ajkVar;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, yjk] */
    @Override // defpackage.yjv
    public final /* synthetic */ Object a(Object obj) {
        switch (this.b) {
            case 0:
                return new ajh((ajk) this.a, (yih) obj, 0).invokeSuspend(ygi.a);
            case 1:
                return new ajh((mr) this.a, (yih) obj, 1).invokeSuspend(ygi.a);
            case 2:
                return new ajh((yjk) this.a, (yih) obj, 2).invokeSuspend(ygi.a);
            case 3:
                return new ajh((iye) this.a, (yih) obj, 3).invokeSuspend(ygi.a);
            case 4:
                return new ajh((jpy) this.a, (yih) obj, 4).invokeSuspend(ygi.a);
            case 5:
                return new ajh((jqe) this.a, (yih) obj, 5).invokeSuspend(ygi.a);
            case 6:
                return new ajh((mok) this.a, (yih) obj, 6).invokeSuspend(ygi.a);
            case 7:
                return new ajh((mok) this.a, (yih) obj, 7, null).invokeSuspend(ygi.a);
            default:
                return new ajh((mpb) this.a, (yih) obj, 8).invokeSuspend(ygi.a);
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, yjk] */
    @Override // defpackage.yit
    public final yih create(yih yihVar) {
        switch (this.b) {
            case 0:
                return new ajh((ajk) this.a, yihVar, 0);
            case 1:
                return new ajh((mr) this.a, yihVar, 1);
            case 2:
                return new ajh((yjk) this.a, yihVar, 2);
            case 3:
                return new ajh((iye) this.a, yihVar, 3);
            case 4:
                return new ajh((jpy) this.a, yihVar, 4);
            case 5:
                return new ajh((jqe) this.a, yihVar, 5);
            case 6:
                return new ajh((mok) this.a, yihVar, 6);
            case 7:
                return new ajh((mok) this.a, yihVar, 7, null);
            default:
                return new ajh((mpb) this.a, yihVar, 8);
        }
    }

    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, yjk] */
    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        switch (this.b) {
            case 0:
                ybn.f(obj);
                ((ajk) this.a).d.D(false);
                break;
            case 1:
                ybn.f(obj);
                ((mr) this.a).g();
                break;
            case 2:
                ybn.f(obj);
                break;
            case 3:
                ybn.f(obj);
                ((iye) this.a).b(true);
                break;
            case 4:
                ybn.f(obj);
                ((jpy) this.a).e.k(true);
                break;
            case 5:
                ybn.f(obj);
                ((jqe) this.a).e.k(true);
                break;
            case 6:
                ybn.f(obj);
                ((mok) this.a).a();
                break;
            case 7:
                ybn.f(obj);
                ((mok) this.a).a();
                break;
            default:
                ybn.f(obj);
                ((mpb) this.a).a();
                break;
        }
        return ygi.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajh(iye iyeVar, yih yihVar, int i) {
        super(1, yihVar);
        this.b = i;
        this.a = iyeVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajh(jpy jpyVar, yih yihVar, int i) {
        super(1, yihVar);
        this.b = i;
        this.a = jpyVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajh(jqe jqeVar, yih yihVar, int i) {
        super(1, yihVar);
        this.b = i;
        this.a = jqeVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajh(mok mokVar, yih yihVar, int i) {
        super(1, yihVar);
        this.b = i;
        this.a = mokVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajh(mok mokVar, yih yihVar, int i, byte[] bArr) {
        super(1, yihVar);
        this.b = i;
        this.a = mokVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajh(mpb mpbVar, yih yihVar, int i) {
        super(1, yihVar);
        this.b = i;
        this.a = mpbVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajh(mr mrVar, yih yihVar, int i) {
        super(1, yihVar);
        this.b = i;
        this.a = mrVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajh(yjk yjkVar, yih yihVar, int i) {
        super(1, yihVar);
        this.b = i;
        this.a = yjkVar;
    }
}

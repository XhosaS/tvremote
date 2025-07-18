package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ua extends yiz implements yka {
    private final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ua(yih yihVar, int i) {
        super(3, yihVar);
        this.a = i;
    }

    @Override // defpackage.yka
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        if (i == 0) {
            ((Number) obj2).floatValue();
            return new ua((yih) obj3, 0).invokeSuspend(ygi.a);
        }
        if (i != 1) {
            long j = ((bmx) obj2).a;
            return new ua((yih) obj3, 2, (char[]) null).invokeSuspend(ygi.a);
        }
        long j2 = ((bmx) obj2).a;
        return new ua((yih) obj3, 1, (byte[]) null).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        if (i == 0) {
            ybn.f(obj);
            return ygi.a;
        }
        if (i != 1) {
            ybn.f(obj);
            return ygi.a;
        }
        ybn.f(obj);
        return ygi.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ua(yih yihVar, int i, byte[] bArr) {
        super(3, yihVar);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ua(yih yihVar, int i, char[] cArr) {
        super(3, yihVar);
        this.a = i;
    }
}

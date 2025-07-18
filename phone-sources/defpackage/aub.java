package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aub extends yiz implements yjz {
    /* synthetic */ Object a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aub(aed aedVar, bvc bvcVar, yjk yjkVar, yjk yjkVar2, yih yihVar, int i) {
        super(2, yihVar);
        this.f = i;
        this.c = aedVar;
        this.e = bvcVar;
        this.b = yjkVar;
        this.d = yjkVar2;
    }

    @Override // defpackage.yjz
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.f != 0) {
            return ((aub) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
        }
        return ((aub) create((CharSequence) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [bvc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, yjk] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, yow] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, yjk] */
    /* JADX WARN: Type inference failed for: r6v1, types: [bdy, java.lang.Object] */
    @Override // defpackage.yit
    public final yih create(Object obj, yih yihVar) {
        if (this.f != 0) {
            aub aubVar = new aub((aed) this.c, (bvc) this.e, (yjk) this.b, (yjk) this.d, yihVar, 1);
            aubVar.a = obj;
            return aubVar;
        }
        Object obj2 = this.b;
        yld yldVar = (yld) obj2;
        aub aubVar2 = new aub(yldVar, (cvi) this.c, (yow) this.d, (bdy) this.e, yihVar, 0);
        aubVar2.a = obj;
        return aubVar2;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, yjk] */
    /* JADX WARN: Type inference failed for: r4v1, types: [bdy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, yow] */
    /* JADX WARN: Type inference failed for: r6v1, types: [bvc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, yjk] */
    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        if (this.f != 0) {
            ybn.f(obj);
            yow yowVar = (yow) this.a;
            ?? r7 = this.b;
            ?? r6 = this.e;
            aed aedVar = (aed) this.c;
            ykr.q(yowVar, null, 0, new th(aedVar, (bvc) r6, (yjk) r7, (yih) null, 5), 3);
            return ykr.q(yowVar, null, 0, new qd(aedVar, (yjk) this.d, (yih) null, 10), 3);
        }
        ybn.f(obj);
        int length = ((CharSequence) this.a).length();
        yld yldVar = (yld) this.b;
        if (length > yldVar.a && ((Boolean) this.e.a()).booleanValue()) {
            cvi cviVar = (cvi) this.c;
            if (!aun.d(cviVar)) {
                ykr.q(this.d, null, 0, new ajn(cviVar, (yih) null, 20, (short[]) null), 3);
            }
        }
        yldVar.a = length;
        return ygi.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aub(yld yldVar, cvi cviVar, yow yowVar, bdy bdyVar, yih yihVar, int i) {
        super(2, yihVar);
        this.f = i;
        this.b = yldVar;
        this.c = cviVar;
        this.d = yowVar;
        this.e = bdyVar;
    }
}

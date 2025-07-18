package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dxe extends yiz implements yjz {
    int a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    final /* synthetic */ Object e;
    private /* synthetic */ Object f;
    private final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxe(bte bteVar, yka ykaVar, yjv yjvVar, uz uzVar, yih yihVar, int i) {
        super(2, yihVar);
        this.g = i;
        this.b = bteVar;
        this.e = ykaVar;
        this.d = yjvVar;
        this.c = uzVar;
    }

    @Override // defpackage.yjz
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.g != 0) {
            return ((dxe) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
        }
        return ((dxe) create((bco) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [bte, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, yka] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, yil] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, ysx] */
    @Override // defpackage.yit
    public final yih create(Object obj, yih yihVar) {
        if (this.g != 0) {
            dxe dxeVar = new dxe((bte) this.b, (yka) this.e, (yjv) this.d, (uz) this.c, yihVar, 1);
            dxeVar.f = obj;
            return dxeVar;
        }
        Object obj2 = this.b;
        dve dveVar = (dve) obj2;
        dxe dxeVar2 = new dxe(dveVar, (dvd) this.c, (yil) this.d, (ysx) this.e, yihVar, 0);
        dxeVar2.f = obj;
        return dxeVar2;
    }

    /* JADX WARN: Type inference failed for: r10v8, types: [bte, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, yil] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, ysx] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, yka] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, yjv] */
    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        if (this.g != 0) {
            yio yioVar = yio.a;
            int i = this.a;
            ybn.f(obj);
            if (i == 0) {
                yow yowVar = (yow) this.f;
                ?? r10 = this.b;
                wa waVar = new wa(yowVar, this.e, this.d, (uz) this.c, null);
                this.a = 1;
                if (kv.k(r10, waVar, this) == yioVar) {
                    return yioVar;
                }
            }
            return ygi.a;
        }
        yio yioVar2 = yio.a;
        if (this.a != 0) {
            ybn.f(obj);
        } else {
            ybn.f(obj);
            bco bcoVar = (bco) this.f;
            Object obj2 = this.b;
            Object obj3 = this.c;
            th thVar = new th((yil) this.d, (ysx) this.e, bcoVar, (yih) null, 12);
            this.a = 1;
            if (dvb.g((dve) obj2, (dvd) obj3, thVar, this) == yioVar2) {
                return yioVar2;
            }
        }
        return ygi.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxe(dve dveVar, dvd dvdVar, yil yilVar, ysx ysxVar, yih yihVar, int i) {
        super(2, yihVar);
        this.g = i;
        this.b = dveVar;
        this.c = dvdVar;
        this.d = yilVar;
        this.e = ysxVar;
    }
}

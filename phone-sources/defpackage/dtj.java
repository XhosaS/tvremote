package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dtj extends yiz implements yjz {
    int a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    final /* synthetic */ Object e;
    private /* synthetic */ Object f;
    private final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dtj(bte bteVar, yka ykaVar, yjv yjvVar, yjv yjvVar2, yih yihVar, int i) {
        super(2, yihVar);
        this.g = i;
        this.e = bteVar;
        this.c = ykaVar;
        this.d = yjvVar;
        this.b = yjvVar2;
    }

    @Override // defpackage.yjz
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        int i = this.g;
        if (i == 0) {
            return ((dtj) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
        }
        if (i != 1) {
            return ((dtj) create((ysy) obj, (yih) obj2)).invokeSuspend(ygi.a);
        }
        return ((dtj) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, ysx] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, yjz] */
    /* JADX WARN: Type inference failed for: r4v1, types: [bte, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, yka] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, yow] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, yjv] */
    @Override // defpackage.yit
    public final yih create(Object obj, yih yihVar) {
        int i = this.g;
        if (i == 0) {
            dtj dtjVar = new dtj((yjz) this.b, (czt) this.e, (yow) this.c, (AtomicReference) this.d, yihVar, 0);
            dtjVar.f = obj;
            return dtjVar;
        }
        if (i == 1) {
            dtj dtjVar2 = new dtj((bte) this.e, (yka) this.c, (yjv) this.d, (yjv) this.b, yihVar, 1);
            dtjVar2.f = obj;
            return dtjVar2;
        }
        ?? r3 = this.c;
        Object obj2 = this.d;
        yol yolVar = (yol) obj2;
        dtj dtjVar3 = new dtj((ysx) r3, yihVar, yolVar, (iaq) this.e, (yol) this.b, 2);
        dtjVar3.f = obj;
        return dtjVar3;
    }

    /* JADX WARN: Type inference failed for: r11v10, types: [java.lang.Object, ysx] */
    /* JADX WARN: Type inference failed for: r11v5, types: [bte, clx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, yka] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, yow] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, yjz] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, yjv] */
    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        int i = this.g;
        if (i == 0) {
            yio yioVar = yio.a;
            if (this.a != 0) {
                ybn.f(obj);
                return obj;
            }
            ybn.f(obj);
            yow yowVar = (yow) this.f;
            Object obj2 = this.e;
            ?? r5 = this.c;
            ?? r6 = this.b;
            dti dtiVar = new dti(yowVar, (czt) obj2, r5, r6, (AtomicReference) this.d);
            this.a = 1;
            Object objA = r6.a(dtiVar, this);
            return objA == yioVar ? yioVar : objA;
        }
        if (i == 1) {
            yio yioVar2 = yio.a;
            if (this.a != 0) {
                ybn.f(obj);
            } else {
                ybn.f(obj);
                yow yowVar2 = (yow) this.f;
                ?? r11 = this.e;
                wb wbVar = new wb(yowVar2, this.c, this.d, this.b, new uz(r11), null);
                this.a = 1;
                if (kv.k(r11, wbVar, this) == yioVar2) {
                    return yioVar2;
                }
            }
            return ygi.a;
        }
        yio yioVar3 = yio.a;
        int i2 = this.a;
        ybn.f(obj);
        if (i2 == 0) {
            ysy ysyVar = (ysy) this.f;
            ?? r112 = this.c;
            ibe ibeVar = new ibe(ysyVar, (yol) this.d, (iaq) this.e, (yol) this.b, 1);
            this.a = 1;
            if (r112.a(ibeVar, this) == yioVar3) {
                return yioVar3;
            }
        }
        return ygi.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dtj(yjz yjzVar, czt cztVar, yow yowVar, AtomicReference atomicReference, yih yihVar, int i) {
        super(2, yihVar);
        this.g = i;
        this.b = yjzVar;
        this.e = cztVar;
        this.c = yowVar;
        this.d = atomicReference;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dtj(ysx ysxVar, yih yihVar, yol yolVar, iaq iaqVar, yol yolVar2, int i) {
        super(2, yihVar);
        this.g = i;
        this.c = ysxVar;
        this.d = yolVar;
        this.e = iaqVar;
        this.b = yolVar2;
    }
}

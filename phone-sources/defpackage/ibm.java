package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ibm extends yiz implements yka {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private /* synthetic */ Object d;
    private final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ibm(Object obj, yih yihVar, int i) {
        super(3, yihVar);
        this.e = i;
        this.c = obj;
    }

    @Override // defpackage.yka
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        int i = this.e;
        if (i == 0) {
            ibm ibmVar = new ibm(this.c, (yih) obj3, 0);
            ibmVar.d = (ysy) obj;
            ibmVar.b = (Throwable) obj2;
            return ibmVar.invokeSuspend(ygi.a);
        }
        if (i != 1) {
            ibm ibmVar2 = new ibm((yih) obj3, (qzm) this.c, 2);
            ibmVar2.d = (ysy) obj;
            ibmVar2.b = (Object[]) obj2;
            return ibmVar2.invokeSuspend(ygi.a);
        }
        ibm ibmVar3 = new ibm((yih) obj3, (gag) this.c, 1);
        ibmVar3.d = (ysy) obj;
        ibmVar3.b = obj2;
        return ibmVar3.invokeSuspend(ygi.a);
    }

    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, ysy] */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.Object, ysy] */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object, ysy] */
    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        if (i == 0) {
            yio yioVar = yio.a;
            if (this.a != 0) {
                ybn.f(obj);
            } else {
                ybn.f(obj);
                ?? r11 = this.d;
                ias iasVar = new ias(new iaj(this.c, (Throwable) this.b), 2);
                this.d = null;
                this.a = 1;
                if (r11.emit(iasVar, this) == yioVar) {
                    return yioVar;
                }
            }
            return ygi.a;
        }
        if (i == 1) {
            yio yioVar2 = yio.a;
            if (this.a != 0) {
                ybn.f(obj);
            } else {
                ybn.f(obj);
                ?? r112 = this.d;
                cvi cviVar = (cvi) this.b;
                Object obj2 = cviVar.a;
                Object obj3 = cviVar.b;
                cvi cviVar2 = new cvi((ysx) new ipi(((gav) obj2).e, new dbi((yih) null, 2, (char[]) null), 19), (gcc) new gac(), new cb(obj2));
                this.a = 1;
                if (r112.emit(cviVar2, this) == yioVar2) {
                    return yioVar2;
                }
            }
            return ygi.a;
        }
        yio yioVar3 = yio.a;
        int i2 = this.a;
        ybn.f(obj);
        if (i2 == 0) {
            ?? r113 = this.d;
            rdp[] rdpVarArr = (rdp[]) this.b;
            Object obj4 = this.c;
            ArrayList arrayList = new ArrayList();
            int length = rdpVarArr.length;
            for (int i3 = 0; i3 < length; i3++) {
                rdp rdpVar = rdpVarArr[i3];
                vqw vqwVar = rdpVar != null ? new vqw(rdpVar.a) : null;
                if (vqwVar != null) {
                    arrayList.add(vqwVar);
                }
            }
            vqu vquVar = new vqu(arrayList, new Integer(((qzm) obj4).a));
            this.a = 1;
            if (r113.emit(vquVar, this) == yioVar3) {
                return yioVar3;
            }
        }
        return ygi.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ibm(yih yihVar, gag gagVar, int i) {
        super(3, yihVar);
        this.e = i;
        this.c = gagVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ibm(yih yihVar, qzm qzmVar, int i) {
        super(3, yihVar);
        this.e = i;
        this.c = qzmVar;
    }
}

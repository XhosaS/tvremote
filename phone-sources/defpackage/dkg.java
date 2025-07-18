package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dkg extends yiz implements yjz {
    int a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    private /* synthetic */ Object e;
    private final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dkg(dki dkiVar, Context context, bcb bcbVar, yih yihVar, int i) {
        super(2, yihVar);
        this.f = i;
        this.b = dkiVar;
        this.c = context;
        this.d = bcbVar;
    }

    @Override // defpackage.yjz
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        switch (this.f) {
            case 0:
                return ((dkg) create((bco) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 1:
                return ((dkg) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 2:
                return ((dkg) create((ysk) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 3:
                return ((dkg) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 4:
                return ((dkg) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 5:
                return ((dkg) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 6:
                return ((dkg) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 7:
                return ((dkg) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            default:
                return ((dkg) create((ysk) obj, (yih) obj2)).invokeSuspend(ygi.a);
        }
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [bcb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, tb] */
    @Override // defpackage.yit
    public final yih create(Object obj, yih yihVar) {
        switch (this.f) {
            case 0:
                Object obj2 = this.b;
                dki dkiVar = (dki) obj2;
                dkg dkgVar = new dkg(dkiVar, (Context) this.c, (bcb) this.d, yihVar, 0);
                dkgVar.e = obj;
                return dkgVar;
            case 1:
                Object obj3 = this.d;
                tf tfVar = (tf) obj3;
                dkg dkgVar2 = new dkg(tfVar, (wh) this.b, (tb) this.c, yihVar, 1);
                dkgVar2.e = obj;
                return dkgVar2;
            case 2:
                Object obj4 = this.b;
                dlj dljVar = (dlj) obj4;
                dkg dkgVar3 = new dkg(dljVar, (Context) this.c, (djz) this.d, yihVar, 2);
                dkgVar3.e = obj;
                return dkgVar3;
            case 3:
                Object obj5 = this.c;
                op opVar = (op) obj5;
                dkg dkgVar4 = new dkg(opVar, (fwr) this.b, (pf) this.d, yihVar, 3);
                dkgVar4.e = obj;
                return dkgVar4;
            case 4:
                Object obj6 = this.c;
                mdw mdwVar = (mdw) obj6;
                dkg dkgVar5 = new dkg(mdwVar, (gbk) this.b, (fzx) this.d, yihVar, 4);
                dkgVar5.e = obj;
                return dkgVar5;
            case 5:
                Object obj7 = this.c;
                jdd jddVar = (jdd) obj7;
                dkg dkgVar6 = new dkg(jddVar, (Long) this.b, (Long) this.d, yihVar, 5);
                dkgVar6.e = obj;
                return dkgVar6;
            case 6:
                Object obj8 = this.d;
                qku qkuVar = (qku) obj8;
                dkg dkgVar7 = new dkg(qkuVar, (vmd) this.b, (qel) this.c, yihVar, 6);
                dkgVar7.e = obj;
                return dkgVar7;
            case 7:
                Object obj9 = this.d;
                qku qkuVar2 = (qku) obj9;
                dkg dkgVar8 = new dkg(qkuVar2, (vmd) this.b, (qel) this.c, yihVar, 7, null);
                dkgVar8.e = obj;
                return dkgVar8;
            default:
                Object obj10 = this.b;
                vou vouVar = (vou) obj10;
                dkg dkgVar9 = new dkg(vouVar, (tae) this.d, (qyn) this.c, yihVar, 8);
                dkgVar9.e = obj;
                return dkgVar9;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x0259, code lost:
    
        if (r0 == r6) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x028d, code lost:
    
        if (defpackage.og.k(r3, 0.0f, r2, r3, r18, 4) == r6) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x028f, code lost:
    
        return r6;
     */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object, tb] */
    /* JADX WARN: Type inference failed for: r1v45, types: [java.lang.Object, yil] */
    /* JADX WARN: Type inference failed for: r8v4, types: [bcb, java.lang.Object] */
    @Override // defpackage.yit
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 1178
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dkg.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dkg(dlj dljVar, Context context, djz djzVar, yih yihVar, int i) {
        super(2, yihVar);
        this.f = i;
        this.b = dljVar;
        this.c = context;
        this.d = djzVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dkg(jdd jddVar, Long l, Long l2, yih yihVar, int i) {
        super(2, yihVar);
        this.f = i;
        this.c = jddVar;
        this.b = l;
        this.d = l2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dkg(mdw mdwVar, gbk gbkVar, fzx fzxVar, yih yihVar, int i) {
        super(2, yihVar);
        this.f = i;
        this.c = mdwVar;
        this.b = gbkVar;
        this.d = fzxVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dkg(op opVar, fwr fwrVar, pf pfVar, yih yihVar, int i) {
        super(2, yihVar);
        this.f = i;
        this.c = opVar;
        this.b = fwrVar;
        this.d = pfVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dkg(qku qkuVar, vmd vmdVar, qel qelVar, yih yihVar, int i) {
        super(2, yihVar);
        this.f = i;
        this.d = qkuVar;
        this.b = vmdVar;
        this.c = qelVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dkg(qku qkuVar, vmd vmdVar, qel qelVar, yih yihVar, int i, byte[] bArr) {
        super(2, yihVar);
        this.f = i;
        this.d = qkuVar;
        this.b = vmdVar;
        this.c = qelVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dkg(tf tfVar, wh whVar, tb tbVar, yih yihVar, int i) {
        super(2, yihVar);
        this.f = i;
        this.d = tfVar;
        this.b = whVar;
        this.c = tbVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dkg(vou vouVar, tae taeVar, qyn qynVar, yih yihVar, int i) {
        super(2, yihVar);
        this.f = i;
        this.b = vouVar;
        this.d = taeVar;
        this.c = qynVar;
    }
}

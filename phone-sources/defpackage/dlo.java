package defpackage;

import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dlo extends yiz implements yjz {
    /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dlo(List list, yih yihVar, int i) {
        super(2, yihVar);
        this.c = i;
        this.b = list;
    }

    @Override // defpackage.yjz
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        switch (this.c) {
            case 0:
                return ((dlo) create((ddf) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 1:
                return ((dlo) create((ddf) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 2:
                return ((dlo) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 3:
                return ((dlo) create((gfz) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 4:
                return ((dlo) create((gfz) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 5:
                return ((dlo) create((iod) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 6:
                return ((dlo) create((CharSequence) obj, (yih) obj2)).invokeSuspend(ygi.a);
            default:
                return ((dlo) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, yjz] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, yjk] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, yjv] */
    @Override // defpackage.yit
    public final yih create(Object obj, yih yihVar) {
        switch (this.c) {
            case 0:
                dlo dloVar = new dlo((Set) this.b, yihVar, 0);
                dloVar.a = obj;
                return dloVar;
            case 1:
                dlo dloVar2 = new dlo((List) this.b, yihVar, 1);
                dloVar2.a = obj;
                return dloVar2;
            case 2:
                dlo dloVar3 = new dlo((yjz) this.b, yihVar, 2);
                dloVar3.a = obj;
                return dloVar3;
            case 3:
                dlo dloVar4 = new dlo(yihVar, (yjv) this.b, 3);
                dloVar4.a = obj;
                return dloVar4;
            case 4:
                dlo dloVar5 = new dlo(yihVar, (yjv) this.b, 4, (byte[]) null);
                dloVar5.a = obj;
                return dloVar5;
            case 5:
                dlo dloVar6 = new dlo((yjv) this.b, yihVar, 5);
                dloVar6.a = obj;
                return dloVar6;
            case 6:
                dlo dloVar7 = new dlo((yjv) this.b, yihVar, 6, (byte[]) null);
                dloVar7.a = obj;
                return dloVar7;
            default:
                dlo dloVar8 = new dlo((yjk) this.b, yihVar, 7);
                dloVar8.a = obj;
                return dloVar8;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x01b6, code lost:
    
        return r0.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01b7, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01b8, code lost:
    
        r1.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01bb, code lost:
    
        throw r8;
     */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, yjk] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, yjz] */
    /* JADX WARN: Type inference failed for: r8v28, types: [java.lang.Object, yjv] */
    @Override // defpackage.yit
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 476
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dlo.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dlo(Set set, yih yihVar, int i) {
        super(2, yihVar);
        this.c = i;
        this.b = set;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dlo(yih yihVar, yjv yjvVar, int i) {
        super(2, yihVar);
        this.c = i;
        this.b = yjvVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dlo(yih yihVar, yjv yjvVar, int i, byte[] bArr) {
        super(2, yihVar);
        this.c = i;
        this.b = yjvVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dlo(yjk yjkVar, yih yihVar, int i) {
        super(2, yihVar);
        this.c = i;
        this.b = yjkVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dlo(yjv yjvVar, yih yihVar, int i) {
        super(2, yihVar);
        this.c = i;
        this.b = yjvVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dlo(yjv yjvVar, yih yihVar, int i, byte[] bArr) {
        super(2, yihVar);
        this.c = i;
        this.b = yjvVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dlo(yjz yjzVar, yih yihVar, int i) {
        super(2, yihVar);
        this.c = i;
        this.b = yjzVar;
    }
}

package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kio extends yiz implements yka {
    int a;
    /* synthetic */ Object b;
    private /* synthetic */ Object c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kio(yih yihVar, int i) {
        super(3, yihVar);
        this.d = i;
    }

    @Override // defpackage.yka
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        int i = this.d;
        if (i == 0) {
            kio kioVar = new kio((yih) obj3, 0);
            kioVar.c = (ysy) obj;
            kioVar.b = obj2;
            return kioVar.invokeSuspend(ygi.a);
        }
        if (i == 1) {
            kio kioVar2 = new kio((yih) obj3, 1, (byte[]) null);
            kioVar2.c = (ysy) obj;
            kioVar2.b = (Throwable) obj2;
            return kioVar2.invokeSuspend(ygi.a);
        }
        if (i == 2) {
            kio kioVar3 = new kio((yih) obj3, 2, (char[]) null);
            kioVar3.c = (ysy) obj;
            kioVar3.b = obj2;
            return kioVar3.invokeSuspend(ygi.a);
        }
        if (i != 3) {
            kio kioVar4 = new kio((yih) obj3, 4, (int[]) null);
            kioVar4.c = (ysy) obj;
            kioVar4.b = (Object[]) obj2;
            return kioVar4.invokeSuspend(ygi.a);
        }
        kio kioVar5 = new kio((yih) obj3, 3, (short[]) null);
        kioVar5.c = (ysy) obj;
        kioVar5.b = obj2;
        return kioVar5.invokeSuspend(ygi.a);
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, ysy] */
    /* JADX WARN: Type inference failed for: r10v10, types: [java.lang.Object, ysy] */
    /* JADX WARN: Type inference failed for: r10v14, types: [java.lang.Object, ysy] */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object, ysy] */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.lang.Object, ysy] */
    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        ysx isvVar;
        ysx isvVar2;
        ysx isvVar3;
        int i = this.d;
        if (i == 0) {
            yio yioVar = yio.a;
            if (this.a != 0) {
                ybn.f(obj);
            } else {
                ybn.f(obj);
                ?? r10 = this.c;
                ith ithVar = (ith) this.b;
                if (ithVar == null || (isvVar = ithVar.q()) == null) {
                    isvVar = new isv(null, 6);
                }
                this.a = 1;
                if (vyf.K(r10, isvVar, this) == yioVar) {
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
                ?? r102 = this.c;
                iag iagVar = new iag((Throwable) this.b);
                this.c = null;
                this.a = 1;
                if (r102.emit(iagVar, this) == yioVar2) {
                    return yioVar2;
                }
            }
            return ygi.a;
        }
        if (i == 2) {
            yio yioVar3 = yio.a;
            if (this.a != 0) {
                ybn.f(obj);
            } else {
                ybn.f(obj);
                ?? r103 = this.c;
                iwf iwfVar = (iwf) this.b;
                if (iwfVar == null || (isvVar2 = iwfVar.g()) == null) {
                    isvVar2 = new isv(null, 6);
                }
                this.a = 1;
                if (vyf.K(r103, isvVar2, this) == yioVar3) {
                    return yioVar3;
                }
            }
            return ygi.a;
        }
        if (i == 3) {
            yio yioVar4 = yio.a;
            if (this.a != 0) {
                ybn.f(obj);
            } else {
                ybn.f(obj);
                ?? r104 = this.c;
                iwf iwfVar2 = (iwf) this.b;
                if (iwfVar2 == null || (isvVar3 = iwfVar2.g()) == null) {
                    isvVar3 = new isv(null, 6);
                }
                this.a = 1;
                if (vyf.K(r104, isvVar3, this) == yioVar4) {
                    return yioVar4;
                }
            }
            return ygi.a;
        }
        yio yioVar5 = yio.a;
        int i2 = this.a;
        ybn.f(obj);
        if (i2 == 0) {
            ?? r105 = this.c;
            vqu[] vquVarArr = (vqu[]) this.b;
            ArrayList arrayList = new ArrayList();
            for (vqu vquVar : vquVarArr) {
                if (true == vquVar.a.isEmpty()) {
                    vquVar = null;
                }
                if (vquVar != null) {
                    arrayList.add(vquVar);
                }
            }
            this.a = 1;
            if (r105.emit(arrayList, this) == yioVar5) {
                return yioVar5;
            }
        }
        return ygi.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kio(yih yihVar, int i, byte[] bArr) {
        super(3, yihVar);
        this.d = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kio(yih yihVar, int i, char[] cArr) {
        super(3, yihVar);
        this.d = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kio(yih yihVar, int i, int[] iArr) {
        super(3, yihVar);
        this.d = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kio(yih yihVar, int i, short[] sArr) {
        super(3, yihVar);
        this.d = i;
    }
}

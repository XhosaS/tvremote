package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ibu extends yiz implements yjz {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private /* synthetic */ Object c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ibu(String str, String str2, yih yihVar, int i) {
        super(2, yihVar);
        this.d = i;
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.yjz
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.d != 0) {
            return ((ibu) create((ddf) obj, (yih) obj2)).invokeSuspend(ygi.a);
        }
        return ((ibu) create((ysk) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, ysx] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, ysx] */
    @Override // defpackage.yit
    public final yih create(Object obj, yih yihVar) {
        if (this.d == 0) {
            ibu ibuVar = new ibu((ysx) this.a, (ysx) this.b, yihVar, 0);
            ibuVar.c = obj;
            return ibuVar;
        }
        ibu ibuVar2 = new ibu((String) this.a, (String) this.b, yihVar, 1);
        ibuVar2.c = obj;
        return ibuVar2;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, ysx] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, ysx] */
    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        if (this.d == 0) {
            ybn.f(obj);
            ysk yskVar = (ysk) this.c;
            ykr.q(yskVar, null, 0, new dbv((ysx) this.a, yskVar, (yih) null, 18), 3);
            ykr.q(yskVar, null, 0, new dbv((ysx) this.b, yskVar, (yih) null, 19, (byte[]) null), 3);
            return ygi.a;
        }
        ybn.f(obj);
        ddf ddfVar = (ddf) this.c;
        ddf ddfVarF = ddfVar.f();
        dde ddeVar = dlr.d;
        Set set = (Set) ddfVar.b(ddeVar);
        if (set == null) {
            set = yhd.a;
        }
        Object obj2 = this.b;
        Object obj3 = this.a;
        ddfVarF.e(ddeVar, wcq.al(set, obj3));
        dlm dlmVar = dlr.a;
        ymp[] ympVarArr = dlm.a;
        ddfVarF.e(dlmVar.a((String) obj3), obj2);
        return ddfVarF.a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ibu(ysx ysxVar, ysx ysxVar2, yih yihVar, int i) {
        super(2, yihVar);
        this.d = i;
        this.a = ysxVar;
        this.b = ysxVar2;
    }
}

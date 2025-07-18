package defpackage;

import android.accounts.Account;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sbl extends yiz implements yjz {
    int a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sbl(rkp rkpVar, yih yihVar, int i) {
        super(2, yihVar);
        this.c = i;
        this.b = rkpVar;
    }

    @Override // defpackage.yjz
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        int i = this.c;
        if (i == 0) {
            return ((sbl) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
        }
        if (i != 1) {
            return ((sbl) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
        }
        return ((sbl) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, ysx] */
    @Override // defpackage.yit
    public final yih create(Object obj, yih yihVar) {
        int i = this.c;
        return i != 0 ? i != 1 ? new sbl((ysx) this.b, yihVar, 2) : new sbl((rkp) this.b, yihVar, 1) : new sbl((yjv) this.b, yihVar, 0);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.Object, ysx] */
    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) throws Exception {
        int i = this.c;
        if (i == 0) {
            yio yioVar = yio.a;
            if (this.a != 0) {
                ybn.f(obj);
            } else {
                ybn.f(obj);
                ?? r5 = this.b;
                this.a = 1;
                if (r5.a(this) == yioVar) {
                    return yioVar;
                }
            }
            return ygi.a;
        }
        if (i != 1) {
            yio yioVar2 = yio.a;
            int i2 = this.a;
            ybn.f(obj);
            if (i2 == 0) {
                ?? r52 = this.b;
                this.a = 1;
                if (vyf.I(r52, this) == yioVar2) {
                    return yioVar2;
                }
            }
            return ygi.a;
        }
        yio yioVar3 = yio.a;
        if (this.a != 0) {
            ybn.f(obj);
        } else {
            ybn.f(obj);
            Object obj2 = this.b;
            this.a = 1;
            obj = ((rkp) obj2).e(this);
            if (obj == yioVar3) {
                return yioVar3;
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : (List) obj) {
            nhp nhpVar = (nhp) obj3;
            if (nhpVar.a != null && nhpVar.b.a) {
                arrayList.add(obj3);
            }
        }
        ArrayList arrayList2 = new ArrayList(yfm.z(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            nia niaVar = ((nhp) it.next()).a;
            arrayList2.add(new Account(niaVar.c, niaVar.b));
        }
        return yfm.al(arrayList2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sbl(yjv yjvVar, yih yihVar, int i) {
        super(2, yihVar);
        this.c = i;
        this.b = yjvVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sbl(ysx ysxVar, yih yihVar, int i) {
        super(2, yihVar);
        this.c = i;
        this.b = ysxVar;
    }
}

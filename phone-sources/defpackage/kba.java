package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kba extends yiz implements yka {
    /* synthetic */ Object a;
    final /* synthetic */ kbc b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kba(kbc kbcVar, yih yihVar) {
        super(3, yihVar);
        this.b = kbcVar;
    }

    @Override // defpackage.yka
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        kba kbaVar = new kba(this.b, (yih) obj3);
        kbaVar.a = (List) obj;
        return kbaVar.invokeSuspend(ygi.a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        isy isyVar;
        isy isyVar2;
        Object next;
        Object next2;
        ybn.f(obj);
        mdw mdwVar = this.b.k;
        ?? r0 = this.a;
        boolean z = false;
        if (mdwVar.o()) {
            if (r0 != 0) {
                Iterator it = r0.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it.next();
                    int iAs = a.as(((wnv) ((isy) next2).a).b);
                    if (iAs != 0 && iAs == 3) {
                        break;
                    }
                }
                isyVar = (isy) next2;
            } else {
                isyVar = null;
            }
            if (r0 != 0) {
                Iterator it2 = r0.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                    int iAs2 = a.as(((wnv) ((isy) next).a).b);
                    if (iAs2 != 0 && iAs2 == 4) {
                        break;
                    }
                }
                isyVar2 = (isy) next;
            } else {
                isyVar2 = null;
            }
            boolean zE = yks.e(isyVar != null ? Integer.valueOf(isyVar.c()) : null, isyVar != null ? Integer.valueOf(isyVar.d.size() - 1) : null);
            boolean zE2 = yks.e(isyVar2 != null ? Integer.valueOf(isyVar2.c()) : null, isyVar2 != null ? Integer.valueOf(isyVar2.d.size() - 1) : null);
            if (!zE || !zE2) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}

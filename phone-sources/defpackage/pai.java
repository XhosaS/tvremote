package defpackage;

import j$.util.function.BiPredicate$CC;
import java.util.Iterator;
import java.util.function.BiPredicate;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pai implements ozm {
    private final /* synthetic */ int a;

    public pai(int i) {
        this.a = i;
    }

    public final /* synthetic */ BiPredicate and(BiPredicate biPredicate) {
        return this.a != 0 ? BiPredicate$CC.$default$and(this, biPredicate) : BiPredicate$CC.$default$and(this, biPredicate);
    }

    public final /* synthetic */ BiPredicate negate() {
        return this.a != 0 ? BiPredicate$CC.$default$negate(this) : BiPredicate$CC.$default$negate(this);
    }

    public final /* synthetic */ BiPredicate or(BiPredicate biPredicate) {
        return this.a != 0 ? BiPredicate$CC.$default$or(this, biPredicate) : BiPredicate$CC.$default$or(this, biPredicate);
    }

    @Override // java.util.function.BiPredicate
    public final /* synthetic */ boolean test(Object obj, Object obj2) {
        if (this.a != 0) {
            uze uzeVar = (uze) obj;
            ozl ozlVar = (ozl) obj2;
            if (uzeVar != null && ozlVar != null && uzeVar.b == 1) {
                oyf oyfVar = ozlVar.a;
                if (oyfVar.b == 1) {
                    uxl uxlVar = (uxl) oyfVar.c;
                    uxl uxlVar2 = (uxl) uzeVar.c;
                    uxl uxlVarW = osk.w(uxlVar);
                    uxl uxlVarW2 = osk.w(uxlVar2);
                    if (uxlVarW.c == uxlVarW2.c && uxlVarW.d == uxlVarW2.d && uxlVarW.e.equals(uxlVarW2.e)) {
                        return true;
                    }
                }
            }
            return false;
        }
        uze uzeVar2 = (uze) obj;
        ozl ozlVar2 = (ozl) obj2;
        if (uzeVar2 != null && ozlVar2 != null && uzeVar2.b == 4) {
            oyf oyfVar2 = ozlVar2.a;
            if (oyfVar2.b == 2) {
                oyh oyhVar = (oyh) oyfVar2.c;
                uzh uzhVar = (uzh) uzeVar2.c;
                uzg uzgVarB = uzg.b(oyhVar.c);
                if (uzgVarB == null) {
                    uzgVarB = uzg.UNKNOWN;
                }
                uzg uzgVarB2 = uzg.b(uzhVar.d);
                if (uzgVarB2 == null) {
                    uzgVarB2 = uzg.UNKNOWN;
                }
                if (uzgVarB != uzgVarB2) {
                    return false;
                }
                if (uzhVar.c.size() == 0) {
                    return true;
                }
                Iterator<E> it = oyhVar.d.iterator();
                while (it.hasNext()) {
                    if (osk.x(((oyg) it.next()).b, uzhVar)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}

package defpackage;

import j$.util.function.BiPredicate$CC;
import java.util.function.BiPredicate;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ozp implements ozh {
    private final oyi a;

    public ozp(oyi oyiVar) {
        oyiVar.getClass();
        this.a = oyiVar;
    }

    @Override // defpackage.ozh
    public final ozg a() {
        return ozg.AUTH_URL;
    }

    public final /* synthetic */ BiPredicate and(BiPredicate biPredicate) {
        return BiPredicate$CC.$default$and(this, biPredicate);
    }

    public final /* synthetic */ BiPredicate negate() {
        return BiPredicate$CC.$default$negate(this);
    }

    public final /* synthetic */ BiPredicate or(BiPredicate biPredicate) {
        return BiPredicate$CC.$default$or(this, biPredicate);
    }

    @Override // java.util.function.BiPredicate
    public final /* synthetic */ boolean test(Object obj, Object obj2) {
        uwi uwiVar;
        ozj ozjVar = (ozj) obj2;
        if (ozjVar == null) {
            return true;
        }
        oyd oydVar = ozjVar.b;
        vun<uxw> vunVar = null;
        if (oydVar != null && (uwiVar = oydVar.c) != null) {
            uyr uyrVar = uwiVar.f;
            if (uyrVar == null) {
                uyrVar = uyr.a;
            }
            if (uyrVar != null) {
                uyc uycVar = uyrVar.c == 2 ? (uyc) uyrVar.d : uyc.a;
                if (uycVar != null) {
                    vunVar = uycVar.i;
                }
            }
        }
        if (vunVar == null || vunVar.isEmpty() || ozjVar.a != null || vunVar.isEmpty()) {
            return true;
        }
        for (uxw uxwVar : vunVar) {
            uxs uxsVar = uxwVar.c == 14 ? (uxs) uxwVar.d : uxs.a;
            if ((uxsVar.b == 3 ? (uyf) uxsVar.c : uyf.a).d) {
                this.a.c(oydVar, "Authenticated URL action requires signed-in user, but user is not signed in.", new Object[0]);
                return false;
            }
        }
        return true;
    }
}

package defpackage;

import android.content.Context;
import com.google.common.collect.ImmutableList;
import j$.util.function.BiPredicate$CC;
import java.util.List;
import java.util.function.BiPredicate;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pag implements ozh {
    private final Context a;
    private final oyi b;
    private final pfs c;

    public pag(Context context, pfs pfsVar, oyi oyiVar) {
        this.a = context;
        this.b = oyiVar;
        this.c = pfsVar;
    }

    @Override // defpackage.ozh
    public final ozg a() {
        return ozg.VALID_INTENT;
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
        List<uxw> listOf;
        oyd oydVar = ((ozj) obj2).b;
        uyr uyrVar = oydVar.c.f;
        if (uyrVar == null) {
            uyrVar = uyr.a;
        }
        int i = uyrVar.c;
        if (i == 2) {
            listOf = ((uyc) uyrVar.d).i;
        } else if (i == 6) {
            uyc uycVar = ((uyo) uyrVar.d).d;
            if (uycVar == null) {
                uycVar = uyc.a;
            }
            listOf = uycVar.i;
        } else if (((i == 3 ? (uyy) uyrVar.d : uyy.a).b & 1024) != 0) {
            uxw uxwVar = (uyrVar.c == 3 ? (uyy) uyrVar.d : uyy.a).p;
            if (uxwVar == null) {
                uxwVar = uxw.a;
            }
            listOf = ImmutableList.of(uxwVar);
        } else if (((uyrVar.c == 5 ? (uzb) uyrVar.d : uzb.a).b & 32) != 0) {
            uxw uxwVar2 = (uyrVar.c == 5 ? (uzb) uyrVar.d : uzb.a).k;
            if (uxwVar2 == null) {
                uxwVar2 = uxw.a;
            }
            listOf = ImmutableList.of(uxwVar2);
        } else {
            listOf = ImmutableList.of();
        }
        for (uxw uxwVar3 : listOf) {
            if (uxwVar3.c == 8 && !this.c.d(this.a, (uxf) uxwVar3.d)) {
                oyi oyiVar = this.b;
                uxv uxvVarB = uxv.b(uxwVar3.e);
                if (uxvVarB == null) {
                    uxvVarB = uxv.ACTION_UNKNOWN;
                }
                oyiVar.b(oydVar, "Found an invalid intent target in action %s.", uxvVarB.name());
                return false;
            }
        }
        return true;
    }
}

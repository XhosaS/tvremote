package defpackage;

import android.util.SparseArray;
import j$.time.Instant;
import j$.util.function.BiPredicate$CC;
import java.util.Calendar;
import java.util.function.BiPredicate;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class paf implements ozh {
    private static final SparseArray a;
    private final oyi b;

    static {
        SparseArray sparseArray = new SparseArray();
        a = sparseArray;
        sparseArray.put(1, wet.SUNDAY);
        sparseArray.put(2, wet.MONDAY);
        sparseArray.put(3, wet.TUESDAY);
        sparseArray.put(4, wet.WEDNESDAY);
        sparseArray.put(5, wet.THURSDAY);
        sparseArray.put(6, wet.FRIDAY);
        sparseArray.put(7, wet.SATURDAY);
    }

    public paf(oyi oyiVar) {
        this.b = oyiVar;
    }

    private static int b(wev wevVar) {
        return c(wevVar.b, wevVar.c);
    }

    private static int c(int i, int i2) {
        return (i * 60) + i2;
    }

    @Override // defpackage.ozh
    public final ozg a() {
        return ozg.TIME_CONSTRAINT;
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
        ozj ozjVar = (ozj) obj2;
        vun<uyz> vunVar = ((uzd) obj).h;
        if (vunVar.isEmpty()) {
            return true;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(Instant.now().toEpochMilli());
        wet wetVar = (wet) a.get(calendar.get(7));
        int iC = c(calendar.get(11), calendar.get(12));
        for (uyz uyzVar : vunVar) {
            wev wevVar = uyzVar.d;
            if (wevVar == null) {
                wevVar = wev.a;
            }
            int iB = b(wevVar);
            wev wevVar2 = uyzVar.e;
            if (wevVar2 == null) {
                wevVar2 = wev.a;
            }
            int iB2 = b(wevVar2);
            if (new vul(uyzVar.f, uyz.a).contains(wetVar) && iC >= iB && iC <= iB2) {
                return true;
            }
        }
        if (ozjVar == null) {
            return false;
        }
        this.b.c(ozjVar.b, "No condition matched. Condition list: %s", vunVar);
        return false;
    }
}

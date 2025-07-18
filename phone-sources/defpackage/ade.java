package defpackage;

import android.graphics.Rect;
import android.view.View;
import com.google.common.collect.ComparisonChain;
import com.google.common.collect.Ordering;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ade implements Comparator {
    private final /* synthetic */ int a;

    public /* synthetic */ ade(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return yks.a(((add) obj).a(), ((add) obj2).a());
            case 1:
                int i = ((zuw) obj2).a;
                int i2 = ((zuw) obj).a;
                long j = acb.a;
                return yks.a(i, i2);
            case 2:
                return yks.a(((bbq) obj).a, ((bbq) obj2).a);
            case 3:
                bys bysVar = (bys) obj;
                bys bysVar2 = (bys) obj2;
                return bysVar.d() == bysVar2.d() ? yks.a(bysVar.f(), bysVar2.f()) : Float.compare(bysVar.d(), bysVar2.d());
            case 4:
                View view = (View) obj;
                View view2 = (View) obj2;
                int i3 = ccz.a;
                if (view == view2) {
                    return 0;
                }
                ki kiVar = ccz.f;
                Object objA = kiVar.a(view);
                objA.getClass();
                Rect rect = (Rect) objA;
                Object objA2 = kiVar.a(view2);
                objA2.getClass();
                Rect rect2 = (Rect) objA2;
                int i4 = rect.top - rect2.top;
                return i4 == 0 ? rect.bottom - rect2.bottom : i4;
            case 5:
                View view3 = (View) obj;
                View view4 = (View) obj2;
                int i5 = ccz.a;
                if (view3 == view4) {
                    return 0;
                }
                ki kiVar2 = ccz.f;
                Object objA3 = kiVar2.a(view3);
                objA3.getClass();
                Rect rect3 = (Rect) objA3;
                Object objA4 = kiVar2.a(view4);
                objA4.getClass();
                Rect rect4 = (Rect) objA4;
                int i6 = rect3.left - rect4.left;
                return i6 == 0 ? (rect3.right - rect4.right) * ccz.b : i6 * ccz.b;
            case 6:
                return wcq.Y(Integer.valueOf(((cfx) obj).b), Integer.valueOf(((cfx) obj2).b));
            case 7:
                return wcq.Y(Integer.valueOf(((cfx) obj).b), Integer.valueOf(((cfx) obj2).b));
            case 8:
                yfw yfwVar = (yfw) obj;
                yfw yfwVar2 = (yfw) obj2;
                return (((Number) yfwVar.b).intValue() - ((Number) yfwVar.a).intValue()) - (((Number) yfwVar2.b).intValue() - ((Number) yfwVar2.a).intValue());
            case 9:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                jp jpVar = cts.a;
                int length = bArr.length;
                int length2 = bArr2.length;
                if (length != length2) {
                    return length - length2;
                }
                for (int i7 = 0; i7 < bArr.length; i7++) {
                    byte b = bArr[i7];
                    byte b2 = bArr2[i7];
                    if (b != b2) {
                        return b - b2;
                    }
                }
                return 0;
            case 10:
                enq enqVar = (enq) obj;
                enq enqVar2 = (enq) obj2;
                int iCompare = Integer.compare(enqVar.c, enqVar2.c);
                return iCompare != 0 ? iCompare : enqVar.b.compareTo(enqVar2.b);
            case 11:
                return ((erd) obj).a.compareTo(((erd) obj2).a);
            case 12:
                return Long.compare(((etn) obj).c, ((etn) obj2).c);
            case 13:
                return ((dze) obj2).T - ((dze) obj).T;
            case 14:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                Ordering ordering = ezd.a;
                if (num.intValue() == -1) {
                    return num2.intValue() == -1 ? 0 : -1;
                }
                if (num2.intValue() == -1) {
                    return 1;
                }
                return num.intValue() - num2.intValue();
            case 15:
                return ((eyr) ((List) obj).get(0)).compareTo((eyr) ((List) obj2).get(0));
            case 16:
                List list = (List) obj;
                List list2 = (List) obj2;
                int i8 = 19;
                ComparisonChain comparisonChainCompare = ComparisonChain.start().compare((ezc) Collections.max(list, new ade(i8)), (ezc) Collections.max(list2, new ade(i8)), new ade(i8)).compare(list.size(), list2.size());
                int i9 = 20;
                return comparisonChainCompare.compare((ezc) Collections.max(list, new ade(i9)), (ezc) Collections.max(list2, new ade(i9)), new ade(i9)).result();
            case 17:
                return ((eyq) Collections.max((List) obj)).compareTo((eyq) Collections.max((List) obj2));
            case 18:
                return ((eyz) ((List) obj).get(0)).compareTo((eyz) ((List) obj2).get(0));
            case 19:
                ezc ezcVar = (ezc) obj;
                ezc ezcVar2 = (ezc) obj2;
                ComparisonChain comparisonChainCompare2 = ComparisonChain.start().compareFalseFirst(ezcVar.h, ezcVar2.h).compare(Integer.valueOf(ezcVar.m), Integer.valueOf(ezcVar2.m), Ordering.natural().reverse()).compare(ezcVar.n, ezcVar2.n).compare(ezcVar.o, ezcVar2.o).compareFalseFirst(ezcVar.p, ezcVar2.p).compare(ezcVar.q, ezcVar2.q).compareFalseFirst(ezcVar.i, ezcVar2.i).compareFalseFirst(ezcVar.e, ezcVar2.e).compareFalseFirst(ezcVar.g, ezcVar2.g).compare(Integer.valueOf(ezcVar.l), Integer.valueOf(ezcVar2.l), Ordering.natural().reverse());
                boolean z = ezcVar.r;
                ComparisonChain comparisonChainCompareFalseFirst = comparisonChainCompare2.compareFalseFirst(z, ezcVar2.r);
                boolean z2 = ezcVar.s;
                ComparisonChain comparisonChainCompareFalseFirst2 = comparisonChainCompareFalseFirst.compareFalseFirst(z2, ezcVar2.s);
                if (z && z2) {
                    comparisonChainCompareFalseFirst2 = comparisonChainCompareFalseFirst2.compare(ezcVar.t, ezcVar2.t);
                }
                return comparisonChainCompareFalseFirst2.result();
            default:
                ezc ezcVar3 = (ezc) obj;
                ezc ezcVar4 = (ezc) obj2;
                Ordering orderingReverse = (ezcVar3.e && ezcVar3.h) ? ezd.a : ezd.a.reverse();
                ComparisonChain comparisonChainStart = ComparisonChain.start();
                if (ezcVar3.f.ak) {
                    comparisonChainStart = comparisonChainStart.compare(Integer.valueOf(ezcVar3.j), Integer.valueOf(ezcVar4.j), ezd.a.reverse());
                }
                return comparisonChainStart.compare(Integer.valueOf(ezcVar3.k), Integer.valueOf(ezcVar4.k), orderingReverse).compare(Integer.valueOf(ezcVar3.j), Integer.valueOf(ezcVar4.j), orderingReverse).result();
        }
    }
}

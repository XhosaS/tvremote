package defpackage;

import android.service.notification.StatusBarNotification;
import com.google.android.material.button.MaterialButton;
import java.io.File;
import java.util.Comparator;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acs<T> implements Comparator {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public acs(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, yjz] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, java.util.Comparator] */
    /* JADX WARN: Type inference failed for: r0v15, types: [etd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, yjz] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, yjz] */
    /* JADX WARN: Type inference failed for: r0v29, types: [iea, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v34, types: [iea, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v39, types: [iea, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v49, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v58, types: [java.lang.Object, xtg] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r8v21, types: [java.lang.Comparable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v17, types: [java.lang.Comparable, java.lang.Object] */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int iA;
        int iA2;
        switch (this.b) {
            case 0:
                Object objH = ((add) obj).h();
                eph ephVar = (eph) this.a;
                return wcq.Y(Integer.valueOf(ephVar.B(objH)), Integer.valueOf(ephVar.B(((add) obj2).h())));
            case 1:
                Object objH2 = ((add) obj).h();
                eph ephVar2 = (eph) this.a;
                return wcq.Y(Integer.valueOf(ephVar2.B(objH2)), Integer.valueOf(ephVar2.B(((add) obj2).h())));
            case 2:
                Object objH3 = ((add) obj2).h();
                eph ephVar3 = (eph) this.a;
                return wcq.Y(Integer.valueOf(ephVar3.B(objH3)), Integer.valueOf(ephVar3.B(((add) obj).h())));
            case 3:
                Object objH4 = ((add) obj2).h();
                eph ephVar4 = (eph) this.a;
                return wcq.Y(Integer.valueOf(ephVar4.B(objH4)), Integer.valueOf(ephVar4.B(((add) obj).h())));
            case 4:
                ?? r0 = this.a;
                return wcq.Y(r0.a(obj), r0.a(obj2));
            case 5:
                int i = cfo.a;
                return ((Number) this.a.a(obj, obj2)).intValue();
            case 6:
                int iCompare = this.a.compare(obj, obj2);
                return iCompare != 0 ? iCompare : wcq.Y(Integer.valueOf(((cff) obj).e), Integer.valueOf(((cff) obj2).e));
            case 7:
                int i2 = ete.a;
                ?? r02 = this.a;
                iA = r02.a(obj2);
                iA2 = r02.a(obj);
                break;
            case 8:
                return ((Number) this.a.a(obj, obj2)).intValue();
            case 9:
                return ((Number) this.a.a(obj, obj2)).intValue();
            case 10:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                num.getClass();
                num2.getClass();
                kkp kkpVar = (kkp) this.a;
                if (!kkpVar.b) {
                    return kkpVar.a.get(num.intValue()) - kkpVar.a.get(num2.intValue());
                }
                iA = kkpVar.a.get(num2.intValue());
                iA2 = kkpVar.a.get(num.intValue());
                break;
            case 11:
                nuh nuhVar = (nuh) obj;
                nuh nuhVar2 = (nuh) obj2;
                int i3 = nuhVar.a - nuhVar2.a;
                if (i3 != 0) {
                    return i3;
                }
                return ((ldo) this.a).a.compare((String) nuhVar.b, (String) nuhVar2.b);
            case 12:
                HashMap map = (HashMap) this.a;
                long jLongValue = ((Long) map.get((File) obj)).longValue();
                long jLongValue2 = ((Long) map.get((File) obj2)).longValue();
                if (jLongValue < jLongValue2) {
                    return -1;
                }
                return jLongValue > jLongValue2 ? 1 : 0;
            case 13:
                ?? r03 = this.a;
                kvf kvfVar = (kvf) obj;
                kvf kvfVar2 = (kvf) obj2;
                long j = ((kva) r03.a()).b(kvfVar2.o()).l - ((kva) r03.a()).b(kvfVar.o()).l;
                return j == 0 ? kvfVar.E().compareTo(kvfVar2.E()) : (int) j;
            case 14:
                ?? r04 = this.a;
                kvf kvfVar3 = (kvf) obj;
                kvf kvfVar4 = (kvf) obj2;
                long j2 = ((kva) r04.a()).b(kvfVar4.o()).o - ((kva) r04.a()).b(kvfVar3.o()).o;
                Long lValueOf = Long.valueOf(j2);
                lValueOf.getClass();
                return j2 == 0 ? kvfVar3.E().compareTo(kvfVar4.E()) : lValueOf.intValue();
            case 15:
                ?? r05 = this.a;
                kwn kwnVar = (kwn) obj;
                kwn kwnVar2 = (kwn) obj2;
                long j3 = ((kva) r05.a()).c(kwnVar2.d).g - ((kva) r05.a()).c(kwnVar.d).g;
                return j3 == 0 ? kwnVar.g.compareTo(kwnVar2.g) : (int) j3;
            case 16:
                qis qisVar = ((qcy) obj).d;
                qis qisVar2 = (qis) this.a;
                return wcq.Y(qdd.f(ocv.bj(qisVar2), qisVar2, qisVar), qdd.f(ocv.bj(qisVar2), qisVar2, ((qcy) obj2).d));
            case 17:
                StatusBarNotification statusBarNotification = ((qcy) obj).b;
                qis qisVar3 = (qis) this.a;
                ocv.bk(qisVar3);
                Long lValueOf2 = Long.valueOf(qdd.e(statusBarNotification));
                StatusBarNotification statusBarNotification2 = ((qcy) obj2).b;
                ocv.bk(qisVar3);
                return wcq.Y(lValueOf2, Long.valueOf(qdd.e(statusBarNotification2)));
            case 18:
                ?? r06 = this.a;
                return wcq.Y(Integer.valueOf(r06.get((qxj) obj) != null ? 0 : 1), Integer.valueOf(r06.get((qxj) obj2) == null ? 1 : 0));
            case 19:
                MaterialButton materialButton = (MaterialButton) obj;
                MaterialButton materialButton2 = (MaterialButton) obj2;
                int iCompareTo = Boolean.valueOf(materialButton.j).compareTo(Boolean.valueOf(materialButton2.j));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
                int iCompareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
                if (iCompareTo2 != 0) {
                    return iCompareTo2;
                }
                sqq sqqVar = (sqq) this.a;
                return Integer.compare(sqqVar.indexOfChild(materialButton), sqqVar.indexOfChild(materialButton2));
            default:
                ?? r07 = this.a;
                r07.a(obj);
                r07.a(obj2);
                return obj.getClass().getName().compareTo(obj2.getClass().getName());
        }
        return iA - iA2;
    }

    public /* synthetic */ acs(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}

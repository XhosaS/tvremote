package defpackage;

import android.util.SparseIntArray;
import java.util.Comparator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sib implements Comparator {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public sib(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v13, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.content.SharedPreferences, java.lang.Object] */
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        int iIntValue;
        int iIntValue2;
        int i = this.b;
        if (i == 0) {
            String strA = ((shu) obj).a();
            String strA2 = ((shu) obj2).a();
            ?? r0 = ((ulp) this.a).a;
            iIntValue = r0.getInt(strA, 0);
            iIntValue2 = r0.getInt(strA2, 0);
        } else if (i == 1) {
            Integer num = (Integer) obj;
            Integer num2 = (Integer) obj2;
            sel selVar = (sel) this.a;
            if (!selVar.b) {
                SparseIntArray sparseIntArray = selVar.a;
                return sparseIntArray.get(num.intValue()) - sparseIntArray.get(num2.intValue());
            }
            SparseIntArray sparseIntArray2 = selVar.a;
            iIntValue2 = sparseIntArray2.get(num2.intValue());
            iIntValue = sparseIntArray2.get(num.intValue());
        } else {
            if (i != 2) {
                if (i == 3) {
                    String strA3 = ((shu) obj).a();
                    String strA4 = ((shu) obj2).a();
                    ?? r02 = ((ulp) this.a).a;
                    return Long.compare(r02.getLong(strA4, 0L), r02.getLong(strA3, 0L));
                }
                Map.Entry entry = (Map.Entry) obj;
                Map.Entry entry2 = (Map.Entry) obj2;
                if (((Double) entry.getValue()).doubleValue() > ((Double) entry2.getValue()).doubleValue()) {
                    return 1;
                }
                if (((Double) entry.getValue()).doubleValue() < ((Double) entry2.getValue()).doubleValue()) {
                    return -1;
                }
                String strA5 = ((shu) entry.getKey()).a();
                String strA6 = ((shu) entry2.getKey()).a();
                ?? r03 = this.a;
                int iIntValue3 = ((Integer) r03.get(strA6)).intValue() - ((Integer) r03.get(strA5)).intValue();
                return iIntValue3 == 0 ? strA5.compareToIgnoreCase(strA6) : iIntValue3;
            }
            String strA7 = ((shu) obj).a();
            String strA8 = ((shu) obj2).a();
            ?? r04 = ((ulp) this.a).a;
            iIntValue2 = ((Integer) r04.get(strA8)).intValue();
            iIntValue = ((Integer) r04.get(strA7)).intValue();
        }
        return iIntValue2 - iIntValue;
    }
}

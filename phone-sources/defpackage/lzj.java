package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lzj implements lzi {
    private final lfn a;

    public lzj(lfn lfnVar) {
        lfnVar.getClass();
        this.a = lfnVar;
    }

    @Override // defpackage.lzi
    public final ieg a(int i) {
        kuy kuyVar;
        Map map = ovd.a;
        ovc ovcVar = (ovc) ovd.a.get(Integer.valueOf(i));
        if (ovcVar == null) {
            kuyVar = null;
        } else {
            int i2 = ovcVar.f;
            int i3 = i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 6 ? -1 : 3 : 2 : 1 : 0;
            int i4 = ovcVar.e;
            if (i4 == 0) {
                i4 = 1;
            }
            int i5 = i4 - 1;
            int i6 = i5 != 1 ? i5 != 2 ? i5 != 3 ? i5 != 4 ? 0 : 4 : 3 : 2 : 1;
            Integer num = ovcVar.d;
            int iIntValue = num == null ? 0 : num.intValue();
            Integer num2 = ovcVar.c;
            int iIntValue2 = num2 == null ? 0 : num2.intValue();
            Integer num3 = ovcVar.b;
            int iIntValue3 = num3 == null ? 0 : num3.intValue();
            int i7 = ovcVar.g;
            boolean z = i7 == 2;
            boolean z2 = i7 == 3;
            String str = ovcVar.a.f;
            if (str == null) {
                throw new NullPointerException("Null mimeType");
            }
            kuyVar = new kuy(iIntValue3, iIntValue2, iIntValue, z, z2, i3, i6, str);
        }
        return ieg.a(kuyVar);
    }

    @Override // defpackage.lzi
    public final Set b() {
        HashSet hashSet = new HashSet();
        Iterator it = this.a.bz().iterator();
        while (it.hasNext()) {
            kuy kuyVar = (kuy) a(((Integer) it.next()).intValue()).c;
            if (kuyVar != null) {
                if (kuyVar.b * kuyVar.a > 0) {
                    hashSet.add(Integer.valueOf(kuyVar.a()));
                }
            }
        }
        return hashSet;
    }
}

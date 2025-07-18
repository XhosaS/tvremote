package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class br implements kz {
    final /* synthetic */ kk a;
    private final /* synthetic */ int b;

    public br(bs bsVar, int i) {
        this.b = i;
        this.a = bsVar;
    }

    @Override // defpackage.kz
    public final void a() {
        int i = this.b;
        if (i == 0) {
            kk kkVar = this.a;
            bv bvVarF = ((bs) kkVar).f();
            bvVarF.e();
            kkVar.J().c("androidx:appcompat");
            bvVarF.o();
            return;
        }
        if (i == 1) {
            Object obj = ((t) this.a).e.a;
            y yVar = (y) obj;
            yVar.e.j(yVar, (v) obj, null);
            return;
        }
        kk kkVar2 = this.a;
        Bundle bundleC = kkVar2.J().c("android:support:activity-result");
        if (bundleC != null) {
            lc lcVar = kkVar2.h;
            ArrayList<Integer> integerArrayList = bundleC.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = bundleC.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList == null || integerArrayList == null) {
                return;
            }
            ArrayList<String> stringArrayList2 = bundleC.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            if (stringArrayList2 != null) {
                lcVar.d.addAll(stringArrayList2);
            }
            Bundle bundle = bundleC.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
            if (bundle != null) {
                lcVar.g.putAll(bundle);
            }
            int size = stringArrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                String str = stringArrayList.get(i2);
                Map map = lcVar.b;
                if (map.containsKey(str)) {
                    Integer num = (Integer) map.remove(str);
                    if (!lcVar.g.containsKey(str)) {
                        lcVar.a.remove(num);
                    }
                }
                Integer num2 = integerArrayList.get(i2);
                num2.getClass();
                int iIntValue = num2.intValue();
                String str2 = stringArrayList.get(i2);
                str2.getClass();
                lcVar.b(iIntValue, str2);
            }
        }
    }

    public /* synthetic */ br(kk kkVar, int i) {
        this.b = i;
        this.a = kkVar;
    }
}

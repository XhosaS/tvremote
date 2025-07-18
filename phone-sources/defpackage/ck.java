package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ck implements go {
    final /* synthetic */ cr a;
    private final /* synthetic */ int b;

    public ck(cr crVar, int i) {
        this.b = i;
        this.a = crVar;
    }

    @Override // defpackage.go
    public final /* synthetic */ void a(Object obj) {
        int i = this.b;
        if (i == 0) {
            cr crVar = this.a;
            gn gnVar = (gn) obj;
            cm cmVar = (cm) crVar.t.pollLast();
            if (cmVar == null) {
                toString();
                Log.w("FragmentManager", "No Activities were started for result for ".concat(toString()));
                return;
            }
            ajs ajsVar = crVar.z;
            String str = cmVar.a;
            bv bvVarC = ajsVar.c(str);
            if (bvVarC == null) {
                Log.w("FragmentManager", "Activity result delivered for unknown Fragment ".concat(String.valueOf(str)));
                return;
            } else {
                bvVarC.onActivityResult(cmVar.b, gnVar.a, gnVar.b);
                return;
            }
        }
        if (i != 1) {
            cr crVar2 = this.a;
            gn gnVar2 = (gn) obj;
            cm cmVar2 = (cm) crVar2.t.pollFirst();
            if (cmVar2 == null) {
                toString();
                Log.w("FragmentManager", "No IntentSenders were started for ".concat(toString()));
                return;
            }
            ajs ajsVar2 = crVar2.z;
            String str2 = cmVar2.a;
            bv bvVarC2 = ajsVar2.c(str2);
            if (bvVarC2 == null) {
                Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment ".concat(String.valueOf(str2)));
                return;
            } else {
                bvVarC2.onActivityResult(cmVar2.b, gnVar2.a, gnVar2.b);
                return;
            }
        }
        Map map = (Map) obj;
        String[] strArr = (String[]) map.keySet().toArray(new String[0]);
        ArrayList arrayList = new ArrayList(map.values());
        int[] iArr = new int[arrayList.size()];
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            iArr[i2] = true != ((Boolean) arrayList.get(i2)).booleanValue() ? -1 : 0;
        }
        cr crVar3 = this.a;
        cm cmVar3 = (cm) crVar3.t.pollFirst();
        if (cmVar3 == null) {
            toString();
            Log.w("FragmentManager", "No permissions were requested for ".concat(toString()));
            return;
        }
        ajs ajsVar3 = crVar3.z;
        String str3 = cmVar3.a;
        bv bvVarC3 = ajsVar3.c(str3);
        if (bvVarC3 == null) {
            Log.w("FragmentManager", "Permission request result delivered for unknown Fragment ".concat(String.valueOf(str3)));
        } else {
            bvVarC3.onRequestPermissionsResult(cmVar3.b, strArr, iArr);
        }
    }
}

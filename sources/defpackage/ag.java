package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ag implements lb {
    final /* synthetic */ am a;
    private final /* synthetic */ int b;

    public ag(am amVar, int i) {
        this.b = i;
        this.a = amVar;
    }

    @Override // defpackage.lb
    public final /* synthetic */ void a(Object obj) {
        int i = this.b;
        if (i == 0) {
            am amVar = this.a;
            la laVar = (la) obj;
            ai aiVar = (ai) amVar.p.pollLast();
            if (aiVar == null) {
                toString();
                Log.w("FragmentManager", "No Activities were started for result for ".concat(toString()));
                return;
            }
            as asVar = amVar.b;
            String str = aiVar.a;
            q qVarC = asVar.c(str);
            if (qVarC == null) {
                Log.w("FragmentManager", "Activity result delivered for unknown Fragment ".concat(String.valueOf(str)));
                return;
            } else {
                qVarC.p(aiVar.b, laVar.a, laVar.b);
                return;
            }
        }
        if (i != 1) {
            am amVar2 = this.a;
            la laVar2 = (la) obj;
            ai aiVar2 = (ai) amVar2.p.pollFirst();
            if (aiVar2 == null) {
                toString();
                Log.w("FragmentManager", "No IntentSenders were started for ".concat(toString()));
                return;
            }
            as asVar2 = amVar2.b;
            String str2 = aiVar2.a;
            q qVarC2 = asVar2.c(str2);
            if (qVarC2 == null) {
                Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment ".concat(String.valueOf(str2)));
                return;
            } else {
                qVarC2.p(aiVar2.b, laVar2.a, laVar2.b);
                return;
            }
        }
        Map map = (Map) obj;
        ArrayList arrayList = new ArrayList(map.values());
        int[] iArr = new int[arrayList.size()];
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            iArr[i2] = true != ((Boolean) arrayList.get(i2)).booleanValue() ? -1 : 0;
        }
        am amVar3 = this.a;
        ai aiVar3 = (ai) amVar3.p.pollFirst();
        if (aiVar3 == null) {
            toString();
            Log.w("FragmentManager", "No permissions were requested for ".concat(toString()));
            return;
        }
        as asVar3 = amVar3.b;
        String str3 = aiVar3.a;
        if (asVar3.c(str3) == null) {
            Log.w("FragmentManager", "Permission request result delivered for unknown Fragment ".concat(String.valueOf(str3)));
        }
    }
}

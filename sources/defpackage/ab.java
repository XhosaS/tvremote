package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ab implements abj {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public ab(bs bsVar, int i) {
        this.b = i;
        this.a = bsVar;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.abj
    public final Bundle a() {
        csa[] csaVarArr;
        int i = this.b;
        if (i == 0) {
            return ((am) this.a).a();
        }
        if (i == 1) {
            t tVar = (t) this.a;
            tVar.c();
            tVar.d.b(xa.ON_STOP);
            return new Bundle();
        }
        if (i == 2) {
            Bundle bundle = new Bundle();
            ((bs) this.a).f();
            return bundle;
        }
        if (i == 3) {
            Bundle bundle2 = new Bundle();
            lc lcVar = ((kk) this.a).h;
            Map map = lcVar.b;
            bundle2.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(map.values()));
            bundle2.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(map.keySet()));
            bundle2.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(lcVar.d));
            bundle2.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(lcVar.g));
            return bundle2;
        }
        auf aufVar = (auf) this.a;
        for (Map.Entry entry : dnx.aH(aufVar.b).entrySet()) {
            String str = (String) entry.getKey();
            Object obj = ((aei) entry.getValue()).a;
            cvx cvxVar = cvs.a;
            Object obj2 = ((cvg) obj).a;
            if (obj2 == cvxVar) {
                obj2 = null;
            }
            aufVar.b(str, obj2);
        }
        for (Map.Entry entry2 : dnx.aH(aufVar.d).entrySet()) {
            aufVar.b((String) entry2.getKey(), ((abj) entry2.getValue()).a());
        }
        ?? r0 = aufVar.c;
        if (r0.isEmpty()) {
            csaVarArr = new csa[0];
        } else {
            ArrayList arrayList = new ArrayList(r0.size());
            for (Map.Entry entry3 : r0.entrySet()) {
                arrayList.add(new csa((String) entry3.getKey(), entry3.getValue()));
            }
            csaVarArr = (csa[]) arrayList.toArray(new csa[0]);
        }
        return mo.D((csa[]) Arrays.copyOf(csaVarArr, csaVarArr.length));
    }

    public /* synthetic */ ab(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }
}

package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class cf implements ghb {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ cf(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [bie, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.ghb
    public final Bundle saveState() {
        yfw[] yfwVarArr;
        int i = this.b;
        if (i == 0) {
            return ((cr) this.a).b();
        }
        if (i == 1) {
            return ((by) this.a).m80lambda$init$0$androidsupportv4appFragmentActivity();
        }
        if (i == 2) {
            return fl._init_$lambda$6((fl) this.a);
        }
        if (i == 3) {
            int i2 = ccv.a;
            Map mapB = this.a.b();
            Bundle bundle = new Bundle();
            for (Map.Entry entry : mapB.entrySet()) {
                String str = (String) entry.getKey();
                List list = (List) entry.getValue();
                bundle.putParcelableArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
            }
            return bundle;
        }
        gag gagVar = (gag) this.a;
        for (Map.Entry entry2 : yfm.l(gagVar.e).entrySet()) {
            gagVar.c((String) entry2.getKey(), ((yvc) entry2.getValue()).d());
        }
        for (Map.Entry entry3 : yfm.l(gagVar.d).entrySet()) {
            gagVar.c((String) entry3.getKey(), ((ghb) entry3.getValue()).saveState());
        }
        ?? r0 = gagVar.a;
        if (r0.isEmpty()) {
            yfwVarArr = new yfw[0];
        } else {
            ArrayList arrayList = new ArrayList(r0.size());
            for (Map.Entry entry4 : r0.entrySet()) {
                arrayList.add(new yfw((String) entry4.getKey(), entry4.getValue()));
            }
            yfwVarArr = (yfw[]) arrayList.toArray(new yfw[0]);
        }
        return cmq.j((yfw[]) Arrays.copyOf(yfwVarArr, yfwVarArr.length));
    }
}

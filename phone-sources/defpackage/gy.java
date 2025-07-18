package defpackage;

import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gy extends gx {
    @Override // defpackage.gx
    public final /* bridge */ /* synthetic */ Object a(int i, Intent intent) {
        if (i != -1) {
            return yhc.a;
        }
        if (intent == null) {
            return yhc.a;
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (intArrayExtra == null || stringArrayExtra == null) {
            return yhc.a;
        }
        ArrayList arrayList = new ArrayList(intArrayExtra.length);
        for (int i2 : intArrayExtra) {
            arrayList.add(Boolean.valueOf(i2 == 0));
        }
        List listAW = yfm.aW(stringArrayExtra);
        Iterator it = listAW.iterator();
        Iterator it2 = arrayList.iterator();
        ArrayList arrayList2 = new ArrayList(Math.min(yfm.z(listAW, 10), yfm.z(arrayList, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList2.add(new yfw(it.next(), it2.next()));
        }
        return yfm.k(arrayList2);
    }

    @Override // defpackage.gx
    public final /* bridge */ /* synthetic */ Intent b(Object obj) {
        String[] strArr = (String[]) obj;
        strArr.getClass();
        return hp.d(strArr);
    }

    @Override // defpackage.gx
    public final /* bridge */ /* synthetic */ cb c(Context context, Object obj) {
        String[] strArr = (String[]) obj;
        strArr.getClass();
        if (strArr.length == 0) {
            return new cb(yhc.a);
        }
        for (String str : strArr) {
            if (czi.b(context, str) != 0) {
                return null;
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(ykn.j(yfm.e(strArr.length), 16));
        for (String str2 : strArr) {
            yfw yfwVar = new yfw(str2, true);
            linkedHashMap.put(yfwVar.a, yfwVar.b);
        }
        return new cb(linkedHashMap);
    }
}

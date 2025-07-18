package defpackage;

import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class vc extends vb {
    @Override // defpackage.vb
    public final /* bridge */ /* synthetic */ Object a(int i, Intent intent) {
        if (i != -1) {
            return agre.a;
        }
        if (intent == null) {
            return agre.a;
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (intArrayExtra == null || stringArrayExtra == null) {
            return agre.a;
        }
        ArrayList arrayList = new ArrayList(intArrayExtra.length);
        for (int i2 : intArrayExtra) {
            arrayList.add(Boolean.valueOf(i2 == 0));
        }
        List listM = agqj.m(stringArrayExtra);
        Iterator it = listM.iterator();
        Iterator it2 = arrayList.iterator();
        ArrayList arrayList2 = new ArrayList(Math.min(agqq.i(listM, 10), agqq.i(arrayList, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList2.add(new agpi(it.next(), it2.next()));
        }
        return agrj.f(arrayList2);
    }

    @Override // defpackage.vb
    public final /* bridge */ /* synthetic */ Intent b(Object obj) {
        String[] strArr = (String[]) obj;
        strArr.getClass();
        Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
        intentPutExtra.getClass();
        return intentPutExtra;
    }

    @Override // defpackage.vb
    public final /* bridge */ /* synthetic */ va c(Context context, Object obj) {
        String[] strArr = (String[]) obj;
        strArr.getClass();
        if (strArr.length == 0) {
            return new va(agre.a);
        }
        for (String str : strArr) {
            if (abs.a(context, str) != 0) {
                return null;
            }
        }
        int iB = agrj.b(strArr.length);
        if (iB < 16) {
            iB = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
        for (String str2 : strArr) {
            agpi agpiVar = new agpi(str2, true);
            linkedHashMap.put(agpiVar.a, agpiVar.b);
        }
        return new va(linkedHashMap);
    }
}

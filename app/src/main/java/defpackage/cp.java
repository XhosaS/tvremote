package defpackage;

import android.support.v4.app.FragmentManager$LaunchedFragmentInfo;
import android.util.Log;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
class cp implements uq {
    final /* synthetic */ de a;

    public cp(de deVar) {
        this.a = deVar;
    }

    @Override // defpackage.uq
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Map map = (Map) obj;
        ArrayList arrayList = new ArrayList(map.values());
        int[] iArr = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            iArr[i] = true != ((Boolean) arrayList.get(i)).booleanValue() ? -1 : 0;
        }
        de deVar = this.a;
        FragmentManager$LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo = (FragmentManager$LaunchedFragmentInfo) deVar.t.pollFirst();
        if (fragmentManager$LaunchedFragmentInfo == null) {
            toString();
            Log.w("FragmentManager", "No permissions were requested for ".concat(toString()));
            return;
        }
        dn dnVar = deVar.b;
        String str = fragmentManager$LaunchedFragmentInfo.a;
        bq bqVarE = dnVar.e(str);
        if (bqVarE == null) {
            Log.w("FragmentManager", "Permission request result delivered for unknown Fragment ".concat(String.valueOf(str)));
        } else {
            bqVarE.aA();
        }
    }
}

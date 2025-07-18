package defpackage;

import android.support.v4.app.FragmentManager$LaunchedFragmentInfo;
import android.util.Log;
import androidx.activity.result.ActivityResult;

/* compiled from: PG */
/* loaded from: classes.dex */
class cw implements uq {
    final /* synthetic */ de a;

    public cw(de deVar) {
        this.a = deVar;
    }

    @Override // defpackage.uq
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ActivityResult activityResult = (ActivityResult) obj;
        de deVar = this.a;
        FragmentManager$LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo = (FragmentManager$LaunchedFragmentInfo) deVar.t.pollLast();
        if (fragmentManager$LaunchedFragmentInfo == null) {
            toString();
            Log.w("FragmentManager", "No Activities were started for result for ".concat(toString()));
            return;
        }
        dn dnVar = deVar.b;
        String str = fragmentManager$LaunchedFragmentInfo.a;
        bq bqVarE = dnVar.e(str);
        if (bqVarE == null) {
            Log.w("FragmentManager", "Activity result delivered for unknown Fragment ".concat(String.valueOf(str)));
        } else {
            bqVarE.V(fragmentManager$LaunchedFragmentInfo.b, activityResult.a, activityResult.b);
        }
    }
}

package defpackage;

import android.support.v4.app.FragmentManager$LaunchedFragmentInfo;
import android.util.Log;
import androidx.activity.result.ActivityResult;

/* compiled from: PG */
/* loaded from: classes.dex */
class cx implements uq {
    final /* synthetic */ de a;

    public cx(de deVar) {
        this.a = deVar;
    }

    @Override // defpackage.uq
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ActivityResult activityResult = (ActivityResult) obj;
        de deVar = this.a;
        FragmentManager$LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo = (FragmentManager$LaunchedFragmentInfo) deVar.t.pollFirst();
        if (fragmentManager$LaunchedFragmentInfo == null) {
            toString();
            Log.w("FragmentManager", "No IntentSenders were started for ".concat(toString()));
            return;
        }
        dn dnVar = deVar.b;
        String str = fragmentManager$LaunchedFragmentInfo.a;
        bq bqVarE = dnVar.e(str);
        if (bqVarE == null) {
            Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment ".concat(String.valueOf(str)));
        } else {
            bqVarE.V(fragmentManager$LaunchedFragmentInfo.b, activityResult.a, activityResult.b);
        }
    }
}

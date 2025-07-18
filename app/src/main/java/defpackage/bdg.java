package defpackage;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bdg {
    /* JADX WARN: Multi-variable type inference failed */
    public final void a(Activity activity, bce bceVar) {
        bceVar.getClass();
        if (activity instanceof bcp) {
            ((bcp) activity).a().e(bceVar);
        } else if (activity instanceof bcl) {
            bcg bcgVarEk = ((bcl) activity).ek();
            if (bcgVarEk instanceof bco) {
                ((bco) bcgVarEk).e(bceVar);
            }
        }
    }

    public final void b(Activity activity) {
        activity.getClass();
        if (Build.VERSION.SDK_INT >= 29) {
            bdi.Companion.a(activity);
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new bdj(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}

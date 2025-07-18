package defpackage;

import android.content.Intent;
import com.google.android.apps.tvsearch.results.disclaimer.DisclaimerActivity;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hic {
    public final DisclaimerActivity a;

    public hic(DisclaimerActivity disclaimerActivity) {
        this.a = disclaimerActivity;
    }

    public final void a(Intent intent) {
        hid hidVar = new hid();
        aeik.d(hidVar);
        hidVar.ae(intent.getExtras());
        ab abVar = new ab(((bw) this.a).a.a.e);
        abVar.r(R.animator.setup_open_enter, R.animator.setup_open_exit, 0, 0);
        abVar.q(R.id.assistant_container, hidVar, null);
        abVar.e();
    }
}

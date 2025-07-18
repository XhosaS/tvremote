package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.usagereporting.UsageReportingOptInOptions;

/* compiled from: PG */
/* loaded from: classes.dex */
class lvy extends lwr {
    final /* synthetic */ lvj a;

    public lvy(lvj lvjVar) {
        this.a = lvjVar;
    }

    @Override // defpackage.lwr, defpackage.lwm
    public final void c(Status status, UsageReportingOptInOptions usageReportingOptInOptions) {
        kid.a(status, new lwc(new lwq(Status.a, usageReportingOptInOptions)), this.a);
    }
}

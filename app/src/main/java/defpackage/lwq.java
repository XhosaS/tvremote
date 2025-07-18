package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.usagereporting.UsageReportingOptInOptions;

/* compiled from: PG */
/* loaded from: classes.dex */
public class lwq implements kfc {
    public final UsageReportingOptInOptions a;
    private final Status b;

    public lwq(Status status, UsageReportingOptInOptions usageReportingOptInOptions) {
        this.b = status;
        this.a = usageReportingOptInOptions;
    }

    @Override // defpackage.kfc
    public final Status b() {
        return this.b;
    }

    public final String toString() {
        UsageReportingOptInOptions usageReportingOptInOptions = this.a;
        kkk.k(usageReportingOptInOptions);
        return String.format("OptInOptionsResultImpl[%s]", Boolean.valueOf(usageReportingOptInOptions.a == 1));
    }
}

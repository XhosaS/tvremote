package defpackage;

import android.os.Parcelable;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.ComplianceOptions;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class knv {
    public static ApiMetadata a() {
        knu knuVar = knt.a;
        ComplianceOptions complianceOptions = new ComplianceOptions(-1, -1, 0, true);
        Parcelable.Creator creator = ApiMetadata.CREATOR;
        return kek.a(complianceOptions, false);
    }
}

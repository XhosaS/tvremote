package defpackage;

import android.util.Log;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ooy extends oov {
    @Override // defpackage.oov
    public final void c(Status status) {
        if (status.b()) {
            return;
        }
        Log.e("UsageReportingClientImp", "disconnect(): Could not unregister listener: status=".concat(String.valueOf(String.valueOf(status))));
    }
}

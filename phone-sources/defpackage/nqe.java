package defpackage;

import com.google.android.gms.cast.MediaError;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class nqe implements nqd {
    private final Status a;
    private final MediaError b;

    public nqe(Status status, MediaError mediaError) {
        this.a = status;
        this.b = mediaError;
    }

    @Override // defpackage.nxc
    public final Status e() {
        return this.a;
    }
}

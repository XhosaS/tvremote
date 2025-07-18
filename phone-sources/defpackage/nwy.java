package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nwy extends BasePendingResult {
    private final nxc a;

    public nwy(nxc nxcVar) {
        super(null);
        this.a = nxcVar;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final nxc a(Status status) {
        return this.a;
    }
}

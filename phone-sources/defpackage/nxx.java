package defpackage;

import com.google.android.gms.common.api.internal.BasePendingResult;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nxx {
    final /* synthetic */ BasePendingResult a;

    public nxx(BasePendingResult basePendingResult) {
        this.a = basePendingResult;
    }

    protected final void finalize() throws Throwable {
        int i = BasePendingResult.p;
        BasePendingResult.p(this.a.m);
        super.finalize();
    }
}

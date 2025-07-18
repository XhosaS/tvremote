package defpackage;

import com.google.android.gms.common.api.internal.BasePendingResult;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kgc {
    final /* synthetic */ BasePendingResult a;

    public kgc(BasePendingResult basePendingResult) {
        this.a = basePendingResult;
    }

    protected final void finalize() throws Throwable {
        ThreadLocal threadLocal = BasePendingResult.b;
        BasePendingResult.l(this.a.f);
        super.finalize();
    }
}

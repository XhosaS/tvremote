package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* compiled from: PG */
/* loaded from: classes.dex */
class kge implements kex {
    final /* synthetic */ BasePendingResult a;
    final /* synthetic */ kgg b;

    public kge(kgg kggVar, BasePendingResult basePendingResult) {
        this.a = basePendingResult;
        this.b = kggVar;
    }

    @Override // defpackage.kex
    public final void a(Status status) {
        this.b.a.remove(this.a);
    }
}

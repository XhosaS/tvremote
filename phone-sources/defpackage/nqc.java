package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class nqc extends BasePendingResult {
    private nsm a;
    public final boolean c;
    final /* synthetic */ nqj d;

    public nqc(nqj nqjVar) {
        this(nqjVar, false);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ nxc a(Status status) {
        return new nqb(status, 0);
    }

    public abstract void b();

    final nsm c() {
        if (this.a == null) {
            this.a = new nqa(this, 0);
        }
        return this.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nqc(nqj nqjVar, boolean z) {
        super(null);
        this.d = nqjVar;
        this.c = z;
    }
}

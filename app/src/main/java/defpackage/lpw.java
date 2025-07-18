package defpackage;

import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lpw implements lnl {
    private final Status a;
    private final lqh b;

    public lpw(Status status, lqh lqhVar) {
        this.a = status;
        this.b = lqhVar;
    }

    @Override // defpackage.kez
    public final void a() {
        lqh lqhVar = this.b;
        if (lqhVar != null) {
            lqhVar.a.close();
        }
    }

    @Override // defpackage.kfc
    public final Status b() {
        return this.a;
    }

    @Override // defpackage.lnl
    public final lqh c() {
        return this.b;
    }
}

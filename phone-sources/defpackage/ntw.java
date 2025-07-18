package defpackage;

import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ntw extends nuc {
    final /* synthetic */ ntx a;
    private final nug b;

    public ntw(ntx ntxVar, nug nugVar) {
        this.a = ntxVar;
        this.b = nugVar;
    }

    @Override // defpackage.nuc
    public final void b(Status status) {
        try {
            if (status.b()) {
                ntx ntxVar = this.a;
                nuh.c(ntxVar.a.w).e();
                ntxVar.d();
            } else {
                if (nuh.c(this.a.a.w).b() != null) {
                    nue nueVarB = nue.b();
                    nug nugVar = this.b;
                    String str = ((ntk) nugVar.c).a.f;
                    int i = nugVar.a;
                    nueVarB.c(new nuf(str, 1003, 1));
                }
            }
        } finally {
            nty.a.set(false);
        }
    }
}

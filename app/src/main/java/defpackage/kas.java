package defpackage;

import com.google.android.gms.clearcut.internal.LogErrorParcelable;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes.dex */
class kas extends kax {
    final /* synthetic */ kat a;
    private final kbe b;

    public kas(kat katVar, kbe kbeVar) {
        this.a = katVar;
        this.b = kbeVar;
    }

    @Override // defpackage.kax, defpackage.kba
    public final void d(Status status) {
        try {
            if (status.c()) {
                kat katVar = this.a;
                kbf.c(katVar.a.b).e();
                katVar.c();
            } else {
                if (kbf.c(this.a.a.b).b() != null) {
                    kbc kbcVarB = kbc.b();
                    kbe kbeVar = this.b;
                    String str = kbeVar.a.a.f;
                    int i = kbeVar.b;
                    kbcVarB.c(new LogErrorParcelable(str, 1003, 1));
                }
            }
        } finally {
            kau.a.set(false);
        }
    }
}

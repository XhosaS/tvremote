package defpackage;

import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ujy extends nzk {
    final /* synthetic */ ujz a;
    final /* synthetic */ kwy b;

    public ujy(ujz ujzVar, kwy kwyVar) {
        this.b = kwyVar;
        this.a = ujzVar;
    }

    @Override // defpackage.nzl
    public final void a(Status status) {
        Exception ujpVar;
        if (this.b.w(null)) {
            if (status.b()) {
                ((kwy) this.a.a.c).u(null);
                return;
            }
            ujz ujzVar = this.a;
            ocv.aF(status);
            String str = status.g;
            if (str == null || str.isEmpty()) {
                str = "Indexing error, please try again.";
            }
            switch (status.f) {
                case 17510:
                    ujpVar = new ujp(str);
                    break;
                case 17511:
                    ujpVar = new ujq(str);
                    break;
                case 17512:
                default:
                    ujpVar = new ujn(str);
                    break;
                case 17513:
                    ujpVar = new ujo(str);
                    break;
                case 17514:
                    ujpVar = new ujm(str);
                    break;
            }
            ((kwy) ujzVar.a.c).t(ujpVar);
        }
    }
}

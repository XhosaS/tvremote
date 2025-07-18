package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yrl extends yrm implements ypd {
    public final Handler a;
    public final yrl b;
    private final String c;
    private final boolean d;

    public yrl(Handler handler, String str) {
        this(handler, str, false);
    }

    private final void j(yil yilVar, Runnable runnable) {
        yoz.x(yilVar, new CancellationException(a.cj(this, "The task was rejected, the handler underlying the dispatcher '", "' was closed")));
        yot yotVar = ypk.a;
        yya.a.a(yilVar, runnable);
    }

    @Override // defpackage.yot
    public final void a(yil yilVar, Runnable runnable) {
        if (this.a.post(runnable)) {
            return;
        }
        j(yilVar, runnable);
    }

    @Override // defpackage.ypd
    public final void c(long j, yoe yoeVar) {
        xxl xxlVar = new xxl(yoeVar, this, 12, (char[]) null);
        if (this.a.postDelayed(xxlVar, ykn.n(j, 4611686018427387903L))) {
            yoeVar.b(new qaz(this, xxlVar, 20));
        } else {
            j(((yof) yoeVar).b, xxlVar);
        }
    }

    @Override // defpackage.yot
    public final boolean cF(yil yilVar) {
        if (this.d) {
            return !yks.e(Looper.myLooper(), this.a.getLooper());
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof yrl)) {
            return false;
        }
        yrl yrlVar = (yrl) obj;
        return yrlVar.a == this.a && yrlVar.d == this.d;
    }

    @Override // defpackage.yrm, defpackage.ypd
    public final ypm h(long j, final Runnable runnable, yil yilVar) {
        if (this.a.postDelayed(runnable, ykn.n(j, 4611686018427387903L))) {
            return new ypm() { // from class: yrk
                @Override // defpackage.ypm
                public final void eD() {
                    this.a.a.removeCallbacks(runnable);
                }
            };
        }
        j(yilVar, runnable);
        return yqs.a;
    }

    public final int hashCode() {
        boolean z = this.d;
        return (true != z ? 1237 : 1231) ^ System.identityHashCode(this.a);
    }

    @Override // defpackage.yqp
    public final /* synthetic */ yqp i() {
        return this.b;
    }

    @Override // defpackage.yqp, defpackage.yot
    public final String toString() {
        String strE = e();
        if (strE != null) {
            return strE;
        }
        String string = this.c;
        if (string == null) {
            string = this.a.toString();
        }
        return this.d ? String.valueOf(string).concat(".immediate") : string;
    }

    private yrl(Handler handler, String str, boolean z) {
        this.a = handler;
        this.c = str;
        this.d = z;
        this.b = z ? this : new yrl(handler, str, true);
    }
}

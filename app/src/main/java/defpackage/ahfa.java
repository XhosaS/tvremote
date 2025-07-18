package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahfa extends ahfb implements ahcd {
    public final Handler a;
    private final String d;
    private final boolean e;
    private final ahfa f;

    public ahfa(Handler handler, String str, boolean z) {
        this.a = handler;
        this.d = str;
        this.e = z;
        this.f = z ? this : new ahfa(handler, str, true);
    }

    private final void i(agte agteVar, Runnable runnable) {
        ahdp.c(agteVar, new CancellationException(a.c(this, "The task was rejected, the handler underlying the dispatcher '", "' was closed")));
        ahbm ahbmVar = ahcl.a;
        ahbm ahbmVar2 = ahmy.a;
        ahmy.a.a(agteVar, runnable);
    }

    @Override // defpackage.ahbm
    public final void a(agte agteVar, Runnable runnable) {
        if (this.a.post(runnable)) {
            return;
        }
        i(agteVar, runnable);
    }

    @Override // defpackage.ahbm
    public final boolean b(agte agteVar) {
        if (this.e) {
            return !agvy.c(Looper.myLooper(), this.a.getLooper());
        }
        return true;
    }

    @Override // defpackage.ahcd
    public final void c(long j, final ahap ahapVar) {
        final Runnable runnable = new Runnable() { // from class: ahey
            @Override // java.lang.Runnable
            public final void run() {
                ahapVar.b(this, agpu.a);
            }
        };
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.a.postDelayed(runnable, j)) {
            ahapVar.a(new agux() { // from class: ahez
                @Override // defpackage.agux
                public final Object a(Object obj) {
                    this.a.a.removeCallbacks(runnable);
                    return agpu.a;
                }
            });
        } else {
            i(((ahar) ahapVar).b, runnable);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ahfa)) {
            return false;
        }
        ahfa ahfaVar = (ahfa) obj;
        return ahfaVar.a == this.a && ahfaVar.e == this.e;
    }

    @Override // defpackage.ahfb, defpackage.ahcd
    public final ahcn g(long j, final Runnable runnable, agte agteVar) {
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.a.postDelayed(runnable, j)) {
            return new ahcn() { // from class: ahex
                @Override // defpackage.ahcn
                public final void fn() {
                    this.a.a.removeCallbacks(runnable);
                }
            };
        }
        i(agteVar, runnable);
        return ahec.a;
    }

    @Override // defpackage.ahdz
    public final /* synthetic */ ahdz h() {
        return this.f;
    }

    public final int hashCode() {
        boolean z = this.e;
        return (true != z ? 1237 : 1231) ^ System.identityHashCode(this.a);
    }

    @Override // defpackage.ahdz, defpackage.ahbm
    public final String toString() {
        String strE = e();
        if (strE != null) {
            return strE;
        }
        String string = this.d;
        if (string == null) {
            string = this.a.toString();
        }
        return this.e ? String.valueOf(string).concat(".immediate") : string;
    }
}

package defpackage;

import android.os.SystemClock;
import com.google.protobuf.MessageLite;
import io.grpc.Status;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ovl implements owf {
    public final ovo a;
    private final ovm b;
    private final Executor c;
    private final afil d;
    private final ager e;
    private final String f;
    private final owg g;
    private String h;
    private String i;
    private afeq j;
    private long k;
    private final MessageLite l;

    public ovl(ovo ovoVar, ovm ovmVar, afil afilVar, MessageLite messageLite, ager agerVar, Executor executor, long j, String str, String str2, owg owgVar) {
        this.a = ovoVar;
        this.b = ovmVar;
        this.d = afilVar;
        this.l = messageLite;
        this.e = ovoVar.a(this, agerVar);
        this.c = executor;
        this.k = j;
        this.f = str;
        this.i = str2;
        this.g = owgVar;
    }

    @Override // defpackage.oui
    public final String a() {
        return this.i;
    }

    @Override // defpackage.oui
    public final String b() {
        return this.f;
    }

    @Override // defpackage.oui
    public final String c() {
        return this.h;
    }

    @Override // defpackage.oui
    public final void d(String str) {
        this.i = str;
    }

    @Override // defpackage.oui
    public final void e(String str) {
        this.h = str;
    }

    @Override // defpackage.owf
    public final long f() {
        return this.k;
    }

    @Override // defpackage.owf
    public final ovm g() {
        return this.b;
    }

    @Override // defpackage.owf
    public final owg h() {
        return this.g;
    }

    @Override // defpackage.owf
    public final afil i() {
        return this.d;
    }

    @Override // defpackage.owf
    public final Executor j() {
        return this.c;
    }

    @Override // defpackage.owf
    public final synchronized void k(Throwable th) {
        owg owgVar = this.g;
        if (owgVar.d) {
            return;
        }
        owgVar.d = true;
        afeq afeqVar = this.j;
        if (afeqVar != null) {
            afeqVar.b("Request cancelled intentionally by client", th);
        } else {
            this.e.f(new afjx(Status.b.withDescription("Request cancelled before it started").c(th), null));
        }
    }

    @Override // defpackage.owf
    public final synchronized void l(afen afenVar, afem afemVar) {
        if (this.g.d) {
            return;
        }
        long j = this.k;
        if (j > 0) {
            afemVar = afemVar.c(afft.c(j, TimeUnit.MILLISECONDS, afft.a));
        }
        afeq afeqVarA = afenVar.a(this.d, afemVar);
        this.j = afeqVarA;
        MessageLite messageLite = this.l;
        ager agerVar = this.e;
        afel afelVar = agen.a;
        agerVar.getClass();
        agen.b(afeqVarA, messageLite, new agek(agerVar, new ageh(afeqVarA, false)));
    }

    @Override // defpackage.owf
    public final void m(long j) {
        this.k = j;
    }

    @Override // defpackage.owf
    public final void n(ovx ovxVar) {
        owg owgVar = this.g;
        mcw mcwVar = owgVar.e;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        owgVar.b = jElapsedRealtime;
        if (owgVar.a == -1) {
            owgVar.a = jElapsedRealtime;
        }
        owgVar.c++;
        ovxVar.c.b.c(ovxVar.a, ovxVar.b);
    }
}

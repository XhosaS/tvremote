package defpackage;

import com.google.android.gms.auth.TokenData;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lnl implements lnn {
    private final boolean a;
    private int b;
    private String c;
    private String d;
    private long e;

    public lnl(lfn lfnVar) {
        this.a = lfnVar.db();
    }

    private static void x(boolean z, lih lihVar) {
        int i = lihVar.b - lihVar.a;
        StringBuilder sb = new StringBuilder("Ad playback ");
        sb.append(true != z ? "completed" : "started");
        sb.append(" load time = ");
        sb.append(i);
        sb.append(" (ms)");
        krd.b(sb.toString());
    }

    @Override // defpackage.lnn
    public final void a(int i, lih lihVar) {
        x(false, lihVar);
    }

    @Override // defpackage.lnn
    public final void b(int i, lih lihVar) {
        x(true, lihVar);
    }

    @Override // defpackage.lnn
    public final void c(int i, int i2, int i3, String str, int i4) {
        krd.b("Audio format enabled: " + i + ", " + i2 + ", " + i3 + ", " + str + ", " + i4);
    }

    @Override // defpackage.lnn
    public final void d(int i, int i2, kzo kzoVar, boolean z) {
        if (kzoVar == null) {
            return;
        }
        Integer numValueOf = Integer.valueOf(i2);
        String str = kzoVar.c;
        int iBm = a.bm(kzoVar.f);
        if (iBm == 0) {
            iBm = 1;
        }
        krd.b(String.format("Audio Track selected: timeMs:%s language:%s, type:%s, format:%s, reason:%s", numValueOf, str, kaf.l(iBm), true != kzoVar.e ? "" : "5.1", true != z ? "INITIAL" : "MANUAL"));
    }

    @Override // defpackage.lnn
    public final void e(int i, int i2) {
        krd.b("Dropped frames: " + this.d + ", " + i2);
    }

    @Override // defpackage.lnn
    public final void f(int i, int i2) {
        krd.c("Failed: " + this.d + ", " + i2);
    }

    @Override // defpackage.lnn
    public final void g(int i, int i2, int i3, int i4) {
        krd.b("Format enabled: " + i2 + ", " + i3 + ", " + i4 + ", " + this.e);
    }

    @Override // defpackage.lnn
    public final void h(int i, int i2, int i3) {
        krd.b("Format selected: " + i2 + ", " + i3 + ", " + this.e);
    }

    @Override // defpackage.lnn
    public final void i(int i, int i2, int i3, boolean z) {
        krd.b("Network:" + i2 + ", " + i3 + ", " + z);
    }

    @Override // defpackage.lnn
    public final void j(boolean z) {
        krd.b("On PiP Mode changed for playback: " + z);
    }

    @Override // defpackage.lnn
    public final void k(int i, int i2, boolean z, int i3) {
        krd.b("State:" + this.d + ", " + z + ", " + i3);
    }

    @Override // defpackage.lnn
    public final void l(int i, kwx kwxVar) {
        krd.b("Subtitle enabled: ".concat(String.valueOf(String.valueOf(kwxVar))));
    }

    @Override // defpackage.lnn
    public final void m(int i, kwx kwxVar, Throwable th) {
        krd.d("Subtitle error: " + this.d + ", " + i + ", " + String.valueOf(kwxVar), th);
    }

    @Override // defpackage.lnn
    public final void n(int i, kwx kwxVar) {
        krd.b("Subtitle selected: ".concat(String.valueOf(String.valueOf(kwxVar))));
    }

    @Override // defpackage.lnn
    public final void o(int i, int i2, boolean z, int i3) {
        krd.b("Seeking:" + i2 + ", " + z + ", " + i3);
    }

    @Override // defpackage.lnn
    public final void p(int i) {
        krd.b(a.cf(i, "Playback DRM type:"));
    }

    @Override // defpackage.lnn
    public final void q(int i, lne lneVar) {
        krd.b("Ended: ".concat(String.valueOf(this.d)));
        krd.b("============");
        krd.b("Asset: ".concat(String.valueOf(this.c)));
        krd.b("Player type: " + this.b);
        krd.b("Joining time: " + lneVar.c);
        krd.b("Playing time: " + lneVar.h);
        krd.b("Rebuffering time: " + lneVar.e);
        krd.b("Rebuffering count: " + lneVar.d);
        krd.b("Initial rebuffering time: " + lneVar.g);
        krd.b("Initial rebuffering count: " + lneVar.f);
        krd.b("Error count: " + lneVar.k);
        krd.b("Failure count: " + lneVar.l);
        krd.b("Dropped frames: " + lneVar.n);
        krd.b("Itags: ".concat(String.valueOf(Arrays.toString(lneVar.b.toArray()))));
        krd.b("Connection types: ".concat(String.valueOf(Arrays.toString(lneVar.a.toArray()))));
        krd.b("First itag: " + lneVar.o);
        krd.b("Second itag: " + lneVar.p);
        krd.b("First quality switch time ms: " + lneVar.q);
        krd.b("Format enabled count: " + lneVar.r);
        krd.b("Format selected count: " + lneVar.s);
        krd.b("Total time in PiP: " + lneVar.i);
        krd.b("Total playing time in PiP: " + lneVar.j);
        long j = lneVar.t;
        if (j > 0) {
            krd.b("Average video resolution: " + ((int) (lneVar.u / j)));
            krd.b("Average video bandwidth: " + ((int) (lneVar.v / lneVar.t)));
        }
        krd.b("============");
    }

    @Override // defpackage.lnn
    public final void r(long j) {
        this.e = j;
    }

    @Override // defpackage.lnn
    public final void s(int i, int i2, int i3, int i4, Throwable th) {
        krd.d("Error: " + this.d + ", " + i2 + ", " + i3 + ", " + i4, th);
    }

    @Override // defpackage.lnn
    public final void t(long j) {
        if (this.a) {
            krd.b(a.cs(j, "Http data source opened: "));
        }
    }

    @Override // defpackage.lnn
    public final void u(boolean z) {
        if (this.a) {
            krd.b("Loading:" + z);
        }
    }

    @Override // defpackage.lnn
    public final void w(String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, int i, boolean z3, TokenData tokenData, boolean z4) {
        this.b = 5;
        this.c = str3;
        this.d = str2;
        this.e = -1L;
        krd.b("SessionStarted: " + str + " " + str2 + " 5 " + str3 + " " + str4 + " " + str5 + " " + z + " " + z2 + " " + i + " " + z3);
        if (tokenData == null) {
            krd.b("Session token is null");
            return;
        }
        Long l = tokenData.c;
        if (l == null) {
            krd.b("Token has no expiration time");
            return;
        }
        krd.b("Session token expiring in " + (l.longValue() - (System.currentTimeMillis() / 1000)) + "s");
    }

    @Override // defpackage.lnn
    public final void v() {
    }
}

package defpackage;

import android.media.session.MediaController;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gks implements gkp, gnx {
    public static final Duration a;
    public final gfr b;
    public final gnz c;
    private final ahbt d;
    private final agow e;
    private String f;
    private ahdl g;

    static {
        Duration durationOfSeconds = Duration.ofSeconds(30L);
        durationOfSeconds.getClass();
        a = durationOfSeconds;
    }

    public gks(ahbt ahbtVar, agow agowVar, gfr gfrVar, gnz gnzVar) {
        ahbtVar.getClass();
        agowVar.getClass();
        gfrVar.getClass();
        gnzVar.getClass();
        this.d = ahbtVar;
        this.e = agowVar;
        this.b = gfrVar;
        this.c = gnzVar;
        this.f = "";
    }

    @Override // defpackage.gkp
    public final void a(String str) {
        str.getClass();
        if (((Boolean) this.e.a()).booleanValue()) {
            this.f = str;
            ahdl ahdlVar = this.g;
            if (ahdlVar != null) {
                ahdlVar.s(null);
            }
            this.g = ahal.e(this.d, null, 0, new gkr(this, null), 3);
        }
    }

    @Override // defpackage.gnx
    public final void b(MediaController mediaController) {
        String packageName = mediaController.getPackageName();
        packageName.getClass();
        ahdl ahdlVar = this.g;
        if (ahdlVar != null && ahdlVar.t() && agvy.c(packageName, this.f)) {
            this.b.b(rpm.y(), null, null);
        }
    }

    @Override // defpackage.gnx
    public final void c(MediaController mediaController) {
        String packageName = mediaController.getPackageName();
        packageName.getClass();
        ahdl ahdlVar = this.g;
        if (ahdlVar != null && ahdlVar.t() && agvy.c(packageName, this.f)) {
            gfq.a(this.b, rpm.dS(), abqb.OK, 12);
        }
        ahdl ahdlVar2 = this.g;
        if (ahdlVar2 != null) {
            ahdlVar2.s(null);
        }
    }

    @Override // defpackage.gnx
    public final void d(MediaController mediaController, int i) {
        String packageName = mediaController.getPackageName();
        packageName.getClass();
        ahdl ahdlVar = this.g;
        if (ahdlVar != null && ahdlVar.t() && agvy.c(packageName, this.f)) {
            if (i == 1) {
                gfq.a(this.b, rpm.dU(), null, 14);
                return;
            }
            if (i == 2) {
                gfq.b(this.b, rpm.w(), null, null, 14);
            } else if (i == 3) {
                gfq.b(this.b, rpm.x(), null, null, 14);
            } else {
                if (i != 7) {
                    return;
                }
                gfq.b(this.b, rpm.v(), null, null, 14);
            }
        }
    }
}

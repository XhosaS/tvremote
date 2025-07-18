package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fph extends frw {
    public static final int a;
    public final foo b;
    public final fpe c;
    public final fse d;
    public final fpf e;
    public final ComponentName f;
    public uha g;
    public final Bundle h;
    public ImmutableList i;
    public ImmutableList j;
    public fqx k;
    public eak l;
    public eah m;
    public final iom n;
    private final fsh s;
    private final fpb t;
    private final boolean u = true;
    private volatile long v;
    private int w;

    static {
        a = Build.VERSION.SDK_INT >= 31 ? 33554432 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public fph(defpackage.foo r10, android.net.Uri r11, android.os.Handler r12, android.os.Bundle r13, com.google.common.collect.ImmutableList r14, com.google.common.collect.ImmutableList r15, defpackage.fqx r16, defpackage.eak r17, android.os.Bundle r18) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fph.<init>(foo, android.net.Uri, android.os.Handler, android.os.Bundle, com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableList, fqx, eak, android.os.Bundle):void");
    }

    private static ComponentName L(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            return null;
        }
        ResolveInfo resolveInfo = listQueryIntentServices.get(0);
        return new ComponentName(resolveInfo.serviceInfo.packageName, resolveInfo.serviceInfo.name);
    }

    private static dzy M(String str, Uri uri, String str2, Bundle bundle) {
        dzl dzlVar = new dzl();
        if (str == null) {
            str = "";
        }
        dzlVar.b(str);
        kvw kvwVar = new kvw((char[]) null);
        kvwVar.a = uri;
        kvwVar.c = str2;
        kvwVar.b = bundle;
        dzlVar.e = new dzu(kvwVar);
        return dzlVar.a();
    }

    private final void N(fqw fqwVar, fpg fpgVar) {
        O(fqwVar, 0, fpgVar, this.d.c());
    }

    private final void O(fqw fqwVar, int i, fpg fpgVar, fsf fsfVar) {
        Object objValueOf = fqwVar;
        if (fsfVar == null) {
            if (fqwVar == null) {
                objValueOf = Integer.valueOf(i);
            }
            edb.g("RemoteUserInfo is null, ignoring command=".concat(objValueOf.toString()));
        } else {
            foo fooVar = this.b;
            edt.aB(fooVar.k, new ejq(this, fqwVar, i, fsfVar, fpgVar, 2));
        }
    }

    private final void P(final dzy dzyVar, final boolean z) {
        d(31, new fpg() { // from class: fov
            @Override // defpackage.fpg
            public final void a(fnw fnwVar) {
                ImmutableList immutableListOf = ImmutableList.of(dzyVar);
                fph fphVar = this.a;
                sfy.K(fphVar.b.h(fnwVar, immutableListOf, -1, -9223372036854775807L), new foz(fphVar, fnwVar, z), ugk.a);
            }
        }, this.d.c(), false);
    }

    private final void Q(final frs frsVar, final int i) {
        if (frsVar != null) {
            if (i == -1 || i >= 0) {
                d(20, new fpg() { // from class: fos
                    /* JADX WARN: Removed duplicated region for block: B:34:0x009d  */
                    @Override // defpackage.fpg
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final void a(defpackage.fnw r13) throws java.io.IOException {
                        /*
                            Method dump skipped, instructions count: 348
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.fos.a(fnw):void");
                    }
                }, this.d.c(), false);
            }
        }
    }

    public static String c(Throwable th) {
        return "Failed to load bitmap: ".concat(String.valueOf(th.getMessage()));
    }

    static /* synthetic */ void e(uhp uhpVar, ResultReceiver resultReceiver) {
        fra fraVar;
        try {
            fraVar = (fra) ((uhl) uhpVar).b;
            eci.d(fraVar, "SessionResult must not be null");
        } catch (InterruptedException e) {
            e = e;
            edb.f("MediaSessionLegacyStub", "Custom command failed", e);
            fraVar = new fra(-1);
        } catch (CancellationException e2) {
            edb.f("MediaSessionLegacyStub", "Custom command cancelled", e2);
            fraVar = new fra(1);
        } catch (ExecutionException e3) {
            e = e3;
            edb.f("MediaSessionLegacyStub", "Custom command failed", e);
            fraVar = new fra(-1);
        }
        resultReceiver.send(fraVar.e, fraVar.f);
    }

    @Override // defpackage.frw
    public final void A(int i) {
        d(14, new fox(this, i, 0), this.d.c(), true);
    }

    @Override // defpackage.frw
    public final void B() {
        int i = 9;
        int i2 = 8;
        if (this.b.q.q(9)) {
            d(9, new fop(this, i2), this.d.c(), true);
        } else {
            d(8, new fop(this, i), this.d.c(), true);
        }
    }

    @Override // defpackage.frw
    public final void C() {
        if (this.b.q.q(7)) {
            d(7, new fop(this, 3), this.d.c(), true);
        } else {
            d(6, new fop(this, 4), this.d.c(), true);
        }
    }

    @Override // defpackage.frw
    public final void D(long j) {
        if (j < 0) {
            return;
        }
        d(10, new fow(this, j, 1), this.d.c(), true);
    }

    @Override // defpackage.frw
    public final void E() {
        d(3, new fop(this, 7), this.d.c(), true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void F() {
        ImmutableList immutableList = this.j;
        eak eakVar = this.l;
        int i = fnb.e;
        ImmutableList.Builder builder = new ImmutableList.Builder();
        for (int i2 = 0; i2 < immutableList.size(); i2++) {
            fnb fnbVar = (fnb) immutableList.get(i2);
            fqw fqwVar = fnbVar.a;
            int i3 = fnbVar.b;
            if (!eakVar.d(0)) {
                throw null;
            }
            builder.add((ImmutableList.Builder) fnbVar);
        }
        ImmutableList immutableListA = fnb.a(builder.build());
        this.i = immutableListA;
        Bundle bundle = this.h;
        fnb.b(immutableListA);
        bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", true);
        fnb.b(this.i);
        bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", true);
    }

    public final void G(fqt fqtVar) {
        edt.aB(this.b.k, new foa(this, fqtVar, 9, null));
    }

    public final boolean H() {
        return this.l.d(17) && this.b.q.M().d(17);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d6  */
    @Override // defpackage.frw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean I(android.content.Intent r11) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fph.I(android.content.Intent):boolean");
    }

    @Override // defpackage.frw
    public final void J(fsm fsmVar) {
        eaq eaqVarE = fnm.e(fsmVar);
        if (eaqVarE == null) {
            edb.e("MediaSessionLegacyStub", "Ignoring invalid RatingCompat ".concat(String.valueOf(String.valueOf(fsmVar))));
        } else {
            O(null, 40010, new fot(this, eaqVarE, 1), this.d.c());
        }
    }

    public final fnw a(fsf fsfVar) {
        iom iomVar = this.n;
        fnw fnwVarJ = iomVar.j(fsfVar);
        if (fnwVarJ == null) {
            fpc fpcVar = new fpc(fsfVar);
            this.s.b(fsfVar);
            fnw fnwVar = new fnw(fsfVar, 0, 0, fpcVar, Bundle.EMPTY);
            foo fooVar = this.b;
            fnu fnuVarD = fooVar.d(fnwVar);
            iomVar.m(fnwVar.a, fnwVar, fnuVarD.d, fnuVarD.e);
            fooVar.n(fnwVar);
            fnwVarJ = fnwVar;
        }
        fpb fpbVar = this.t;
        long j = this.v;
        fpbVar.removeMessages(1001, fnwVarJ);
        fpbVar.sendMessageDelayed(fpbVar.obtainMessage(1001, fnwVarJ), j);
        return fnwVarJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.fsl b(defpackage.fqt r19) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fph.b(fqt):fsl");
    }

    public final void d(final int i, final fpg fpgVar, final fsf fsfVar, final boolean z) {
        foo fooVar = this.b;
        if (fooVar.s()) {
            return;
        }
        if (fsfVar == null) {
            edb.g(a.cf(i, "RemoteUserInfo is null, ignoring command="));
        } else {
            edt.aB(fooVar.k, new Runnable() { // from class: foy
                @Override // java.lang.Runnable
                public final void run() {
                    fph fphVar = this.a;
                    foo fooVar2 = fphVar.b;
                    if (fooVar2.s()) {
                        return;
                    }
                    fsf fsfVar2 = fsfVar;
                    int i2 = i;
                    if (!fphVar.d.m()) {
                        edb.e("MediaSessionLegacyStub", "Ignore incoming player command before initialization. command=" + i2 + ", pid=" + fsfVar2.a());
                        return;
                    }
                    fnw fnwVarA = fphVar.a(fsfVar2);
                    if (!fphVar.n.s(fnwVarA, i2)) {
                        if (i2 != 1 || fooVar2.q.al()) {
                            return;
                        }
                        edb.e("MediaSessionLegacyStub", "Calling play() omitted due to COMMAND_PLAY_PAUSE not being available. If this play command has started the service for instance for playback resumption, this may prevent the service from being started into the foreground.");
                        return;
                    }
                    boolean z2 = z;
                    fpg fpgVar2 = fpgVar;
                    fooVar2.w(fnwVarA);
                    new foe(new foa(fpgVar2, fnwVarA, 10), 1).run();
                    if (z2) {
                        int[] iArr = eaj.a;
                        rin rinVar = new rin(null, null);
                        rinVar.j(i2);
                        eaj.a(rinVar);
                        fooVar2.x(fnwVarA);
                    }
                }
            });
        }
    }

    final void f(fqt fqtVar) {
        int i = true != fqtVar.q(20) ? 0 : 4;
        if (this.w != i) {
            this.w = i;
            ((frx) this.d.b).e(i);
        }
    }

    @Override // defpackage.frw
    public final void g(frs frsVar) {
        Q(frsVar, -1);
    }

    @Override // defpackage.frw
    public final void h(frs frsVar, int i) {
        Q(frsVar, i);
    }

    @Override // defpackage.frw
    public final void i(String str, final Bundle bundle, final ResultReceiver resultReceiver) {
        eci.e(str);
        if (str.equals("androidx.media3.session.SESSION_COMMAND_MEDIA3_PLAY_REQUEST")) {
            return;
        }
        if (!str.equals("androidx.media3.session.SESSION_COMMAND_REQUEST_SESSION3_TOKEN") || resultReceiver == null) {
            final fqw fqwVar = new fqw(str, Bundle.EMPTY);
            N(fqwVar, new fpg() { // from class: fou
                @Override // defpackage.fpg
                public final void a(fnw fnwVar) {
                    uhp uhpVarY = this.a.b.y(fnwVar);
                    ResultReceiver resultReceiver2 = resultReceiver;
                    if (resultReceiver2 != null) {
                        uhpVarY.c(new foa(uhpVarY, resultReceiver2, 8), ugk.a);
                    }
                }
            });
            return;
        }
        foo fooVar = this.b;
        Bundle bundle2 = new Bundle();
        bundle2.putInt(frc.a, 0);
        frb frbVar = fooVar.i.c;
        String str2 = frc.b;
        Bundle bundle3 = new Bundle();
        frd frdVar = (frd) frbVar;
        bundle3.putInt(frd.a, frdVar.k);
        bundle3.putInt(frd.b, 0);
        bundle3.putInt(frd.c, 1008000001);
        bundle3.putString(frd.d, frdVar.l);
        bundle3.putString(frd.e, frdVar.m);
        bundle3.putBinder(frd.g, frdVar.n);
        bundle3.putParcelable(frd.f, null);
        bundle3.putBundle(frd.h, frdVar.o);
        bundle3.putInt(frd.i, 4);
        MediaSession.Token token = frdVar.p;
        if (token != null) {
            bundle3.putParcelable(frd.j, token);
        }
        bundle2.putBundle(str2, bundle3);
        resultReceiver.send(0, bundle2);
    }

    @Override // defpackage.frw
    public final void j(String str, final Bundle bundle) {
        if (str.equals("androidx.media3.session.SESSION_COMMAND_MEDIA3_PLAY_REQUEST")) {
            return;
        }
        final fqw fqwVar = new fqw(str, Bundle.EMPTY);
        N(fqwVar, new fpg() { // from class: for
            @Override // defpackage.fpg
            public final void a(fnw fnwVar) {
                this.a.b.y(fnwVar);
            }
        });
    }

    @Override // defpackage.frw
    public final void k() {
        d(12, new fop(this, 1), this.d.c(), true);
    }

    @Override // defpackage.frw
    public final void l() {
        d(1, new fop(this, 0), this.d.c(), true);
    }

    @Override // defpackage.frw
    public final void m() {
        d(1, new fop(this, 10), this.d.c(), false);
    }

    @Override // defpackage.frw
    public final void n(String str, Bundle bundle) {
        P(M(str, null, null, bundle), true);
    }

    @Override // defpackage.frw
    public final void o(String str, Bundle bundle) {
        P(M(null, null, str, bundle), true);
    }

    @Override // defpackage.frw
    public final void p(Uri uri, Bundle bundle) {
        P(M(null, uri, null, bundle), true);
    }

    @Override // defpackage.frw
    public final void q() {
        d(2, new fop(this, 6), this.d.c(), true);
    }

    @Override // defpackage.frw
    public final void r(String str, Bundle bundle) {
        P(M(str, null, null, bundle), false);
    }

    @Override // defpackage.frw
    public final void s(String str, Bundle bundle) {
        P(M(null, null, str, bundle), false);
    }

    @Override // defpackage.frw
    public final void t(Uri uri, Bundle bundle) {
        P(M(null, uri, null, bundle), false);
    }

    @Override // defpackage.frw
    public final void u(frs frsVar) {
        if (frsVar == null) {
            return;
        }
        d(20, new fot(this, frsVar, 0), this.d.c(), true);
    }

    @Override // defpackage.frw
    public final void v() {
        d(11, new fop(this, 5), this.d.c(), true);
    }

    @Override // defpackage.frw
    public final void w(long j) {
        d(5, new fow(this, j, 0), this.d.c(), true);
    }

    @Override // defpackage.frw
    public final void x(final float f) {
        if (f <= 0.0f) {
            return;
        }
        d(13, new fpg() { // from class: foq
            @Override // defpackage.fpg
            public final void a(fnw fnwVar) {
                this.a.b.q.aB(f);
            }
        }, this.d.c(), true);
    }

    @Override // defpackage.frw
    public final void y(fsm fsmVar) {
        J(fsmVar);
    }

    @Override // defpackage.frw
    public final void z(int i) {
        d(15, new fox(this, i, 1), this.d.c(), true);
    }
}

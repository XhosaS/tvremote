package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.exoplayer.drm.ExoMediaDrm;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lha implements epd, epi, ejz {
    public static final tui a = tui.l("com/google/android/apps/play/movies/common/service/drm/exov2/WidevineDrmSessionManagerV2");
    public final lfn b;
    public final idf c;
    public final lnu d;
    public final lgw e;
    public final ContentResolver f;
    public final Executor g;
    public final boolean h;
    public lgy i;
    public lgv j;
    public final lyz k;
    public final lrq m;
    public lhe n;
    private final Executor o;
    private final Handler p;
    private final mem q;
    private final boolean r;
    private Looper s;
    private final lmi t;

    public lha(lfn lfnVar, ExecutorService executorService, lyz lyzVar, lrq lrqVar, idf idfVar, mem memVar, lgw lgwVar, Executor executor, Context context, Handler handler, lmi lmiVar, lnu lnuVar, boolean z, boolean z2) {
        this.b = lfnVar;
        this.o = executorService;
        this.k = lyzVar;
        this.m = lrqVar;
        this.c = idfVar;
        this.p = handler;
        this.t = lmiVar;
        this.d = lnuVar;
        this.q = memVar;
        this.e = lgwVar;
        this.g = executor;
        this.h = z;
        this.r = z2;
        this.f = context.getContentResolver();
    }

    @Override // defpackage.epd
    public final int a(dze dzeVar) {
        if (dzeVar.ac != null) {
            return this.n.a.getCryptoType();
        }
        return 0;
    }

    public final int b() {
        lhe lheVar = this.n;
        if (lheVar != null) {
            return lheVar.c;
        }
        return -2;
    }

    @Override // defpackage.epi
    public final void ef(ExoMediaDrm exoMediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
        lgy lgyVar = this.i;
        if (lgyVar != null) {
            lgyVar.ef(exoMediaDrm, bArr, i, i2, bArr2);
        } else {
            krd.c("Drm event when session has been released ");
        }
    }

    @Override // defpackage.epd
    public final void eo(Looper looper, elk elkVar) {
        this.s = looper;
    }

    @Override // defpackage.epd
    public final eox ep(eph ephVar, dze dzeVar) {
        dyz dyzVar;
        dza dzaVar = dzeVar.ac;
        byte[] bArr = null;
        if (dzaVar == null) {
            return null;
        }
        int i = 0;
        int i2 = 1;
        a.ab(this.s != null);
        a.ab(this.j != null);
        a.ab(this.n != null);
        while (true) {
            if (i >= dzaVar.c) {
                dyzVar = null;
                break;
            }
            dyz dyzVarA = dzaVar.a(i);
            if (dyzVarA.c(dys.d)) {
                dyzVar = dyzVarA;
                break;
            }
            i++;
        }
        if (this.i == null) {
            lhe lheVar = this.n;
            boolean z = this.r;
            lgv lgvVar = this.j;
            this.i = new lgy(lheVar, dyzVar, z, lgvVar.e, lgvVar.f, this.s, this.p, this.t, this.q, new pku(this, bArr));
        }
        this.i.o(ephVar);
        if (this.j.f != null && dyzVar != null) {
            this.o.execute(new lik(this, dyzVar, i2, bArr));
        }
        return this.i;
    }

    @Override // defpackage.epd
    public final /* synthetic */ epc i(eph ephVar, dze dzeVar) {
        return epc.e;
    }

    @Override // defpackage.ejz
    public final void s(int i, Object obj) {
        if (i == 0) {
            ((mff) obj).run();
            return;
        }
        if (i == 1) {
            a.H(obj instanceof lgz);
            lgz lgzVar = (lgz) obj;
            a.H(lgzVar.a == this.i);
            lgy lgyVar = this.i;
            eph ephVar = lgzVar.b;
            lgyVar.p(null);
        }
    }

    @Override // defpackage.epd
    public final /* synthetic */ void em() {
    }

    @Override // defpackage.epd
    public final /* synthetic */ void en() {
    }
}

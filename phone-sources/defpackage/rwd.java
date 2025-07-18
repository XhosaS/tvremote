package defpackage;

import android.content.Context;
import com.google.android.libraries.performance.primes.transmitter.clearcut.ClearcutMetricSnapshotTransmitter;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rwd implements rvy {
    public final Context a;
    public final ClearcutMetricSnapshotTransmitter b;
    private final ttm c;
    private final boolean d;
    private final rwb e;

    public rwd(Context context, tst tstVar, rwb rwbVar, ClearcutMetricSnapshotTransmitter clearcutMetricSnapshotTransmitter) {
        this.a = context;
        this.c = sij.l(new rtb(context, 2));
        this.d = ((Boolean) tstVar.e(false)).booleanValue();
        this.e = rwbVar;
        this.b = clearcutMetricSnapshotTransmitter;
    }

    @Override // defpackage.rvy
    public final rvx a() {
        return new rvx(9);
    }

    @Override // defpackage.rvy
    public final uhp b(zba zbaVar) {
        int i;
        byte[] bArr = null;
        if (this.d) {
            zan zanVar = zbaVar.i;
            if (zanVar == null) {
                zanVar = zan.a;
            }
            if ((zanVar.b & 1) != 0) {
                return ufn.i(this.e.a(), new nbb(this, zbaVar, 8, bArr), ugk.a);
            }
        }
        if ((zbaVar.b & 1024) != 0 && ((Boolean) this.c.get()).booleanValue()) {
            vtw vtwVar = (vtw) zbaVar.a(5, null);
            vtwVar.x(zbaVar);
            zat zatVar = zbaVar.l;
            if (zatVar == null) {
                zatVar = zat.a;
            }
            vun<zas> vunVar = zatVar.k;
            if (!vunVar.isEmpty()) {
                vtw vtwVarM = zax.a.m();
                zas zasVar = null;
                for (zas zasVar2 : vunVar) {
                    if (zasVar != null && (i = zasVar.e + 1) != zasVar2.d) {
                        vtwVarM.br(0);
                        vtwVarM.bq(i);
                    }
                    vtwVarM.br(zasVar2.c);
                    vtwVarM.bq(zasVar2.d);
                    zasVar = zasVar2;
                }
                if (zasVar != null && (zasVar.b & 4) != 0) {
                    int i2 = zasVar.e + 1;
                    vtwVarM.br(0);
                    vtwVarM.bq(i2);
                }
                vtw vtwVar2 = (vtw) zatVar.a(5, null);
                vtwVar2.x(zatVar);
                vty vtyVar = (vty) vtwVar2;
                if (!vtyVar.b.A()) {
                    vtyVar.u();
                }
                ((zat) vtyVar.b).k = vvt.a;
                if (!vtyVar.b.A()) {
                    vtyVar.u();
                }
                zat zatVar2 = (zat) vtyVar.b;
                zax zaxVar = (zax) vtwVarM.r();
                zaxVar.getClass();
                zatVar2.j = zaxVar;
                zatVar2.b |= 128;
                zatVar = (zat) vtyVar.r();
            }
            if (!vtwVar.b.A()) {
                vtwVar.u();
            }
            zba zbaVar2 = (zba) vtwVar.b;
            zatVar.getClass();
            zbaVar2.l = zatVar;
            zbaVar2.b |= 1024;
            zbaVar = (zba) vtwVar.r();
        }
        return ufn.j(this.e.a(), new pap(this, zbaVar, 11, bArr), ugk.a);
    }
}

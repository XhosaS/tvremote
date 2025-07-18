package defpackage;

import android.view.FrameMetrics;
import android.view.Window;
import android.view.Window$OnFrameMetricsAvailableListener;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hxd implements Window$OnFrameMetricsAvailableListener {
    final /* synthetic */ hxr a;
    private boolean b;

    public hxd(hxr hxrVar) {
        this.a = hxrVar;
    }

    public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
        int i2;
        window.getClass();
        frameMetrics.getClass();
        zdy zdyVar = hxr.f;
        if (this.b) {
            return;
        }
        this.b = true;
        hxr hxrVar = this.a;
        if (hxrVar.x.b()) {
            gmd gmdVar = hxrVar.F;
            yyk yykVarS = yyk.s(gmc.av, gmc.aw, gmc.aA, gmc.aB, gmc.ab, gmc.Z);
            yykVarS.getClass();
            gmdVar.n(yykVarS);
            if (((Boolean) hxrVar.H.a()).booleanValue()) {
                ((gfn) hxrVar.C.a()).a(rpm.dI()).b().c();
            } else {
                gfq.b(hxrVar.D, rpm.dI(), null, null, 14);
            }
        } else {
            gmd gmdVar2 = hxrVar.F;
            yyk yykVarS2 = yyk.s(gmc.av, gmc.aw, gmc.Y, gmc.aa, gmc.ab, gmc.Z);
            yykVarS2.getClass();
            gmdVar2.n(yykVarS2);
            if (((Boolean) hxrVar.H.a()).booleanValue()) {
                ((gfn) hxrVar.C.a()).a(rpm.dH()).b().c();
            } else {
                gfq.b(hxrVar.D, rpm.dH(), null, null, 14);
            }
        }
        gnv gnvVar = hxrVar.ap;
        FrameMetrics frameMetrics2 = new FrameMetrics(frameMetrics);
        gnvVar.i = Duration.ofNanos(frameMetrics2.getMetric(10)).plus(Duration.ofNanos(frameMetrics2.getMetric(8)));
        gnu gnuVar = hxrVar.av;
        if (((Boolean) gnuVar.b.a()).booleanValue()) {
            if (gnvVar.f.isZero()) {
                i2 = !gnvVar.g.isZero() ? 6 : 1;
            } else {
                geq geqVar = gnuVar.c;
                i2 = geqVar.b() ? 2 : geqVar.e.get() ? 3 : geqVar.f.get() ? 4 : 5;
            }
            abxk abxkVar = ahrs.a;
            ahrq ahrqVar = new ahrq();
            ahrw ahrwVar = ahrw.a;
            ahrv ahrvVar = new ahrv();
            int i3 = true == gnuVar.d.b() ? 3 : 4;
            if ((ahrvVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ahrvVar.y();
            }
            ahrw ahrwVar2 = (ahrw) ahrvVar.b;
            ahrwVar2.c = i3 - 2;
            ahrwVar2.b = 1 | ahrwVar2.b;
            if ((ahrvVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ahrvVar.y();
            }
            ahrw ahrwVar3 = (ahrw) ahrvVar.b;
            ahrwVar3.d = i2 - 1;
            ahrwVar3.b |= 2;
            ahrw ahrwVar4 = (ahrw) ahrvVar.v();
            if ((ahrqVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ahrqVar.y();
            }
            ahrs ahrsVar = (ahrs) ahrqVar.b;
            ahrwVar4.getClass();
            ahrsVar.g = ahrwVar4;
            ahrsVar.f = 14;
            ahrs ahrsVar2 = (ahrs) ahrqVar.v();
            if (!gnvVar.a(gnvVar.b).isZero()) {
                gfl gflVarB = ((gfn) gnuVar.e.a()).a(rpm.dx()).b();
                gflVarB.f(gnvVar.a(gnvVar.b));
                gflVarB.g(ahrsVar2);
                gflVarB.c();
            }
            if (!gnvVar.a(gnvVar.c).isZero()) {
                gfl gflVarB2 = ((gfn) gnuVar.e.a()).a(rpm.dp()).b();
                gflVarB2.f(gnvVar.a(gnvVar.c));
                gflVarB2.g(ahrsVar2);
                gflVarB2.c();
            }
            if (!gnvVar.a(gnvVar.e).isZero()) {
                gfl gflVarB3 = ((gfn) gnuVar.e.a()).a(rpm.dq()).b();
                gflVarB3.f(gnvVar.a(gnvVar.e));
                gflVarB3.g(ahrsVar2);
                gflVarB3.c();
            }
            if (!gnvVar.a(gnvVar.f).isZero()) {
                gfl gflVarB4 = ((gfn) gnuVar.e.a()).a(rpm.dv()).b();
                gflVarB4.f(gnvVar.a(gnvVar.f));
                gflVarB4.g(ahrsVar2);
                gflVarB4.c();
            }
            if (!gnvVar.a(gnvVar.g).isZero()) {
                gfl gflVarB5 = ((gfn) gnuVar.e.a()).a(rpm.du()).b();
                gflVarB5.f(gnvVar.a(gnvVar.g));
                gflVarB5.g(ahrsVar2);
                gflVarB5.c();
            }
            if (!gnvVar.a(gnvVar.h).isZero()) {
                gfl gflVarB6 = ((gfn) gnuVar.e.a()).a(rpm.dw()).b();
                gflVarB6.f(gnvVar.a(gnvVar.h));
                gflVarB6.g(ahrsVar2);
                gflVarB6.c();
            }
            if (!gnvVar.a(gnvVar.i).isZero()) {
                gfl gflVarB7 = ((gfn) gnuVar.e.a()).a(rpm.dt()).b();
                gflVarB7.f(gnvVar.a(gnvVar.i));
                gflVarB7.g(ahrsVar2);
                gflVarB7.c();
            }
        }
        hxrVar.b.removeOnFrameMetricsAvailableListener(this);
    }
}

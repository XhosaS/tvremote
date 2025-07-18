package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;
import java.io.IOException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class bsp implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public bsp(cce cceVar, ccd ccdVar, int i) {
        this.c = i;
        this.b = ccdVar;
        this.a = cceVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [android.content.ServiceConnection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [android.hardware.SensorPrivacyManager$OnSensorPrivacyChangedListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        int i2 = 0;
        int i3 = 3;
        int i4 = 2;
        int i5 = 1;
        if (i == 0) {
            final agb agbVar = new agb((Context) this.b, new amz());
            Handler handlerC = mo.C(Looper.getMainLooper());
            Object obj = this.a;
            final bsr bsrVar = (bsr) obj;
            ami amiVarE = agbVar.e(new anb() { // from class: bsm
                @Override // defpackage.anb
                public final void a() {
                    ((cbs) bsr.a.c().j("com/google/android/tv/remote/service/clearcut/EnabledOptInObserver", "configureOptInTask", 53, "EnabledOptInObserver.java")).p("Usage reporting setting has changed");
                    bsrVar.b(agbVar);
                }
            });
            adx adxVar = new adx((byte[]) null, (byte[]) null);
            handlerC.postDelayed(new bsk(adxVar, i2), bsr.b);
            final adx adxVar2 = new adx((adx) adxVar.a);
            chz chzVar = chz.a;
            amiVarE.i(chzVar, new amg() { // from class: bsl
                @Override // defpackage.amg
                public final void a(Object obj2) {
                    adxVar2.h((Void) obj2);
                }
            });
            amiVarE.h(chzVar, new apj(adxVar2, i4));
            Object obj2 = adxVar2.a;
            bsq bsqVar = new bsq(handlerC, i5);
            ami amiVar = (ami) obj2;
            amiVar.g(chzVar, bsqVar);
            amiVar.i(chzVar, new amg() { // from class: bsn
                @Override // defpackage.amg
                public final void a(Object obj3) {
                    ((cbs) ((cbs) bsr.a.c().g(btt.a)).j("com/google/android/tv/remote/service/clearcut/EnabledOptInObserver", "configureOptInTask", 63, "EnabledOptInObserver.java")).p("Usage reporting API is available");
                    bsrVar.b(agbVar);
                }
            });
            apj apjVar = new apj(obj, i3);
            Executor executor = amm.a;
            ((amn) obj2).h(executor, apjVar);
            amiVar.e(executor, new amc() { // from class: bso
                @Override // defpackage.amc
                public final void b() {
                    ((cbs) bsr.a.g().j("com/google/android/tv/remote/service/clearcut/EnabledOptInObserver", "configureOptInTask", 73, "EnabledOptInObserver.java")).p("Usage reporting API is not ready");
                    bsrVar.a(false);
                }
            });
            return;
        }
        if (i == 1) {
            ((buf) this.a).unbindService(this.b);
            return;
        }
        if (i == 2) {
            gh$$ExternalSyntheticApiModelOutline0.m17m(this.a).removeSensorPrivacyListener(this.b);
            return;
        }
        if (i == 3) {
            ((ContentResolver) this.b).unregisterContentObserver((ContentObserver) this.a);
            return;
        }
        if (i == 4) {
            Toast.makeText(((buc) this.b).b, (CharSequence) this.a, 0).show();
            return;
        }
        if (i != 5) {
            ((cce) this.a).a.remove(this.b);
            return;
        }
        Object obj3 = this.b;
        Object obj4 = this.a;
        if (obj3 != null) {
            ((blq) obj3).e();
        }
        try {
            ((buc) obj4).e.close();
        } catch (IOException unused) {
        }
    }

    public /* synthetic */ bsp(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    public /* synthetic */ bsp(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}

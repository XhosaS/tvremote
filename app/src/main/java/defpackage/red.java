package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.libraries.performance.primes.transmitter.LifeboatReceiver;
import com.google.android.libraries.performance.primes.transmitter.clearcut.ClearcutMetricSnapshotTransmitter;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class red implements rdn {
    public final Context a;
    public final ClearcutMetricSnapshotTransmitter b;
    private final yrp c;
    private final boolean d;
    private final rdv e;

    public red(final Context context, yqt yqtVar, rdv rdvVar, ClearcutMetricSnapshotTransmitter clearcutMetricSnapshotTransmitter) {
        this.a = context;
        this.c = yru.a(new yrp() { // from class: reb
            @Override // defpackage.yrp
            public final Object eV() {
                return Boolean.valueOf(aexn.a.eV().b(context));
            }
        });
        this.d = ((Boolean) ((yqz) yqtVar).a).booleanValue();
        this.e = rdvVar;
        this.b = clearcutMetricSnapshotTransmitter;
    }

    @Override // defpackage.rdn
    public final rdm a() {
        return new rdm(9);
    }

    @Override // defpackage.rdn
    public final zyd b(final ahvw ahvwVar) {
        int i;
        if (this.d) {
            ahuv ahuvVar = ahvwVar.i;
            if (ahuvVar == null) {
                ahuvVar = ahuv.a;
            }
            if ((ahuvVar.b & 1) != 0) {
                return zuz.g(this.e.a(), new yqi() { // from class: rea
                    @Override // defpackage.yqi
                    public final Object apply(Object obj) {
                        int iA;
                        rdj rdjVar = new rdj();
                        rdjVar.B((rdk) obj);
                        if ((rdjVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            rdjVar.y();
                        }
                        ahvw ahvwVar2 = ahvwVar;
                        red redVar = this.a;
                        rdk rdkVar = (rdk) rdjVar.b;
                        rdk rdkVar2 = rdk.a;
                        ahvwVar2.getClass();
                        rdkVar.c = ahvwVar2;
                        rdkVar.b |= 1;
                        rdk rdkVar3 = (rdk) rdjVar.v();
                        String[] strArr = {redVar.b.getClass().getName()};
                        Intent intent = new Intent();
                        Context context = redVar.a;
                        intent.setComponent(new ComponentName(context, (Class<?>) LifeboatReceiver.class));
                        intent.setPackage(context.getPackageName());
                        intent.putExtra("Transmitters", strArr);
                        try {
                            int i2 = rdkVar3.memoizedSerializedSize;
                            if ((i2 & Integer.MIN_VALUE) != 0) {
                                iA = abza.a.a(rdkVar3.getClass()).a(rdkVar3);
                                if (iA < 0) {
                                    throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                                }
                            } else {
                                iA = i2 & Integer.MAX_VALUE;
                                if (iA == Integer.MAX_VALUE) {
                                    iA = abza.a.a(rdkVar3.getClass()).a(rdkVar3);
                                    if (iA < 0) {
                                        throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                                    }
                                    rdkVar3.memoizedSerializedSize = (Integer.MIN_VALUE & rdkVar3.memoizedSerializedSize) | iA;
                                }
                            }
                            byte[] bArr = new byte[iA];
                            boolean z = abvz.e;
                            abvw abvwVar = new abvw(bArr, 0, iA);
                            abza.a.a(rdkVar3.getClass()).m(rdkVar3, abwa.a(abvwVar));
                            abvwVar.K();
                            intent.putExtra("MetricSnapshot", bArr);
                            context.sendBroadcast(intent);
                            return null;
                        } catch (IOException e) {
                            throw new RuntimeException(a.u(rdkVar3, " to a byte array threw an IOException (should never happen)."), e);
                        }
                    }
                }, zwk.a);
            }
        }
        if ((ahvwVar.b & 1024) != 0 && ((Boolean) this.c.eV()).booleanValue()) {
            ahvv ahvvVar = new ahvv();
            ahvvVar.B(ahvwVar);
            ahvh ahvhVar = ahvwVar.l;
            if (ahvhVar == null) {
                ahvhVar = ahvh.a;
            }
            abxs<ahvf> abxsVar = ahvhVar.k;
            if (!abxsVar.isEmpty()) {
                ahvp ahvpVar = ahvp.a;
                ahvo ahvoVar = new ahvo();
                ahvf ahvfVar = null;
                for (ahvf ahvfVar2 : abxsVar) {
                    if (ahvfVar != null && (i = ahvfVar.e + 1) != ahvfVar2.d) {
                        ahvoVar.b(0);
                        ahvoVar.a(i);
                    }
                    ahvoVar.b(ahvfVar2.c);
                    ahvoVar.a(ahvfVar2.d);
                    ahvfVar = ahvfVar2;
                }
                if (ahvfVar != null && (ahvfVar.b & 4) != 0) {
                    int i2 = ahvfVar.e + 1;
                    ahvoVar.b(0);
                    ahvoVar.a(i2);
                }
                ahvg ahvgVar = new ahvg();
                ahvgVar.B(ahvhVar);
                if ((ahvgVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    ahvgVar.y();
                }
                ((ahvh) ahvgVar.b).k = abzb.b;
                if ((ahvgVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    ahvgVar.y();
                }
                ahvh ahvhVar2 = (ahvh) ahvgVar.b;
                ahvp ahvpVar2 = (ahvp) ahvoVar.v();
                ahvpVar2.getClass();
                ahvhVar2.j = ahvpVar2;
                ahvhVar2.b |= 128;
                ahvhVar = (ahvh) ahvgVar.v();
            }
            if ((ahvvVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ahvvVar.y();
            }
            ahvw ahvwVar2 = (ahvw) ahvvVar.b;
            ahvhVar.getClass();
            ahvwVar2.l = ahvhVar;
            ahvwVar2.b |= 1024;
            ahvwVar = (ahvw) ahvvVar.v();
        }
        zyd zydVarA = this.e.a();
        zvi zviVar = new zvi() { // from class: rdz
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                rdj rdjVar = new rdj();
                rdjVar.B((rdk) obj);
                if ((rdjVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    rdjVar.y();
                }
                red redVar = this.a;
                ahvw ahvwVar3 = ahvwVar;
                rdk rdkVar = (rdk) rdjVar.b;
                rdk rdkVar2 = rdk.a;
                ahvwVar3.getClass();
                rdkVar.c = ahvwVar3;
                rdkVar.b |= 1;
                return redVar.b.a(redVar.a, (rdk) rdjVar.v());
            }
        };
        zwk zwkVar = zwk.a;
        zyd zydVarH = zuz.h(zydVarA, zviVar, zwkVar);
        if (Log.isLoggable("ClearcutMetricXmitter", 4)) {
            zxn.p(zydVarH, new rec(), zwkVar);
        }
        return zydVarH;
    }
}

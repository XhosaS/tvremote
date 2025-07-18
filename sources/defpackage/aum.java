package defpackage;

import android.content.Context;
import com.google.android.libraries.performance.primes.transmitter.clearcut.ClearcutMetricSnapshotTransmitter;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aum implements cpi {
    private final cpm a;
    private final cpm b;
    private final cpm c;
    private final /* synthetic */ int d;

    public aum(cpm cpmVar, cpm cpmVar2, cpm cpmVar3, int i) {
        this.d = i;
        this.a = cpmVar;
        this.b = cpmVar2;
        this.c = cpmVar3;
    }

    @Override // defpackage.crv, defpackage.cru
    public final /* synthetic */ Object a() {
        switch (this.d) {
            case 0:
                Object obj = ((cpj) this.c).a;
                final cmt cmtVarA = ((ast) this.b).a();
                final byg bygVar = (byg) obj;
                final cpm cpmVar = this.a;
                return new beb() { // from class: auj
                    @Override // defpackage.beb
                    public final void a() {
                        if (((Boolean) bygVar.d(false)).booleanValue() && bdq.b()) {
                            Iterator it = ((cpo) cpmVar).a().iterator();
                            while (it.hasNext()) {
                                ((auh) it.next()).t();
                            }
                            cmtVarA.d();
                        }
                    }
                };
            case 1:
                return new aqc((cjd) this.b.a(), (asv) this.a.a(), this.c);
            case 2:
                return new awb(cph.b(this.b), (byg) ((cpj) this.a).a, (Executor) this.c.a());
            case 3:
                Object cbfVar = (((byg) ((cpj) this.a).a).f() || ((byg) ((cpj) this.b).a).f()) ? new cbf((auh) this.c.a()) : cbd.a;
                cbfVar.getClass();
                return cbfVar;
            case 4:
                return new bdl((Context) ((cpj) this.c).a, ((bnl) this.b).b(), ((azy) this.a).a(), new ClearcutMetricSnapshotTransmitter());
            case 5:
                Object obj2 = ((cpj) this.b).a;
                final awy awyVarA = ((bds) this.c).a();
                final Map map = (Map) obj2;
                final Map map2 = ((cpf) this.a).a;
                return new bdu() { // from class: bec
                    @Override // defpackage.bdu
                    public final void a() {
                        bxb bxbVarG = awo.g("Startup Listeners");
                        try {
                            boolean zD = awyVarA.d();
                            Map map3 = map2;
                            if (zD) {
                                double dRandom = Math.random();
                                Map map4 = map;
                                if (dRandom < 0.5d) {
                                    bdq.d(map3);
                                    bdq.d(map4);
                                } else {
                                    bdq.d(map4);
                                    bdq.d(map3);
                                }
                            } else {
                                bdq.d(map3);
                            }
                            bxbVarG.close();
                        } catch (Throwable th) {
                            try {
                                bxbVarG.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                };
            case 6:
                return new bqh((buf) ((cpj) this.b).a, ((buj) this.a).a(), (bsi) this.c.a());
            default:
                return ((Context) ((cpj) this.b).a).checkSelfPermission("android.permission.UPDATE_APP_OPS_STATS") == 0 ? ((bqt) this.c).a() : ((brc) this.a).a();
        }
    }

    public aum(cpm cpmVar, cpm cpmVar2, cpm cpmVar3, int i, byte[] bArr) {
        this.d = i;
        this.b = cpmVar;
        this.a = cpmVar2;
        this.c = cpmVar3;
    }

    public aum(cpm cpmVar, cpm cpmVar2, cpm cpmVar3, int i, int[] iArr) {
        this.d = i;
        this.c = cpmVar;
        this.b = cpmVar2;
        this.a = cpmVar3;
    }

    public aum(cpm cpmVar, cpm cpmVar2, cpm cpmVar3, int i, byte[][] bArr) {
        this.d = i;
        this.b = cpmVar;
        this.c = cpmVar2;
        this.a = cpmVar3;
    }
}

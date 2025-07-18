package defpackage;

import android.media.AudioDeviceAttributes;
import android.net.Uri;
import android.os.Handler;
import android.os.StrictMode;
import com.google.android.gms.common.api.internal.BasePendingResult;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class adz implements byb {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ adz(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.byb
    public final Object a(Object obj) {
        int i = 0;
        boolean z = true;
        switch (this.b) {
            case 0:
                Object obj2 = this.a;
                agb agbVar = (agb) obj2;
                agt agtVar = new agt((aed) obj2, (adh) obj, agbVar.h, adu.a);
                if (!agtVar.h && !((Boolean) BasePendingResult.b.get()).booleanValue()) {
                    z = false;
                }
                agtVar.h = z;
                ahf ahfVar = agbVar.i;
                bda bdaVar = new bda((agq) new agm(agtVar), ahfVar.i.get(), agbVar);
                Handler handler = ahfVar.k;
                handler.sendMessage(handler.obtainMessage(4, bdaVar));
                adx adxVar = new adx((byte[]) null);
                agtVar.e(new aiy(agtVar, adxVar, 0));
                return adxVar.a;
            case 1:
                ado adoVar = (ado) obj;
                if (adoVar != null) {
                    clq clqVar = ((adh) this.a).n;
                    cos cosVar = ((cor) clqVar.b).l;
                    if (cosVar == null) {
                        cosVar = cos.a;
                    }
                    clo cloVar = (clo) cosVar.a(5, null);
                    cloVar.n(cosVar);
                    clq clqVar2 = (clq) cloVar;
                    cos cosVar2 = ((cor) clqVar.b).l;
                    if (cosVar2 == null) {
                        cosVar2 = cos.a;
                    }
                    ckb ckbVar = cosVar2.f;
                    if (ckbVar == null) {
                        ckbVar = ckb.a;
                    }
                    clo cloVar2 = (clo) ckbVar.a(5, null);
                    cloVar2.n(ckbVar);
                    String strB = adoVar.b();
                    if (!cloVar2.b.A()) {
                        cloVar2.l();
                    }
                    ckb ckbVar2 = (ckb) cloVar2.b;
                    strB.getClass();
                    ckbVar2.c = strB;
                    cka ckaVarA = adoVar.a();
                    if (!cloVar2.b.A()) {
                        cloVar2.l();
                    }
                    ckb ckbVar3 = (ckb) cloVar2.b;
                    ckaVarA.getClass();
                    ckbVar3.d = ckaVarA;
                    ckbVar3.b |= 1;
                    if (!clqVar2.b.A()) {
                        clqVar2.l();
                    }
                    cos cosVar3 = (cos) clqVar2.b;
                    ckb ckbVar4 = (ckb) cloVar2.i();
                    ckbVar4.getClass();
                    cosVar3.f = ckbVar4;
                    cosVar3.b = 4 | cosVar3.b;
                    cos cosVar4 = (cos) clqVar2.i();
                    if (!clqVar.b.A()) {
                        clqVar.l();
                    }
                    cor corVar = (cor) clqVar.b;
                    cosVar4.getClass();
                    corVar.l = cosVar4;
                    corVar.b |= 268435456;
                }
                return null;
            case 2:
                aot aotVar = (aot) obj;
                clo cloVar3 = (clo) aotVar.a(5, null);
                cloVar3.n(aotVar);
                while (true) {
                    Object obj3 = this.a;
                    if (i >= ((aot) cloVar3.b).b.size()) {
                        if (!cloVar3.b.A()) {
                            cloVar3.l();
                        }
                        aot aotVar2 = (aot) cloVar3.b;
                        obj3.getClass();
                        aotVar2.b();
                        aotVar2.b.add(obj3);
                        return (aot) cloVar3.i();
                    }
                    if (((aor) ((aot) cloVar3.b).b.get(i)).d.equals(((aor) obj3).d)) {
                        if (!cloVar3.b.A()) {
                            cloVar3.l();
                        }
                        aot aotVar3 = (aot) cloVar3.b;
                        obj3.getClass();
                        aotVar3.b();
                        aotVar3.b.set(i, obj3);
                        return (aot) cloVar3.i();
                    }
                    i++;
                }
            case 3:
                try {
                    return new ProcessBuilder("/system/bin/trigger_perfetto", (String) obj).start();
                } catch (IOException unused) {
                    ((aun) this.a).b = true;
                    return null;
                }
            case 4:
                anc ancVar = ((ang) ((apl) obj).a).a;
                qp.p(ancVar);
                int i2 = ancVar.a;
                boolean z2 = i2 == 1 || i2 == 3;
                Object obj4 = this.a;
                Boolean boolValueOf = Boolean.valueOf(z2);
                ((azt) obj4).a.set(boolValueOf);
                return boolValueOf;
            case 5:
                return (bcj) ((auf) this.a).b.get((String) obj);
            case 6:
                int i3 = bcw.a;
                clo cloVarO = bbz.a.o();
                for (Map.Entry entry : DesugarCollections.unmodifiableMap(((bbz) obj).b).entrySet()) {
                    Object obj5 = this.a;
                    bbx bbxVar = (bbx) entry.getValue();
                    clo cloVarO2 = bbx.a.o();
                    if (!bbxVar.d.equals(obj5)) {
                        String str = bbxVar.d;
                        if (!cloVarO2.b.A()) {
                            cloVarO2.l();
                        }
                        bbx bbxVar2 = (bbx) cloVarO2.b;
                        str.getClass();
                        bbxVar2.b |= 1;
                        bbxVar2.d = str;
                    }
                    for (String str2 : bbxVar.c) {
                        if (!str2.equals(obj5)) {
                            cloVarO2.p(str2);
                        }
                    }
                    cloVarO.q((String) entry.getKey(), (bbx) cloVarO2.i());
                }
                return (bbz) cloVarO.i();
            case 7:
                int i4 = bcw.a;
                bbx bbxVar3 = bbx.a;
                cmu cmuVar = ((bbz) obj).b;
                Object obj6 = this.a;
                if (cmuVar.containsKey(obj6)) {
                    bbxVar3 = (bbx) cmuVar.get(obj6);
                }
                return bbxVar3.c;
            case 8:
                int i5 = bcw.a;
                Object obj7 = this.a;
                bbx bbxVar4 = bbx.a;
                obj7.getClass();
                cmu cmuVar2 = ((bbz) obj).b;
                if (cmuVar2.containsKey(obj7)) {
                    bbxVar4 = (bbx) cmuVar2.get(obj7);
                }
                return bbxVar4.d;
            case 9:
                bbv bbvVar = (bbv) obj;
                dcq dcqVar = new dcq((byte[]) null);
                StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskWrites().build());
                Object obj8 = this.a;
                try {
                    try {
                        synchronized (bdp.a) {
                            bzt bztVar = (bzt) ((bdp) obj8).f.aL();
                            Uri uri = ((bdp) obj8).i;
                            bbr bbrVar = bbvVar.c;
                            if (bbrVar == null) {
                                bbrVar = bbr.b;
                            }
                            bfg bfgVar = new bfg(bbrVar);
                            bfgVar.a = new dcq[]{dcqVar};
                            bztVar.g(uri, bfgVar);
                            bbr bbrVar2 = bbvVar.c;
                            if (bbrVar2 == null) {
                                bbrVar2 = bbr.b;
                            }
                            ((bdp) obj8).j = bbrVar2;
                        }
                        synchronized (bdp.b) {
                            bzt bztVar2 = (bzt) ((bdp) obj8).f.aL();
                            Uri uri2 = ((bdp) obj8).k;
                            bbt bbtVar = bbvVar.d;
                            if (bbtVar == null) {
                                bbtVar = bbt.b;
                            }
                            bfg bfgVar2 = new bfg(bbtVar);
                            bfgVar2.a = new dcq[]{dcqVar};
                            bztVar2.g(uri2, bfgVar2);
                            bbt bbtVar2 = bbvVar.d;
                            if (bbtVar2 == null) {
                                bbtVar2 = bbt.b;
                            }
                            ((bdp) obj8).l = bbtVar2;
                        }
                        return null;
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                } finally {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
            default:
                AudioDeviceAttributes audioDeviceAttributes = (AudioDeviceAttributes) obj;
                for (bgl bglVar : this.a) {
                    if (bglVar.b == audioDeviceAttributes.getType() && bglVar.c.equals(audioDeviceAttributes.getAddress())) {
                        return bglVar;
                    }
                }
                return new bgl(-1, audioDeviceAttributes.getType(), audioDeviceAttributes.getAddress(), "");
        }
    }
}

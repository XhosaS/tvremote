package defpackage;

import j$.util.Map;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tuq implements tur, tus {
    private static final zdy d = zdy.h("com/google/android/libraries/speech/transcription/recognition/RecognitionServiceAppFlowLogger");
    private static final yrl e = yrl.b(new ypz(' ')).a().d(yqc.b);
    private final ros f;
    private final String l;
    private final tru m;
    private final HashMap g = new HashMap();
    private final HashSet h = new HashSet();
    private final HashSet i = new HashSet();
    private final HashSet j = new HashSet();
    private final HashMap k = new HashMap();
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();

    public tuq(ros rosVar, String str, tru truVar) {
        this.f = rosVar;
        this.l = true != str.contains("tts") ? "" : str;
        this.m = truVar;
    }

    private final void q(String str, String str2) {
        int size;
        HashMap map = this.a;
        long jLongValue = ((Long) Map.EL.getOrDefault(map, str, 0L)).longValue();
        HashMap map2 = this.k;
        String str3 = (String) Map.EL.getOrDefault(map2, str, "");
        yrl yrlVar = e;
        List listG = yrlVar.g(str2);
        List listG2 = yrlVar.g(str3);
        int size2 = 0;
        int i = 0;
        while (true) {
            if (i < listG.size()) {
                if (i >= listG2.size()) {
                    break;
                }
                if (!((String) listG.get(i)).equals(listG2.get(i)) && i != listG2.size() - 1) {
                    size = listG2.size();
                    break;
                } else {
                    if (i == listG2.size() - 1 && !((String) listG.get(i)).startsWith((String) listG2.get(i))) {
                        size = listG2.size();
                        break;
                    }
                    i++;
                }
            } else if (listG.size() < listG2.size()) {
                size2 = listG2.size() - listG.size();
            }
        }
        size2 = size - i;
        zer zerVar = zfi.a;
        map.put(str, Long.valueOf(jLongValue + size2));
        map2.put(str, str2);
    }

    private final void r(String str) {
        HashSet hashSet = this.i;
        if (hashSet.contains(str)) {
            ((zdv) ((zdv) d.b().o(zfi.a, "RecSrvAppFlowLogger")).q("com/google/android/libraries/speech/transcription/recognition/RecognitionServiceAppFlowLogger", "logFirstTranscription", 285, "RecognitionServiceAppFlowLogger.java")).u("ignore not first transcription");
            return;
        }
        hashSet.add(str);
        rqo rqoVar = rpx.a;
        rqt rqtVar = new rqt(new rpz("RECOGNITION_SERVICE_FIRST_RECOGNITION_TEXT", false, ypv.a, 200, rpy.NONE, rpx.b, rpx.a, rpx.c, rpx.d));
        rqtVar.i("recognition_session", str);
        a(str, rqtVar);
    }

    private final void s(final String str, Optional optional) {
        optional.ifPresentOrElse(new Consumer() { // from class: tuo
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                trr trrVar = (trr) obj;
                tuq tuqVar = this.a;
                String str2 = str;
                rqw rqwVarB = tuqVar.m(str2) ? rpx.b() : rpx.c();
                rqt rqtVar = (rqt) rqwVarB.a;
                rqtVar.i("recognition_session", str2);
                abxc abxcVar = zol.b;
                zok zokVar = new zok();
                long jLongValue = ((Long) Map.EL.getOrDefault(tuqVar.a, str2, 0L)).longValue();
                if ((zokVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    zokVar.y();
                }
                zol zolVar = (zol) zokVar.b;
                zolVar.c |= 64;
                zolVar.j = jLongValue;
                long jLongValue2 = ((Long) Map.EL.getOrDefault(tuqVar.b, str2, 0L)).longValue();
                if ((zokVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    zokVar.y();
                }
                zol zolVar2 = (zol) zokVar.b;
                zolVar2.c |= 128;
                zolVar2.k = jLongValue2;
                long jIntValue = ((Integer) Map.EL.getOrDefault(tuqVar.c, str2, 0)).intValue();
                if ((zokVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    zokVar.y();
                }
                zol zolVar3 = (zol) zokVar.b;
                zolVar3.c |= 512;
                zolVar3.m = jIntValue;
                rqtVar.f(abxcVar, (zol) zokVar.v());
                trb trbVar = trrVar.a;
                tuqVar.a(str2, rqwVarB.a(((trd) trbVar).a, trbVar.c()));
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }, new Runnable() { // from class: tup
            @Override // java.lang.Runnable
            public final void run() {
                tuq tuqVar = this.a;
                String str2 = str;
                rqw rqwVarB = tuqVar.m(str2) ? rpx.b() : rpx.c();
                rqt rqtVar = (rqt) rqwVarB.a;
                rqtVar.i("recognition_session", str2);
                abxc abxcVar = zol.b;
                zok zokVar = new zok();
                long jLongValue = ((Long) Map.EL.getOrDefault(tuqVar.a, str2, 0L)).longValue();
                if ((zokVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    zokVar.y();
                }
                zol zolVar = (zol) zokVar.b;
                zolVar.c |= 64;
                zolVar.j = jLongValue;
                long jLongValue2 = ((Long) Map.EL.getOrDefault(tuqVar.b, str2, 0L)).longValue();
                if ((zokVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    zokVar.y();
                }
                zol zolVar2 = (zol) zokVar.b;
                zolVar2.c |= 128;
                zolVar2.k = jLongValue2;
                long jIntValue = ((Integer) Map.EL.getOrDefault(tuqVar.c, str2, 0)).intValue();
                if ((zokVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    zokVar.y();
                }
                zol zolVar3 = (zol) zokVar.b;
                zolVar3.c |= 512;
                zolVar3.m = jIntValue;
                rqtVar.f(abxcVar, (zol) zokVar.v());
                tuqVar.a(str2, rqwVarB.b(abqb.OK));
            }
        });
        this.g.remove(str);
        this.h.remove(str);
        this.i.remove(str);
        this.a.remove(str);
        this.b.remove(str);
        this.j.remove(str);
        this.c.remove(str);
    }

    public final void a(String str, rqu rquVar) {
        if (this.j.contains(str)) {
            zer zerVar = zfi.a;
        } else {
            this.f.a(rquVar);
        }
    }

    @Override // defpackage.tus
    public final void c(String str) {
        s(str, Optional.empty());
    }

    @Override // defpackage.tur
    public final void d(String str) {
        if (m(str)) {
            return;
        }
        rqo rqoVar = rpx.a;
        rqt rqtVar = new rqt(new rpz("RECOGNITION_SERVICE_END_OF_SPEECH", false, ypv.a, 111, rpy.NONE, rpx.b, rpx.a, rpx.c, rpx.d));
        rqtVar.i("recognition_session", str);
        a(str, rqtVar);
    }

    @Override // defpackage.tus
    public final void e(String str, trr trrVar) {
        rqo rqoVar = rpx.a;
        rqt rqtVar = new rqt(new rpz("RECOGNITION_SERVICE_FALLBACK", false, ypv.a, 120, rpy.NONE, rpx.b, rpx.a, rpx.c, rpx.d));
        rqtVar.i("recognition_session", str);
        trb trbVar = trrVar.a;
        rqtVar.a(((trd) trbVar).a, trbVar.c());
        a(str, rqtVar);
    }

    @Override // defpackage.tur
    public final void f(String str, tso tsoVar) {
        if (m(str)) {
            r(str);
            q(str, !tsoVar.c.isEmpty() ? (String) tsoVar.c.get(0) : "");
            HashMap map = this.b;
            map.put(str, Long.valueOf(((Long) Map.EL.getOrDefault(map, str, 0L)).longValue() + e.g(r7).size()));
            this.k.remove(str);
        }
    }

    @Override // defpackage.tus
    public final void g(String str) {
        rqo rqoVar = rpx.a;
        rqt rqtVar = new rqt(new rpz("RECOGNITION_SERVICE_MIC_CLOSE_REQUESTED", false, ypv.a, 113, rpy.NONE, rpx.b, rpx.a, rpx.c, rpx.d));
        rqtVar.i("recognition_session", str);
        a(str, rqtVar);
    }

    @Override // defpackage.tus
    public final void h(String str) {
        rqo rqoVar = rpx.a;
        rqt rqtVar = new rqt(new rpz("RECOGNITION_SERVICE_MIC_DEACTIVATED", false, ypv.a, 118, rpy.NONE, rpx.b, rpx.a, rpx.c, rpx.d));
        rqtVar.i("recognition_session", str);
        a(str, rqtVar);
    }

    @Override // defpackage.tus
    public final void i(String str) {
        rqo rqoVar = rpx.a;
        rqt rqtVar = new rqt(new rpz("RECOGNITION_SERVICE_MIC_OPENED", false, ypv.a, 112, rpy.NONE, rpx.b, rpx.a, rpx.c, rpx.d));
        rqtVar.i("recognition_session", str);
        a(str, rqtVar);
    }

    @Override // defpackage.tur
    public final void j(String str, tuw tuwVar) {
        if (m(str)) {
            r(str);
            q(str, tuwVar.c.concat(" ").concat(tuwVar.d));
        }
    }

    @Override // defpackage.tus
    public final void k(String str, tuu tuuVar) {
        rqt rqtVar;
        tsi tsiVar = (tsi) tuuVar;
        this.g.put(str, tsiVar.d);
        if (m(str)) {
            rqo rqoVar = rpx.a;
            rqtVar = new rqt(new rpz("RECOGNITION_GRPC_SERVICE_START", true, yqt.i(86400000L), 198, rpy.TRANSCRIPTION_RECOGNITION_GRPC_SERVICE, rpx.b, rpx.a, rpx.c, rpx.d));
        } else {
            rqo rqoVar2 = rpx.a;
            rqtVar = new rqt(new rpz("RECOGNITION_SERVICE_START", true, yqt.i(86400000L), 108, rpy.TRANSCRIPTION_RECOGNITION_SERVICE, rpx.b, rpx.a, rpx.c, rpx.d));
        }
        rqtVar.i("recognition_session", str);
        abxc abxcVar = zol.b;
        zok zokVar = new zok();
        String str2 = tsiVar.a;
        if ((zokVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            zokVar.y();
        }
        zol zolVar = (zol) zokVar.b;
        zolVar.c |= 4;
        zolVar.f = str2;
        String str3 = tsiVar.b;
        if ((zokVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            zokVar.y();
        }
        zol zolVar2 = (zol) zokVar.b;
        zolVar2.c |= 8;
        zolVar2.g = str3;
        int i = tsiVar.g;
        if ((zokVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            zokVar.y();
        }
        zol zolVar3 = (zol) zokVar.b;
        zolVar3.i = i - 1;
        zolVar3.c |= 32;
        boolean z = tsiVar.c;
        if ((zokVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            zokVar.y();
        }
        zol zolVar4 = (zol) zokVar.b;
        zolVar4.c |= 16;
        zolVar4.h = z;
        String str4 = this.l;
        if ((zokVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            zokVar.y();
        }
        zol zolVar5 = (zol) zokVar.b;
        str4.getClass();
        zolVar5.c |= 256;
        zolVar5.l = str4;
        tru truVar = this.m;
        if ((zokVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            zokVar.y();
        }
        boolean z2 = truVar.h;
        zol zolVar6 = (zol) zokVar.b;
        zolVar6.c |= 8192;
        zolVar6.n = z2;
        yyk yykVar = tsiVar.f;
        if ((Integer.MIN_VALUE & zokVar.b.memoizedSerializedSize) == 0) {
            zokVar.y();
        }
        zol zolVar7 = (zol) zokVar.b;
        abxs abxsVar = zolVar7.o;
        if (!abxsVar.c()) {
            int size = abxsVar.size();
            zolVar7.o = abxsVar.d(size + size);
        }
        abus.m(yykVar, zolVar7.o);
        rqtVar.f(abxcVar, (zol) zokVar.v());
        a(str, rqtVar);
        if (m(str)) {
            return;
        }
        if (tsiVar.e) {
            rqt rqtVar2 = new rqt(new rpz("RECOGNITION_SERVICE_PREFER_OFFLINE", false, ypv.a, 114, rpy.NONE, rpx.b, rpx.a, rpx.c, rpx.d));
            rqtVar2.i("recognition_session", str);
            a(str, rqtVar2);
        }
        if (z) {
            rqt rqtVar3 = new rqt(new rpz("RECOGNITION_SERVICE_AUDIO_SOURCE", false, ypv.a, 115, rpy.NONE, rpx.b, rpx.a, rpx.c, rpx.d));
            rqtVar3.i("recognition_session", str);
            a(str, rqtVar3);
        }
    }

    @Override // defpackage.tur
    public final void l(String str) {
        if (!m(str)) {
            rqo rqoVar = rpx.a;
            rqt rqtVar = new rqt(new rpz("RECOGNITION_SERVICE_START_OF_SPEECH", false, ypv.a, 110, rpy.NONE, rpx.b, rpx.a, rpx.c, rpx.d));
            rqtVar.i("recognition_session", str);
            a(str, rqtVar);
            return;
        }
        if (!this.h.add(str)) {
            ((zdv) ((zdv) d.b().o(zfi.a, "RecSrvAppFlowLogger")).q("com/google/android/libraries/speech/transcription/recognition/RecognitionServiceAppFlowLogger", "onStartSpeech", 305, "RecognitionServiceAppFlowLogger.java")).u("ignore not first start of speech");
            return;
        }
        rqo rqoVar2 = rpx.a;
        rqt rqtVar2 = new rqt(new rpz("RECOGNITION_SERVICE_FIRST_START_OF_SPEECH", false, ypv.a, 199, rpy.NONE, rpx.b, rpx.a, rpx.c, rpx.d));
        rqtVar2.i("recognition_session", str);
        a(str, rqtVar2);
    }

    public final boolean m(String str) {
        HashMap map = this.g;
        return map.containsKey(str) && map.get(str) == twc.GRPC_SERVICE_API;
    }

    @Override // defpackage.tus
    public final void n(String str, trr trrVar) {
        s(str, Optional.of(trrVar));
    }

    @Override // defpackage.tus
    public final void o(String str, txt txtVar) {
        this.c.put(str, Integer.valueOf(txtVar.c));
    }

    @Override // defpackage.tus
    public final void b() {
    }

    @Override // defpackage.tur
    public final void p() {
    }
}

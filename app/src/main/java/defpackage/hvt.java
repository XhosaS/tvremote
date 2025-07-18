package defpackage;

import java.util.EnumMap;
import java.util.Map;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hvt implements hvq, hzf {
    private static final zdy h = zdy.h("com/google/android/apps/tvsearch/searchbar/SearchBarStateMachineImpl");
    public final agow a;
    public final gfr b;
    public final gmd c;
    public final agow d;
    public final hzj e;
    public final Map f;
    public hze g;
    private final boolean i;
    private final hzd j;

    public hvt(agow agowVar, gfr gfrVar, gmd gmdVar, agow agowVar2, hzd hzdVar, boolean z) {
        hzj hzjVar = new hzj();
        this.e = hzjVar;
        this.f = new EnumMap(hzk.class);
        this.g = hzjVar;
        this.a = agowVar;
        this.b = gfrVar;
        this.c = gmdVar;
        this.d = agowVar2;
        this.j = hzdVar;
        this.i = z;
    }

    @Override // defpackage.hvq
    public final void a(hzk hzkVar) {
        r();
        if (this.g != this.e) {
            ((zdv) ((zdv) ((zdv) h.c()).r(zfc.MEDIUM)).q("com/google/android/apps/tvsearch/searchbar/SearchBarStateMachineImpl", "initializeState", 343, "SearchBarStateMachineImpl.java")).F("#initializeState called with %s when state is %s", hzkVar, this.g);
            return;
        }
        hyr hyrVarQ = q(hzkVar);
        hyrVarQ.m();
        this.g = hyrVarQ;
        s();
    }

    @Override // defpackage.hvq
    public final void b() {
        r();
        this.g = this.g.a(hzg.CLOSE_MIC);
        s();
    }

    @Override // defpackage.hvq
    public final void c(String str) {
        this.g = this.g.b(hzg.SHOW_ERROR, str);
    }

    @Override // defpackage.hvq
    public final void d() {
        r();
        this.g = this.g.a(hzg.OPEN_KEYBOARD);
        s();
    }

    @Override // defpackage.hvq
    public final void e() {
        r();
        this.g = this.g.a(hzg.GOT_RESPONSE);
        s();
    }

    @Override // defpackage.hvq
    public final void f(String str) {
        r();
        this.g = this.g.b(hzg.SEARCHING, str);
        s();
    }

    @Override // defpackage.hvq
    public final void g(String str) {
        r();
        this.g = this.g.b(hzg.SHOW_TEXT, str);
        s();
    }

    @Override // defpackage.hvq
    public final void h(String str, String str2) {
        r();
        this.g = this.g.c(hzg.SPEECH, str, str2);
        s();
    }

    @Override // defpackage.hvq
    public final void i() {
        if (!o()) {
            ((zdv) ((zdv) h.b()).q("com/google/android/apps/tvsearch/searchbar/SearchBarStateMachineImpl", "onSpeechHesitationDetected", 127, "SearchBarStateMachineImpl.java")).u("Unexpected SPEECH_HESITATION_DETECTED when mic is not open");
            return;
        }
        hzg hzgVar = hzg.SPEECH_HESITATION_DETECTED;
        hze hzeVar = this.g;
        if (hzeVar == this.e) {
            ((zdv) ((zdv) h.d()).q("com/google/android/apps/tvsearch/searchbar/SearchBarStateMachineImpl", "onStateSignal", 258, "SearchBarStateMachineImpl.java")).x("State signalled [%s] when machine is not initialize", hzgVar);
            return;
        }
        r();
        this.g = hzeVar.a(hzgVar);
        s();
    }

    @Override // defpackage.hvq
    public final void j() {
        r();
        this.g = this.g.a(hzg.SUGGESTIONS_UPDATED);
        s();
    }

    @Override // defpackage.hvq
    public final void k() {
        r();
        this.g = this.g.a(hzg.TALKING);
        s();
    }

    @Override // defpackage.hvq
    public final void l() {
        r();
        this.g = this.g.a(hzg.TALKING_DONE);
        s();
    }

    @Override // defpackage.hvq
    public final boolean m() {
        return this.g.j() == hzk.KEYBOARD;
    }

    @Override // defpackage.hvq
    public final boolean n() {
        return this.g.j() == hzk.LOADING;
    }

    @Override // defpackage.hvq
    public final boolean o() {
        hzk hzkVarJ = this.g.j();
        return hzkVarJ == hzk.LISTENING || hzkVarJ == hzk.LISTENING_FALLBACK || hzkVarJ == hzk.SPEAKING || hzkVarJ == hzk.SPEAKING_FALLBACK || hzkVarJ == hzk.TRANSCRIBING;
    }

    @Override // defpackage.hvq
    public final boolean p() {
        hzk hzkVarJ = this.g.j();
        return this.i ? hzkVarJ == hzk.TALKING || hzkVarJ == hzk.TALKING_IDLE || hzkVarJ == hzk.TALKING_RESPONSE : hzkVarJ == hzk.TALKING_IDLE || hzkVarJ == hzk.TALKING_RESPONSE;
    }

    public final hyr q(hzk hzkVar) {
        hyr hysVar;
        Map map = this.f;
        if (map.containsKey(hzkVar)) {
            return (hyr) map.get(hzkVar);
        }
        switch (hzkVar.ordinal()) {
            case 0:
                hysVar = new hys(hzkVar, this.j, this);
                break;
            case 1:
                hysVar = new hyt(hzkVar, this.j, this);
                break;
            case 2:
                hysVar = new hyu(hzkVar, this.j, this);
                break;
            case 3:
                hysVar = new hyv(hzkVar, this.j, this);
                break;
            case 4:
                hysVar = new hyx(hzkVar, this.j, this);
                break;
            case 5:
                hysVar = new hyw(hzkVar, this.j, this);
                break;
            case 6:
                hysVar = new hyz(hzkVar, this.j, this, new Runnable() { // from class: hvr
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((gfn) this.a.a.a()).a(rpm.L()).b().c();
                    }
                });
                break;
            case 7:
                hysVar = new hyy(hzkVar, this.j, this);
                break;
            case 8:
                hysVar = new hzb(hzkVar, this.j, this);
                break;
            case 9:
                hysVar = new hza(hzkVar, this.j, this);
                break;
            case 10:
                hysVar = new hzi(hzkVar, this.j, this);
                break;
            case 11:
                hysVar = new hzh(hzkVar, this.j, this);
                break;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
            default:
                ((zdv) ((zdv) ((zdv) h.c()).r(zfc.MEDIUM)).q("com/google/android/apps/tvsearch/searchbar/SearchBarStateMachineImpl", "getState", 323, "SearchBarStateMachineImpl.java")).x("Received unhandled State: %s", hzkVar);
                hysVar = new hyt(hzkVar, this.j, this);
                break;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                hysVar = new hzo(hzkVar, this.j, this);
                break;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                hysVar = new hzm(hzkVar, this.j, this);
                break;
            case 15:
                hysVar = new hzn(hzkVar, this.j, this);
                break;
            case 16:
                hysVar = new hzp(hzkVar, this.j, this, new Runnable() { // from class: hvs
                    @Override // java.lang.Runnable
                    public final void run() {
                        hvt hvtVar = this.a;
                        if (((Boolean) hvtVar.d.a()).booleanValue()) {
                            ((gfn) hvtVar.a.a()).a(rpm.N()).b().c();
                        } else {
                            hvtVar.b.a(rpm.N(), abqb.OK, null, null);
                        }
                        hvtVar.c.m(gmc.i);
                    }
                });
                break;
        }
        map.put(hzkVar, hysVar);
        return hysVar;
    }

    public final void r() {
        this.b.b(rpm.cs(), null, null);
    }

    public final void s() {
        this.c.p(gmc.au, this.g.p());
        this.b.c(this.g.r(), abqb.OK, null, null);
    }
}

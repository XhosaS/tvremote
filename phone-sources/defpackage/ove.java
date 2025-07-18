package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.support.v7.appcompat.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ove implements epd, eam, net, eoz {
    public static final tui a = tui.l("com/google/android/libraries/googletv/player/kinetoscope/drm/NurDrmSessionManager");
    public byte[] b;
    private final epl c;
    private final ovi d;
    private Looper f;
    private elk g;
    private final Map e = new LinkedHashMap();
    private final Map h = new LinkedHashMap();

    public ove(epl eplVar, ovi oviVar) {
        this.c = eplVar;
        this.d = oviVar;
    }

    private final eou H(int i) {
        Map map = this.e;
        Integer numValueOf = Integer.valueOf(i);
        Object objA = map.get(numValueOf);
        if (objA == null) {
            eop eopVar = new eop();
            eopVar.b(1, 2);
            eopVar.c(dys.d, this.c);
            eopVar.a = false;
            eopVar.b = true;
            a.H(true);
            eopVar.c = -9223372036854775807L;
            objA = eopVar.a(this.d);
        }
        eou eouVar = (eou) objA;
        if (map.get(numValueOf) == null) {
            eouVar.e(0, this.b);
            Looper looper = this.f;
            elk elkVar = null;
            if (looper == null) {
                yks.c("playbackLooper");
                looper = null;
            }
            elk elkVar2 = this.g;
            if (elkVar2 == null) {
                yks.c("playerId");
            } else {
                elkVar = elkVar2;
            }
            eouVar.eo(looper, elkVar);
            eouVar.em();
            map.put(numValueOf, eouVar);
            ((tug) a.b().j("com/google/android/libraries/googletv/player/kinetoscope/drm/NurDrmSessionManager", "maybeCreateDrmSessionManager", 240, "NurDrmSessionManager.kt")).x("Created manager for period %d = %s", i, eouVar.toString());
        }
        return eouVar;
    }

    private static final int I(dze dzeVar) {
        String str;
        try {
            String str2 = dzeVar.K;
            if (str2 != null && (str = (String) yfm.S(ylh.aa(str2, new String[]{"-"}))) != null) {
                return Integer.parseInt(str);
            }
        } catch (NumberFormatException unused) {
        }
        return 0;
    }

    @Override // defpackage.net
    public final void G(String str) {
        this.d.d = str;
    }

    @Override // defpackage.epd
    public final int a(dze dzeVar) {
        dzeVar.getClass();
        int iA = H(I(dzeVar)).a(dzeVar);
        ((tug) a.b().j("com/google/android/libraries/googletv/player/kinetoscope/drm/NurDrmSessionManager", "getCryptoType", R.styleable.AppCompatTheme_windowMinWidthMinor, "NurDrmSessionManager.kt")).B("format %s, result = %s", dzeVar, iA != 1 ? iA != 2 ? iA != 3 ? a.cf(iA, "Unknown crypto type ") : "CRYPTO_TYPE_CUSTOM" : "CRYPTO_TYPE_SYSTEM" : "CRYPTO_TYPE_NONE");
        return iA;
    }

    @Override // defpackage.eoz
    public final void db(int i, evz evzVar, int i2) {
        if (evzVar != null) {
            Map map = this.h;
            int I = osk.I(evzVar);
            Integer numValueOf = Integer.valueOf(I);
            Object obj = map.get(numValueOf);
            boolean z = false;
            if (obj == null) {
                obj = 0;
                map.put(numValueOf, obj);
            }
            map.put(numValueOf, Integer.valueOf(((Number) obj).intValue() + 1));
            ovi oviVar = this.d;
            if (!map.isEmpty()) {
                Iterator it = map.entrySet().iterator();
                int i3 = 0;
                while (it.hasNext()) {
                    if (((Number) ((Map.Entry) it.next()).getValue()).intValue() > 0) {
                        i3++;
                    }
                }
                if (i3 > 1) {
                    z = true;
                }
            }
            oviVar.e = z;
            tug tugVar = (tug) a.b().j("com/google/android/libraries/googletv/player/kinetoscope/drm/NurDrmSessionManager", "onDrmSessionAcquired", 153, "NurDrmSessionManager.kt");
            Integer numValueOf2 = Integer.valueOf(I);
            tugVar.F("Increased session count for period %s, to %d, skip renewals = %s, session counts: %s", numValueOf2, map.get(numValueOf2), Boolean.valueOf(oviVar.e), map);
        }
    }

    @Override // defpackage.epd
    public final void em() {
        ((tug) a.b().j("com/google/android/libraries/googletv/player/kinetoscope/drm/NurDrmSessionManager", "prepare", 56, "NurDrmSessionManager.kt")).s("No arguments");
        this.e.clear();
    }

    @Override // defpackage.epd
    public final void en() {
        tui tuiVar = a;
        tug tugVar = (tug) tuiVar.b().j("com/google/android/libraries/googletv/player/kinetoscope/drm/NurDrmSessionManager", "release", 62, "NurDrmSessionManager.kt");
        Map map = this.e;
        tugVar.v("drmSessionManagers keys: %s", map.keySet());
        for (Map.Entry entry : map.entrySet()) {
            int iIntValue = ((Number) entry.getKey()).intValue();
            eou eouVar = (eou) entry.getValue();
            ((tug) tuiVar.b().j("com/google/android/libraries/googletv/player/kinetoscope/drm/NurDrmSessionManager", "release", 64, "NurDrmSessionManager.kt")).x("Releasing period %d's session manager: %s", iIntValue, eouVar);
            eouVar.en();
        }
        map.clear();
    }

    @Override // defpackage.epd
    public final void eo(Looper looper, elk elkVar) {
        looper.getClass();
        ((tug) a.b().j("com/google/android/libraries/googletv/player/kinetoscope/drm/NurDrmSessionManager", "setPlayer", 49, "NurDrmSessionManager.kt")).B("Looper: %s, playerId: %s", looper, elkVar);
        this.f = looper;
        this.g = elkVar;
    }

    @Override // defpackage.epd
    public final eox ep(eph ephVar, dze dzeVar) {
        Looper looper = null;
        eph ephVar2 = ephVar == null ? new eph((byte[]) null) : ephVar;
        Looper looper2 = this.f;
        if (looper2 == null) {
            yks.c("playbackLooper");
        } else {
            looper = looper2;
        }
        ephVar2.s(new Handler(looper), this);
        eox eoxVarEp = H(I(dzeVar)).ep(ephVar2, dzeVar);
        ((tug) a.b().j("com/google/android/libraries/googletv/player/kinetoscope/drm/NurDrmSessionManager", "acquireSession", 109, "NurDrmSessionManager.kt")).E("eventDispatcher: %s, format: %s, result = %s", osk.J(ephVar), dzeVar, eoxVarEp);
        return eoxVarEp;
    }

    @Override // defpackage.eoz
    public final void g(int i, evz evzVar) {
        if (evzVar != null) {
            Map map = this.h;
            int I = osk.I(evzVar);
            Integer numValueOf = Integer.valueOf(I);
            Object obj = map.get(numValueOf);
            boolean z = false;
            if (obj == null) {
                obj = 0;
                map.put(numValueOf, obj);
            }
            map.put(numValueOf, Integer.valueOf(Math.max(((Number) obj).intValue() - 1, 0)));
            ovi oviVar = this.d;
            if (!map.isEmpty()) {
                Iterator it = map.entrySet().iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    if (((Number) ((Map.Entry) it.next()).getValue()).intValue() > 0) {
                        i2++;
                    }
                }
                if (i2 > 1) {
                    z = true;
                }
            }
            oviVar.e = z;
            tug tugVar = (tug) a.b().j("com/google/android/libraries/googletv/player/kinetoscope/drm/NurDrmSessionManager", "onDrmSessionReleased", 176, "NurDrmSessionManager.kt");
            Integer numValueOf2 = Integer.valueOf(I);
            tugVar.F("Decreased session count for period %s, to %d, skip renewals = %s, session counts: %s", numValueOf2, map.get(numValueOf2), Boolean.valueOf(oviVar.e), map);
        }
    }

    @Override // defpackage.epd
    public final epc i(eph ephVar, dze dzeVar) {
        epc epcVarI = H(I(dzeVar)).i(ephVar, dzeVar);
        ((tug) a.b().j("com/google/android/libraries/googletv/player/kinetoscope/drm/NurDrmSessionManager", "preacquireSession", 84, "NurDrmSessionManager.kt")).E("eventDispatcher: %s, format: %s, result = %s", osk.J(ephVar), dzeVar, epcVarI);
        return epcVarI;
    }

    @Override // defpackage.eam
    public final /* synthetic */ void F() {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void u() {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void A(ebf ebfVar) {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void B(ebh ebhVar) {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void C(ebo eboVar) {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void D(float f) {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void E(eal ealVar) {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void b(int i) {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void c(eak eakVar) {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void d(ecb ecbVar) {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void dc(boolean z) {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void dd(boolean z) {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void de(boolean z) {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void dg(eab eabVar) {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void dh(ead eadVar) {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void e(List list) {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void el(dyo dyoVar) {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void m(eai eaiVar) {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void n(int i) {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void o(int i) {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void p(eah eahVar) {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void q(eah eahVar) {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void s(eab eabVar) {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void v(int i) {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void w(boolean z) {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void x(boolean z) {
    }

    @Override // defpackage.eoz
    public final /* synthetic */ void cY(int i, evz evzVar) {
    }

    @Override // defpackage.eoz
    public final /* synthetic */ void cZ(int i, evz evzVar) {
    }

    @Override // defpackage.eoz
    public final /* synthetic */ void da(int i, evz evzVar) {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void df(dzy dzyVar, int i) {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void l(boolean z, int i) {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void r(boolean z, int i) {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void y(int i, int i2) {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void z(eay eayVar, int i) {
    }

    @Override // defpackage.eoz
    public final /* synthetic */ void f(int i, evz evzVar, Exception exc) {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void t(ean eanVar, ean eanVar2, int i) {
    }
}

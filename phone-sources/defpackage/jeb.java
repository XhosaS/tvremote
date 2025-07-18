package defpackage;

import androidx.media3.exoplayer.drm.ExoMediaDrm;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class jeb implements epl {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ jeb(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    @Override // defpackage.epl
    public final ExoMediaDrm a(UUID uuid) {
        int i = this.c;
        if (i == 0) {
            uuid.getClass();
            final ovg ovgVar = new ovg(uuid, (ovi) this.a);
            ovgVar.setOnKeyStatusChangeListener(new epk() { // from class: jea
                @Override // defpackage.epk
                public final void a(byte[] bArr, List list, boolean z) {
                    bArr.getClass();
                    Map mapG = osk.G(ovgVar.a);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        zuw zuwVar = (zuw) it.next();
                        Object obj = zuwVar.b;
                        obj.getClass();
                        otx otxVar = (otx) mapG.get(osk.f((byte[]) obj));
                        if (otxVar != null) {
                            otxVar.a(osk.L(zuwVar));
                        }
                    }
                }
            });
            return ovgVar;
        }
        if (i != 1) {
            uuid.getClass();
            final ovg ovgVar2 = new ovg(uuid, (ovi) this.b);
            final ovf ovfVar = ((ovx) this.a).d;
            if (ovfVar != null) {
                ovgVar2.setOnKeyStatusChangeListener(new epk() { // from class: ovw
                    @Override // defpackage.epk
                    public final void a(byte[] bArr, List list, boolean z) {
                        bArr.getClass();
                        tui tuiVar = ovv.a;
                        tug tugVar = (tug) tuiVar.b().j("com/google/android/libraries/googletv/player/kinetoscope/tvodplayer/impl/TvodPlayerControllerImpl", "onKeyStatusChange", 252, "TvodPlayerControllerImpl.kt");
                        String str = new String(bArr, ynd.a);
                        ovg ovgVar3 = ovgVar2;
                        tugVar.F("nurMediaDrm: %s, sessionId: %s, exoKeyInformation: %s, hasNewUsableKey: %s", ovgVar3, str, list, Boolean.valueOf(z));
                        Map mapG = osk.G(ovgVar3.a);
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            zuw zuwVar = (zuw) it.next();
                            Object obj = zuwVar.b;
                            obj.getClass();
                            String strF = osk.f((byte[]) obj);
                            otx otxVar = (otx) mapG.get(strF);
                            if (otxVar != null) {
                                otxVar.a(osk.L(zuwVar));
                                ((tug) tuiVar.b().j("com/google/android/libraries/googletv/player/kinetoscope/tvodplayer/impl/TvodPlayerControllerImpl", "onKeyStatusChange", 268, "TvodPlayerControllerImpl.kt")).F("Key id hex: %s, status code: %s, format: %s, range: %s", strF, otxVar.a.name(), vxr.e(otxVar.b), qtl.aD(otxVar.c));
                            }
                        }
                        ovv ovvVar = (ovv) ovfVar;
                        ykr.q(ovvVar.c, null, 0, new kci(ovvVar, (yih) null, 9), 3);
                    }
                });
            }
            return ovgVar2;
        }
        uuid.getClass();
        ksy ksyVar = (ksy) this.a;
        int iAU = a.aU(hju.t(ksyVar).c);
        int i2 = iAU != 0 ? iAU : 1;
        String str = ksyVar.b;
        jdr jdrVar = (jdr) this.b;
        return new ovg(uuid, new ovi(new our(str, qtl.au(i2)), jdrVar.d, jdrVar.c));
    }

    public /* synthetic */ jeb(ovi oviVar, ovx ovxVar, int i) {
        this.c = i;
        this.b = oviVar;
        this.a = ovxVar;
    }
}

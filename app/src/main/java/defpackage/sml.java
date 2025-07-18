package defpackage;

import android.os.ParcelFileDescriptor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sml implements slz, sma {
    private static final zdy c = zdy.h("com/google/android/libraries/search/audio/extensions/externallisteningsession/impl/ExternalListeningSessionProviderImpl");
    public final sbb a;
    public final sfe b;
    private final seu d;
    private final sep e;
    private final ahbt f;
    private final eub g;

    public sml(sbb sbbVar, seu seuVar, sfe sfeVar, eub eubVar, sep sepVar, ahbt ahbtVar) {
        eubVar.getClass();
        ahbtVar.getClass();
        this.a = sbbVar;
        this.d = seuVar;
        this.b = sfeVar;
        this.g = eubVar;
        this.e = sepVar;
        this.f = ahbtVar;
    }

    private final rux d(final sdp sdpVar, ruo ruoVar, tae taeVar) {
        final agwh agwhVar = new agwh();
        zyd zydVarA = xt.a(new xq() { // from class: smf
            @Override // defpackage.xq
            public final Object a(xo xoVar) {
                agwhVar.a = xoVar;
                return "createStopListeningStatusFuture";
            }
        });
        final sjp sjpVar = new sjp(this.f);
        final agux aguxVar = new agux() { // from class: smg
            @Override // defpackage.agux
            public final Object a(Object obj) {
                xo xoVar;
                rvm rvmVar = (rvm) obj;
                rvmVar.getClass();
                Object obj2 = agwhVar.a;
                if (obj2 == null) {
                    agvy.b("stoppedCompleter");
                    xoVar = null;
                } else {
                    xoVar = (xo) obj2;
                }
                xoVar.b(rvmVar);
                return agpu.a;
            }
        };
        return new sme(sjpVar.a(new smk(this, sdpVar, taeVar, ruoVar, aguxVar, null)), zydVarA, ruoVar, new agux() { // from class: smh
            @Override // defpackage.agux
            public final Object a(Object obj) {
                rxn rxnVar = (rxn) obj;
                rxnVar.getClass();
                sjpVar.a(new smj(this, sdpVar, rxnVar, aguxVar, null));
                return agpu.a;
            }
        }, (zyh) this.g.a.a.m.a());
    }

    @Override // defpackage.slz
    public final rux a(ParcelFileDescriptor parcelFileDescriptor, ruo ruoVar) {
        ruoVar.getClass();
        ((zdv) c.b().o(zfi.a, "ALT.ExtSessionProvider").q("com/google/android/libraries/search/audio/extensions/externallisteningsession/impl/ExternalListeningSessionProviderImpl", "createPfdAudioRequestListeningSession", 98, "ExternalListeningSessionProviderImpl.kt")).u("#audio# create external(PFD) session");
        sej sejVar = new sej(parcelFileDescriptor);
        rui ruiVar = new rui();
        ruiVar.B(ruoVar);
        if ((ruiVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ruiVar.y();
        }
        ruo ruoVar2 = (ruo) ruiVar.b;
        ruoVar2.b |= 2048;
        ruoVar2.l = false;
        return d(sejVar, rue.a(ruiVar), null);
    }

    @Override // defpackage.slz
    public final rux b(rvf rvfVar) {
        rvfVar.getClass();
        ((zdv) c.b().o(zfi.a, "ALT.ExtSessionProvider").q("com/google/android/libraries/search/audio/extensions/externallisteningsession/impl/ExternalListeningSessionProviderImpl", "createUriAudioRequestListeningSession", 84, "ExternalListeningSessionProviderImpl.kt")).u("#audio# create external(URI) session");
        if (((rvfVar.c == 13 ? (saa) rvfVar.d : saa.a).b & 1) == 0) {
            throw new IllegalArgumentException("AudioRequestMicInputParams must have Uri string");
        }
        set setVarA = this.d.a((rvfVar.c == 13 ? (saa) rvfVar.d : saa.a).c);
        ruo ruoVar = rvfVar.g;
        if (ruoVar == null) {
            ruoVar = ruo.a;
        }
        ruoVar.getClass();
        rui ruiVar = new rui();
        ruiVar.B(ruoVar);
        if ((ruiVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ruiVar.y();
        }
        ruo ruoVar2 = (ruo) ruiVar.b;
        ruoVar2.b |= 2048;
        ruoVar2.l = false;
        return d(setVarA, rue.a(ruiVar), null);
    }

    @Override // defpackage.sma
    public final rux c(sec secVar, tae taeVar) {
        ((zdv) c.b().o(zfi.a, "ALT.ExtSessionProvider").q("com/google/android/libraries/search/audio/extensions/externallisteningsession/impl/ExternalListeningSessionProviderImpl", "createAudioRequestListeningSessionForInternalUse", 111, "ExternalListeningSessionProviderImpl.kt")).u("#audio# create external session");
        ypv ypvVar = ypv.a;
        zyd zydVarH = zxn.h(ypvVar);
        sgo sgoVar = sgo.a;
        Integer num = null;
        seo seoVarA = this.e.a(secVar, ypvVar, zydVarH, new smv(sgp.a(new sgm()), num, num, 12));
        ruo ruoVar = secVar.e;
        if (ruoVar == null) {
            ruoVar = ruo.a;
        }
        ruoVar.getClass();
        return d(seoVarA, ruoVar, taeVar);
    }
}

package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class swj implements swh {
    private static final zdy a = zdy.h("com/google/android/libraries/search/audio/policies/controller/impl/SourcePolicyControllerImpl");
    private final Map b;
    private final svu c;

    public swj(Map map, svu svuVar, sez sezVar, smw smwVar) {
        svuVar.getClass();
        sezVar.getClass();
        smwVar.getClass();
        this.b = map;
        this.c = svuVar;
    }

    @Override // defpackage.swh
    public final rvf a(svb svbVar, rvc rvcVar) {
        zdy zdyVar = a;
        zeo zeoVarB = zdyVar.b();
        zer zerVar = zfi.a;
        ((zdv) zeoVarB.o(zerVar, "ALT.SourcePolicyCtlr").q("com/google/android/libraries/search/audio/policies/controller/impl/SourcePolicyControllerImpl", "selectAudioFormat", 54, "SourcePolicyControllerImpl.kt")).x("#audio# selecting audio format..., request=%s", svbVar);
        sgo sgoVar = rvcVar.c;
        if (sgoVar == null) {
            sgoVar = sgo.a;
        }
        int iB = sgn.b(sgoVar.b);
        if (iB == 0) {
            throw null;
        }
        final rva rvaVarB = rva.b(rvcVar.d);
        if (rvaVarB == null) {
            rvaVarB = rva.DEFAULT;
        }
        final int i = iB - 1;
        Map map = this.b;
        rvaVarB.getClass();
        Object obj = map.get(new swa() { // from class: swi
            @Override // defpackage.swa
            public final /* synthetic */ int a() {
                return i;
            }

            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return swa.class;
            }

            @Override // defpackage.swa
            public final /* synthetic */ rva b() {
                return rvaVarB;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj2) {
                if (!(obj2 instanceof swa)) {
                    return false;
                }
                swa swaVar = (swa) obj2;
                return i == swaVar.a() && rvaVarB == swaVar.b();
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return (i ^ (-1129414950)) + (rvaVarB.hashCode() ^ (-14018716));
            }

            @Override // java.lang.annotation.Annotation
            public final String toString() {
                return "@com.google.android.libraries.search.audio.policies.PolicyUse(clientOrdinal=" + i + ", intent=" + rvaVarB + ")";
            }
        });
        if (obj == null) {
            obj = this.c;
        }
        rvf rvfVar = rvf.a;
        rve rveVar = new rve();
        ruo ruoVar = ruo.a;
        rui ruiVar = new rui();
        if ((ruiVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ruiVar.y();
        }
        ruo ruoVar2 = (ruo) ruiVar.b;
        ruoVar2.b |= 1;
        ruoVar2.c = 6;
        if ((ruiVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ruiVar.y();
        }
        ruo ruoVar3 = (ruo) ruiVar.b;
        ruoVar3.b |= 2;
        ruoVar3.d = 16000;
        if ((ruiVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ruiVar.y();
        }
        ruo ruoVar4 = (ruo) ruiVar.b;
        ruoVar4.b |= 4;
        ruoVar4.e = 1;
        if ((ruiVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ruiVar.y();
        }
        ruo ruoVar5 = (ruo) ruiVar.b;
        ruoVar5.b |= 8;
        ruoVar5.f = 2;
        if ((ruiVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ruiVar.y();
        }
        ruo ruoVar6 = (ruo) ruiVar.b;
        ruoVar6.b |= 2048;
        ruoVar6.l = true;
        ruo ruoVarA = rue.a(ruiVar);
        if ((rveVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            rveVar.y();
        }
        rvf rvfVar2 = (rvf) rveVar.b;
        rvfVar2.g = ruoVarA;
        rvfVar2.b |= 1;
        rvf rvfVarA = rvn.a(rveVar);
        ((zdv) zdyVar.b().o(zerVar, "ALT.SourcePolicyCtlr").q("com/google/android/libraries/search/audio/policies/controller/impl/SourcePolicyControllerImpl", "selectAudioFormat", 56, "SourcePolicyControllerImpl.kt")).x("#audio# selected audio format=%s", rvfVarA);
        return rvfVarA;
    }
}

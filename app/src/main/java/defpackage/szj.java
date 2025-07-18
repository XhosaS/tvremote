package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class szj extends agtu implements agvb {
    int a;
    final /* synthetic */ szo b;
    final /* synthetic */ agum c;
    final /* synthetic */ sdw d;
    final /* synthetic */ rzb e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public szj(szo szoVar, agum agumVar, sdw sdwVar, rzb rzbVar, agsw agswVar) {
        super(2, agswVar);
        this.b = szoVar;
        this.c = agumVar;
        this.d = sdwVar;
        this.e = rzbVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((szj) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            zdy zdyVar = szo.a;
            zer zerVar = zfi.a;
            final szo szoVar = this.b;
            final sdw sdwVar = this.d;
            final rzb rzbVar = this.e;
            final agum agumVar = new agum() { // from class: szh
                @Override // defpackage.agum
                public final Object a() {
                    Object objA;
                    rzb rzbVar2 = rzbVar;
                    String strA = szp.a(sdwVar);
                    rsk rskVar = (rsk) rzbVar2.a().c();
                    szo szoVar2 = szoVar;
                    syb sybVarA = szoVar2.a(strA);
                    int iC = szr.c(szoVar2.j);
                    byte[] bArr = new byte[iC];
                    int i2 = 0;
                    while (true) {
                        try {
                            objA = Integer.valueOf(rskVar.a(bArr, i2, 0, iC));
                        } catch (Throwable th) {
                            objA = agpl.a(th);
                        }
                        if (agpk.a(objA) != null) {
                            ((zdv) szo.a.d().o(zfi.a, "ALT.SessionAudioStore").q("com/google/android/libraries/search/audio/store/session/SessionAudioStore", "storeAudio", 173, "SessionAudioStore.kt")).x("#audio# cannot read session(%s) next audio data", szoVar2.k);
                            sybVarA.a();
                            break;
                        }
                        int iIntValue = ((Number) objA).intValue();
                        if (iIntValue < 0) {
                            break;
                        }
                        if (iIntValue > 0) {
                            i2 += iIntValue;
                            if (sybVarA.c(abvo.u(bArr, 0, iIntValue)).isCancelled()) {
                                break;
                            }
                        }
                    }
                    sybVarA.a();
                    return agpu.a;
                }
            };
            zyd zydVarJ = zxn.j(wyo.h(new Runnable() { // from class: szi
                @Override // java.lang.Runnable
                public final void run() {
                    agumVar.a();
                }
            }), szoVar.e);
            this.a = 1;
            if (ahkr.b(zydVarJ, this) == agtgVar) {
                return agtgVar;
            }
        }
        this.c.a();
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new szj(this.b, this.c, this.d, this.e, agswVar);
    }
}

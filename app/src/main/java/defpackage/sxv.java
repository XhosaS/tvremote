package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class sxv implements zxe {
    final /* synthetic */ sdo a;
    final /* synthetic */ sgo b;
    final /* synthetic */ sxx c;

    public sxv(sxx sxxVar, sdo sdoVar, sgo sgoVar) {
        this.a = sdoVar;
        this.b = sgoVar;
        this.c = sxxVar;
    }

    @Override // defpackage.zxe
    public final void a(Throwable th) {
        zdv zdvVar = (zdv) ((zdv) sxx.a.d().o(zfi.a, "ALT.AudioEventsHolder")).q("com/google/android/libraries/search/audio/state/events/impl/AudioEventsHolderImpl$6", "onFailure", 443, "AudioEventsHolderImpl.java");
        sdo sdoVar = this.a;
        zdvVar.v("#audio# cannot retrieve audio focus session(token(%d)) acquire status", sdoVar.c);
        ryi ryiVar = ryi.a;
        ryh ryhVar = new ryh();
        rts rtsVarC = skj.c(6);
        if ((ryhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ryhVar.y();
        }
        ryi ryiVar2 = (ryi) ryhVar.b;
        rtsVarC.getClass();
        ryiVar2.d = rtsVarC;
        ryiVar2.c = 5;
        if ((ryhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ryhVar.y();
        }
        ryi ryiVar3 = (ryi) ryhVar.b;
        ryiVar3.f = sdoVar;
        ryiVar3.b |= 2;
        sgo sgoVar = this.b;
        if ((ryhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ryhVar.y();
        }
        sxx sxxVar = this.c;
        ryi ryiVar4 = (ryi) ryhVar.b;
        ryiVar4.g = sgoVar;
        ryiVar4.b |= 4;
        sxxVar.e((ryi) ryhVar.v());
    }

    @Override // defpackage.zxe
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        rts rtsVar = (rts) obj;
        zdv zdvVar = (zdv) ((zdv) sxx.a.b().o(zfi.a, "ALT.AudioEventsHolder")).q("com/google/android/libraries/search/audio/state/events/impl/AudioEventsHolderImpl$6", "onSuccess", 430, "AudioEventsHolderImpl.java");
        sdo sdoVar = this.a;
        int i = sdoVar.c;
        int iB = rtu.b(rtsVar.c);
        if (iB == 0) {
            iB = 1;
        }
        zdvVar.B("#audio# audio focus session(token(%d)) acquire status(%s)", i, rtu.a(iB));
        sxx sxxVar = this.c;
        ryi ryiVar = ryi.a;
        ryh ryhVar = new ryh();
        if ((ryhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ryhVar.y();
        }
        ryi ryiVar2 = (ryi) ryhVar.b;
        rtsVar.getClass();
        ryiVar2.d = rtsVar;
        ryiVar2.c = 5;
        if ((ryhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ryhVar.y();
        }
        ryi ryiVar3 = (ryi) ryhVar.b;
        ryiVar3.f = sdoVar;
        ryiVar3.b |= 2;
        sgo sgoVar = this.b;
        if ((ryhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ryhVar.y();
        }
        ryi ryiVar4 = (ryi) ryhVar.b;
        ryiVar4.g = sgoVar;
        ryiVar4.b |= 4;
        sxxVar.e((ryi) ryhVar.v());
    }
}

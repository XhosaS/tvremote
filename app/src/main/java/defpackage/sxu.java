package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class sxu implements zxe {
    final /* synthetic */ sdo a;
    final /* synthetic */ sgo b;
    final /* synthetic */ sxx c;

    public sxu(sxx sxxVar, sdo sdoVar, sgo sgoVar) {
        this.a = sdoVar;
        this.b = sgoVar;
        this.c = sxxVar;
    }

    @Override // defpackage.zxe
    public final void a(Throwable th) {
        zdv zdvVar = (zdv) ((zdv) sxx.a.d().o(zfi.a, "ALT.AudioEventsHolder")).q("com/google/android/libraries/search/audio/state/events/impl/AudioEventsHolderImpl$5", "onFailure", 406, "AudioEventsHolderImpl.java");
        sdo sdoVar = this.a;
        zdvVar.v("#audio# cannot retrieve audio focus session(token(%d)) release status", sdoVar.c);
        ryi ryiVar = ryi.a;
        ryh ryhVar = new ryh();
        ruc rucVarD = skj.d(6);
        if ((ryhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ryhVar.y();
        }
        ryi ryiVar2 = (ryi) ryhVar.b;
        rucVarD.getClass();
        ryiVar2.d = rucVarD;
        ryiVar2.c = 6;
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
        ruc rucVar = (ruc) obj;
        zdv zdvVar = (zdv) ((zdv) sxx.a.b().o(zfi.a, "ALT.AudioEventsHolder")).q("com/google/android/libraries/search/audio/state/events/impl/AudioEventsHolderImpl$5", "onSuccess", 393, "AudioEventsHolderImpl.java");
        sdo sdoVar = this.a;
        int i = sdoVar.c;
        int iB = rty.b(rucVar.c);
        if (iB == 0) {
            iB = 1;
        }
        zdvVar.B("#audio# audio focus session(token(%d)) release status(%s)", i, rty.a(iB));
        sxx sxxVar = this.c;
        ryi ryiVar = ryi.a;
        ryh ryhVar = new ryh();
        if ((ryhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ryhVar.y();
        }
        ryi ryiVar2 = (ryi) ryhVar.b;
        rucVar.getClass();
        ryiVar2.d = rucVar;
        ryiVar2.c = 6;
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

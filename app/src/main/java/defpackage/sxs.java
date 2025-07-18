package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class sxs implements zxe {
    final /* synthetic */ int a;
    final /* synthetic */ long b;
    final /* synthetic */ sgo c;
    final /* synthetic */ sxx d;

    public sxs(sxx sxxVar, int i, long j, sgo sgoVar) {
        this.a = i;
        this.b = j;
        this.c = sgoVar;
        this.d = sxxVar;
    }

    @Override // defpackage.zxe
    public final void a(Throwable th) {
        zdv zdvVar = (zdv) ((zdv) sxx.a.d().o(zfi.a, "ALT.AudioEventsHolder")).q("com/google/android/libraries/search/audio/state/events/impl/AudioEventsHolderImpl$1", "onFailure", 175, "AudioEventsHolderImpl.java");
        int i = this.a;
        long j = this.b;
        zdvVar.A("#audio# cannot retrieve audio request client(token(%d)) session(token(%d)) stop listening status", i, j);
        rvm rvmVar = rvm.a;
        rvl rvlVar = new rvl();
        rxd rxdVar = rxd.a;
        rxc rxcVar = new rxc();
        if ((rxcVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            rxcVar.y();
        }
        rxd rxdVar2 = (rxd) rxcVar.b;
        rxdVar2.c = 500;
        rxdVar2.b = 2;
        rxd rxdVar3 = (rxd) rxcVar.v();
        if ((rvlVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            rvlVar.y();
        }
        rvm rvmVar2 = (rvm) rvlVar.b;
        rxdVar3.getClass();
        rvmVar2.c = rxdVar3;
        rvmVar2.b |= 1;
        rvm rvmVar3 = (rvm) rvlVar.v();
        ryi ryiVar = ryi.a;
        ryh ryhVar = new ryh();
        if ((ryhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ryhVar.y();
        }
        ryi ryiVar2 = (ryi) ryhVar.b;
        rvmVar3.getClass();
        ryiVar2.d = rvmVar3;
        ryiVar2.c = 2;
        if ((ryhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ryhVar.y();
        }
        ryi ryiVar3 = (ryi) ryhVar.b;
        ryiVar3.b |= 1;
        ryiVar3.e = j;
        long j2 = i;
        if ((ryhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ryhVar.y();
        }
        ryi ryiVar4 = (ryi) ryhVar.b;
        ryiVar4.b |= 8;
        ryiVar4.h = j2;
        sgo sgoVar = this.c;
        if (sgn.b(sgoVar.b) != 1) {
            if ((ryhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ryhVar.y();
            }
            ryi ryiVar5 = (ryi) ryhVar.b;
            ryiVar5.g = sgoVar;
            ryiVar5.b |= 4;
        }
        this.d.e((ryi) ryhVar.v());
    }

    @Override // defpackage.zxe
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        int iB;
        String strA;
        int iB2;
        rvm rvmVar = (rvm) obj;
        rxd rxdVar = rvmVar.c;
        if (rxdVar == null) {
            rxdVar = rxd.a;
        }
        if (rxdVar.b == 2) {
            rxd rxdVar2 = rvmVar.c;
            if (rxdVar2 == null) {
                rxdVar2 = rxd.a;
            }
            if (rxdVar2.b != 2 || (iB2 = rxb.b(((Integer) rxdVar2.c).intValue())) == 0) {
                iB2 = 1;
            }
            strA = rxb.a(iB2);
        } else {
            rxd rxdVar3 = rvmVar.c;
            if (rxdVar3 == null) {
                rxdVar3 = rxd.a;
            }
            if (rxdVar3.b != 1 || (iB = rxf.b(((Integer) rxdVar3.c).intValue())) == 0) {
                iB = 1;
            }
            strA = rxf.a(iB);
        }
        zdv zdvVar = (zdv) ((zdv) sxx.a.b().o(zfi.a, "ALT.AudioEventsHolder")).q("com/google/android/libraries/search/audio/state/events/impl/AudioEventsHolderImpl$1", "onSuccess", 158, "AudioEventsHolderImpl.java");
        int i = this.a;
        long j = this.b;
        zdvVar.I("#audio# audio request client(token(%d)) session(token(%d)) stop listening status(%s)", Integer.valueOf(i), Long.valueOf(j), strA);
        ryi ryiVar = ryi.a;
        ryh ryhVar = new ryh();
        if ((ryhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ryhVar.y();
        }
        ryi ryiVar2 = (ryi) ryhVar.b;
        rvmVar.getClass();
        ryiVar2.d = rvmVar;
        ryiVar2.c = 2;
        if ((ryhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ryhVar.y();
        }
        ryi ryiVar3 = (ryi) ryhVar.b;
        ryiVar3.b |= 1;
        ryiVar3.e = j;
        long j2 = i;
        if ((ryhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ryhVar.y();
        }
        ryi ryiVar4 = (ryi) ryhVar.b;
        ryiVar4.b |= 8;
        ryiVar4.h = j2;
        sgo sgoVar = this.c;
        if (sgn.b(sgoVar.b) != 1) {
            if ((ryhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ryhVar.y();
            }
            ryi ryiVar5 = (ryi) ryhVar.b;
            ryiVar5.g = sgoVar;
            ryiVar5.b |= 4;
        }
        this.d.e((ryi) ryhVar.v());
    }
}

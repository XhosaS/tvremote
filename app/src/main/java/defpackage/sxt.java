package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class sxt implements zxe {
    final /* synthetic */ int a;
    final /* synthetic */ long b;
    final /* synthetic */ sgo c;
    final /* synthetic */ sxx d;

    public sxt(sxx sxxVar, int i, long j, sgo sgoVar) {
        this.a = i;
        this.b = j;
        this.c = sgoVar;
        this.d = sxxVar;
    }

    @Override // defpackage.zxe
    public final void a(Throwable th) {
        zdv zdvVar = (zdv) ((zdv) sxx.a.d().o(zfi.a, "ALT.AudioEventsHolder")).q("com/google/android/libraries/search/audio/state/events/impl/AudioEventsHolderImpl$2", "onFailure", 236, "AudioEventsHolderImpl.java");
        int i = this.a;
        long j = this.b;
        zdvVar.A("#audio# cannot retrieve audio request client(token(%d)) session(token(%d)) start listening status", i, j);
        rvk rvkVar = rvk.a;
        rvj rvjVar = new rvj();
        rxj rxjVar = rxj.a;
        rxi rxiVar = new rxi();
        rxh rxhVar = rxh.FAILED_OPENING_ERROR_RETRIEVING_STATUS;
        if ((rxiVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            rxiVar.y();
        }
        rxj rxjVar2 = (rxj) rxiVar.b;
        rxjVar2.c = Integer.valueOf(rxhVar.aq);
        rxjVar2.b = 2;
        rxj rxjVar3 = (rxj) rxiVar.v();
        if ((rvjVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            rvjVar.y();
        }
        rvk rvkVar2 = (rvk) rvjVar.b;
        rxjVar3.getClass();
        rvkVar2.c = rxjVar3;
        rvkVar2.b |= 1;
        rvk rvkVar3 = (rvk) rvjVar.v();
        ryi ryiVar = ryi.a;
        ryh ryhVar = new ryh();
        if ((ryhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ryhVar.y();
        }
        ryi ryiVar2 = (ryi) ryhVar.b;
        rvkVar3.getClass();
        ryiVar2.d = rvkVar3;
        ryiVar2.c = 1;
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
        rxh rxhVarB;
        ruv ruvVar = (ruv) obj;
        Object objF = ruvVar.f();
        rvk rvkVar = (rvk) objF;
        rxj rxjVar = rvkVar.c;
        if (rxjVar == null) {
            rxjVar = rxj.a;
        }
        if (rxjVar.b == 2) {
            rxj rxjVar2 = rvkVar.c;
            if (rxjVar2 == null) {
                rxjVar2 = rxj.a;
            }
            if (rxjVar2.b != 2 || (rxhVarB = rxh.b(((Integer) rxjVar2.c).intValue())) == null) {
                rxhVarB = rxh.UNKNOWN_OPENING_FAILURE;
            }
            strA = rxhVarB.name();
        } else {
            rxj rxjVar3 = rvkVar.c;
            if (rxjVar3 == null) {
                rxjVar3 = rxj.a;
            }
            if (rxjVar3.b != 1 || (iB = rxl.b(((Integer) rxjVar3.c).intValue())) == 0) {
                iB = 1;
            }
            strA = rxl.a(iB);
        }
        zdv zdvVar = (zdv) ((zdv) sxx.a.b().o(zfi.a, "ALT.AudioEventsHolder")).q("com/google/android/libraries/search/audio/state/events/impl/AudioEventsHolderImpl$2", "onSuccess", 218, "AudioEventsHolderImpl.java");
        int i = this.a;
        long j = this.b;
        zdvVar.I("#audio# audio request client(token(%d)) session(token(%d)) start listening status(%s)", Integer.valueOf(i), Long.valueOf(j), strA);
        ryi ryiVar = ryi.a;
        ryh ryhVar = new ryh();
        if ((ryhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ryhVar.y();
        }
        ryi ryiVar2 = (ryi) ryhVar.b;
        objF.getClass();
        ryiVar2.d = objF;
        ryiVar2.c = 1;
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
        sxx sxxVar = this.d;
        sxxVar.e((ryi) ryhVar.v());
        if (ruvVar.c().g()) {
            zxn.p((zyd) ruvVar.c().c(), wyo.f(new sxw(sxxVar, j, i, sgoVar)), sxxVar.b);
        }
    }
}

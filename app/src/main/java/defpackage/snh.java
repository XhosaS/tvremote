package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class snh implements smu {
    public static final snb a = new snb();
    public static final abxc b = ahov.b;
    private final smt c;
    private final ahbt d;

    public snh(smt smtVar, ahbt ahbtVar) {
        ahbtVar.getClass();
        this.c = smtVar;
        this.d = ahbtVar;
    }

    private final ahov C(int i) {
        ahov ahovVar = ahov.a;
        ahon ahonVar = new ahon();
        ahom ahomVar = ahom.a;
        ahol aholVar = new ahol();
        if ((aholVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            aholVar.y();
        }
        ahom ahomVar2 = (ahom) aholVar.b;
        ahomVar2.b |= 2;
        ahomVar2.d = i;
        ahom ahomVarA = ahoc.a(aholVar);
        if ((ahonVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ahonVar.y();
        }
        ahov ahovVar2 = (ahov) ahonVar.b;
        ahovVar2.h = ahomVarA;
        ahovVar2.c |= 128;
        return ahod.a(ahonVar);
    }

    private final void D(rqs rqsVar, Integer num) {
        if (num != null) {
            ((rqt) rqsVar).i("listening", num.toString());
        }
    }

    static /* synthetic */ ahov z(sgo sgoVar, int i, rvw rvwVar, rzf rzfVar, int i2) {
        ahov ahovVar = ahov.a;
        ahon ahonVar = new ahon();
        snb snbVar = a;
        ahod.b(snbVar.a(sgoVar), ahonVar);
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if (i != 0) {
            ahod.c(i, ahonVar);
        }
        if ((i2 & 8) != 0) {
            rzfVar = null;
        }
        ahor ahorVar = ahor.a;
        ahoq ahoqVar = new ahoq();
        if (rzfVar != null) {
            int i3 = rzfVar.c;
            if ((ahoqVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ahoqVar.y();
            }
            ahor ahorVar2 = (ahor) ahoqVar.b;
            ahorVar2.b |= 4;
            ahorVar2.e = i3;
        }
        if ((i2 & 4) != 0) {
            rvwVar = null;
        }
        if (rvwVar != null) {
            int iB = snbVar.b(rvwVar);
            if ((ahoqVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ahoqVar.y();
            }
            ahor ahorVar3 = (ahor) ahoqVar.b;
            ahorVar3.d = iB - 1;
            ahorVar3.b |= 2;
        }
        ahor ahorVarA = ahoe.a(ahoqVar);
        if ((ahonVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ahonVar.y();
        }
        ahov ahovVar2 = (ahov) ahonVar.b;
        ahovVar2.f = ahorVarA;
        ahovVar2.c |= 32;
        return ahod.a(ahonVar);
    }

    public final void A(rqs rqsVar, long j) {
        ((rqt) rqsVar).i("listening", String.valueOf(j));
    }

    public final void B(rqs rqsVar, rxj rxjVar) {
        int iB;
        int i = rxjVar.b;
        if (i == 2) {
            rxh rxhVarB = rxh.b(((Integer) rxjVar.c).intValue());
            if (rxhVarB == null) {
                rxhVarB = rxh.UNKNOWN_OPENING_FAILURE;
            }
            rqsVar.a(rxhVarB.aq, "start_listening_failure");
            return;
        }
        int i2 = 1;
        if (i == 1 && (iB = rxl.b(((Integer) rxjVar.c).intValue())) != 0) {
            i2 = iB;
        }
        rqsVar.a(i2 - 1, "start_listening_success");
    }

    @Override // defpackage.smu
    public final void a(String str, int i) {
        rqs rqsVarB = rpp.i().b(abqb.OK);
        rqt rqtVar = (rqt) rqsVarB;
        rqtVar.i("buffer", str);
        rqtVar.f(b, C(i));
        sgo sgoVar = sgo.a;
        x(rqsVarB, sgp.a(new sgm()));
    }

    @Override // defpackage.smu
    public final void b(String str, int i) {
        rqs rqsVarA = rpp.a();
        rqt rqtVar = (rqt) rqsVarA;
        rqtVar.i("buffer", str);
        rqtVar.f(b, C(i));
        sgo sgoVar = sgo.a;
        x(rqsVarA, sgp.a(new sgm()));
    }

    @Override // defpackage.smu
    public final void c(String str, int i) {
        rqs rqsVarB = rpp.b();
        rqt rqtVar = (rqt) rqsVarB;
        rqtVar.i("buffer", str);
        rqtVar.f(b, C(i));
        sgo sgoVar = sgo.a;
        x(rqsVarB, sgp.a(new sgm()));
    }

    @Override // defpackage.smu
    public final void d(String str) {
        rqs rqsVarC = rpp.c();
        ((rqt) rqsVarC).i("buffer", str);
        sgo sgoVar = sgo.a;
        x(rqsVarC, sgp.a(new sgm()));
    }

    @Override // defpackage.smu
    public final void e(String str, int i) {
        rqs rqsVarD = rpp.d();
        rqt rqtVar = (rqt) rqsVarD;
        rqtVar.i("buffer", str);
        rqtVar.f(b, C(i));
        sgo sgoVar = sgo.a;
        x(rqsVarD, sgp.a(new sgm()));
    }

    @Override // defpackage.smu
    public final void f(String str, Integer num) {
        rqs rqsVarE = rpp.e();
        rqt rqtVar = (rqt) rqsVarE;
        rqtVar.i("buffer", str);
        if (num != null) {
            abxc abxcVar = b;
            ahov ahovVar = ahov.a;
            ahon ahonVar = new ahon();
            ahom ahomVar = ahom.a;
            ahol aholVar = new ahol();
            int iIntValue = num.intValue();
            if ((aholVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                aholVar.y();
            }
            ahom ahomVar2 = (ahom) aholVar.b;
            ahomVar2.b |= 1;
            ahomVar2.c = iIntValue;
            ahom ahomVarA = ahoc.a(aholVar);
            if ((ahonVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ahonVar.y();
            }
            ahov ahovVar2 = (ahov) ahonVar.b;
            ahovVar2.h = ahomVarA;
            ahovVar2.c |= 128;
            rqtVar.f(abxcVar, ahod.a(ahonVar));
        }
        sgo sgoVar = sgo.a;
        x(rqsVarE, sgp.a(new sgm()));
    }

    @Override // defpackage.smu
    public final void g(String str, int i) {
        rqs rqsVarF = rpp.f();
        rqt rqtVar = (rqt) rqsVarF;
        rqtVar.i("buffer", str);
        abxc abxcVar = b;
        ahov ahovVar = ahov.a;
        ahon ahonVar = new ahon();
        ahom ahomVar = ahom.a;
        ahol aholVar = new ahol();
        if ((aholVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            aholVar.y();
        }
        ahom ahomVar2 = (ahom) aholVar.b;
        ahomVar2.b |= 4;
        ahomVar2.e = i;
        ahom ahomVarA = ahoc.a(aholVar);
        if ((ahonVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ahonVar.y();
        }
        ahov ahovVar2 = (ahov) ahonVar.b;
        ahovVar2.h = ahomVarA;
        ahovVar2.c |= 128;
        rqtVar.f(abxcVar, ahod.a(ahonVar));
        sgo sgoVar = sgo.a;
        x(rqsVarF, sgp.a(new sgm()));
    }

    @Override // defpackage.smu
    public final void h(sgo sgoVar, int i, swl swlVar) {
        rqo rqoVar = rpp.a;
        rqt rqtVar = new rqt(new rpz("AUDIO_FOCUS_ACQUIRE_STARTED", true, yqt.i(120000L), 124, rpq.AUDIO_FOCUS_ACQUIRE, rpp.b, rpp.a, rpp.c, rpp.d));
        rqtVar.i("focus_acquire", String.valueOf(i));
        abxc abxcVar = b;
        ahov ahovVar = ahov.a;
        ahon ahonVar = new ahon();
        ahod.b(a.a(sgoVar), ahonVar);
        ahog ahogVar = ahog.a;
        ahof ahofVar = new ahof();
        rua ruaVar = rua.a;
        rtz rtzVar = new rtz();
        if ((swlVar.b & 1) != 0) {
            int i2 = swlVar.c;
            if ((rtzVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                rtzVar.y();
            }
            rua ruaVar2 = (rua) rtzVar.b;
            ruaVar2.b |= 1;
            ruaVar2.c = i2;
        }
        if ((swlVar.b & 2) != 0) {
            boolean z = swlVar.d;
            if ((rtzVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                rtzVar.y();
            }
            rua ruaVar3 = (rua) rtzVar.b;
            ruaVar3.b |= 4;
            ruaVar3.e = z;
        }
        if ((swlVar.b & 4) != 0) {
            boolean z2 = swlVar.e;
            if ((rtzVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                rtzVar.y();
            }
            rua ruaVar4 = (rua) rtzVar.b;
            ruaVar4.b |= 8;
            ruaVar4.f = z2;
        }
        if ((swlVar.b & 16) != 0) {
            int i3 = swlVar.g;
            if ((rtzVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                rtzVar.y();
            }
            rua ruaVar5 = (rua) rtzVar.b;
            ruaVar5.b |= 32;
            ruaVar5.h = i3;
        }
        if ((swlVar.b & 8) != 0) {
            int i4 = swlVar.f;
            if ((rtzVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                rtzVar.y();
            }
            rua ruaVar6 = (rua) rtzVar.b;
            ruaVar6.b |= 2;
            ruaVar6.d = i4;
        }
        abxd abxdVarV = rtzVar.v();
        abxdVarV.getClass();
        rua ruaVar7 = (rua) abxdVarV;
        if ((ahofVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ahofVar.y();
        }
        ahog ahogVar2 = (ahog) ahofVar.b;
        ahogVar2.c = ruaVar7;
        ahogVar2.b |= 1;
        abxd abxdVarV2 = ahofVar.v();
        abxdVarV2.getClass();
        ahog ahogVar3 = (ahog) abxdVarV2;
        if ((ahonVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ahonVar.y();
        }
        ahov ahovVar2 = (ahov) ahonVar.b;
        ahovVar2.i = ahogVar3;
        ahovVar2.c |= 512;
        rqtVar.f(abxcVar, ahod.a(ahonVar));
        x(rqtVar, sgoVar);
    }

    @Override // defpackage.smu
    public final void i(int i, int i2, smv smvVar, Duration duration) {
        rqo rqoVar = rpp.a;
        rqt rqtVar = new rqt(new rpz("AUDIO_LEVEL_METRICS_EVENT", false, ypv.a, 146, rpq.NONE, rpp.b, rpp.a, rpp.c, rpp.d));
        D(rqtVar, smvVar.b);
        abxc abxcVar = b;
        ahov ahovVar = ahov.a;
        ahon ahonVar = new ahon();
        ahok ahokVar = ahok.a;
        ahoj ahojVar = new ahoj();
        if ((ahojVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ahojVar.y();
        }
        ahok ahokVar2 = (ahok) ahojVar.b;
        ahokVar2.b |= 1;
        ahokVar2.c = i;
        if ((ahojVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ahojVar.y();
        }
        ahok ahokVar3 = (ahok) ahojVar.b;
        ahokVar3.b |= 2;
        ahokVar3.d = i2;
        abxd abxdVarV = ahojVar.v();
        abxdVarV.getClass();
        ahok ahokVar4 = (ahok) abxdVarV;
        if ((ahonVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ahonVar.y();
        }
        ahov ahovVar2 = (ahov) ahonVar.b;
        ahovVar2.k = ahokVar4;
        ahovVar2.c |= 4096;
        rqtVar.f(abxcVar, ahod.a(ahonVar));
        rqtVar.c = yqt.i(duration);
        x(rqtVar, smvVar.a);
    }

    @Override // defpackage.smu
    public final void j(smv smvVar) {
        rqs rqsVarG = rpp.g();
        rqsVarG.b(abqb.UNKNOWN);
        D(rqsVarG, smvVar.b);
        x(rqsVarG, smvVar.a);
    }

    @Override // defpackage.smu
    public final void k(smv smvVar) {
        rqs rqsVarG = rpp.g();
        rqsVarG.b(abqb.OK);
        D(rqsVarG, smvVar.b);
        x(rqsVarG, smvVar.a);
    }

    @Override // defpackage.smu
    public final void l(smv smvVar) {
        rqs rqsVarH = rpp.h();
        rqsVarH.b(abqb.OK);
        D(rqsVarH, smvVar.b);
        x(rqsVarH, smvVar.a);
    }

    @Override // defpackage.smu
    public final void m(smv smvVar) {
        rqs rqsVarH = rpp.h();
        rqsVarH.b(abqb.UNKNOWN);
        D(rqsVarH, smvVar.b);
        x(rqsVarH, smvVar.a);
    }

    @Override // defpackage.smu
    public final void n(smv smvVar) {
        rqo rqoVar = rpp.a;
        rqt rqtVar = new rqt(new rpz("FETCHING_AUDIO_RECORD_PREFERRED_DEVICE", false, ypv.a, 142, rpq.NONE, rpp.b, rpp.a, rpp.c, rpp.d));
        D(rqtVar, smvVar.b);
        x(rqtVar, smvVar.a);
    }

    @Override // defpackage.smu
    public final void o(sgo sgoVar, rux ruxVar, long j, rvf rvfVar, sjs sjsVar) {
        sne sneVar = new sne(this, sgoVar, j, sjsVar, rvfVar, ruxVar, null);
        ahbt ahbtVar = this.d;
        ahal.e(ahbtVar, null, 0, sneVar, 3);
        ahal.e(ahbtVar, null, 0, new snf(this, sgoVar, j, ruxVar, null), 3);
    }

    @Override // defpackage.smu
    public final void p(sgo sgoVar, Integer num, rvw rvwVar, zyd zydVar) {
        ahal.e(this.d, null, 0, new sng(this, sgoVar, num, rvwVar, zydVar, null), 3);
    }

    @Override // defpackage.smu
    public final void q(sgo sgoVar, Integer num) {
        rqo rqoVar = rpp.a;
        rqt rqtVar = new rqt(new rpz("AUDIO_ROUTE_DISCONNECT_STARTED", true, yqt.i(120000L), 103, rpq.AUDIO_ROUTE_DISCONNECT, rpp.b, rpp.a, rpp.c, rpp.d));
        rqtVar.i("route_disconnect", y(num));
        x(rqtVar, sgoVar);
    }

    @Override // defpackage.smu
    public final void r(smv smvVar) {
        rqo rqoVar = rpp.a;
        rqt rqtVar = new rqt(new rpz("SETTING_AUDIO_RECORD_PREFERRED_DEVICE", false, ypv.a, 144, rpq.NONE, rpp.b, rpp.a, rpp.c, rpp.d));
        D(rqtVar, smvVar.b);
        x(rqtVar, smvVar.a);
    }

    @Override // defpackage.smu
    public final void s(sgo sgoVar, long j) {
        rqo rqoVar = rpp.a;
        rqt rqtVar = new rqt(new rpz("AUDIO_STOP_LISTENING_STARTED", false, ypv.a, 108, rpq.NONE, rpp.b, rpp.a, rpp.c, rpp.d));
        A(rqtVar, j);
        x(rqtVar, sgoVar);
    }

    @Override // defpackage.smu
    public final void t(smv smvVar, rxj rxjVar) {
        rqo rqoVar = rpp.a;
        rqt rqtVar = new rqt(new rpz("ZLM_AUDIO_SOURCE_OPEN_DONE", false, ypv.a, 130, rpq.NONE, rpp.b, rpp.a, rpp.c, rpp.d));
        B(rqtVar, rxjVar);
        D(rqtVar, smvVar.b);
        x(rqtVar, smvVar.a);
    }

    @Override // defpackage.smu
    public final void u(sgo sgoVar, int i, int i2) {
        rqo rqoVar = rpp.a;
        rqt rqtVar = new rqt(new rpz("AUDIO_FOCUS_RELEASE_STARTED", true, yqt.i(120000L), 126, rpq.AUDIO_FOCUS_RELEASE, rpp.b, rpp.a, rpp.c, rpp.d));
        rqtVar.i("focus_release", String.valueOf(i));
        abxc abxcVar = b;
        ahov ahovVar = ahov.a;
        ahon ahonVar = new ahon();
        ahod.b(a.a(sgoVar), ahonVar);
        ahoi ahoiVar = ahoi.a;
        ahoh ahohVar = new ahoh();
        if ((ahohVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ahohVar.y();
        }
        ahoi ahoiVar2 = (ahoi) ahohVar.b;
        ahoiVar2.c = i2 - 1;
        ahoiVar2.b |= 1;
        abxd abxdVarV = ahohVar.v();
        abxdVarV.getClass();
        ahoi ahoiVar3 = (ahoi) abxdVarV;
        if ((ahonVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ahonVar.y();
        }
        ahov ahovVar2 = (ahov) ahonVar.b;
        ahovVar2.j = ahoiVar3;
        ahovVar2.c |= 1024;
        rqtVar.f(abxcVar, ahod.a(ahonVar));
        x(rqtVar, sgoVar);
    }

    @Override // defpackage.smu
    public final void v(sgo sgoVar, long j, Duration duration) {
        rqo rqoVar = rpp.a;
        rqt rqtVar = new rqt(new rpz("AUDIO_START_LISTENING_STARTED", true, yqt.i(3600000L), 105, rpq.AUDIO_LISTENING, rpp.b, rpp.a, rpp.c, rpp.d));
        A(rqtVar, j);
        rqtVar.f(b, z(sgoVar, 0, null, null, 14));
        rqtVar.c = yqt.i(Duration.ofNanos(duration.toNanos()));
        x(rqtVar, sgoVar);
    }

    @Override // defpackage.smu
    public final void w(sgo sgoVar, int i, sdj sdjVar) {
        snc sncVar = new snc(this, sgoVar, i, sdjVar, null);
        ahbt ahbtVar = this.d;
        ahal.e(ahbtVar, null, 0, sncVar, 3);
        ahal.e(ahbtVar, null, 0, new snd(this, sgoVar, i, sdjVar, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0102  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void x(defpackage.rqs r10, defpackage.sgo r11) {
        /*
            Method dump skipped, instructions count: 520
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.snh.x(rqs, sgo):void");
    }

    public final String y(Integer num) {
        String string = num.toString();
        return string == null ? "hotword" : string;
    }
}

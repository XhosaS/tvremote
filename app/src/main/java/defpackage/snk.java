package defpackage;

import j$.time.Duration;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class snk implements smw {
    public final sxr a;
    public final smy b;
    public final szs c;
    private final smu d;
    private final ahbt e;
    private final mcw f;

    public snk(sxr sxrVar, smy smyVar, smu smuVar, mcw mcwVar, szs szsVar, ahbt ahbtVar) {
        sxrVar.getClass();
        smuVar.getClass();
        mcwVar.getClass();
        szsVar.getClass();
        ahbtVar.getClass();
        this.a = sxrVar;
        this.b = smyVar;
        this.d = smuVar;
        this.f = mcwVar;
        this.c = szsVar;
        this.e = ahbtVar;
    }

    @Override // defpackage.smw
    public final void A(sdo sdoVar, sdj sdjVar, sgo sgoVar) {
        sdoVar.getClass();
        sgoVar.getClass();
        this.d.w(sgoVar, sdoVar.c, sdjVar);
        this.a.d(sdjVar, sdoVar, sgoVar);
        smy smyVar = this.b;
        zyd zydVarI = zxn.i(sdjVar.e);
        snr snrVar = (snr) smyVar;
        zxe zxeVarF = wyo.f(new snp(snrVar, sgoVar));
        Executor executor = snrVar.c;
        zxn.p(zydVarI, zxeVarF, executor);
        zxn.p(zxn.i(sdjVar.f), wyo.f(new snq(snrVar, sgoVar)), executor);
    }

    @Override // defpackage.smw
    public final void B(String str, int i, int i2) {
        str.getClass();
        this.d.g(str, i);
        ryg rygVar = ryg.a;
        ryf ryfVar = new ryf();
        rxq rxqVar = rxq.a;
        rxp rxpVar = new rxp();
        rsl.b(101, rxpVar);
        if ((rxpVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            rxpVar.y();
        }
        rxq rxqVar2 = (rxq) rxpVar.b;
        rxqVar2.b |= 2;
        rxqVar2.d = str;
        if ((rxpVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            rxpVar.y();
        }
        rxq rxqVar3 = (rxq) rxpVar.b;
        rxqVar3.b |= 4;
        rxqVar3.e = i2;
        rxq rxqVarA = rsl.a(rxpVar);
        if ((ryfVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ryfVar.y();
        }
        sxr sxrVar = this.a;
        ryg rygVar2 = (ryg) ryfVar.b;
        rygVar2.d = rxqVarA;
        rygVar2.c = 3;
        sxrVar.c(ryy.a(ryfVar));
    }

    @Override // defpackage.smw
    public final void C(int i) {
        rye ryeVar = rye.a;
        ryd rydVar = new ryd();
        ryx.b(3, rydVar);
        if ((rydVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            rydVar.y();
        }
        long j = i;
        rye ryeVar2 = (rye) rydVar.b;
        ryeVar2.b |= 2;
        ryeVar2.f = j;
        if ((rydVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            rydVar.y();
        }
        sxr sxrVar = this.a;
        rye ryeVar3 = (rye) rydVar.b;
        ryeVar3.j = 2;
        ryeVar3.b |= 32;
        sxrVar.b(ryx.a(rydVar));
    }

    @Override // defpackage.smw
    public final void D(int i, rvc rvcVar) {
        rye ryeVar = rye.a;
        ryd rydVar = new ryd();
        ryx.b(3, rydVar);
        if ((rydVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            rydVar.y();
        }
        long j = i;
        rye ryeVar2 = (rye) rydVar.b;
        ryeVar2.b |= 2;
        ryeVar2.f = j;
        if ((rydVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            rydVar.y();
        }
        rye ryeVar3 = (rye) rydVar.b;
        ryeVar3.j = 5;
        ryeVar3.b |= 32;
        sgo sgoVar = rvcVar.c;
        if (sgoVar == null) {
            sgoVar = sgo.a;
        }
        sgoVar.getClass();
        if ((rydVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            rydVar.y();
        }
        sxr sxrVar = this.a;
        rye ryeVar4 = (rye) rydVar.b;
        ryeVar4.k = sgoVar;
        ryeVar4.b |= 64;
        sxrVar.b(ryx.a(rydVar));
    }

    @Override // defpackage.smw
    public final void a(String str, int i) {
        str.getClass();
        this.d.a(str, i);
        ryg rygVar = ryg.a;
        ryf ryfVar = new ryf();
        rxq rxqVar = rxq.a;
        rxp rxpVar = new rxp();
        rsl.b(2, rxpVar);
        if ((rxpVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            rxpVar.y();
        }
        rxq rxqVar2 = (rxq) rxpVar.b;
        rxqVar2.b = 2 | rxqVar2.b;
        rxqVar2.d = str;
        if ((rxpVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            rxpVar.y();
        }
        rxq rxqVar3 = (rxq) rxpVar.b;
        rxqVar3.b |= 4;
        rxqVar3.e = i;
        rxq rxqVarA = rsl.a(rxpVar);
        if ((ryfVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ryfVar.y();
        }
        sxr sxrVar = this.a;
        ryg rygVar2 = (ryg) ryfVar.b;
        rygVar2.d = rxqVarA;
        rygVar2.c = 3;
        sxrVar.c(ryy.a(ryfVar));
        snr snrVar = (snr) this.b;
        ((uqq) ((sor) snrVar.b.a()).c.eV()).b(i, (String) snrVar.d.eV());
    }

    @Override // defpackage.smw
    public final void b(String str, int i) {
        str.getClass();
        this.d.b(str, i);
        ryg rygVar = ryg.a;
        ryf ryfVar = new ryf();
        rxq rxqVar = rxq.a;
        rxp rxpVar = new rxp();
        rsl.b(7, rxpVar);
        if ((rxpVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            rxpVar.y();
        }
        rxq rxqVar2 = (rxq) rxpVar.b;
        rxqVar2.b |= 2;
        rxqVar2.d = str;
        if ((rxpVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            rxpVar.y();
        }
        rxq rxqVar3 = (rxq) rxpVar.b;
        rxqVar3.b |= 4;
        rxqVar3.e = i;
        rxq rxqVarA = rsl.a(rxpVar);
        if ((ryfVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ryfVar.y();
        }
        sxr sxrVar = this.a;
        ryg rygVar2 = (ryg) ryfVar.b;
        rygVar2.d = rxqVarA;
        rygVar2.c = 3;
        sxrVar.c(ryy.a(ryfVar));
    }

    @Override // defpackage.smw
    public final void c(String str, int i) {
        str.getClass();
        this.d.c(str, i);
        ryg rygVar = ryg.a;
        ryf ryfVar = new ryf();
        rxq rxqVar = rxq.a;
        rxp rxpVar = new rxp();
        rsl.b(4, rxpVar);
        if ((rxpVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            rxpVar.y();
        }
        rxq rxqVar2 = (rxq) rxpVar.b;
        rxqVar2.b |= 2;
        rxqVar2.d = str;
        if ((rxpVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            rxpVar.y();
        }
        rxq rxqVar3 = (rxq) rxpVar.b;
        rxqVar3.b = 4 | rxqVar3.b;
        rxqVar3.e = i;
        rxq rxqVarA = rsl.a(rxpVar);
        if ((ryfVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ryfVar.y();
        }
        sxr sxrVar = this.a;
        ryg rygVar2 = (ryg) ryfVar.b;
        rygVar2.d = rxqVarA;
        rygVar2.c = 3;
        sxrVar.c(ryy.a(ryfVar));
        this.b.a();
    }

    @Override // defpackage.smw
    public final void d(String str) {
        str.getClass();
        this.d.d(str);
    }

    @Override // defpackage.smw
    public final void e(String str, int i) {
        str.getClass();
        this.d.e(str, i);
        ryg rygVar = ryg.a;
        ryf ryfVar = new ryf();
        rxq rxqVar = rxq.a;
        rxp rxpVar = new rxp();
        rsl.b(3, rxpVar);
        if ((rxpVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            rxpVar.y();
        }
        rxq rxqVar2 = (rxq) rxpVar.b;
        rxqVar2.b |= 2;
        rxqVar2.d = str;
        if ((rxpVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            rxpVar.y();
        }
        rxq rxqVar3 = (rxq) rxpVar.b;
        rxqVar3.b |= 4;
        rxqVar3.e = i;
        rxq rxqVarA = rsl.a(rxpVar);
        if ((ryfVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ryfVar.y();
        }
        sxr sxrVar = this.a;
        ryg rygVar2 = (ryg) ryfVar.b;
        rygVar2.d = rxqVarA;
        rygVar2.c = 3;
        sxrVar.c(ryy.a(ryfVar));
        this.b.a();
    }

    @Override // defpackage.smw
    public final void f(String str, int i) {
        smu smuVar = this.d;
        Integer numValueOf = Integer.valueOf(i);
        smuVar.f(str, numValueOf);
        ryg rygVar = ryg.a;
        ryf ryfVar = new ryf();
        rxq rxqVar = rxq.a;
        rxp rxpVar = new rxp();
        rsl.b(5, rxpVar);
        if ((rxpVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            rxpVar.y();
        }
        rxq rxqVar2 = (rxq) rxpVar.b;
        rxqVar2.b |= 8;
        rxqVar2.f = i;
        rxq rxqVarA = rsl.a(rxpVar);
        if ((ryfVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ryfVar.y();
        }
        sxr sxrVar = this.a;
        ryg rygVar2 = (ryg) ryfVar.b;
        rygVar2.d = rxqVarA;
        rygVar2.c = 3;
        sxrVar.c(ryy.a(ryfVar));
        snr snrVar = (snr) this.b;
        ((uqo) ((sor) snrVar.b.a()).k.eV()).a(1L, (String) snrVar.d.eV(), numValueOf);
    }

    @Override // defpackage.smw
    public final void g(String str) {
        ryg rygVar = ryg.a;
        ryf ryfVar = new ryf();
        rxq rxqVar = rxq.a;
        rxp rxpVar = new rxp();
        rsl.b(6, rxpVar);
        rxq rxqVarA = rsl.a(rxpVar);
        if ((ryfVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ryfVar.y();
        }
        sxr sxrVar = this.a;
        ryg rygVar2 = (ryg) ryfVar.b;
        rygVar2.d = rxqVarA;
        rygVar2.c = 3;
        sxrVar.c(ryy.a(ryfVar));
        this.d.f(str, null);
    }

    @Override // defpackage.smw
    public final void h(int i, rvc rvcVar) {
        rye ryeVar = rye.a;
        ryd rydVar = new ryd();
        ryx.b(2, rydVar);
        if ((rydVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            rydVar.y();
        }
        long j = i;
        rye ryeVar2 = (rye) rydVar.b;
        ryeVar2.b = 2 | ryeVar2.b;
        ryeVar2.f = j;
        if ((rydVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            rydVar.y();
        }
        sxr sxrVar = this.a;
        rye ryeVar3 = (rye) rydVar.b;
        ryeVar3.d = rvcVar;
        ryeVar3.c = 200;
        sxrVar.b(ryx.a(rydVar));
        smy smyVar = this.b;
        sgo sgoVar = rvcVar.c;
        if (sgoVar == null) {
            sgoVar = sgo.a;
        }
        sgoVar.getClass();
        smyVar.b(sgoVar, "AUDIO_REQUEST");
    }

    @Override // defpackage.smw
    public final void i(sdo sdoVar, swl swlVar, sgo sgoVar) {
        sdoVar.getClass();
        sgoVar.getClass();
        this.d.h(sgoVar, sdoVar.c, swlVar);
        rye ryeVar = rye.a;
        ryd rydVar = new ryd();
        ryx.b(105, rydVar);
        if ((rydVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            rydVar.y();
        }
        rye ryeVar2 = (rye) rydVar.b;
        ryeVar2.k = sgoVar;
        ryeVar2.b |= 64;
        if ((rydVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            rydVar.y();
        }
        rye ryeVar3 = (rye) rydVar.b;
        ryeVar3.d = swlVar;
        ryeVar3.c = 206;
        if ((rydVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            rydVar.y();
        }
        sxr sxrVar = this.a;
        rye ryeVar4 = (rye) rydVar.b;
        ryeVar4.i = sdoVar;
        ryeVar4.b |= 16;
        sxrVar.b(ryx.a(rydVar));
        this.b.b(sgoVar, "AUDIO_FOCUS");
    }

    @Override // defpackage.smw
    public final void j(sgo sgoVar, ruo ruoVar) {
        ruoVar.getClass();
        sor sorVar = (sor) ((snr) this.b).b.a();
        String string = Integer.toString(ruoVar.e);
        String string2 = Integer.toString(ruoVar.d);
        String string3 = Integer.toString(ruoVar.f);
        int iB = sgn.b(sgoVar.b);
        if (iB == 0) {
            throw null;
        }
        ((uqo) sorVar.e.eV()).a(1L, string, string2, string3, sgn.a(iB));
    }

    @Override // defpackage.smw
    public final void k(int i, int i2, smv smvVar, Duration duration) {
        this.d.i(i, i2, smvVar, duration);
    }

    @Override // defpackage.smw
    public final void l(smv smvVar) {
        this.d.j(smvVar);
    }

    @Override // defpackage.smw
    public final void m(smv smvVar) {
        this.d.k(smvVar);
    }

    @Override // defpackage.smw
    public final void n(smv smvVar) {
        this.d.l(smvVar);
    }

    @Override // defpackage.smw
    public final void o(smv smvVar) {
        this.d.m(smvVar);
    }

    @Override // defpackage.smw
    public final void p(sxb sxbVar) {
        sgo sgoVar = sxbVar.b.c;
        if (sgoVar == null) {
            sgoVar = sgo.a;
        }
        smu smuVar = this.d;
        sgoVar.getClass();
        smuVar.q(sgoVar, Integer.valueOf(sxbVar.a));
    }

    @Override // defpackage.smw
    public final void q(sxe sxeVar) {
        sxg sxgVar = (sxg) sxeVar;
        sxb sxbVar = sxgVar.e;
        sgo sgoVar = sxbVar.b.c;
        if (sgoVar == null) {
            sgoVar = sgo.a;
        }
        sgoVar.getClass();
        int i = sxbVar.a;
        rvt rvtVar = sxgVar.f;
        Integer numValueOf = Integer.valueOf(i);
        rvw rvwVar = rvtVar.c;
        if (rvwVar == null) {
            rvwVar = rvw.a;
        }
        smu smuVar = this.d;
        rvwVar.getClass();
        zyd zydVarI = zxn.i(((sww) sxgVar.b).a);
        zydVarI.getClass();
        smuVar.p(sgoVar, numValueOf, rvwVar, zydVarI);
    }

    @Override // defpackage.smw
    public final void r(sra sraVar) {
        srd srdVar = (srd) sraVar;
        sqx sqxVar = srdVar.b;
        rvc rvcVar = sqxVar.b;
        sgo sgoVar = rvcVar.c;
        if (sgoVar == null) {
            sgoVar = sgo.a;
        }
        sgo sgoVar2 = sgoVar;
        smu smuVar = this.d;
        sgoVar2.getClass();
        rux ruxVar = srdVar.a;
        long j = srdVar.d;
        smuVar.o(sgoVar2, ruxVar, j, srdVar.f, srdVar.c.b);
        sxr sxrVar = this.a;
        int i = sqxVar.a;
        sgo sgoVar3 = rvcVar.c;
        if (sgoVar3 == null) {
            sgoVar3 = sgo.a;
        }
        sgo sgoVar4 = sgoVar3;
        sgoVar4.getClass();
        sxrVar.a(ruxVar, i, j, sgoVar4);
        smy smyVar = this.b;
        sgo sgoVar5 = rvcVar.c;
        if (sgoVar5 == null) {
            sgoVar5 = sgo.a;
        }
        sgoVar5.getClass();
        rxh rxhVar = rxh.FAILED_OPENING_ERROR_RETRIEVING_STATUS;
        zyd zydVarB = ruxVar.b();
        snr snrVar = (snr) smyVar;
        zxe zxeVarF = wyo.f(new snn(snrVar, sgoVar5, rxhVar));
        Executor executor = snrVar.c;
        zxn.p(zydVarB, zxeVarF, executor);
        zxn.p(((ruw) ruxVar.c()).a(), wyo.f(new sno(snrVar, sgoVar5)), executor);
    }

    @Override // defpackage.smw
    public final void s(sra sraVar, rxn rxnVar) {
        srb srbVar = (srb) sraVar;
        sqx sqxVar = srbVar.b;
        rvc rvcVar = sqxVar.b;
        sgo sgoVar = rvcVar.c;
        if (sgoVar == null) {
            sgoVar = sgo.a;
        }
        smu smuVar = this.d;
        sgoVar.getClass();
        long j = srbVar.d;
        smuVar.s(sgoVar, j);
        sxr sxrVar = this.a;
        rye ryeVar = rye.a;
        ryd rydVar = new ryd();
        ryx.b(102, rydVar);
        int i = sqxVar.a;
        if ((rydVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            rydVar.y();
        }
        long j2 = i;
        rye ryeVar2 = (rye) rydVar.b;
        ryeVar2.b |= 2;
        ryeVar2.f = j2;
        if ((rydVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            rydVar.y();
        }
        rye ryeVar3 = (rye) rydVar.b;
        ryeVar3.b |= 4;
        ryeVar3.g = j;
        if ((rydVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            rydVar.y();
        }
        rye ryeVar4 = (rye) rydVar.b;
        ryeVar4.h = rxnVar.s;
        ryeVar4.b |= 8;
        sgo sgoVar2 = rvcVar.c;
        if (sgoVar2 == null) {
            sgoVar2 = sgo.a;
        }
        sgoVar2.getClass();
        if ((rydVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            rydVar.y();
        }
        rye ryeVar5 = (rye) rydVar.b;
        ryeVar5.k = sgoVar2;
        ryeVar5.b |= 64;
        sxrVar.b(ryx.a(rydVar));
    }

    @Override // defpackage.smw
    public final void t(sgo sgoVar, zyd zydVar, zyd zydVar2, rvw rvwVar) {
        snr snrVar = (snr) this.b;
        zxn.p(zydVar2, wyo.f(new snm(snrVar, yrn.c(snrVar.e), sgoVar, rvwVar)), snrVar.c);
        snj snjVar = new snj(this, sgoVar, zydVar, zydVar2, null);
        ahbt ahbtVar = this.e;
        ahal.e(ahbtVar, null, 0, snjVar, 3);
        ahal.e(ahbtVar, null, 0, new sni(this, zydVar, zydVar2, null), 3);
    }

    @Override // defpackage.smw
    public final void u(sgo sgoVar) {
        sor sorVar = (sor) ((snr) this.b).b.a();
        int iB = sgn.b(sgoVar.b);
        if (iB == 0) {
            throw null;
        }
        ((uqo) sorVar.j.eV()).a(1L, sgn.a(iB));
    }

    @Override // defpackage.smw
    public final void v(smv smvVar) {
        this.d.n(smvVar);
    }

    @Override // defpackage.smw
    public final void w(smv smvVar) {
        this.d.r(smvVar);
    }

    @Override // defpackage.smw
    public final void x(smv smvVar, rxh rxhVar) {
        rxj rxjVarA;
        if (rxhVar != null) {
            rxj rxjVar = rxj.a;
            rxi rxiVar = new rxi();
            rwz.b(rxhVar, rxiVar);
            rxjVarA = rwz.a(rxiVar);
        } else {
            rxj rxjVar2 = rxj.a;
            rxi rxiVar2 = new rxi();
            rwz.c(2, rxiVar2);
            rxjVarA = rwz.a(rxiVar2);
        }
        this.d.t(smvVar, rxjVarA);
    }

    @Override // defpackage.smw
    public final void y(sdo sdoVar, sgo sgoVar, int i) {
        this.d.u(sgoVar, sdoVar.c, i);
        rye ryeVar = rye.a;
        ryd rydVar = new ryd();
        ryx.b(106, rydVar);
        if ((rydVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            rydVar.y();
        }
        sxr sxrVar = this.a;
        rye ryeVar2 = (rye) rydVar.b;
        ryeVar2.i = sdoVar;
        ryeVar2.b |= 16;
        sxrVar.b(ryx.a(rydVar));
    }

    @Override // defpackage.smw
    public final void z(sqx sqxVar, sru sruVar, rvf rvfVar, int i) {
        rvc rvcVar = sqxVar.b;
        sgo sgoVar = rvcVar.c;
        if (sgoVar == null) {
            sgoVar = sgo.a;
        }
        smu smuVar = this.d;
        sgoVar.getClass();
        long j = i;
        Duration durationOfNanos = Duration.ofNanos(this.f.a());
        durationOfNanos.getClass();
        smuVar.v(sgoVar, j, durationOfNanos);
        sxr sxrVar = this.a;
        rye ryeVar = rye.a;
        ryd rydVar = new ryd();
        ryx.b(101, rydVar);
        if ((rydVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            rydVar.y();
        }
        rye ryeVar2 = (rye) rydVar.b;
        ryeVar2.d = rvfVar;
        ryeVar2.c = 201;
        int i2 = sqxVar.a;
        if ((rydVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            rydVar.y();
        }
        long j2 = i2;
        rye ryeVar3 = (rye) rydVar.b;
        ryeVar3.b |= 2;
        ryeVar3.f = j2;
        sgo sgoVar2 = rvcVar.c;
        if (sgoVar2 == null) {
            sgoVar2 = sgo.a;
        }
        sgoVar2.getClass();
        if ((rydVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            rydVar.y();
        }
        rye ryeVar4 = (rye) rydVar.b;
        ryeVar4.k = sgoVar2;
        ryeVar4.b |= 64;
        int i3 = sruVar.a;
        if ((rydVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            rydVar.y();
        }
        rye ryeVar5 = (rye) rydVar.b;
        ryeVar5.b |= 128;
        ryeVar5.l = i3;
        if ((rydVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            rydVar.y();
        }
        rye ryeVar6 = (rye) rydVar.b;
        ryeVar6.b |= 4;
        ryeVar6.g = j;
        sxrVar.b(ryx.a(rydVar));
    }
}

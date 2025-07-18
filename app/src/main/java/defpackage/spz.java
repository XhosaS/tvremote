package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class spz implements sqn {
    public static final zdy a = zdy.h("com/google/android/libraries/search/audio/microphone/impl/audiosourcedataaccessor/AudioAdapterAudioSourceDataAccessor");
    public final sgo b;
    public final int c;
    public final sat d;
    public final san e;
    public final ruo f;
    public final ahaz h;
    private final yqt i;
    private final ahbt j;
    private final spi k;
    private final scz l;
    private final sjp m;
    private rsp o;
    private final agpc p;
    private final agpc q;
    private final agpc r;
    private final agpc s;
    private final zyd t;
    private final sds u;
    private final agpc n = new agpn(new agum() { // from class: spn
        @Override // defpackage.agum
        public final Object a() {
            Object objA;
            tad tadVar;
            zdv zdvVar = (zdv) spz.a.b().o(zfi.a, "ALT.AdapterSrcAccessor").q("com/google/android/libraries/search/audio/microphone/impl/audiosourcedataaccessor/AudioAdapterAudioSourceDataAccessor", "writeableAudioBufferData_delegate$lambda$2", 93, "AudioAdapterAudioSourceDataAccessor.kt");
            spz spzVar = this.a;
            zdvVar.D("#audio# %s session(%d) opening source", spzVar.k(), spzVar.c);
            try {
                sat satVar = spzVar.d;
                sap sapVar = spzVar.e.c;
                if (sapVar == null) {
                    sapVar = sap.a;
                }
                objA = satVar.a(sapVar);
            } catch (Throwable th) {
                objA = agpl.a(th);
            }
            agpk agpkVar = new agpk(objA);
            Object obj = agpkVar.a;
            tac tacVarA = null;
            if (true == (obj instanceof agpj)) {
                obj = null;
            }
            yqt yqtVar = (yqt) obj;
            if (yqtVar != null && (tadVar = (tad) yqtVar.f()) != null) {
                tacVarA = tadVar.a();
            }
            spzVar.m(tacVarA);
            return agpkVar;
        }
    });
    public final ahaz g = new ahaz();

    public spz(sgo sgoVar, yqt yqtVar, int i, sat satVar, san sanVar, ahbt ahbtVar, spi spiVar, final ety etyVar, final eua euaVar, scz sczVar) {
        sdw sdwVar;
        this.b = sgoVar;
        this.i = yqtVar;
        this.c = i;
        this.d = satVar;
        this.e = sanVar;
        this.j = ahbtVar;
        this.k = spiVar;
        this.l = sczVar;
        this.m = new sjp(ahbtVar);
        ahaz ahazVar = new ahaz();
        this.h = ahazVar;
        this.p = new agpn(new agum() { // from class: spo
            @Override // defpackage.agum
            public final Object a() {
                spz spzVar = this.a;
                ruo ruoVar = spzVar.f;
                rul rulVar = ruoVar.k;
                if (rulVar == null) {
                    rulVar = rul.a;
                }
                int iA = ruk.a(rulVar.c);
                if (iA == 0) {
                    iA = 1;
                }
                int i2 = iA - 2;
                if (i2 == -1 || i2 == 0) {
                    return null;
                }
                return i2 != 1 ? euaVar.a(spzVar.b, ruoVar) : etyVar.a(spzVar.b, ruoVar);
            }
        });
        this.q = new agpn(new agum() { // from class: spp
            @Override // defpackage.agum
            public final Object a() {
                Object objJ = this.a.j();
                agpl.b(objJ);
                return sci.a(((tad) ((yqt) objJ).c()).a(), scs.class);
            }
        });
        this.r = new agpn(new agum() { // from class: spq
            @Override // defpackage.agum
            public final Object a() {
                Object objJ = this.a.j();
                agpl.b(objJ);
                return sci.a(((tad) ((yqt) objJ).c()).a(), scn.class);
            }
        });
        agpn agpnVar = new agpn(new agum() { // from class: spr
            @Override // defpackage.agum
            public final Object a() {
                return ypv.a;
            }
        });
        this.s = agpnVar;
        this.t = ahkr.a(ahazVar);
        sap sapVar = sanVar.c;
        ruo ruoVar = (sapVar == null ? sap.a : sapVar).d;
        ruoVar = ruoVar == null ? ruo.a : ruoVar;
        ruoVar.getClass();
        this.f = ruoVar;
        sdr sdrVar = sds.a;
        int iOrdinal = ((sav) satVar).a.ordinal();
        if (iOrdinal == 0) {
            sdwVar = sdw.SOURCE_BISTO;
        } else if (iOrdinal == 1) {
            sdwVar = sdw.SOURCE_SODA;
        } else if (iOrdinal == 2) {
            sdwVar = sdw.SOURCE_CAR;
        } else if (iOrdinal == 3) {
            sdwVar = sdw.SOURCE_GACS;
        } else {
            if (iOrdinal != 4) {
                throw new agpg();
            }
            sdwVar = sdw.SOURCE_EMPTY;
        }
        this.u = sdrVar.a(sdwVar);
    }

    private final yqt r() {
        return (yqt) this.q.a();
    }

    @Override // defpackage.sqc
    public final int a() {
        tac tacVarA;
        l(rxh.FAILED_TO_OPEN_AUDIO_SOURCE);
        Object objJ = j();
        agpl.b(objJ);
        tad tadVar = (tad) ((yqt) objJ).f();
        if (tadVar == null || (tacVarA = tadVar.a()) == null) {
            throw new IllegalStateException("Source was expected to be opened by this time");
        }
        return tacVarA.b();
    }

    @Override // defpackage.sqc
    public final ruo b() {
        return this.f;
    }

    @Override // defpackage.sqc
    public final sds c() {
        return this.u;
    }

    @Override // defpackage.sqn
    public final /* synthetic */ slb d() {
        return null;
    }

    public final sos e() {
        return (sos) this.p.a();
    }

    @Override // defpackage.sqc
    public final zyd g(rxn rxnVar) {
        return this.m.a(new spu(this, rxnVar, null));
    }

    @Override // defpackage.sqc
    public final zyd h() {
        return this.t;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(defpackage.agsw r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.spv
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == 0) goto L13
            r0 = r8
            spv r0 = (defpackage.spv) r0
            int r2 = r0.c
            r3 = r2 & r1
            if (r3 == 0) goto L13
            int r2 = r2 - r1
            r0.c = r2
            goto L18
        L13:
            spv r0 = new spv
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.a
            agtg r2 = defpackage.agtg.a
            int r3 = r0.c
            r4 = 1
            if (r3 == 0) goto L30
            if (r3 != r4) goto L28
            defpackage.agpl.b(r8)
            goto La1
        L28:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L30:
            defpackage.agpl.b(r8)
            java.lang.Object r8 = r7.j()
            defpackage.agpl.b(r8)
            yqt r8 = (defpackage.yqt) r8
            java.lang.Object r8 = r8.f()
            tad r8 = (defpackage.tad) r8
            if (r8 != 0) goto L4d
            skc r8 = defpackage.skc.a
            r0 = 303(0x12f, float:4.25E-43)
            rxd r8 = r8.h(r0)
            return r8
        L4d:
            sar r3 = defpackage.sar.a
            saq r3 = new saq
            r3.<init>()
            san r5 = r7.e
            sap r5 = r5.c
            if (r5 != 0) goto L5c
            sap r5 = defpackage.sap.a
        L5c:
            r5.getClass()
            int r6 = r5.b
            r6 = r6 & 4
            if (r6 == 0) goto L6c
            rwu r5 = r5.e
            if (r5 != 0) goto L6d
            rwu r5 = defpackage.rwu.a
            goto L6d
        L6c:
            r5 = 0
        L6d:
            if (r5 == 0) goto L85
            abxd r6 = r3.b
            int r6 = r6.memoizedSerializedSize
            r1 = r1 & r6
            if (r1 != 0) goto L79
            r3.y()
        L79:
            abxd r1 = r3.b
            sar r1 = (defpackage.sar) r1
            r1.c = r5
            int r5 = r1.b
            r5 = r5 | 2
            r1.b = r5
        L85:
            tac r8 = r8.a()
            r8.g()
            sat r8 = r7.d
            abxd r1 = r3.v()
            sar r1 = (defpackage.sar) r1
            zyd r8 = r8.b(r1)
            r0.c = r4
            java.lang.Object r8 = defpackage.ahkr.b(r8, r0)
            if (r8 != r2) goto La1
            return r2
        La1:
            r8.getClass()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.spz.i(agsw):java.lang.Object");
    }

    public final Object j() {
        return ((agpk) this.n.a()).a;
    }

    public final String k() {
        return true != this.i.g() ? "hotword" : "audio request";
    }

    public final void l(rxh rxhVar) {
        Object objA;
        try {
            objA = (rxj) this.g.A();
        } catch (Throwable th) {
            objA = agpl.a(th);
        }
        if (true == (objA instanceof agpj)) {
            objA = null;
        }
        rxj rxjVar = (rxj) objA;
        if (rxjVar == null || rxjVar.b != 1) {
            throw new sln(skc.a.d(rxhVar));
        }
    }

    public final void m(Object obj) {
        scd scdVar = obj instanceof scd ? (scd) obj : null;
        if (scdVar != null) {
            agrx agrxVar = new agrx(10);
            if (this.e.e) {
                agrxVar.add(this.l.a(false, true));
            }
            scdVar.e(agqq.a(agrxVar));
        }
    }

    @Override // defpackage.sqc
    public final zyd n(sqb sqbVar) {
        return this.m.a(new spx(this, sqbVar, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object o(defpackage.sqb r10, defpackage.agsw r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.spz.o(sqb, agsw):java.lang.Object");
    }

    @Override // defpackage.sqc
    public final zyd p(sqb sqbVar) {
        return this.m.a(new spw(this, sqbVar, null));
    }

    public final ruv q(int i) {
        tac tacVarA;
        Object objJ = j();
        agpl.b(objJ);
        tad tadVar = (tad) ((yqt) objJ).f();
        if (tadVar == null || (tacVarA = tadVar.a()) == null) {
            throw new IllegalStateException("Source was expected to be opened by this time");
        }
        sax saxVar = tacVarA instanceof sax ? (sax) tacVarA : null;
        scc sccVar = tacVarA instanceof scc ? (scc) tacVarA : null;
        yqt yqtVarH = yqt.h(saxVar != null ? saxVar : null);
        yqt yqtVarA = sbn.a(sccVar);
        yqt yqtVarH2 = yqt.h(this.o);
        rxj rxjVar = rxj.a;
        rxi rxiVar = new rxi();
        rwz.c(i, rxiVar);
        return new sjz(yqtVarH, yqtVarH2, yqtVarA, i == 4 ? scw.a(r()).b(new yqi() { // from class: sps
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                scs scsVar = (scs) obj;
                scsVar.getClass();
                return scsVar.a();
            }
        }) : r().b(new yqi() { // from class: spt
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                scs scsVar = (scs) obj;
                scsVar.getClass();
                return scsVar.a();
            }
        }), (zyd) scq.a((yqt) this.r.a(), this.f).a(), rwz.a(rxiVar));
    }

    @Override // defpackage.sqn
    public final /* synthetic */ sqn f() {
        return this;
    }
}

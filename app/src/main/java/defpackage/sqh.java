package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sqh extends agtu implements agvb {
    int a;
    final /* synthetic */ sqk b;
    final /* synthetic */ rxn c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sqh(sqk sqkVar, rxn rxnVar, agsw agswVar) {
        super(2, agswVar);
        this.b = sqkVar;
        this.c = rxnVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((sqh) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x006b, code lost:
    
        if (r7 != r0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x006d, code lost:
    
        r7 = ((defpackage.rvm) r7).c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0071, code lost:
    
        if (r7 != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0073, code lost:
    
        r7 = defpackage.rxd.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0075, code lost:
    
        r7.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0078, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ac, code lost:
    
        if (r7 == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00af, code lost:
    
        r7 = ((defpackage.rvm) r7).c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b3, code lost:
    
        if (r7 != null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b5, code lost:
    
        r7 = defpackage.rxd.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b7, code lost:
    
        r7.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ba, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (r1 != 1) goto L29;
     */
    @Override // defpackage.agto
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            agtg r0 = defpackage.agtg.a
            int r1 = r6.a
            r2 = 1
            defpackage.agpl.b(r7)
            if (r1 == 0) goto Le
            if (r1 == r2) goto L6d
            goto Laf
        Le:
            java.lang.Object r7 = r6.d
            ahbt r7 = (defpackage.ahbt) r7
            zdy r7 = defpackage.sqk.a
            zeo r7 = r7.b()
            zer r1 = defpackage.zfi.a
            java.lang.String r3 = "ALT.SrcAccessor"
            zeo r7 = r7.o(r1, r3)
            r1 = 151(0x97, float:2.12E-43)
            java.lang.String r3 = "AudioSourceDataAccessorImpl.kt"
            java.lang.String r4 = "com/google/android/libraries/search/audio/microphone/impl/audiosourcedataaccessor/AudioSourceDataAccessorImpl$closeAudioSource$1"
            java.lang.String r5 = "invokeSuspend"
            zeo r7 = r7.q(r4, r5, r1, r3)
            zdv r7 = (defpackage.zdv) r7
            sqk r1 = r6.b
            java.lang.String r3 = "#audio# closing audio source(%s)"
            java.lang.String r4 = r1.g
            r7.x(r3, r4)
            sos r7 = r1.e()
            if (r7 == 0) goto L40
            r7.b()
        L40:
            agpk r7 = r1.f
            if (r7 != 0) goto L79
            ahaz r7 = r1.j
            rxn r1 = r6.c
            rvm r3 = defpackage.rvm.a
            rvl r3 = new rvl
            r3.<init>()
            defpackage.rzy.c(r1, r3)
            r1 = 108(0x6c, float:1.51E-43)
            rxd r1 = defpackage.skj.f(r1)
            r1.getClass()
            defpackage.rzy.b(r1, r3)
            rvm r1 = defpackage.rzy.a(r3)
            r7.N(r1)
            r6.a = r2
            java.lang.Object r7 = r7.fy(r6)
            if (r7 == r0) goto Lae
        L6d:
            rvm r7 = (defpackage.rvm) r7
            rxd r7 = r7.c
            if (r7 != 0) goto L75
            rxd r7 = defpackage.rxd.a
        L75:
            r7.getClass()
            return r7
        L79:
            sdp r7 = r1.c     // Catch: java.lang.Throwable -> L80
            rxd r7 = r7.a()     // Catch: java.lang.Throwable -> L80
            goto L85
        L80:
            r7 = move-exception
            java.lang.Object r7 = defpackage.agpl.a(r7)
        L85:
            rxn r1 = r6.c
            java.lang.Throwable r2 = defpackage.agpk.a(r7)
            if (r2 != 0) goto L96
            rxd r7 = (defpackage.rxd) r7
            skc r2 = defpackage.skc.a
            rvm r7 = r2.c(r7, r1)
            goto L9e
        L96:
            skc r7 = defpackage.skc.a
            r2 = 111(0x6f, float:1.56E-43)
            rvm r7 = r7.g(r2, r1)
        L9e:
            sqk r1 = r6.b
            ahaz r1 = r1.j
            r1.N(r7)
            r7 = 2
            r6.a = r7
            java.lang.Object r7 = r1.fy(r6)
            if (r7 != r0) goto Laf
        Lae:
            return r0
        Laf:
            rvm r7 = (defpackage.rvm) r7
            rxd r7 = r7.c
            if (r7 != 0) goto Lb7
            rxd r7 = defpackage.rxd.a
        Lb7:
            r7.getClass()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sqh.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        sqh sqhVar = new sqh(this.b, this.c, agswVar);
        sqhVar.d = obj;
        return sqhVar;
    }
}

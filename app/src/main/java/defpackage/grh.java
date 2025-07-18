package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class grh implements gqv {
    public static final zdy a = zdy.h("com/google/android/apps/tvsearch/performers/MediaPerformerImpl");
    public final ahbt b;
    public final god c;
    public final fgx d;
    private final agow e;
    private final agow f;
    private final gfr g;
    private final glq h;
    private final gmd i;
    private final agow j;
    private final ghr k;
    private final jca l;

    public grh(ahbt ahbtVar, agow agowVar, agow agowVar2, gfr gfrVar, glq glqVar, gmd gmdVar, god godVar, fgx fgxVar, agow agowVar3, ghr ghrVar, jca jcaVar) {
        ahbtVar.getClass();
        gfrVar.getClass();
        gmdVar.getClass();
        fgxVar.getClass();
        agowVar3.getClass();
        ghrVar.getClass();
        jcaVar.getClass();
        this.b = ahbtVar;
        this.e = agowVar;
        this.f = agowVar2;
        this.g = gfrVar;
        this.h = glqVar;
        this.i = gmdVar;
        this.c = godVar;
        this.d = fgxVar;
        this.j = agowVar3;
        this.k = ghrVar;
        this.l = jcaVar;
    }

    public final zyd a(gez gezVar, Runnable runnable) {
        agow agowVar = this.e;
        if (((Boolean) agowVar.a()).booleanValue() && gezVar != null) {
            gez.a.a(((gfn) this.f.a()).a(rpm.bP()), gezVar).c();
        }
        gfr gfrVar = this.g;
        gfrVar.b(rpm.bI(), null, null);
        gmd gmdVar = this.i;
        gmc gmcVar = gmc.t;
        gmdVar.l(gmcVar);
        runnable.run();
        this.k.af();
        gfq.a(gfrVar, rpm.ei(), null, 14);
        gmdVar.m(gmcVar);
        this.h.y(gma.h);
        if (((Boolean) this.j.a()).booleanValue()) {
            ((gfn) this.f.a()).a(rpm.cq()).b().c();
        } else {
            gfq.b(gfrVar, rpm.cq(), null, null, 14);
        }
        if (((Boolean) agowVar.a()).booleanValue() && gezVar != null) {
            agow agowVar2 = this.f;
            gey geyVar = gez.a;
            geyVar.a(((gfn) agowVar2.a()).a(rpm.bO()), gezVar).c();
            rqw rqwVarC = gfb.c(gezVar, 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00a9: INVOKE (r1v8 'rqwVarC' rqw) = 
                  (r7v0 'gezVar' gez)
                  (wrap:agow:0x0002: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:3) call: gfa.<init>():void type: CONSTRUCTOR)
                 STATIC call: gfb.c(gez, agow):rqw A[DECLARE_VAR, MD:(gez, agow):rqw (m)] (LINE:6) in method: grh.a(gez, java.lang.Runnable):zyd, file: classes.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:301)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                	at java.base/java.util.ArrayList.forEach(Unknown Source)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
                	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                	at jadx.core.ProcessClass.process(ProcessClass.java:79)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
                	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:401)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:389)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:309)
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: gfa, state: NOT_LOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:304)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                	... 41 more
                */
            /*
                this = this;
                agow r0 = r6.e
                java.lang.Object r1 = r0.a()
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                if (r1 == 0) goto L29
                if (r7 == 0) goto L29
                agow r1 = r6.f
                gey r2 = defpackage.gez.a
                java.lang.Object r1 = r1.a()
                gfn r1 = (defpackage.gfn) r1
                rqs r3 = defpackage.rpm.bP()
                gfi r1 = r1.a(r3)
                gfl r1 = r2.a(r1, r7)
                r1.c()
            L29:
                gfr r1 = r6.g
                rqs r2 = defpackage.rpm.bI()
                r3 = 0
                r1.b(r2, r3, r3)
                gmd r2 = r6.i
                gmc r4 = defpackage.gmc.t
                r2.l(r4)
                r8.run()
                ghr r8 = r6.k
                r8.af()
                rqw r8 = defpackage.rpm.ei()
                r5 = 14
                defpackage.gfq.a(r1, r8, r3, r5)
                r2.m(r4)
                glq r8 = r6.h
                gma r4 = defpackage.gma.h
                r8.y(r4)
                agow r8 = r6.j
                java.lang.Object r8 = r8.a()
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 == 0) goto L7b
                agow r8 = r6.f
                java.lang.Object r8 = r8.a()
                gfn r8 = (defpackage.gfn) r8
                rqs r1 = defpackage.rpm.cq()
                gfi r8 = r8.a(r1)
                gfl r8 = defpackage.gfh.b(r8)
                r8.c()
                goto L82
            L7b:
                rqs r8 = defpackage.rpm.cq()
                defpackage.gfq.b(r1, r8, r3, r3, r5)
            L82:
                java.lang.Object r8 = r0.a()
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 == 0) goto Lc3
                if (r7 == 0) goto Lc3
                agow r8 = r6.f
                gey r0 = defpackage.gez.a
                java.lang.Object r1 = r8.a()
                gfn r1 = (defpackage.gfn) r1
                rqs r3 = defpackage.rpm.bO()
                gfi r1 = r1.a(r3)
                gfl r1 = r0.a(r1, r7)
                r1.c()
                rqw r1 = defpackage.gfb.d(r7)
                if (r1 == 0) goto Lc3
                java.lang.Object r8 = r8.a()
                gfn r8 = (defpackage.gfn) r8
                gfd r8 = r8.c(r1)
                r1 = 0
                gfg r7 = r0.d(r8, r7, r1, r1)
                abqb r8 = defpackage.abqb.OK
                r7.c(r8)
            Lc3:
                gmc r7 = defpackage.gmc.x
                r2.m(r7)
                xju r7 = defpackage.xju.OK
                zyd r7 = defpackage.irv.b(r7)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.grh.a(gez, java.lang.Runnable):zyd");
        }

        public final void b(final boolean z) {
            this.l.b(new jby() { // from class: gqz
                @Override // defpackage.jby
                public final void a(jdq jdqVar) {
                    boolean z2 = z;
                    if (jdqVar != null) {
                        try {
                            jdqVar.f(z2);
                        } catch (Exception e) {
                            ((zdv) ((zdv) grh.a.c()).p(e).q("com/google/android/apps/tvsearch/performers/MediaPerformerImpl", "setIsAssistantTriggeredMusicPlaying$lambda$12", 206, "MediaPerformerImpl.kt")).u("Error calling #isAssistantTriggeredMusicPlaying");
                        }
                    }
                }
            });
        }
    }

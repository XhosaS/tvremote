package defpackage;

import android.content.Context;
import android.provider.Settings;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gqo implements gqm {
    private static final zdy i = zdy.h("com/google/android/apps/tvsearch/performers/DevicePerformerImpl");
    public final agow a;
    public final agow b;
    public final gfr c;
    public final glq d;
    public final gmd e;
    public final irr f;
    public final ghr g;
    public final gxt h;
    private final fjg j;
    private final Context k;

    public gqo(fjg fjgVar, Context context, ahbt ahbtVar, agow agowVar, agow agowVar2, gfr gfrVar, glq glqVar, gmd gmdVar, irr irrVar, ghr ghrVar, gxt gxtVar) {
        context.getClass();
        ahbtVar.getClass();
        gfrVar.getClass();
        gmdVar.getClass();
        ghrVar.getClass();
        this.j = fjgVar;
        this.k = context;
        this.a = agowVar;
        this.b = agowVar2;
        this.c = gfrVar;
        this.d = glqVar;
        this.e = gmdVar;
        this.f = irrVar;
        this.g = ghrVar;
        this.h = gxtVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.gqm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.xku r12, defpackage.agsw r13) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gqo.a(xku, agsw):java.lang.Object");
    }

    @Override // defpackage.gqm
    public final Object b(xid xidVar) {
        String str = xidVar.c;
        str.getClass();
        int iA = xic.a(xidVar.b);
        if (iA == 0) {
            iA = 1;
        }
        if (!agvy.c(str, "ACCESSIBILITY")) {
            xhe xheVar = xhe.a;
            xhb xhbVar = new xhb();
            xjv xjvVar = xjv.a;
            xjs xjsVar = new xjs();
            xnw.b(xju.UNAVAILABLE, xjsVar);
            xjv xjvVarA = xnw.a(xjsVar);
            if ((Integer.MIN_VALUE & xhbVar.b.memoizedSerializedSize) == 0) {
                xhbVar.y();
            }
            xhe xheVar2 = (xhe) xhbVar.b;
            xheVar2.c = xjvVarA;
            xheVar2.b |= 1;
            return xkn.a(xhbVar);
        }
        int i2 = iA - 1;
        if (i2 == 1) {
            Context context = this.k;
            Settings.Secure.putString(context.getContentResolver(), "enabled_accessibility_services", "com.google.android.marvin.talkback/com.google.android.marvin.talkback.TalkBackService");
            Settings.Secure.putString(context.getContentResolver(), "accessibility_enabled", "1");
            this.g.af();
            this.d.y(gma.d);
            return gqk.a;
        }
        if (i2 == 2) {
            Context context2 = this.k;
            Settings.Secure.putString(context2.getContentResolver(), "enabled_accessibility_services", "");
            Settings.Secure.putString(context2.getContentResolver(), "accessibility_enabled", "0");
            this.g.af();
            this.d.y(gma.d);
            return gqk.a;
        }
        xhe xheVar3 = xhe.a;
        xhb xhbVar2 = new xhb();
        xjv xjvVar2 = xjv.a;
        xjs xjsVar2 = new xjs();
        xnw.b(xju.UNAVAILABLE, xjsVar2);
        xjv xjvVarA2 = xnw.a(xjsVar2);
        if ((Integer.MIN_VALUE & xhbVar2.b.memoizedSerializedSize) == 0) {
            xhbVar2.y();
        }
        xhe xheVar4 = (xhe) xhbVar2.b;
        xheVar4.c = xjvVarA2;
        xheVar4.b |= 1;
        return xkn.a(xhbVar2);
    }

    public final int c(int i2) {
        return agwm.a((i2 / 100.0d) * this.h.a());
    }

    public final void d(gez gezVar, abqb abqbVar) {
        if (!((Boolean) this.a.a()).booleanValue() || gezVar == null) {
            return;
        }
        agow agowVar = this.b;
        gey geyVar = gez.a;
        geyVar.a(((gfn) agowVar.a()).a(rpm.bM()), gezVar).d(abqbVar);
        rqw rqwVarC = gfb.c(gezVar, 
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0029: INVOKE (r2v4 'rqwVarC' rqw) = 
              (r5v0 'gezVar' gez)
              (wrap:agow:0x0002: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:3) call: gfa.<init>():void type: CONSTRUCTOR)
             STATIC call: gfb.c(gez, agow):rqw A[DECLARE_VAR, MD:(gez, agow):rqw (m)] (LINE:6) in method: gqo.d(gez, abqb):void, file: classes.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
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
            	... 39 more
            */
        /*
            this = this;
            agow r0 = r4.a
            java.lang.Object r0 = r0.a()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L41
            if (r5 == 0) goto L41
            agow r0 = r4.b
            gey r1 = defpackage.gez.a
            java.lang.Object r2 = r0.a()
            gfn r2 = (defpackage.gfn) r2
            rqs r3 = defpackage.rpm.bM()
            gfi r2 = r2.a(r3)
            gfl r2 = r1.a(r2, r5)
            r2.d(r6)
            rqw r2 = defpackage.gfb.d(r5)
            if (r2 == 0) goto L41
            java.lang.Object r0 = r0.a()
            gfn r0 = (defpackage.gfn) r0
            gfd r0 = r0.c(r2)
            r2 = 0
            gfg r5 = r1.d(r0, r5, r2, r2)
            r5.c(r6)
        L41:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gqo.d(gez, abqb):void");
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class glb implements gkz {
    private static final zdy j = zdy.h("com/google/android/apps/tvsearch/logging/invocation/AssistantInvocationLoggerImpl");
    public final fby a;
    public final agow b;
    public final gzu c;
    public final agow d;
    public final fke e;
    public final ztw f;
    public final ghp g;
    public final ghr h;
    public String i;
    private final jdt k;
    private final ahbt l;
    private final glk m;
    private final gfr n;
    private final agow o;
    private final icl p;
    private final agow q;
    private boolean r;
    private boolean s;
    private boolean t;

    public glb(fby fbyVar, jdt jdtVar, ahbt ahbtVar, agow agowVar, gzu gzuVar, glk glkVar, agow agowVar2, gfr gfrVar, fke fkeVar, agow agowVar3, icl iclVar, agow agowVar4, ztw ztwVar, ghp ghpVar, ghr ghrVar) {
        fbyVar.getClass();
        jdtVar.getClass();
        ahbtVar.getClass();
        agowVar.getClass();
        gzuVar.getClass();
        glkVar.getClass();
        gfrVar.getClass();
        agowVar3.getClass();
        iclVar.getClass();
        ztwVar.getClass();
        ghpVar.getClass();
        ghrVar.getClass();
        this.a = fbyVar;
        this.k = jdtVar;
        this.l = ahbtVar;
        this.b = agowVar;
        this.c = gzuVar;
        this.m = glkVar;
        this.d = agowVar2;
        this.n = gfrVar;
        this.e = fkeVar;
        this.o = agowVar3;
        this.p = iclVar;
        this.q = agowVar4;
        this.f = ztwVar;
        this.g = ghpVar;
        this.h = ghrVar;
        this.i = "";
    }

    private final String h() {
        String strConcat;
        if (this.s) {
            icl iclVar = this.p;
            strConcat = !iclVar.j() ? "binding_not_started" : !iclVar.k() ? "binding_not_finished" : "syncing_not_finished";
        } else {
            jdt jdtVar = this.k;
            strConcat = jdtVar.j() == null ? this.m.j() ? "assistant_no_state_gms_update" : "assistant_no_state" : !jdtVar.R() ? "assistant_state_".concat(String.valueOf(jdtVar.j())) : !this.r ? "setup_not_finished" : "invocation_failed_unknown";
        }
        return this.m.i() ? strConcat.concat("_after_reboot") : strConcat;
    }

    @Override // defpackage.gkz
    public final void a() {
        if (this.i.length() == 0) {
            this.i = h();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    /* JADX WARN: Removed duplicated region for block: B:78:0x017e  */
    @Override // defpackage.gkz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 896
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.glb.b():void");
    }

    @Override // defpackage.gkz
    public final void c() {
        ahal.e(this.l, null, 0, new gla(this, null), 3);
    }

    @Override // defpackage.gkz
    public final void d(boolean z) {
        this.s = z;
    }

    @Override // defpackage.gkz
    public final void e(boolean z) {
        this.t = z;
    }

    @Override // defpackage.gkz
    public final boolean f() {
        return this.t;
    }

    @Override // defpackage.gkz
    public final void g() {
        this.r = true;
    }
}

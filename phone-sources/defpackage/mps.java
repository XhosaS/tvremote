package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mps extends sbx {
    public final pkg a;
    public final pjx b;
    private final Context c;
    private final ntp d;

    public mps(Context context, pkg pkgVar, pjx pjxVar, ntp ntpVar) {
        pkgVar.getClass();
        this.c = context;
        this.a = pkgVar;
        this.b = pjxVar;
        this.d = ntpVar;
    }

    @Override // defpackage.sbx
    public final /* bridge */ /* synthetic */ Object C() {
        return new mpn();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003b, code lost:
    
        if (r1.equals("SHOW_TITLE") != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0053, code lost:
    
        if (r1.equals("MOVIE_TITLE") != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0055, code lost:
    
        r3 = com.google.android.videos.R.string.sort_by_title;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0056 A[PHI: r3
  0x0056: PHI (r3v11 int) = (r3v0 int), (r3v1 int), (r3v2 int), (r3v0 int), (r3v12 int) binds: [B:18:0x004c, B:16:0x0044, B:22:0x0055, B:9:0x0034, B:7:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0060  */
    @Override // defpackage.sbx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ void c(java.lang.Object r13, java.lang.Object r14) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 394
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mps.c(java.lang.Object, java.lang.Object):void");
    }
}

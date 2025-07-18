package defpackage;

import android.util.Log;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class bts extends cee {
    public static final Level a;
    public static final Level b;
    public static final boolean c;
    private static final cdc e;
    final String d;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006f, code lost:
    
        if (r0.equals("warning") != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0078, code lost:
    
        if (r0.equals("verbose") != false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008e, code lost:
    
        if (r0.equals("error") != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0097, code lost:
    
        if (r0.equals("debug") != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a0, code lost:
    
        if (r0.equals("info") != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a9, code lost:
    
        if (r0.equals("fine") != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b2, code lost:
    
        if (r0.equals("w") != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b4, code lost:
    
        r0 = java.util.logging.Level.WARNING;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00bd, code lost:
    
        if (r0.equals("v") != false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c6, code lost:
    
        if (r0.equals("i") != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c8, code lost:
    
        r0 = java.util.logging.Level.INFO;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d1, code lost:
    
        if (r0.equals("e") != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00da, code lost:
    
        if (r0.equals("d") != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00dc, code lost:
    
        r0 = java.util.logging.Level.FINE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00ec, code lost:
    
        if (r0.equals("severe") != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ee, code lost:
    
        r0 = java.util.logging.Level.SEVERE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00f7, code lost:
    
        if (r0.equals("finest") != false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00f9, code lost:
    
        r0 = java.util.logging.Level.FINEST;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:15:0x0064. Please report as an issue. */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0100  */
    static {
        /*
            Method dump skipped, instructions count: 380
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bts.<clinit>():void");
    }

    public bts(String str, String str2) {
        super(str);
        this.d = str2;
    }

    static final void d(String str, cdb cdbVar) {
        String strA;
        cdy cdyVarG = cdy.g(ceb.f(), cdbVar.k());
        Level levelN = cdbVar.n();
        cdc cdcVar = e;
        if (cec.b(cdbVar, cdyVarG, cdcVar.b)) {
            StringBuilder sb = new StringBuilder();
            cfg.e(cdbVar, sb);
            cec.c(cdyVarG, cdcVar.a, sb);
            strA = sb.toString();
        } else {
            strA = cec.a(cdbVar);
        }
        Throwable th = (Throwable) cdyVarG.b(cbx.a);
        int iF = ces.f(levelN);
        if (iF == 3) {
            Log.d(str, strA, th);
            return;
        }
        if (iF == 4) {
            Log.i(str, strA, th);
            return;
        }
        if (iF == 5) {
            Log.w(str, strA, th);
        } else if (iF != 6) {
            Log.v(str, strA, th);
        } else {
            Log.e(str, strA, th);
        }
    }

    @Override // defpackage.cdd
    public void b(cdb cdbVar) {
        d(this.d, cdbVar);
    }
}

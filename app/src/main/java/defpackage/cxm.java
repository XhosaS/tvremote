package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cxm {
    final String[] a;
    final String b;
    final String c;
    final Object d;

    public cxm(Object obj, String str, String str2, String[] strArr) {
        this.a = strArr;
        this.b = str;
        this.c = str2;
        this.d = obj;
    }

    public final int a() {
        Object obj = this.d;
        aff.a(obj, "Object must be non-null for FORMAT_INT");
        return ((Integer) obj).intValue();
    }

    public final long b() {
        Object obj = this.d;
        aff.a(obj, "Object must be non-null for FORMAT_LONG");
        return ((Long) obj).longValue();
    }

    public final cxl c() {
        Object obj = this.d;
        aff.a(obj, "Object must be non-null for FORMAT_SLICE");
        return "action".equals(this.b) ? (cxl) ((afg) obj).b : (cxl) obj;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String d(java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 556
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cxm.d(java.lang.String):java.lang.String");
    }

    public final String toString() {
        return d("");
    }
}

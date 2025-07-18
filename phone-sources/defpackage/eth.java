package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eth implements eti {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @Override // defpackage.eti
    public final ffp a(dze dzeVar) {
        String str = dzeVar.Y;
        if (str != null) {
            switch (str.hashCode()) {
                case -1354451219:
                    if (str.equals("application/vnd.dvb.ait")) {
                        return new fft();
                    }
                    break;
                case -1348231605:
                    if (str.equals("application/x-icy")) {
                        return new ffy();
                    }
                    break;
                case -1248341703:
                    if (str.equals("application/id3")) {
                        return new fgh();
                    }
                    break;
                case 1154383568:
                    if (str.equals("application/x-emsg")) {
                        return new ffv();
                    }
                    break;
                case 1652648887:
                    if (str.equals("application/x-scte35")) {
                        return new fgv();
                    }
                    break;
            }
        }
        throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: ".concat(String.valueOf(str)));
    }

    @Override // defpackage.eti
    public final boolean b(dze dzeVar) {
        String str = dzeVar.Y;
        return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
    }
}

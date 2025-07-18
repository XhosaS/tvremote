package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fjf implements fjg {
    private final /* synthetic */ int b;

    public fjf(int i) {
        this.b = i;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.fjg
    public final int a(dze dzeVar) {
        if (this.b == 0) {
            return 1;
        }
        String str = dzeVar.Y;
        if (str != null) {
            switch (str.hashCode()) {
                case -1351681404:
                    if (str.equals("application/dvbsubs")) {
                        return 2;
                    }
                    break;
                case -1248334819:
                    if (str.equals("application/pgs")) {
                        return 2;
                    }
                    break;
                case -1026075066:
                    if (str.equals("application/x-mp4-vtt")) {
                        return 2;
                    }
                    break;
                case -1004728940:
                    if (str.equals("text/vtt")) {
                        return 1;
                    }
                    break;
                case 691401887:
                    if (str.equals("application/x-quicktime-tx3g")) {
                        return 2;
                    }
                    break;
                case 822864842:
                    if (str.equals("text/x-ssa")) {
                        return 1;
                    }
                    break;
                case 1157994102:
                    if (str.equals("application/vobsub")) {
                        return 2;
                    }
                    break;
                case 1668750253:
                    if (str.equals("application/x-subrip")) {
                        return 1;
                    }
                    break;
                case 1693976202:
                    if (str.equals("application/ttml+xml")) {
                        return 1;
                    }
                    break;
            }
        }
        throw new IllegalArgumentException("Unsupported MIME type: ".concat(String.valueOf(str)));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @Override // defpackage.fjg
    public final fji b(dze dzeVar) {
        if (this.b == 0) {
            throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
        }
        String str = dzeVar.Y;
        if (str != null) {
            switch (str.hashCode()) {
                case -1351681404:
                    if (str.equals("application/dvbsubs")) {
                        return new fjz(dzeVar.ab);
                    }
                    break;
                case -1248334819:
                    if (str.equals("application/pgs")) {
                        return new fkb();
                    }
                    break;
                case -1026075066:
                    if (str.equals("application/x-mp4-vtt")) {
                        return new fku();
                    }
                    break;
                case -1004728940:
                    if (str.equals("text/vtt")) {
                        return new flc();
                    }
                    break;
                case 691401887:
                    if (str.equals("application/x-quicktime-tx3g")) {
                        return new fkr(dzeVar.ab);
                    }
                    break;
                case 822864842:
                    if (str.equals("text/x-ssa")) {
                        return new fkd(dzeVar.ab);
                    }
                    break;
                case 1157994102:
                    if (str.equals("application/vobsub")) {
                        return new fkt(dzeVar.ab);
                    }
                    break;
                case 1668750253:
                    if (str.equals("application/x-subrip")) {
                        return new fkh();
                    }
                    break;
                case 1693976202:
                    if (str.equals("application/ttml+xml")) {
                        return new fkn();
                    }
                    break;
            }
        }
        throw new IllegalArgumentException("Unsupported MIME type: ".concat(String.valueOf(str)));
    }

    @Override // defpackage.fjg
    public final boolean c(dze dzeVar) {
        if (this.b == 0) {
            return false;
        }
        String str = dzeVar.Y;
        return Objects.equals(str, "text/x-ssa") || Objects.equals(str, "text/vtt") || Objects.equals(str, "application/x-mp4-vtt") || Objects.equals(str, "application/x-subrip") || Objects.equals(str, "application/x-quicktime-tx3g") || Objects.equals(str, "application/pgs") || Objects.equals(str, "application/vobsub") || Objects.equals(str, "application/dvbsubs") || Objects.equals(str, "application/ttml+xml");
    }
}

package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum afro {
    NO_ERROR(0, Status.l),
    PROTOCOL_ERROR(1, Status.k),
    INTERNAL_ERROR(2, Status.k),
    FLOW_CONTROL_ERROR(3, Status.k),
    SETTINGS_TIMEOUT(4, Status.k),
    STREAM_CLOSED(5, Status.k),
    FRAME_SIZE_ERROR(6, Status.k),
    REFUSED_STREAM(7, Status.l),
    CANCEL(8, Status.b),
    COMPRESSION_ERROR(9, Status.k),
    CONNECT_ERROR(10, Status.k),
    ENHANCE_YOUR_CALM(11, Status.h.withDescription("Bandwidth exhausted")),
    INADEQUATE_SECURITY(12, Status.f.withDescription("Permission denied as protocol is not secure enough to call")),
    HTTP_1_1_REQUIRED(13, Status.c);

    public static final afro[] o;
    public final Status p;
    private final int r;

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)" because "ssaVar" is null
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:493)
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:496)
        	at jadx.core.dex.visitors.regions.LoopRegionVisitor.checkArrayForEach(LoopRegionVisitor.java:230)
        	at jadx.core.dex.visitors.regions.LoopRegionVisitor.checkForIndexedLoop(LoopRegionVisitor.java:144)
        	at jadx.core.dex.visitors.regions.LoopRegionVisitor.processLoopRegion(LoopRegionVisitor.java:81)
        	at jadx.core.dex.visitors.regions.LoopRegionVisitor.enterRegion(LoopRegionVisitor.java:65)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.LoopRegionVisitor.visit(LoopRegionVisitor.java:55)
        */
    static {
        /*
            Method dump skipped, instructions count: 283
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afro.<clinit>():void");
    }

    afro(int i, Status status) {
        this.r = i;
        String strConcat = "HTTP/2 error code: ".concat(String.valueOf(name()));
        if (status.getDescription() != null) {
            strConcat = strConcat + " (" + status.getDescription() + ")";
        }
        this.p = status.withDescription(strConcat);
    }
}

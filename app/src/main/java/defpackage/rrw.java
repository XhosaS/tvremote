package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rrw extends rrt {
    public yzq a;
    public boolean b;
    public byte c;
    private ahpb d;
    private rqp e;
    private yyk f;

    @Override // defpackage.rrt
    public final rru a() {
        ahpb ahpbVar;
        yzq yzqVar;
        rqp rqpVar;
        yyk yykVar;
        if (this.c == 1 && (ahpbVar = this.d) != null && (yzqVar = this.a) != null && (rqpVar = this.e) != null && (yykVar = this.f) != null) {
            return new rrx(ahpbVar, yzqVar, rqpVar, false, yykVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.d == null) {
            sb.append(" appFlow");
        }
        if (this.a == null) {
            sb.append(" testCodes");
        }
        if (this.e == null) {
            sb.append(" appFlowType");
        }
        if (this.c == 0) {
            sb.append(" sampledOut");
        }
        if (this.f == null) {
            sb.append(" globalMetadata");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.rrt
    public final yqt c() {
        ahpb ahpbVar = this.d;
        return ahpbVar == null ? ypv.a : yqt.i(ahpbVar);
    }

    @Override // defpackage.rrt
    public final void d(ahpb ahpbVar) {
        if (ahpbVar == null) {
            throw new NullPointerException("Null appFlow");
        }
        this.d = ahpbVar;
    }

    @Override // defpackage.rrt
    public final void e(rqp rqpVar) {
        if (rqpVar == null) {
            throw new NullPointerException("Null appFlowType");
        }
        this.e = rqpVar;
    }

    @Override // defpackage.rrt
    public final void f(yyk yykVar) {
        if (yykVar == null) {
            throw new NullPointerException("Null globalMetadata");
        }
        this.f = yykVar;
    }
}

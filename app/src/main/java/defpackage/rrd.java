package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rrd extends rrg {
    public int a;
    private yyk b;

    @Override // defpackage.rrg
    public final rrh a() {
        int i;
        yyk yykVar = this.b;
        if (yykVar != null && (i = this.a) != 0) {
            return new rre(yykVar, i);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" records");
        }
        if (this.a == 0) {
            sb.append(" status");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.rrg
    public final void b(yyk yykVar) {
        if (yykVar == null) {
            throw new NullPointerException("Null records");
        }
        this.b = yykVar;
    }
}

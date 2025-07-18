package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qxf extends qwr {
    public String a;
    public agow b;
    public int c;

    @Override // defpackage.qwr
    public final qws a() {
        String str;
        int i = this.c;
        if (i != 0 && (str = this.a) != null) {
            return new qxg(i, str, this.b);
        }
        StringBuilder sb = new StringBuilder();
        if (this.c == 0) {
            sb.append(" enablement");
        }
        if (this.a == null) {
            sb.append(" reportingProcessShortName");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}

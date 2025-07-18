package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ypb extends ypk {
    private static final long serialVersionUID = -1522852442442473691L;
    protected final String a;
    private final String h;
    private final boolean i;

    static {
        int i = ypa.a;
    }

    protected ypb() {
        ype ypeVar = new ype();
        super(ypeVar.a, ypeVar.b, ypeVar.c);
        this.a = null;
        this.h = "googleapis.com";
        this.i = false;
    }

    protected yqq c() {
        yqq yqqVarB = yqr.b(this);
        yqqVarB.a = true;
        yqqVarB.b("quotaProjectId", null);
        yqqVarB.b("universeDomain", this.h);
        yqqVarB.c("isExplicitUniverseDomain", "false");
        return yqqVarB;
    }

    @Override // defpackage.ypk
    public boolean equals(Object obj) {
        if (!(obj instanceof ypb)) {
            return false;
        }
        ypb ypbVar = (ypb) obj;
        String str = ypbVar.a;
        if (Objects.equals(null, null) && Objects.equals(this.h, ypbVar.h)) {
            boolean z = ypbVar.i;
            if (Objects.equals(false, false)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ypk
    public int hashCode() {
        return Objects.hash(null, this.h, false);
    }

    @Override // defpackage.ypk
    public final String toString() {
        return c().toString();
    }
}

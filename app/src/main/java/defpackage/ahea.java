package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahea extends ahlt implements ahdg {
    public final String c(String str) {
        StringBuilder sb = new StringBuilder("List{");
        sb.append(str);
        sb.append("}[");
        Object obj = this.e.a;
        obj.getClass();
        boolean z = true;
        for (ahlv ahlvVarH = (ahlv) obj; !agvy.c(ahlvVarH, this); ahlvVarH = ahlvVarH.h()) {
            if (ahlvVarH instanceof ahdq) {
                if (!z) {
                    sb.append(", ");
                }
                sb.append(ahlvVarH);
                z = false;
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // defpackage.ahdg
    public final boolean fo() {
        return true;
    }

    @Override // defpackage.ahlv
    public final String toString() {
        return ahbx.a ? c("Active") : super.toString();
    }

    @Override // defpackage.ahdg
    public final ahea a() {
        return this;
    }
}

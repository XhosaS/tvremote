package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yqq extends yxd implements yqa {
    public final String c(String str) {
        StringBuilder sb = new StringBuilder("List{");
        sb.append(str);
        sb.append("}[");
        Object objF = f();
        objF.getClass();
        boolean z = true;
        for (yxf yxfVarH = (yxf) objF; !yks.e(yxfVarH, this); yxfVarH = yxfVarH.h()) {
            if (yxfVarH instanceof yqh) {
                if (!z) {
                    sb.append(", ");
                }
                sb.append(yxfVarH);
                z = false;
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // defpackage.yqa
    public final boolean eE() {
        return true;
    }

    @Override // defpackage.yxf
    public final String toString() {
        return yoy.a ? c("Active") : super.toString();
    }

    @Override // defpackage.yqa
    public final yqq eC() {
        return this;
    }
}

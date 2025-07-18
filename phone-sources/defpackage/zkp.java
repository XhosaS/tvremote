package defpackage;

import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class zkp extends zkx {
    public zkp(OutputStream outputStream) {
        super(outputStream);
    }

    @Override // defpackage.zkx, defpackage.zjf
    public final void i(zih[] zihVarArr) {
        for (zih zihVar : zihVarArr) {
            zihVar.p().k().c(this, true);
        }
    }

    @Override // defpackage.zkx, defpackage.zjf
    public final void n(zjh[] zjhVarArr) {
        for (zjh zjhVar : zjhVarArr) {
            zjhVar.k().c(this, true);
        }
    }

    @Override // defpackage.zkx, defpackage.zjf
    public final void p(zjh zjhVar) {
        zjhVar.k().c(this, true);
    }

    @Override // defpackage.zjf
    public final zkp d() {
        return this;
    }
}

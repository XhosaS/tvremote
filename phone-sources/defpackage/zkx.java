package defpackage;

import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes3.dex */
class zkx extends zjf {
    public zkx(OutputStream outputStream) {
        super(outputStream);
    }

    @Override // defpackage.zjf
    public void i(zih[] zihVarArr) {
        for (zih zihVar : zihVarArr) {
            zihVar.p().l().c(this, true);
        }
    }

    @Override // defpackage.zjf
    public void n(zjh[] zjhVarArr) {
        for (zjh zjhVar : zjhVarArr) {
            zjhVar.l().c(this, true);
        }
    }

    @Override // defpackage.zjf
    public void p(zjh zjhVar) {
        zjhVar.l().c(this, true);
    }

    @Override // defpackage.zjf
    public final zkx e() {
        return this;
    }
}

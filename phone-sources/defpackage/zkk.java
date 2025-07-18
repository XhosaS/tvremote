package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zkk extends zim {
    public zkk(zjb zjbVar, ziu ziuVar, zjh zjhVar, int i, zjh zjhVar2) {
        super(zjbVar, ziuVar, zjhVar, i, zjhVar2);
    }

    @Override // defpackage.zim
    public final zjm b() {
        zii ziiVar = new zii(4);
        zjb zjbVar = this.a;
        if (zjbVar != null) {
            ziiVar.b(zjbVar);
        }
        ziu ziuVar = this.b;
        if (ziuVar != null) {
            ziiVar.b(ziuVar);
        }
        zjh zjhVar = this.c;
        if (zjhVar != null) {
            ziiVar.b(zjhVar.k());
        }
        int i = this.d;
        ziiVar.b(new zks(i == 0, i, this.e));
        return new zkq(ziiVar);
    }

    @Override // defpackage.zim, defpackage.zjh
    public final zjh k() {
        return this;
    }

    @Override // defpackage.zjh
    public final zjh l() {
        return this;
    }
}

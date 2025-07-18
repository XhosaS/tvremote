package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zkv extends zim {
    public zkv(zky zkyVar) {
        super(zkyVar);
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
            ziiVar.b(zjhVar.l());
        }
        int i = this.d;
        ziiVar.b(new zla(i == 0, i, this.e));
        return new zky(ziiVar);
    }

    @Override // defpackage.zjh
    public final zjh l() {
        return this;
    }
}

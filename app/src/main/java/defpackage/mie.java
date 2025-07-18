package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mie extends aqu {
    final /* synthetic */ aqy a;

    public mie(aqy aqyVar) {
        this.a = aqyVar;
    }

    @Override // defpackage.aqu
    public final void a() {
        mif.b = true;
        aqy aqyVar = this.a;
        aqyVar.c.writeLock().lock();
        try {
            aqyVar.d.remove(this);
        } finally {
            aqyVar.c.writeLock().unlock();
        }
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class otw extends afeu {
    public otu b;
    public final qzv d;
    public final Object a = new Object();
    public boolean c = false;

    public otw(qzv qzvVar) {
        this.d = qzvVar;
        if (yqv.c("application/grpc")) {
            return;
        }
        qzvVar.k = "application/grpc";
    }

    @Override // defpackage.afeu
    public final afev a() {
        synchronized (this.a) {
            if (this.b != null) {
                return new otv();
            }
            otu otuVar = new otu(this.d);
            this.b = otuVar;
            return otuVar;
        }
    }
}

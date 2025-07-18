package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aqr implements yjz {
    final /* synthetic */ bkp a;
    final /* synthetic */ od b;
    final /* synthetic */ bcb c;
    final /* synthetic */ sj d;
    final /* synthetic */ bol e;
    final /* synthetic */ long f;
    final /* synthetic */ float g;
    final /* synthetic */ yka h;

    public aqr(bkp bkpVar, od odVar, bcb bcbVar, sj sjVar, bol bolVar, long j, float f, yka ykaVar) {
        this.a = bkpVar;
        this.b = odVar;
        this.c = bcbVar;
        this.d = sjVar;
        this.e = bolVar;
        this.f = j;
        this.g = f;
        this.h = ykaVar;
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        bao baoVar = (bao) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = iIntValue & 3;
        if (baoVar.L(i != 2, iIntValue & 1)) {
            wv.J(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, baoVar, 384);
        } else {
            baoVar.t();
        }
        return ygi.a;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gpv extends agtq {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ gpx c;
    int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gpv(gpx gpxVar, agsw agswVar) {
        super(agswVar);
        this.c = gpxVar;
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.d(null, this);
    }
}

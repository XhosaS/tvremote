package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afwa {
    public final afhj a;
    public affe b;
    public boolean c = false;
    public afff d = afff.a(affe.IDLE);

    public afwa(afhj afhjVar, affe affeVar) {
        this.a = afhjVar;
        this.b = affeVar;
    }

    public final void a(affe affeVar) {
        boolean z;
        this.b = affeVar;
        if (affeVar == affe.READY || affeVar == affe.TRANSIENT_FAILURE) {
            z = true;
        } else if (affeVar != affe.IDLE) {
            return;
        } else {
            z = false;
        }
        this.c = z;
    }
}

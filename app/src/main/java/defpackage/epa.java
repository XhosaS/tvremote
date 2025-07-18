package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class epa extends abww implements abyr {
    public epa() {
        super(epb.a);
    }

    public final void a(adga adgaVar) {
        if ((this.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            y();
        }
        epb epbVar = (epb) this.b;
        epb epbVar2 = epb.a;
        adgaVar.getClass();
        adga adgaVar2 = epbVar.d;
        if (adgaVar2 != null && adgaVar2 != adga.a) {
            adfx adfxVar = new adfx();
            adfxVar.B(adgaVar2);
            adfxVar.B(adgaVar);
            adgaVar = (adga) adfxVar.w();
        }
        epbVar.d = adgaVar;
        epbVar.b |= 2;
    }
}

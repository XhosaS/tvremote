package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahod {
    public static final /* synthetic */ ahov a(ahon ahonVar) {
        abxd abxdVarV = ahonVar.v();
        abxdVarV.getClass();
        return (ahov) abxdVarV;
    }

    public static final void b(int i, ahon ahonVar) {
        if ((ahonVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ahonVar.y();
        }
        ahov ahovVar = (ahov) ahonVar.b;
        ahov ahovVar2 = ahov.a;
        ahovVar.e = i - 1;
        ahovVar.c |= 2;
    }

    public static final void c(int i, ahon ahonVar) {
        if ((ahonVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ahonVar.y();
        }
        ahov ahovVar = (ahov) ahonVar.b;
        ahov ahovVar2 = ahov.a;
        ahovVar.d = i - 1;
        ahovVar.c |= 1;
    }
}

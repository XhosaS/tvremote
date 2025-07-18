package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fxb {
    public static final /* synthetic */ fxa a(fwz fwzVar) {
        abxd abxdVarV = fwzVar.v();
        abxdVarV.getClass();
        return (fxa) abxdVarV;
    }

    public static final void b(int i, fwz fwzVar) {
        if (i == 0) {
            throw null;
        }
        if ((fwzVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            fwzVar.y();
        }
        fxa fxaVar = (fxa) fwzVar.b;
        fxa fxaVar2 = fxa.a;
        if (i == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        fxaVar.c = i - 2;
        fxaVar.b |= 1;
    }
}

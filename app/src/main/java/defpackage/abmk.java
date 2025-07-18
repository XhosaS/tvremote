package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abmk {
    public static final /* synthetic */ abmt a(abms abmsVar) {
        abxd abxdVarV = abmsVar.v();
        abxdVarV.getClass();
        return (abmt) abxdVarV;
    }

    public static final void b(String str, abms abmsVar) {
        str.getClass();
        if ((abmsVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            abmsVar.y();
        }
        abmt abmtVar = (abmt) abmsVar.b;
        abmt abmtVar2 = abmt.a;
        abmtVar.b |= 2;
        abmtVar.d = str;
    }

    public static final void c(int i, abms abmsVar) {
        if ((abmsVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            abmsVar.y();
        }
        abmt abmtVar = (abmt) abmsVar.b;
        abmt abmtVar2 = abmt.a;
        abmtVar.f = i;
        abmtVar.b |= 8;
    }
}

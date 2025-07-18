package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abku {
    public static final /* synthetic */ abkt a(abkq abkqVar) {
        abxd abxdVarV = abkqVar.v();
        abxdVarV.getClass();
        return (abkt) abxdVarV;
    }

    public static final void b(String str, abkq abkqVar) {
        if ((abkqVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            abkqVar.y();
        }
        abkt abktVar = (abkt) abkqVar.b;
        abkt abktVar2 = abkt.a;
        abyl abylVar = abktVar.b;
        if (!abylVar.b) {
            abktVar.b = abylVar.a();
        }
        abktVar.b.put("X-Geo", str);
    }
}

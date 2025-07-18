package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class rdh {
    protected final ahug a;

    public rdh(ahug ahugVar) {
        this.a = ahugVar;
    }

    public abstract long a(String str);

    public abstract ahug b(Long l);

    public abstract ahug c(Long l);

    public abstract boolean d();

    public final ahug e() {
        ahug ahugVarB = b(null);
        ahud ahudVar = new ahud();
        ahudVar.B(ahugVarB);
        if ((ahudVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ahudVar.y();
        }
        ahug ahugVar = (ahug) ahudVar.b;
        ahug ahugVar2 = ahug.a;
        ahugVar.b |= 2;
        ahugVar.c = -1L;
        return (ahug) ahudVar.v();
    }
}

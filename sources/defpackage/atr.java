package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atr extends atp {
    public static final atr a = new atr();

    private atr() {
    }

    @Override // defpackage.atp
    public final /* synthetic */ cmz a(String str, Object obj) {
        return se.p(str, k$$ExternalSyntheticApiModelOutline1.m32m(obj));
    }

    @Override // defpackage.atp
    public final /* synthetic */ cmz b(cmz cmzVar, cmz cmzVar2) {
        return se.o((cws) cmzVar, (cws) cmzVar2);
    }

    @Override // defpackage.atp
    public final /* bridge */ /* synthetic */ String c(cmz cmzVar) {
        cws cwsVar = (cws) cmzVar;
        cwn cwnVar = cwsVar.e;
        if (cwnVar == null) {
            cwnVar = cwn.a;
        }
        int i = cwnVar.b & 2;
        cwn cwnVar2 = cwsVar.e;
        if (i != 0) {
            if (cwnVar2 == null) {
                cwnVar2 = cwn.a;
            }
            return cwnVar2.d;
        }
        if (cwnVar2 == null) {
            cwnVar2 = cwn.a;
        }
        return Long.toHexString(cwnVar2.c);
    }
}

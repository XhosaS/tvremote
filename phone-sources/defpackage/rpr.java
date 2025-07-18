package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rpr extends rpp {
    public static final rpr a = new rpr();

    private rpr() {
    }

    @Override // defpackage.rpp
    public final /* synthetic */ vvj a(String str, Object obj) {
        return rrx.t(str, a$$ExternalSyntheticApiModelOutline0.m5m(obj));
    }

    @Override // defpackage.rpp
    public final /* synthetic */ vvj b(vvj vvjVar, vvj vvjVar2) {
        return rrx.s((yze) vvjVar, (yze) vvjVar2);
    }

    @Override // defpackage.rpp
    public final /* bridge */ /* synthetic */ String c(vvj vvjVar) {
        yze yzeVar = (yze) vvjVar;
        yyz yyzVar = yzeVar.e;
        if (yyzVar == null) {
            yyzVar = yyz.a;
        }
        int i = yyzVar.b & 2;
        yyz yyzVar2 = yzeVar.e;
        if (i != 0) {
            if (yyzVar2 == null) {
                yyzVar2 = yyz.a;
            }
            return yyzVar2.d;
        }
        if (yyzVar2 == null) {
            yyzVar2 = yyz.a;
        }
        return Long.toHexString(yyzVar2.c);
    }
}

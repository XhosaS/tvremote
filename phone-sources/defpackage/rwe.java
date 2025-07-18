package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rwe implements rwf {
    private final /* synthetic */ int a;

    public rwe(int i) {
        this.a = i;
    }

    @Override // defpackage.rwf
    public final /* synthetic */ String a(vvi vviVar) {
        int i = this.a;
        return i != 0 ? i != 1 ? ((yzw) ((vty) vviVar).b).c : ((zba) ((vtw) vviVar).b).e : ((yyw) ((vtw) vviVar).b).f;
    }

    @Override // defpackage.rwf
    public final /* synthetic */ String b(vvi vviVar) {
        int i = this.a;
        return i != 0 ? i != 1 ? ((yzw) ((vty) vviVar).b).e : ((zba) ((vtw) vviVar).b).d : ((yyw) ((vtw) vviVar).b).e;
    }

    @Override // defpackage.rwf
    public final /* synthetic */ void c(vvi vviVar, Long l) {
        int i = this.a;
        if (i == 0) {
            if (l == null) {
                vtw vtwVar = (vtw) vviVar;
                if (!vtwVar.b.A()) {
                    vtwVar.u();
                }
                yyw yywVar = (yyw) vtwVar.b;
                yyw yywVar2 = yyw.a;
                yywVar.b &= -3;
                yywVar.d = 0L;
                return;
            }
            long jLongValue = l.longValue();
            vtw vtwVar2 = (vtw) vviVar;
            if (!vtwVar2.b.A()) {
                vtwVar2.u();
            }
            yyw yywVar3 = (yyw) vtwVar2.b;
            yyw yywVar4 = yyw.a;
            yywVar3.b |= 2;
            yywVar3.d = jLongValue;
            return;
        }
        if (i != 1) {
            vty vtyVar = (vty) vviVar;
            if (l == null) {
                if (!vtyVar.b.A()) {
                    vtyVar.u();
                }
                yzw yzwVar = (yzw) vtyVar.b;
                yzw yzwVar2 = yzw.a;
                yzwVar.b &= -3;
                yzwVar.d = 0L;
                return;
            }
            long jLongValue2 = l.longValue();
            if (!vtyVar.b.A()) {
                vtyVar.u();
            }
            yzw yzwVar3 = (yzw) vtyVar.b;
            yzw yzwVar4 = yzw.a;
            yzwVar3.b |= 2;
            yzwVar3.d = jLongValue2;
            return;
        }
        if (l == null) {
            vtw vtwVar3 = (vtw) vviVar;
            if (!vtwVar3.b.A()) {
                vtwVar3.u();
            }
            zba zbaVar = (zba) vtwVar3.b;
            zba zbaVar2 = zba.a;
            zbaVar.b &= -2;
            zbaVar.c = 0L;
            return;
        }
        long jLongValue3 = l.longValue();
        vtw vtwVar4 = (vtw) vviVar;
        if (!vtwVar4.b.A()) {
            vtwVar4.u();
        }
        zba zbaVar3 = (zba) vtwVar4.b;
        zba zbaVar4 = zba.a;
        zbaVar3.b |= 1;
        zbaVar3.c = jLongValue3;
    }

    @Override // defpackage.rwf
    public final /* synthetic */ void d(vvi vviVar) {
        int i = this.a;
        if (i == 0) {
            vtw vtwVar = (vtw) vviVar;
            if (!vtwVar.b.A()) {
                vtwVar.u();
            }
            yyw yywVar = (yyw) vtwVar.b;
            yyw yywVar2 = yyw.a;
            yywVar.b &= -5;
            yywVar.e = yyw.a.e;
            return;
        }
        if (i != 1) {
            vty vtyVar = (vty) vviVar;
            if (!vtyVar.b.A()) {
                vtyVar.u();
            }
            yzw yzwVar = (yzw) vtyVar.b;
            yzw yzwVar2 = yzw.a;
            yzwVar.b &= -5;
            yzwVar.e = yzw.a.e;
            return;
        }
        vtw vtwVar2 = (vtw) vviVar;
        if (!vtwVar2.b.A()) {
            vtwVar2.u();
        }
        zba zbaVar = (zba) vtwVar2.b;
        zba zbaVar2 = zba.a;
        zbaVar.b &= -3;
        zbaVar.d = zba.a.d;
    }
}

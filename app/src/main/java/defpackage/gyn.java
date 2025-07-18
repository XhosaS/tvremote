package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gyn {
    public final gzc a;
    final /* synthetic */ gyv b;
    private final agpc c;
    private final agpc d;

    public gyn(final gyv gyvVar, gzc gzcVar) {
        gzcVar.getClass();
        this.b = gyvVar;
        this.a = gzcVar;
        this.c = new agpn(new agum() { // from class: gyl
            @Override // defpackage.agum
            public final Object a() {
                String str = String.format("%s-%s", Arrays.copyOf(new Object[]{this.a.a.b().T.a, gyvVar.g.name()}, 2));
                str.getClass();
                return str;
            }
        });
        this.d = new agpn(new agum() { // from class: gym
            @Override // defpackage.agum
            public final Object a() {
                abxk abxkVar = ahrs.a;
                ahrq ahrqVar = new ahrq();
                ahru ahruVar = ahru.a;
                ahrt ahrtVar = new ahrt();
                ahqx ahqxVarD = gyvVar.d();
                if ((ahrtVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    ahrtVar.y();
                }
                gyn gynVar = this;
                ahru ahruVar2 = (ahru) ahrtVar.b;
                ahruVar2.c = ahqxVarD;
                ahruVar2.b |= 1;
                gzc gzcVar2 = gynVar.a;
                String str = gzcVar2.b().T.a;
                str.getClass();
                if ((ahrtVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    ahrtVar.y();
                }
                ahru ahruVar3 = (ahru) ahrtVar.b;
                int i = 2;
                ahruVar3.b |= 2;
                ahruVar3.d = str;
                int iA = gzcVar2.a();
                if ((ahrtVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    ahrtVar.y();
                }
                ahru ahruVar4 = (ahru) ahrtVar.b;
                ahruVar4.b |= 4;
                ahruVar4.e = iA;
                if (gzcVar2 instanceof glu) {
                    i = 4;
                } else {
                    if (!(gzcVar2 instanceof gyi)) {
                        throw new agpg();
                    }
                    int iF = ((gyi) gzcVar2).f() - 1;
                    if (iF == 0) {
                        i = 5;
                    } else if (iF == 1) {
                        i = 6;
                    }
                }
                if ((ahrtVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    ahrtVar.y();
                }
                ahru ahruVar5 = (ahru) ahrtVar.b;
                ahruVar5.f = i - 2;
                ahruVar5.b |= 8;
                abxd abxdVarV = ahrtVar.v();
                abxdVarV.getClass();
                ahru ahruVar6 = (ahru) abxdVarV;
                if ((ahrqVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    ahrqVar.y();
                }
                ahrs ahrsVar = (ahrs) ahrqVar.b;
                ahrsVar.g = ahruVar6;
                ahrsVar.f = 7;
                return ahta.a(ahrqVar);
            }
        });
    }

    private final String d() {
        return (String) this.c.a();
    }

    private final ahrs e() {
        return (ahrs) this.d.a();
    }

    public final void a(abqb abqbVar) {
        abqbVar.getClass();
        gyv gyvVar = this.b;
        if (((Boolean) gyvVar.d.a()).booleanValue()) {
            gfg gfgVarA = ((gfn) gyvVar.e.a()).c(rpm.eC()).a(d());
            gfgVarA.f(e());
            gfgVarA.c(abqbVar);
        }
    }

    public final void b() {
        gyv gyvVar = this.b;
        if (((Boolean) gyvVar.d.a()).booleanValue()) {
            gfl gflVarA = ((gfn) gyvVar.e.a()).a(rpm.cH()).a(d());
            gflVarA.g(e());
            gflVarA.c();
        }
    }

    public final void c() {
        gyv gyvVar = this.b;
        if (((Boolean) gyvVar.d.a()).booleanValue()) {
            gfl gflVarA = ((gfn) gyvVar.e.a()).b(rpm.cI()).a(d());
            gflVarA.g(e());
            gflVarA.c();
        }
    }
}

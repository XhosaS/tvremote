package defpackage;

import j$.util.DesugarCollections;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fiv extends agtu implements agvb {
    int a;
    final /* synthetic */ fiw b;
    final /* synthetic */ String c;
    final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fiv(fiw fiwVar, String str, String str2, agsw agswVar) {
        super(2, agswVar);
        this.b = fiwVar;
        this.c = str;
        this.d = str2;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fiv) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            fiw fiwVar = this.b;
            final String str = this.c;
            final String str2 = this.d;
            this.a = 1;
            Object objB = fiwVar.b.e.b(new agux() { // from class: fhx
                @Override // defpackage.agux
                public final Object a(Object obj2) {
                    fnp fnpVar = (fnp) obj2;
                    fic ficVar = fiu.a;
                    fnpVar.getClass();
                    fnd fndVar = fnpVar.c;
                    if (fndVar == null) {
                        fndVar = fnd.a;
                    }
                    String str3 = str;
                    fnc fncVar = (fnc) DesugarCollections.unmodifiableMap(fndVar.c).get(str3);
                    String str4 = null;
                    if (fncVar != null) {
                        fnb fnbVar = fncVar.c;
                        if (fnbVar == null) {
                            fnbVar = fnb.a;
                        }
                        if (fnbVar != null) {
                            str4 = fnbVar.e;
                        }
                    }
                    String str5 = str2;
                    if (agvy.c(str4, str5)) {
                        return fnpVar;
                    }
                    fno fnoVar = new fno();
                    fnoVar.B(fnpVar);
                    fnd fndVarA = fnq.a(fnoVar);
                    fmv fmvVar = new fmv();
                    fmvVar.B(fndVarA);
                    fne.b(fmvVar);
                    Object objB2 = fne.b(fmvVar).get(str3);
                    if (objB2 == null) {
                        fnc fncVar2 = fnc.a;
                        objB2 = fng.b(new fmz());
                    }
                    fmz fmzVar = new fmz();
                    fmzVar.B((fnc) objB2);
                    fnb fnbVarA = fng.a(fmzVar);
                    fna fnaVar = new fna();
                    fnaVar.B(fnbVarA);
                    fnh.d(str5, fnaVar);
                    fnb fnbVarA2 = fnh.a(fnaVar);
                    if ((fmzVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        fmzVar.y();
                    }
                    fnc fncVar3 = (fnc) fmzVar.b;
                    fncVar3.c = fnbVarA2;
                    fncVar3.b |= 1;
                    fne.f(str3, fng.b(fmzVar), fmvVar);
                    fnd fndVarA2 = fne.a(fmvVar);
                    if ((fnoVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        fnoVar.y();
                    }
                    fnp fnpVar2 = (fnp) fnoVar.b;
                    fnpVar2.c = fndVarA2;
                    fnpVar2.b |= 1;
                    return fnq.c(fnoVar);
                }
            }, this);
            if (objB != agtgVar) {
                objB = agpu.a;
            }
            if (objB == agtgVar) {
                return agtgVar;
            }
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new fiv(this.b, this.c, this.d, agswVar);
    }
}

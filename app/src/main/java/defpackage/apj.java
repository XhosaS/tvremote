package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class apj {
    public final ahbt a;
    public final agvb b;
    public final ahfn c = ahfq.a(Integer.MAX_VALUE, 0, 6);
    public final alq d = new alq();

    public apj(ahbt ahbtVar, final agux aguxVar, final agvb agvbVar, agvb agvbVar2) {
        this.a = ahbtVar;
        this.b = agvbVar2;
        ahdl ahdlVar = (ahdl) ahbtVar.fs().get(ahdl.c);
        if (ahdlVar != null) {
            ahdlVar.w(new agux() { // from class: aph
                @Override // defpackage.agux
                public final Object a(Object obj) {
                    Throwable th = (Throwable) obj;
                    aguxVar.a(th);
                    ahfn ahfnVar = this.c;
                    ahfnVar.u(th);
                    while (true) {
                        Object objA = ahft.a(ahfnVar.h());
                        if (objA == null) {
                            return agpu.a;
                        }
                        agvbVar.a(objA, th);
                    }
                }
            });
        }
    }
}

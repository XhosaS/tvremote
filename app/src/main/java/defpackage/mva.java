package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mva {
    public final agow a;
    private final tkb b;

    public mva(tkb tkbVar, agow agowVar) {
        this.b = tkbVar;
        this.a = agowVar;
    }

    public final agff a(agff agffVar, CommandOuterClass$Command commandOuterClass$Command, SenderStateOuterClass$SenderState senderStateOuterClass$SenderState, adav adavVar, abwk abwkVar) {
        final oad oadVarA = this.b.a(abwkVar == null ? 0 : abwkVar.a());
        final adav adavVar2 = null;
        agff agffVarD = agffVar.e(new aggy() { // from class: mux
            @Override // defpackage.aggy
            public final void a(Object obj) {
            }
        }).d(new aggy(adavVar2, oadVarA) { // from class: muy
            public final /* synthetic */ adav b = null;
            public final /* synthetic */ oad c;

            {
                this.c = oadVarA;
            }

            @Override // defpackage.aggy
            public final void a(Object obj) {
                this.a.b(this.c, (Throwable) obj);
            }
        });
        aggv aggvVar = new aggv(adavVar2, oadVarA) { // from class: muz
            public final /* synthetic */ adav b = null;
            public final /* synthetic */ oad c;

            {
                this.c = oadVarA;
            }

            @Override // defpackage.aggv
            public final void a() {
                this.a.b(this.c, null);
            }
        };
        aggy aggyVar = aghm.c;
        return agffVarD.m(aggyVar, aggyVar, aggvVar);
    }

    public final void b(oad oadVar, Throwable th) {
        tkc tkcVar = (tkc) oadVar;
        tkcVar.a.g(th == null ? "Runtime.Command.Success" : "Runtime.Command.Error", tkcVar.b);
    }
}

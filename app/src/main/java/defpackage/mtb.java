package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mtb implements agfj {
    public final oco a;
    public final oal b;

    private mtb(oco ocoVar, oal oalVar) {
        this.a = ocoVar;
        this.b = oalVar;
    }

    public final mtb a(oal oalVar) {
        return new mtb(this.a, oalVar);
    }

    @Override // defpackage.agfj
    public final agfi b(agff agffVar) {
        agiw agiwVar = new agiw(agffVar.d(new aggy() { // from class: mta
            @Override // defpackage.aggy
            public final void a(Object obj) {
                mtb mtbVar = this.a;
                mtbVar.a.d(acsw.LOG_TYPE_COMMAND_EXECUTION_ERROR, mtbVar.b, (Throwable) obj, "Command error", new Object[0]);
            }
        }));
        aggz aggzVar = agoh.n;
        return agiwVar;
    }

    public mtb(oco ocoVar) {
        this.a = ocoVar;
        this.b = oal.A;
    }
}

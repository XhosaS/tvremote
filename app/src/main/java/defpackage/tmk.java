package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tmk implements oco {
    private static final yyr a;
    private static final yyr b;
    private final tmg c;

    static {
        yyn yynVar = new yyn(4);
        yynVar.c(acsw.LOG_TYPE_WIRE_FORMAT_ERROR, adfj.WIRE_FORMAT_ERROR);
        yynVar.c(acsw.LOG_TYPE_CONFIGURATION_ERROR, adfj.CONFIGURATION_ERROR);
        yynVar.c(acsw.LOG_TYPE_INTERNAL_TEMPLATE_RESOLUTION_ERROR, adfj.INTERNAL_TEMPLATE_RESOLUTION_ERROR);
        yynVar.c(acsw.LOG_TYPE_INTERNAL_ERROR, adfj.INTERNAL_ERROR);
        yynVar.c(acsw.LOG_TYPE_INTERNAL_RESOURCE_ERROR, adfj.INTERNAL_RESOURCE_ERROR);
        yynVar.c(acsw.LOG_TYPE_INTERNAL_UTP_ERROR, adfj.INTERNAL_UTP_ERROR);
        yynVar.c(acsw.ERROR_TYPE_UNKNOWN, adfj.INTERNAL_RUNTIME_ERROR_UNSPECIFIED);
        a = yynVar.a(false);
        yyn yynVar2 = new yyn(4);
        yynVar2.c(acsw.LOG_TYPE_INVALID_FIELD, adfk.INVALID_VALUE);
        yynVar2.c(acsw.LOG_TYPE_MISSING_FIELD, adfk.MISSING_FIELD);
        yynVar2.c(acsw.LOG_TYPE_UNKNOWN_EXTENSION, adfk.UNKNOWN_EXTENSION);
        yynVar2.c(acsw.LOG_TYPE_MODEL_ERROR, adfk.MODEL_ERROR);
        yynVar2.c(acsw.LOG_TYPE_COMMAND_EXECUTION_ERROR, adfk.COMMAND_EXECUTION_ERROR);
        yynVar2.c(acsw.LOG_TYPE_INTERNAL_MISSING_RESOURCE_ERROR, adfk.MISSING_TEMPLATE_ERROR);
        yynVar2.c(acsw.LOG_TYPE_PROPERTY_RESOLUTION_ERROR, adfk.PROPERTY_RESOLUTION_ERROR);
        b = yynVar2.a(false);
    }

    public tmk(tmg tmgVar) {
        this.c = tmgVar;
    }

    @Override // defpackage.oco
    public final /* synthetic */ void a(acwg acwgVar, String str, Object... objArr) {
        ocn.a(this, acwgVar, str, objArr);
    }

    @Override // defpackage.oco
    public final /* synthetic */ void b(acsw acswVar, oal oalVar, String str, Object... objArr) {
        d(acswVar, oalVar, null, str, objArr);
    }

    @Override // defpackage.oco
    public final /* synthetic */ void c(acwg acwgVar, oal oalVar, String str, Object... objArr) {
        ocn.b(this, acwgVar, oalVar, null, str, objArr);
    }

    @Override // defpackage.oco
    public final void d(acsw acswVar, oal oalVar, Throwable th, String str, Object... objArr) {
        yyr yyrVar = a;
        if (yyrVar.containsKey(acswVar)) {
            tmg tmgVar = this.c;
            adfj adfjVar = (adfj) yyrVar.get(acswVar);
            tlw tlwVar = (tlw) tmgVar.a.eV();
            int i = adfjVar.h;
            int i2 = tmgVar.d.b;
            ((uqo) tlwVar.c.eV()).a(1L, Integer.valueOf(i), Integer.valueOf(tmgVar.c.X), 0, tmgVar.b);
            return;
        }
        yyr yyrVar2 = b;
        if (yyrVar2.containsKey(acswVar)) {
            tmg tmgVar2 = this.c;
            adfk adfkVar = (adfk) yyrVar2.get(acswVar);
            tlw tlwVar2 = (tlw) tmgVar2.a.eV();
            int i3 = adfkVar.i;
            int i4 = tmgVar2.d.b;
            ((uqo) tlwVar2.b.eV()).a(1L, Integer.valueOf(i3), Integer.valueOf(tmgVar2.c.X), 0, tmgVar2.b);
        }
    }

    @Override // defpackage.oco
    public final /* synthetic */ void e(acwg acwgVar, oal oalVar, Throwable th, String str, Object... objArr) {
        ocn.b(this, acwgVar, oalVar, th, str, objArr);
    }

    @Override // defpackage.oco
    public final /* synthetic */ void f(acwg acwgVar, Throwable th, Object... objArr) {
        ocn.c(this, acwgVar, th, objArr);
    }
}

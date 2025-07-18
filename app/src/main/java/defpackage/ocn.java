package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ocn {
    public static void a(oco ocoVar, acwg acwgVar, String str, Object... objArr) {
        oak oakVarO = oal.O();
        StringBuilder sb = new StringBuilder();
        sb.append(acwgVar.d);
        ((nyw) oakVarO).h = sb;
        ocoVar.e(acwgVar, oakVarO.g(), null, str, objArr);
    }

    public static void b(oco ocoVar, acwg acwgVar, oal oalVar, Throwable th, String str, Object... objArr) {
        acsw acswVarB = acsw.b(acwgVar.c);
        if (acswVarB == null) {
            acswVarB = acsw.ERROR_TYPE_UNKNOWN;
        }
        ocoVar.d(acswVarB, oalVar, th, str, objArr);
    }

    public static void c(oco ocoVar, acwg acwgVar, Throwable th, Object... objArr) {
        acsw acswVarB = acsw.b(acwgVar.c);
        if (acswVarB == null) {
            acswVarB = acsw.ERROR_TYPE_UNKNOWN;
        }
        acsw acswVar = acswVarB;
        oak oakVarO = oal.O();
        StringBuilder sb = new StringBuilder();
        sb.append(acwgVar.d);
        ((nyw) oakVarO).h = sb;
        ocoVar.d(acswVar, oakVarO.g(), th, "Ripple Color (attribute = android.R.attr.colorControlHighlight) is associated with undefined.", objArr);
    }
}

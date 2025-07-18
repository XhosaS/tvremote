package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dsp {
    public static String a(dru druVar) {
        if (druVar == null) {
            return "ComponentContext is null";
        }
        dsu dsuVarD = dsu.d(druVar.h);
        if (dsuVarD == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        b(dsuVarD, 0, sb);
        return sb.toString();
    }

    private static void b(dsu dsuVar, int i, StringBuilder sb) {
        if (dsuVar == null) {
            return;
        }
        sb.append(dsuVar.b().d());
        sb.append('{');
        dvz dvzVarF = dsuVar.f();
        dsx dsxVarE = dsuVar.e();
        sb.append((dvzVarF == null || dvzVarF.getVisibility() != 0) ? "H" : "V");
        if (dsxVarE != null && dsxVarE.a() != null) {
            sb.append(" [clickable]");
        }
        if (dsxVarE != null) {
            sb.append(" ");
            eoe eoeVar = dsxVarE.a.e;
            sb.append(eoeVar.a());
            sb.append("x");
            sb.append(eoeVar.b());
        }
        sb.append('}');
        for (dsu dsuVar2 : dsuVar.g()) {
            sb.append("\n");
            for (int i2 = 0; i2 <= i; i2++) {
                sb.append("  ");
            }
            b(dsuVar2, i + 1, sb);
        }
    }
}

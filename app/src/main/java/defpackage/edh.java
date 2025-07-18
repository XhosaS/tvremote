package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class edh {
    public static dxc a(dru druVar, int i, ecq ecqVar, ecq ecqVar2) {
        ohv ohvVarO = druVar.o();
        if (ohvVarO == null) {
            return null;
        }
        dxc dxcVarA = dwb.a(druVar, ohvVarO, ohvVarO.a(druVar, i));
        if (dxcVarA != null) {
            dxcVarA.b("section_current", ecqVar == null ? "null" : ecqVar.f);
            dxcVarA.b("section_next", ecqVar2 != null ? ecqVar2.f : "null");
        }
        return dxcVarA;
    }

    public static String b(int i) {
        return i != -1 ? i != 0 ? i != 1 ? i != 2 ? "updateStateAsync" : "updateState" : "setRootAsync" : "setRoot" : "none";
    }
}

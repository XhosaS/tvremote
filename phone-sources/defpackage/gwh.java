package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gwh {
    public static final gwh a = new gwh();
    private static riv b;

    private gwh() {
    }

    public static final riv a(Context context) {
        context.getClass();
        riv rivVar = b;
        return rivVar == null ? a.b(context) : rivVar;
    }

    private final synchronized riv b(Context context) {
        riv rivVar;
        riv rivVar2 = b;
        if (rivVar2 != null) {
            return rivVar2;
        }
        Object applicationContext = context.getApplicationContext();
        gwk gwkVar = applicationContext instanceof gwk ? (gwk) applicationContext : null;
        if (gwkVar != null) {
            rivVar = gwkVar.a();
        } else {
            cvi cviVar = new cvi(context);
            Object obj = cviVar.b;
            Object obj2 = cviVar.a;
            yga ygaVar = new yga(new grq(cviVar, 7));
            yga ygaVar2 = new yga(new grq(cviVar, 8));
            yga ygaVar3 = new yga(new gel(8));
            yhb yhbVar = yhb.a;
            rivVar = new riv((Context) obj, (gzo) obj2, ygaVar, ygaVar2, ygaVar3, new gag(yhbVar, yhbVar, yhbVar, yhbVar, yhbVar), (hjs) cviVar.c);
        }
        b = rivVar;
        return rivVar;
    }
}

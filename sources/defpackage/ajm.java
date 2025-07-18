package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajm extends agb {
    private static final qn a;
    private static final awy l;

    static {
        ajl ajlVar = new ajl();
        a = ajlVar;
        l = new awy("ClientTelemetry.API", ajlVar);
    }

    public ajm(Context context, ajg ajgVar) {
        super(context, l, ajgVar, aga.a);
    }

    public final void a(ajf ajfVar) {
        ahq ahqVar = new ahq();
        ahqVar.b = new aes[]{aep.a};
        ahqVar.b();
        ahqVar.a = new ajk(ajfVar, 0);
        f(ahqVar.a());
    }
}

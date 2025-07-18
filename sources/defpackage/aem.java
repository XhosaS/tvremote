package defpackage;

import android.content.Context;
import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aem implements ads {
    public static final ConcurrentHashMap a;
    public static Boolean b;
    public static Long c;
    public static final bzt e;
    public final Context d;

    static {
        bzt bztVar = new bzt(bar.a("com.google.android.gms.clearcut.public"), "", "", (byte[]) null);
        bzt bztVar2 = new bzt(bztVar.a, "gms:playlog:service:samplingrules_", bztVar.c, (byte[]) null);
        e = new bzt(bztVar2.a, bztVar2.b, "LogSamplingRulesV2__", (byte[]) null);
        a = new ConcurrentHashMap();
        b = null;
        c = null;
    }

    public aem(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.d = applicationContext;
        if (applicationContext != null) {
            bba.f(applicationContext);
        }
    }
}

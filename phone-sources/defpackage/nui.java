package defpackage;

import android.content.Context;
import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nui implements ntj {
    public static final ConcurrentHashMap a;
    static Boolean b;
    static Long c;
    public static final aafi e;
    public final Context d;

    static {
        jzs jzsVar = omg.a;
        aafi aafiVar = new aafi(rwt.a("com.google.android.gms.clearcut.public"), "", "");
        aafi aafiVar2 = new aafi(aafiVar.c, "gms:playlog:service:samplingrules_", aafiVar.a);
        e = new aafi(aafiVar2.c, aafiVar2.b, "LogSamplingRulesV2__");
        a = new ConcurrentHashMap();
        b = null;
        c = null;
    }

    public nui(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.d = applicationContext;
        if (applicationContext != null) {
            rxa.f(applicationContext);
        }
    }
}

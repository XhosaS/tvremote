package defpackage;

import android.content.Context;
import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kbh implements jzy {
    public static final rgg a;
    public static final ConcurrentHashMap b;
    static Boolean c;
    static Long d;
    public final Context e;

    static {
        rgg rggVar = new rgg(rff.a("com.google.android.gms.clearcut.public"));
        if (rggVar.e) {
            throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
        }
        rgg rggVar2 = new rgg(rggVar.a, rggVar.b, "gms:playlog:service:samplingrules_", rggVar.d, false, rggVar.f, rggVar.g);
        a = new rgg(rggVar2.a, rggVar2.b, rggVar2.c, "LogSamplingRulesV2__", rggVar2.e, rggVar2.f, rggVar2.g);
        b = new ConcurrentHashMap();
        c = null;
        d = null;
    }

    public kbh(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.e = applicationContext;
        if (applicationContext != null) {
            rgi.e(applicationContext);
        }
    }
}

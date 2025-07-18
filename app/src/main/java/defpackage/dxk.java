package defpackage;

import android.content.res.Configuration;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dxk {
    private static dxk a;
    private final Configuration b;

    protected dxk(Configuration configuration) {
        this.b = configuration;
    }

    static synchronized void a(Configuration configuration) {
        dxk dxkVar = a;
        if (dxkVar == null || !dxkVar.b.equals(configuration)) {
            a = new dwd(new Configuration(configuration));
        }
    }
}

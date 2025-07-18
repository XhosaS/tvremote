package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kln {
    static final /* synthetic */ ymp[] a;
    private static final ylq b;

    static {
        yky ykyVar = new yky(kln.class, "topPicksWidgetDataStore", "getTopPicksWidgetDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;");
        int i = ylg.a;
        a = new ymp[]{ykyVar};
        klk klkVar = klk.a;
        cjp cjpVar = new cjp(4);
        yot yotVar = ypk.a;
        b = new dat(klkVar, cjpVar, yoz.l(yya.a.plus(new yqy(null))));
    }

    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, java.util.List] */
    public static final dbd a(Context context) {
        dbd dbdVar;
        ylq ylqVar = b;
        a[0].getClass();
        synchronized (((dat) ylqVar).e) {
            if (((dat) ylqVar).f == null) {
                Context applicationContext = context.getApplicationContext();
                dcd dcdVar = new dcd(((dat) ylqVar).b, new aye(applicationContext, ylqVar, 6, null));
                yjv yjvVar = ((dat) ylqVar).c;
                applicationContext.getClass();
                ((dat) ylqVar).f = cwo.c(dcdVar, null, yjvVar.a(applicationContext), ((dat) ylqVar).d);
            }
            dbdVar = ((dat) ylqVar).f;
            dbdVar.getClass();
        }
        return dbdVar;
    }
}

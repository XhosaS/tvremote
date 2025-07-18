package defpackage;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class adg implements adq {
    public static volatile int a = -1;
    public static final akt[] b = new akt[0];
    public static final String[] c = new String[0];

    @Deprecated
    public static final awy j;
    private static final qn k;
    public final ads d;
    public final Context e;
    protected final adk f;
    protected final String g;
    public final String h;
    public final adv i;

    static {
        adf adfVar = new adf();
        k = adfVar;
        j = new awy("ClearcutLogger.API", adfVar);
    }

    protected adg(Context context, String str, adv advVar, adk adkVar, ads adsVar) {
        if (!advVar.a(adw.ACCOUNT_NAME)) {
            qp.k(true, "Upload account name cannot be used with a deidentified or pseudonymous logger.");
        }
        b(advVar);
        this.e = context.getApplicationContext();
        this.h = context.getPackageName();
        this.g = str;
        this.i = advVar;
        this.f = adkVar == null ? new aed(context) : adkVar;
        this.d = adsVar == null ? new aem(context) : adsVar;
    }

    static final String a(Iterable iterable) {
        return bdq.t(iterable, ", ");
    }

    public static final void b(adv advVar) {
        if (!advVar.equals(adv.c) && !advVar.equals(adv.a) && !advVar.equals(adv.b)) {
            throw new IllegalArgumentException("piiLevelSet must be one of ZWIEBACK_ONLY, NO_RESTRICTIONS, or DEIDENTIFIED");
        }
    }

    public static final int[] d(ArrayList arrayList) {
        if (arrayList == null) {
            return null;
        }
        int[] iArr = new int[arrayList.size()];
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            iArr[i2] = ((Integer) arrayList.get(i)).intValue();
            i++;
            i2++;
        }
        return iArr;
    }

    @Override // defpackage.adq
    public final boolean c() {
        return this.i.equals(adv.b);
    }
}

package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class nsv implements nth {
    static final oly[] a = new oly[0];
    static final String[] b = new String[0];

    @Deprecated
    public static final jzs k;
    private static volatile int l = -1;
    private static final npj m;
    private static final ocv n;
    public final ntj c;
    public final String d;
    protected final Context e;
    public final nta f;
    protected final String g;
    protected final String h;
    protected final ntn i;
    public final ntc j;

    static {
        npj npjVar = new npj(null);
        m = npjVar;
        nst nstVar = new nst();
        n = nstVar;
        k = new jzs("ClearcutLogger.API", (ocv) nstVar, npjVar);
    }

    protected nsv(Context context, String str, String str2, ntn ntnVar, nta ntaVar, ntj ntjVar, ntc ntcVar) {
        if (!ntnVar.a(nto.ACCOUNT_NAME)) {
            ocv.au(str2 == null, "Upload account name cannot be used with a deidentified or pseudonymous logger.");
        }
        d(ntnVar);
        this.e = context.getApplicationContext();
        this.h = context.getPackageName();
        this.g = str;
        this.d = str2;
        this.i = ntnVar;
        this.f = ntaVar == null ? new nty(context) : ntaVar;
        this.c = ntjVar == null ? new nui(context) : ntjVar;
        this.j = ntcVar;
    }

    static final int a(Context context) {
        if (l == -1) {
            synchronized (nsv.class) {
                if (l == -1) {
                    try {
                        l = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
                    } catch (PackageManager.NameNotFoundException e) {
                        Log.wtf("AbstractClearcutLogger", "This can't happen.", e);
                    }
                }
            }
        }
        return l;
    }

    static final String c(Iterable iterable) {
        return new tsp(", ").b(iterable);
    }

    static final void d(ntn ntnVar) {
        if (!ntnVar.equals(ntn.c) && !ntnVar.equals(ntn.a) && !ntnVar.equals(ntn.b)) {
            throw new IllegalArgumentException("piiLevelSet must be one of ZWIEBACK_ONLY, NO_RESTRICTIONS, or DEIDENTIFIED");
        }
    }

    static final int[] f(ArrayList arrayList) {
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

    @Override // defpackage.nth
    public final boolean e() {
        return this.i.equals(ntn.b);
    }
}

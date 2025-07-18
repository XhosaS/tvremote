package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.phenotype.ExperimentTokens;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class jyn implements jzw {

    @Deprecated
    public static final kei c;
    private static volatile int m = -1;
    private static final kdy o;
    public final jzy d;
    public final String e;
    public aece f;
    protected final Context g;
    public final jyx h;
    protected final String i;
    protected final String j;
    protected final kac k;
    public final jza l;
    static final ExperimentTokens[] a = new ExperimentTokens[0];
    static final String[] b = new String[0];
    private static final keh n = new keh();

    static {
        jyl jylVar = new jyl();
        o = jylVar;
        c = new kei("ClearcutLogger.API", jylVar);
    }

    protected jyn(Context context, String str, String str2, kac kacVar, jyx jyxVar, jzy jzyVar, jza jzaVar) {
        if (!kacVar.d.contains(kad.ACCOUNT_NAME)) {
            kkk.b(str2 == null, "Upload account name cannot be used with a deidentified or pseudonymous logger.");
        }
        c(kacVar);
        this.g = context.getApplicationContext();
        this.j = context.getPackageName();
        this.i = str;
        this.e = str2;
        this.k = kacVar;
        this.f = aece.DEFAULT;
        this.h = jyxVar == null ? new kau(context) : jyxVar;
        this.d = jzyVar == null ? new kbh(context) : jzyVar;
        this.l = jzaVar;
    }

    static final int a(Context context) {
        if (m == -1) {
            synchronized (jyn.class) {
                if (m == -1) {
                    try {
                        m = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
                    } catch (PackageManager.NameNotFoundException e) {
                        Log.wtf("AbstractClearcutLogger", "This can't happen.", e);
                    }
                }
            }
        }
        return m;
    }

    static final String b(Iterable iterable) {
        return new yqn(", ").c(iterable);
    }

    static final void c(kac kacVar) {
        if (!kacVar.equals(kac.c) && !kacVar.equals(kac.a) && !kacVar.equals(kac.b)) {
            throw new IllegalArgumentException("piiLevelSet must be one of ZWIEBACK_ONLY, NO_RESTRICTIONS, or DEIDENTIFIED");
        }
    }

    static final int[] e(ArrayList arrayList) {
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

    @Override // defpackage.jzw
    public final boolean d() {
        return this.k.equals(kac.b);
    }

    public final void f(aece aeceVar) {
        if (aeceVar == null) {
            aeceVar = aece.DEFAULT;
        }
        this.f = aeceVar;
    }
}

package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class ryl extends rxu implements rxy {
    private volatile int d;
    private ulp e;

    public ryl(String str, String str2, ryq ryqVar) {
        super(str, str2, ryqVar);
        this.d = -1;
    }

    @Override // defpackage.rxy
    public final int c() {
        return this.d;
    }

    @Override // defpackage.rxu
    protected final Object e(rwv rwvVar) {
        ryp rypVarA;
        Object objEu;
        Object obj;
        int iC = c();
        if (iC == -1 || iC < j().aC()) {
            synchronized (this) {
                int iC2 = c();
                Object objA = null;
                if (iC2 == -1) {
                    rwv.d();
                    rwvVar.getClass();
                    rypVarA = this.c.a(rwvVar);
                    k(rypVarA.i);
                } else {
                    rypVarA = null;
                }
                int iAC = j().aC();
                if (iC2 < iAC) {
                    rwv.d();
                    rwvVar.getClass();
                    Context context = rwvVar.c;
                    tst tstVarA = rwr.a(context);
                    if (tstVarA.g()) {
                        String strAF = ((ulp) tstVarA.c()).aF(rwt.a(this.a), null, this.b);
                        objEu = strAF == null ? null : eu(strAF);
                    }
                    if (rypVarA == null) {
                        rypVarA = this.c.a(rwvVar);
                    }
                    String str = rypVarA.b;
                    if (Build.VERSION.SDK_INT >= 26 && !context.getPackageName().equals("com.android.vending")) {
                        rrx.H(rwvVar.b().submit(new rmz(rwvVar, str, 10)));
                    }
                    boolean zG = g();
                    String str2 = this.b;
                    if (zG) {
                        yyh yyhVarD = rypVarA.d();
                        obj = ((ImmutableSet) yyhVarD.a).contains(str2) ? ((ImmutableMap) yyhVarD.e).get(str2) : null;
                    } else {
                        obj = ((ImmutableMap) rypVarA.d().e).get(str2);
                    }
                    if (obj != null) {
                        try {
                            objA = a(obj);
                        } catch (IOException | ClassCastException e) {
                            Log.e("FilePhenotypeFlags", "Invalid Phenotype flag value for flag ".concat(this.b), e);
                        }
                    }
                    if (true != tstVarA.g()) {
                        objEu = objA;
                    }
                    if (objEu == null) {
                        objEu = d();
                    }
                    if (objEu != null) {
                        h(objEu);
                        i(iAC);
                    }
                    return objEu;
                }
            }
        }
        return f();
    }

    @Override // defpackage.rxy
    public final void i(int i) {
        this.d = i;
    }

    @Override // defpackage.rxy
    public final ulp j() {
        return this.e;
    }

    @Override // defpackage.rxy
    public final void k(ulp ulpVar) {
        this.e = ulpVar;
    }
}

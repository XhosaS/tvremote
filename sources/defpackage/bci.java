package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class bci extends bbw implements bca {
    private volatile int d;
    private asv e;

    public bci(String str, String str2, bco bcoVar) {
        super(str, str2, bcoVar);
        this.d = -1;
    }

    @Override // defpackage.bca
    public final int a() {
        return this.d;
    }

    @Override // defpackage.bbw
    protected final Object f(bav bavVar) {
        bcn bcnVarA;
        Object objAN;
        int iA = a();
        if (iA == -1 || iA < i().c()) {
            synchronized (this) {
                int iA2 = a();
                Object objB = null;
                if (iA2 == -1) {
                    bav.c();
                    bavVar.getClass();
                    bcnVarA = this.c.a(bavVar);
                    j(bcnVarA.i);
                } else {
                    bcnVarA = null;
                }
                int iC = i().c();
                if (iA2 < iC) {
                    bav.c();
                    bavVar.getClass();
                    Context context = bavVar.d;
                    byg bygVarA = bap.a(context);
                    if (bygVarA.f()) {
                        String strA = ((att) bygVarA.b()).a(bar.a(this.a), null, this.b);
                        objAN = strA == null ? null : aN(strA);
                    }
                    if (bcnVarA == null) {
                        bcnVarA = this.c.a(bavVar);
                    }
                    String str = bcnVarA.b;
                    if (Build.VERSION.SDK_INT >= 26 && !context.getPackageName().equals("com.android.vending")) {
                        tj.h(bavVar.b().submit(new ame(bavVar, str, 10)));
                    }
                    Object obj = ((bzw) bcnVarA.d().c).get(this.b);
                    if (obj != null) {
                        try {
                            objB = b(obj);
                        } catch (IOException | ClassCastException e) {
                            Log.e("FilePhenotypeFlags", "Invalid Phenotype flag value for flag ".concat(this.b), e);
                        }
                    }
                    if (true != bygVarA.f()) {
                        objAN = objB;
                    }
                    if (objAN == null) {
                        objAN = e();
                    }
                    if (objAN != null) {
                        g(objAN);
                        h(iC);
                    }
                    return objAN;
                }
            }
        }
        return d();
    }

    @Override // defpackage.bca
    public final void h(int i) {
        this.d = i;
    }

    @Override // defpackage.bca
    public final asv i() {
        return this.e;
    }

    @Override // defpackage.bca
    public final void j(asv asvVar) {
        this.e = asvVar;
    }
}

package defpackage;

import android.content.Context;
import android.util.Log;
import j$.util.Objects;
import java.io.IOException;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class rhz implements rjx {
    private final String a;
    private final String b;
    private final rkq c;

    public rhz(String str, String str2, rkq rkqVar) {
        this.a = str;
        this.b = str2;
        this.c = rkqVar;
    }

    protected abstract Object b(Object obj);

    protected abstract Object c(String str);

    @Override // defpackage.rjx, defpackage.yrp
    public final Object eV() {
        Context context = rfr.a;
        rft.c = true;
        if (rft.d == null) {
            rft.d = new rfs();
        }
        Context context2 = rfr.a;
        if (context2 != null) {
            Object objH = h(rfr.a(context2));
            objH.getClass();
            return objH;
        }
        synchronized (rft.a) {
        }
        throw new IllegalStateException("Must call PhenotypeContext.setContext() first");
    }

    @Override // defpackage.rjx
    public final Object eW(Context context) {
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        Object objH = h(rfr.a(applicationContext));
        objH.getClass();
        return objH;
    }

    @Override // defpackage.rjx
    public final Object eX(Context context, rlh rlhVar) {
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        rfr rfrVarA = rfr.a(applicationContext);
        String str = rlhVar.b;
        if (!Objects.equals(str, "")) {
            return i(rfrVarA, str);
        }
        Object objH = h(rfrVarA);
        objH.getClass();
        return objH;
    }

    protected Object f() {
        return null;
    }

    protected final Object g(riy riyVar, final rfr rfrVar, String str) {
        rkp rkpVarA;
        Object objJ;
        Object obj;
        int iA = riyVar.a();
        if (iA == -1 || iA < riyVar.eT().a.get()) {
            synchronized (this) {
                int iA2 = riyVar.a();
                Object objB = null;
                if (iA2 == -1) {
                    rfr.g();
                    rfrVar.getClass();
                    rkpVarA = this.c.a(rfrVar, str);
                    riyVar.d(rkpVarA.h);
                } else {
                    rkpVarA = null;
                }
                int i = riyVar.eT().a.get();
                if (iA2 < i) {
                    rfr.g();
                    rfrVar.getClass();
                    Context context = rfrVar.d;
                    yqt yqtVarA = rfd.a(context);
                    if (yqtVarA.g()) {
                        String strA = ((rew) yqtVarA.c()).a(rff.a(this.a), null, null, this.b);
                        objJ = strA == null ? null : j(strA);
                    }
                    if (rkpVarA == null) {
                        rkpVarA = this.c.a(rfrVar, str);
                    }
                    final String str2 = rkpVarA.c;
                    if (!context.getPackageName().equals("com.android.vending")) {
                        rlr.a(rfrVar.e().submit(new Runnable() { // from class: rkz
                            @Override // java.lang.Runnable
                            public final void run() throws abxv {
                                Map mapA = rld.a(rfrVar.d);
                                String str3 = str2;
                                if (mapA.containsKey(str3)) {
                                    return;
                                }
                                Log.e("FilePhenotypeFlags", a.e(str3, "Config package ", " cannot use FILE backing without declarative registration. See go/phenotype-android-integration#phenotype for more information. This will lead to stale flags."));
                            }
                        }));
                    }
                    String str3 = this.b;
                    if (k()) {
                        rmv rmvVarA = rkpVarA.a();
                        obj = rmvVarA.d.contains(str3) ? rmvVarA.e.get(str3) : null;
                    } else {
                        obj = rkpVarA.a().e.get(str3);
                    }
                    if (obj != null) {
                        try {
                            objB = b(obj);
                        } catch (IOException | ClassCastException e) {
                            Log.e("FilePhenotypeFlags", "Invalid Phenotype flag value for flag ".concat(this.b), e);
                        }
                    }
                    if (true != yqtVarA.g()) {
                        objJ = objB;
                    }
                    if (objJ == null) {
                        objJ = f();
                    }
                    if (objJ != null) {
                        riyVar.eS(objJ);
                        riyVar.eU(i);
                    }
                    return objJ;
                }
            }
        }
        return riyVar.e();
    }

    protected abstract Object h(rfr rfrVar);

    protected abstract Object i(rfr rfrVar, String str);

    protected final Object j(String str) {
        try {
            return c(str);
        } catch (IOException | IllegalArgumentException e) {
            Log.e("FilePhenotypeFlags", "Invalid Phenotype flag value for flag ".concat(this.b), e);
            return null;
        }
    }

    protected boolean k() {
        return false;
    }
}

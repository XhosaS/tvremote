package defpackage;

import android.content.Context;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bcu {
    private static final Object f = new Object();
    private static volatile Map g;
    public final String a;
    public final cjv b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public bcu(Context context, bcv bcvVar) {
        this.a = bcvVar.c ? bar.b(context, bcvVar.b) : bcvVar.b;
        cjv cjvVarB = cjv.b(bcvVar.d);
        this.b = cjvVarB == null ? cjv.UNKNOWN : cjvVarB;
        this.c = bcvVar.g;
        this.d = bcvVar.e;
        this.e = bcvVar.f;
    }

    public static Map a(Context context) {
        Map mapB;
        Map map = g;
        if (map != null) {
            return map;
        }
        synchronized (f) {
            mapB = g;
            if (mapB == null) {
                bzu bzuVar = new bzu();
                try {
                    String[] list = context.getAssets().list("phenotype");
                    if (list != null) {
                        for (String str : list) {
                            if (str.endsWith("_package_metadata.binarypb")) {
                                try {
                                    InputStream inputStreamOpen = context.getAssets().open(b.g(str, "phenotype/"));
                                    try {
                                        cli cliVar = cli.a;
                                        cni cniVar = cni.a;
                                        cli cliVar2 = cli.a;
                                        bcv bcvVar = bcv.a;
                                        cky ckyVarK = cky.K(inputStreamOpen);
                                        clt cltVarP = bcvVar.p();
                                        try {
                                            try {
                                                try {
                                                    cno cnoVarB = cni.a.b(cltVarP);
                                                    cnoVarB.l(cltVarP, ckz.p(ckyVarK), cliVar2);
                                                    cnoVarB.g(cltVarP);
                                                    clt.B(cltVarP);
                                                    bcu bcuVar = new bcu(context, (bcv) cltVarP);
                                                    bzuVar.c(bcuVar.a, bcuVar);
                                                    if (inputStreamOpen != null) {
                                                        inputStreamOpen.close();
                                                    }
                                                } catch (cnw e) {
                                                    throw e.a();
                                                } catch (IOException e2) {
                                                    if (e2.getCause() instanceof cmh) {
                                                        throw ((cmh) e2.getCause());
                                                    }
                                                    throw new cmh(e2);
                                                }
                                            } catch (cmh e3) {
                                                if (e3.a) {
                                                    throw new cmh(e3);
                                                }
                                                throw e3;
                                            }
                                        } catch (RuntimeException e4) {
                                            if (e4.getCause() instanceof cmh) {
                                                throw ((cmh) e4.getCause());
                                            }
                                            throw e4;
                                        }
                                    } catch (Throwable th) {
                                        if (inputStreamOpen != null) {
                                            try {
                                                inputStreamOpen.close();
                                            } catch (Throwable th2) {
                                                th.addSuppressed(th2);
                                            }
                                        }
                                        throw th;
                                    }
                                } catch (cmh e5) {
                                    Log.e("PackageInfo", b.g(str, "Unable to read Phenotype PackageMetadata for "), e5);
                                }
                            }
                        }
                    }
                } catch (IOException e6) {
                    Log.e("PackageInfo", "Unable to read Phenotype PackageMetadata from assets.", e6);
                }
                mapB = bzuVar.b();
                g = mapB;
            }
        }
        return mapB;
    }
}

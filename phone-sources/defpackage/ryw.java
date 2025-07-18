package defpackage;

import android.content.Context;
import android.util.Log;
import com.google.common.collect.ImmutableMap;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ryw {
    private static final Object f = new Object();
    private static volatile Map g;
    public final String a;
    public final uis b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public ryw(Context context, ryx ryxVar) {
        this.a = ryxVar.c ? rwt.b(context, ryxVar.b) : ryxVar.b;
        uis uisVarB = uis.b(ryxVar.d);
        this.b = uisVarB == null ? uis.UNKNOWN : uisVarB;
        this.c = ryxVar.g;
        this.d = ryxVar.e;
        this.e = ryxVar.f;
    }

    public static Map a(Context context) {
        Map mapBuildOrThrow;
        Map map = g;
        if (map != null) {
            return map;
        }
        synchronized (f) {
            mapBuildOrThrow = g;
            if (mapBuildOrThrow == null) {
                ImmutableMap.Builder builder = ImmutableMap.builder();
                try {
                    String[] list = context.getAssets().list("phenotype");
                    if (list != null) {
                        for (String str : list) {
                            if (str.endsWith("_package_metadata.binarypb")) {
                                try {
                                    InputStream inputStreamOpen = context.getAssets().open(a.cr(str, "phenotype/"));
                                    try {
                                        vtp vtpVar = vtp.a;
                                        vvs vvsVar = vvs.a;
                                        vtp vtpVar2 = vtp.a;
                                        ryx ryxVar = ryx.a;
                                        vte vteVarL = vte.L(inputStreamOpen);
                                        vuc vucVarO = ryxVar.o();
                                        try {
                                            try {
                                                try {
                                                    vvy vvyVarB = vvs.a.b(vucVarO);
                                                    vvyVarB.l(vucVarO, vtf.p(vteVarL), vtpVar2);
                                                    vvyVarB.g(vucVarO);
                                                    vuc.B(vucVarO);
                                                    ryw rywVar = new ryw(context, (ryx) vucVarO);
                                                    builder.put(rywVar.a, rywVar);
                                                    if (inputStreamOpen != null) {
                                                        inputStreamOpen.close();
                                                    }
                                                } catch (vwf e) {
                                                    throw e.a();
                                                } catch (RuntimeException e2) {
                                                    if (e2.getCause() instanceof vuq) {
                                                        throw ((vuq) e2.getCause());
                                                    }
                                                    throw e2;
                                                }
                                            } catch (vuq e3) {
                                                if (e3.a) {
                                                    throw new vuq(e3);
                                                }
                                                throw e3;
                                            }
                                        } catch (IOException e4) {
                                            if (e4.getCause() instanceof vuq) {
                                                throw ((vuq) e4.getCause());
                                            }
                                            throw new vuq(e4);
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
                                } catch (vuq e5) {
                                    Log.e("PackageInfo", a.cr(str, "Unable to read Phenotype PackageMetadata for "), e5);
                                }
                            }
                        }
                    }
                } catch (IOException e6) {
                    Log.e("PackageInfo", "Unable to read Phenotype PackageMetadata from assets.", e6);
                }
                mapBuildOrThrow = builder.buildOrThrow();
                g = mapBuildOrThrow;
            }
        }
        return mapBuildOrThrow;
    }
}

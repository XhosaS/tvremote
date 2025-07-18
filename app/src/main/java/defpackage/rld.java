package defpackage;

import android.content.Context;
import android.util.Log;
import com.google.protobuf.ExtensionRegistryLite;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class rld {
    private static final Object f = new Object();
    private static volatile Map g;
    public final String a;
    public final aags b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public rld(Context context, rlf rlfVar) {
        this.a = rlfVar.c ? rff.c(context, rlfVar.b) : rlfVar.b;
        aags aagsVarB = aags.b(rlfVar.d);
        this.b = aagsVarB == null ? aags.UNKNOWN : aagsVarB;
        this.c = rlfVar.g;
        this.d = rlfVar.e;
        this.e = rlfVar.f;
    }

    public static Map a(Context context) throws abxv {
        Map mapA;
        Map map = g;
        if (map != null) {
            return map;
        }
        synchronized (f) {
            mapA = g;
            if (mapA == null) {
                yyn yynVar = new yyn(4);
                try {
                    String[] list = context.getAssets().list("phenotype");
                    if (list != null) {
                        for (String str : list) {
                            if (str.endsWith("_package_metadata.binarypb")) {
                                try {
                                    InputStream inputStreamOpen = context.getAssets().open(a.j(str, "phenotype/"));
                                    try {
                                        ExtensionRegistryLite extensionRegistryLite = ExtensionRegistryLite.a;
                                        abza abzaVar = abza.a;
                                        ExtensionRegistryLite extensionRegistryLite2 = ExtensionRegistryLite.a;
                                        rlf rlfVar = rlf.a;
                                        abvt abvtVarK = abvt.K(inputStreamOpen, 4096);
                                        rlf rlfVar2 = new rlf();
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        abzj abzjVarA = abza.a.a(rlfVar2.getClass());
                                                        abzjVarA.i(rlfVar2, abvu.p(abvtVarK), extensionRegistryLite2);
                                                        abzjVarA.g(rlfVar2);
                                                        Byte b = (byte) 1;
                                                        b.getClass();
                                                        rld rldVar = new rld(context, rlfVar2);
                                                        yynVar.c(rldVar.a, rldVar);
                                                        if (inputStreamOpen != null) {
                                                            inputStreamOpen.close();
                                                        }
                                                    } catch (abxv e) {
                                                        if (e.a) {
                                                            throw new abxv(e);
                                                        }
                                                        throw e;
                                                    }
                                                } catch (IOException e2) {
                                                    if (e2.getCause() instanceof abxv) {
                                                        throw ((abxv) e2.getCause());
                                                    }
                                                    throw new abxv(e2);
                                                }
                                            } catch (RuntimeException e3) {
                                                if (e3.getCause() instanceof abxv) {
                                                    throw ((abxv) e3.getCause());
                                                }
                                                throw e3;
                                            }
                                        } catch (abzz e4) {
                                            throw e4.a();
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
                                } catch (abxv e5) {
                                    Log.e("PackageInfo", a.j(str, "Unable to read Phenotype PackageMetadata for "), e5);
                                }
                            }
                        }
                    }
                } catch (IOException e6) {
                    Log.e("PackageInfo", "Unable to read Phenotype PackageMetadata from assets.", e6);
                }
                mapA = yynVar.a(true);
                g = mapA;
            }
        }
        return mapA;
    }
}

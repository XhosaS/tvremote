package defpackage;

import com.google.protobuf.ExtensionRegistryLite;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class far {
    public static final faq a = new faq();
    private static final zdy k = zdy.h("com/google/android/apps/tvsearch/app/params/display/DisplayContextParamsBuilder");
    private static final Map l = agrj.d(new agpi(xdb.ENTITY_DEFAULT, adxj.DEFAULT), new agpi(xdb.ENTITY_MOVIE, adxj.MOVIE), new agpi(xdb.ENTITY_TV_SHOW, adxj.TV_SHOW), new agpi(xdb.ENTITY_VIDEO, adxj.VIDEO));
    public List b;
    public adyj c;
    public List d;
    public boolean e;
    public List f;
    public List g;
    public abnb h;
    public List i;
    public int j;
    private final agow m;
    private final String n;
    private xcp o;
    private final List p = new ArrayList();

    public far(agow agowVar, String str) {
        this.m = agowVar;
        this.n = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x020f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.util.List c() {
        /*
            Method dump skipped, instructions count: 1869
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.far.c():java.util.List");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x05d6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0276  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.xds a() {
        /*
            Method dump skipped, instructions count: 1728
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.far.a():xds");
    }

    public final void b(abvo abvoVar) {
        xcp xcpVar = null;
        if (abvoVar != null) {
            try {
                ExtensionRegistryLite generatedRegistry = ExtensionRegistryLite.getGeneratedRegistry();
                xcp xcpVar2 = xcp.a;
                abvt abvtVarK = abvoVar.k();
                xcp xcpVar3 = new xcp();
                try {
                    try {
                        abzj abzjVarA = abza.a.a(xcpVar3.getClass());
                        abzjVarA.i(xcpVar3, abvu.p(abvtVarK), generatedRegistry);
                        abzjVarA.g(xcpVar3);
                        try {
                            abvtVarK.z(0);
                            Byte b = (byte) 1;
                            b.getClass();
                            xcpVar = xcpVar3;
                        } catch (abxv e) {
                            throw e;
                        }
                    } catch (abxv e2) {
                        if (!e2.a) {
                            throw e2;
                        }
                        throw new abxv(e2);
                    } catch (abzz e3) {
                        throw e3.a();
                    }
                } catch (IOException e4) {
                    if (!(e4.getCause() instanceof abxv)) {
                        throw new abxv(e4);
                    }
                    throw ((abxv) e4.getCause());
                } catch (RuntimeException e5) {
                    if (!(e5.getCause() instanceof abxv)) {
                        throw e5;
                    }
                    throw ((abxv) e5.getCause());
                }
            } catch (abxv e6) {
                ((zdv) ((zdv) k.c()).p(e6).q("com/google/android/apps/tvsearch/app/params/display/DisplayContextParamsBuilder", "setAppContext", 453, "DisplayContextParamsBuilder.kt")).u("Failed to parse AtvLauncherAppParam.");
            }
        }
        this.o = xcpVar;
    }
}

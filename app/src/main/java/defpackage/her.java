package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import com.google.protobuf.ExtensionRegistryLite;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Iterator;
import java.util.Objects;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class her implements heq {
    public static final zdy a = zdy.h("com/google/android/apps/tvsearch/results/actionitem/factory/ActionItemFactoryImpl");
    public static final xkc b;
    public final Context c;
    public final PackageManager d;
    public final gnj e;
    private final gtu f;

    static {
        xkc xkcVar = xkc.a;
        xkb xkbVar = new xkb();
        UUID uuidRandomUUID = UUID.randomUUID();
        Objects.toString(uuidRandomUUID);
        String strValueOf = String.valueOf(uuidRandomUUID);
        if ((xkbVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            xkbVar.y();
        }
        String strConcat = "android_tv".concat(strValueOf);
        xkc xkcVar2 = (xkc) xkbVar.b;
        xkcVar2.b |= 1;
        xkcVar2.c = strConcat;
        abxd abxdVarV = xkbVar.v();
        abxdVarV.getClass();
        b = (xkc) abxdVarV;
    }

    public her(Context context, gtu gtuVar, PackageManager packageManager, gnj gnjVar) {
        context.getClass();
        gtuVar.getClass();
        gnjVar.getClass();
        this.c = context;
        this.f = gtuVar;
        this.d = packageManager;
        this.e = gnjVar;
    }

    @Override // defpackage.heq
    public final hej a(aear aearVar, String str) throws abxv, URISyntaxException {
        xkc xkcVar;
        double d;
        aearVar.getClass();
        exx exxVar = exx.a;
        aebk aebkVar = aearVar.e;
        if (aebkVar == null) {
            aebkVar = aebk.a;
        }
        Intent intentB = exxVar.b(aebkVar, this.f.c());
        if (intentB != null) {
            if (agvy.c(intentB.getAction(), "OPEN_APP")) {
                intentB = this.d.getLeanbackLaunchIntentForPackage(aearVar.f);
            } else {
                intentB.setPackage(aearVar.f).getClass();
            }
            if (intentB != null) {
                intentB.setFlags(335544320);
            }
        }
        Intent intent = intentB;
        Iterator it = aearVar.j.iterator();
        while (true) {
            if (!it.hasNext()) {
                xkcVar = null;
                break;
            }
            xjr xjrVar = (xjr) it.next();
            if (agvy.c("tap_input", xjrVar.c)) {
                try {
                    xjp xjpVar = xjrVar.d;
                    if (xjpVar == null) {
                        xjpVar = xjp.a;
                    }
                    abvo abvoVar = xjpVar.d;
                    xkc xkcVar2 = xkc.a;
                    ExtensionRegistryLite extensionRegistryLite = ExtensionRegistryLite.a;
                    abza abzaVar = abza.a;
                    ExtensionRegistryLite extensionRegistryLite2 = ExtensionRegistryLite.a;
                    abvt abvtVarK = abvoVar.k();
                    xkc xkcVar3 = new xkc();
                    try {
                        try {
                            try {
                                try {
                                    abzj abzjVarA = abza.a.a(xkcVar3.getClass());
                                    abzjVarA.i(xkcVar3, abvu.p(abvtVarK), extensionRegistryLite2);
                                    abzjVarA.g(xkcVar3);
                                    try {
                                        abvtVarK.z(0);
                                        Byte b2 = (byte) 1;
                                        b2.getClass();
                                        b2.getClass();
                                        xkcVar = xkcVar3;
                                        break;
                                    } catch (abxv e) {
                                        throw e;
                                    }
                                } catch (RuntimeException e2) {
                                    if (e2.getCause() instanceof abxv) {
                                        throw ((abxv) e2.getCause());
                                    }
                                    throw e2;
                                }
                            } catch (IOException e3) {
                                if (e3.getCause() instanceof abxv) {
                                    throw ((abxv) e3.getCause());
                                }
                                throw new abxv(e3);
                            }
                        } catch (abxv e4) {
                            if (e4.a) {
                                throw new abxv(e4);
                            }
                            throw e4;
                        }
                    } catch (abzz e5) {
                        throw e5.a();
                    }
                } catch (abxv unused) {
                    ((zdv) a.d().q("com/google/android/apps/tvsearch/results/actionitem/factory/ActionItemFactoryImpl$Companion", "parseTapInput", 189, "ActionItemFactoryImpl.kt")).u("Failed to parse TapInput.");
                }
            }
        }
        aeaq aeaqVar = aearVar.n;
        if (aeaqVar == null) {
            aeaqVar = aeaq.a;
        }
        if ((aeaqVar.b & 1) != 0) {
            aeaq aeaqVar2 = aearVar.n;
            if (aeaqVar2 == null) {
                aeaqVar2 = aeaq.a;
            }
            d = aeaqVar2.c;
        } else {
            d = aearVar.l ? 2.0d : 1.0d;
        }
        double d2 = d;
        if (intent == null && xkcVar == null) {
            return null;
        }
        String str2 = aearVar.f;
        String str3 = aearVar.c;
        str3.getClass();
        String str4 = aearVar.d;
        str4.getClass();
        return new hej(aearVar, str2, str3, str4, str == null ? "" : str, aearVar.g, aearVar.h, intent, d2, xkcVar, false);
    }
}

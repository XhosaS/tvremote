package defpackage;

import android.accounts.Account;
import android.content.Context;
import java.io.IOException;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hho {
    public static final zdy a = zdy.h("com/google/android/apps/tvsearch/results/componentview/KatnissComponentViewUtil");

    public static mid a(Context context, addb addbVar, tkk tkkVar, boolean z, boolean z2, tkw tkwVar) {
        agow agowVar;
        String str;
        oce oceVar;
        oct octVar;
        yyr yyrVar;
        oci ociVarD = tkwVar.d();
        nyz nyzVar = (nyz) ociVarD;
        nyzVar.e = tkkVar;
        nzb nzbVar = (nzb) tkwVar.e();
        if (nzbVar.d != Byte.MAX_VALUE) {
            StringBuilder sb = new StringBuilder();
            if ((nzbVar.d & 1) == 0) {
                sb.append(" initRangeSize");
            }
            if ((nzbVar.d & 2) == 0) {
                sb.append(" collectionRangeRatio");
            }
            if ((nzbVar.d & 4) == 0) {
                sb.append(" binderRangeRatio");
            }
            if ((nzbVar.d & 8) == 0) {
                sb.append(" recyclerViewItemPrefetch");
            }
            if ((nzbVar.d & 16) == 0) {
                sb.append(" useLegacyVisible");
            }
            if ((nzbVar.d & 32) == 0) {
                sb.append(" cleanupOnDetach");
            }
            if ((nzbVar.d & 64) == 0) {
                sb.append(" enableStableIds");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        nyzVar.g = new nzc(nzbVar.a, nzbVar.b, nzbVar.c, nzbVar.e, nzbVar.f);
        ociVarD.a(z2);
        nyzVar.i = ociVarD.l.a(false);
        if (nyzVar.j != 31 || (agowVar = nyzVar.a) == null || (str = nyzVar.b) == null || (oceVar = nyzVar.c) == null || (octVar = nyzVar.d) == null || (yyrVar = nyzVar.i) == null) {
            StringBuilder sb2 = new StringBuilder();
            if (nyzVar.a == null) {
                sb2.append(" converterProvider");
            }
            if (nyzVar.b == null) {
                sb2.append(" logTag");
            }
            if (nyzVar.c == null) {
                sb2.append(" perfLoggerFactory");
            }
            if (nyzVar.d == null) {
                sb2.append(" elementsLifeCycleLogger");
            }
            if ((nyzVar.j & 1) == 0) {
                sb2.append(" useIncrementalMount");
            }
            if ((nyzVar.j & 2) == 0) {
                sb2.append(" enableLithoReconciliation");
            }
            if ((nyzVar.j & 4) == 0) {
                sb2.append(" useSizeSpec");
            }
            if ((nyzVar.j & 8) == 0) {
                sb2.append(" nestedScrollingEnabled");
            }
            if ((nyzVar.j & 16) == 0) {
                sb2.append(" clearComponentOnDetach");
            }
            if (nyzVar.i == null) {
                sb2.append(" userDataMap");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
        }
        nza nzaVar = new nza(agowVar, nyzVar.k, str, oceVar, octVar, nyzVar.e, nyzVar.f, nyzVar.g, nyzVar.h, yyrVar);
        tkwVar.h();
        mid midVar = new mid(context, nzaVar);
        tjp tjpVarH = tkwVar.h();
        if ((addbVar.b & 1) != 0) {
            yyk yykVar = tjp.a;
            int i = ((zcg) yykVar).d;
            for (int i2 = 0; i2 < i; i2++) {
                tjpVarH.c.c((String) yykVar.get(i2));
            }
            if ((addbVar.b & 2) != 0) {
                tjl tjlVar = tjpVarH.e;
                adax adaxVar = addbVar.d;
                if (adaxVar == null) {
                    adaxVar = adax.a;
                }
                tjlVar.a(adaxVar);
            }
            if ((addbVar.b & 4) != 0) {
                tjk tjkVar = tjpVarH.d;
                adct adctVar = addbVar.e;
                if (adctVar == null) {
                    adctVar = adct.a;
                }
                tjkVar.a(adctVar);
            }
            midVar.b = tjpVarH.g;
            abuy abuyVar = addbVar.c;
            if (abuyVar == null) {
                abuyVar = abuy.a;
            }
            midVar.b(abuyVar.c.B());
        } else {
            ((zdv) ((zdv) ((zdv) tjp.b.c()).o(tmm.a, tjpVarH.f.a(Level.SEVERE).a())).q("com/google/android/libraries/search/rendering/xuikit/elements/XUiKitViewBinderHelper", "bindView", 67, "XUiKitViewBinderHelper.java")).u("xUIKit ElementsOutput doesn't contain an Element tree");
        }
        if (z) {
            c(false, tkwVar);
        }
        return midVar;
    }

    public static pbt b(Account account) {
        if (account == null) {
            abxc abxcVar = pck.a;
            pcj pcjVar = pcj.a;
            pcg pcgVar = new pcg();
            if ((Integer.MIN_VALUE & pcgVar.b.memoizedSerializedSize) == 0) {
                pcgVar.y();
            }
            pcj pcjVar2 = (pcj) pcgVar.b;
            pcjVar2.d = 3;
            pcjVar2.b |= 2;
            return new pbt(abxcVar, (pcj) pcgVar.v());
        }
        String str = account.name;
        abxc abxcVar2 = pck.a;
        pcj pcjVar3 = pcj.a;
        pcg pcgVar2 = new pcg();
        if ((pcgVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            pcgVar2.y();
        }
        pcj pcjVar4 = (pcj) pcgVar2.b;
        pcjVar4.d = 1;
        pcjVar4.b |= 2;
        if ((Integer.MIN_VALUE & pcgVar2.b.memoizedSerializedSize) == 0) {
            pcgVar2.y();
        }
        pcj pcjVar5 = (pcj) pcgVar2.b;
        str.getClass();
        pcjVar5.b |= 1;
        pcjVar5.c = str;
        return new pbt(abxcVar2, (pcj) pcgVar2.v());
    }

    public static void c(boolean z, tkw tkwVar) {
        int iA;
        abee abeeVar = abee.a;
        abed abedVar = new abed();
        if ((abedVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            abedVar.y();
        }
        abee abeeVar2 = (abee) abedVar.b;
        abeeVar2.b |= 2;
        abeeVar2.d = z;
        abee abeeVar3 = (abee) abedVar.v();
        oat oatVarC = tkwVar.c();
        try {
            int i = abeeVar3.memoizedSerializedSize;
            if ((i & Integer.MIN_VALUE) != 0) {
                iA = abza.a.a(abeeVar3.getClass()).a(abeeVar3);
                if (iA < 0) {
                    throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                }
            } else {
                iA = i & Integer.MAX_VALUE;
                if (iA == Integer.MAX_VALUE) {
                    iA = abza.a.a(abeeVar3.getClass()).a(abeeVar3);
                    if (iA < 0) {
                        throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                    }
                    abeeVar3.memoizedSerializedSize = (abeeVar3.memoizedSerializedSize & Integer.MIN_VALUE) | iA;
                }
            }
            byte[] bArr = new byte[iA];
            boolean z2 = abvz.e;
            abvw abvwVar = new abvw(bArr, 0, iA);
            abza.a.a(abeeVar3.getClass()).m(abeeVar3, abwa.a(abvwVar));
            abvwVar.K();
            oatVarC.b("atv_args", bArr);
        } catch (IOException e) {
            throw new RuntimeException(a.u(abeeVar3, " to a byte array threw an IOException (should never happen)."), e);
        }
    }
}

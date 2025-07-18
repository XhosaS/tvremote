package defpackage;

import com.google.android.libraries.internal.growth.growthkit.internal.debug.TestingToolsBroadcastReceiver;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class oyj implements tsl {
    private final /* synthetic */ int a;

    public /* synthetic */ oyj(int i) {
        this.a = i;
    }

    @Override // defpackage.tsl
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                tvn tvnVar = TestingToolsBroadcastReceiver.a;
                return true;
            case 1:
                return ((ore) obj).b;
            case 2:
                tvn tvnVar2 = TestingToolsBroadcastReceiver.a;
                return true;
            case 3:
                tvn tvnVar3 = TestingToolsBroadcastReceiver.a;
                return true;
            case 4:
                tvn tvnVar4 = TestingToolsBroadcastReceiver.a;
                return true;
            case 5:
                tvn tvnVar5 = TestingToolsBroadcastReceiver.a;
                return true;
            case 6:
                tvn tvnVar6 = TestingToolsBroadcastReceiver.a;
                return true;
            case 7:
                tvn tvnVar7 = TestingToolsBroadcastReceiver.a;
                return true;
            case 8:
                ImmutableMap.Builder builder = ImmutableMap.builder();
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    Object obj2 = ((pkg) it.next()).a;
                }
                return builder.buildOrThrow();
            case 9:
                ((tvk) ((tvk) ((tvk) paw.a.g()).i((Throwable) obj)).j("com/google/android/libraries/internal/growth/growthkit/internal/promotions/impl/PromotionsManagerImpl", "instrumentProcessResult", 131, "PromotionsManagerImpl.java")).s("Failed to process event");
                return false;
            case 10:
                Map map = (Map) obj;
                tvn tvnVar8 = pbg.a;
                if (map == null) {
                    return new ArrayList();
                }
                ArrayList arrayList = new ArrayList(map.values());
                Collections.sort(arrayList, new fab(18));
                return arrayList;
            case 11:
                String str = ((omv) obj).a;
                tvn tvnVar9 = pbg.a;
                return tst.h(str);
            case 12:
                tvn tvnVar10 = pbg.a;
                return null;
            case 13:
                return new HashMap((Map) obj);
            case 14:
                return null;
            case 15:
                throw new UnsupportedOperationException("Do not call attach()");
            case 16:
                throw new UnsupportedOperationException("Do not call attach()");
            case 17:
                return null;
            case 18:
                return null;
            case 19:
                pju pjuVar = (pju) obj;
                pnn pnnVar = new pnn(pjuVar);
                pjuVar.c = pnnVar;
                int iAL = a.aL(pnnVar.a.a().e);
                pnnVar.b = iAL != 0 ? iAL : 1;
                return pjuVar;
            default:
                return new prg();
        }
    }
}

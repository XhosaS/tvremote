package defpackage;

import com.google.common.collect.Sets;
import java.util.EnumSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mwu {
    private final yzq a;

    public mwu(Iterable iterable) {
        acwh acwhVar;
        EnumSet enumSetNoneOf = EnumSet.noneOf(acwh.class);
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() != 0) {
                switch (num.intValue()) {
                    case 0:
                        acwhVar = acwh.SUBSCRIPTION_UNKNOWN;
                        break;
                    case 1:
                        acwhVar = acwh.SUBSCRIPTION_LAYOUT_ROOT_MAX_WIDTH_DIMENSIONS;
                        break;
                    case 2:
                        acwhVar = acwh.SUBSCRIPTION_LAYOUT_ROOT_MAX_HEIGHT_DIMENSIONS;
                        break;
                    case 3:
                        acwhVar = acwh.SUBSCRIPTION_DEVICE_ORIENTATION;
                        break;
                    case 4:
                        acwhVar = acwh.SUBSCRIPTION_WINDOW_SIZE;
                        break;
                    case 5:
                        acwhVar = acwh.SUBSCRIPTION_PLATFORM_NAME;
                        break;
                    case 6:
                        acwhVar = acwh.SUBSCRIPTION_FORM_FACTOR;
                        break;
                    case 7:
                        acwhVar = acwh.SUBSCRIPTION_IS_SCREEN_READER_ACTIVE;
                        break;
                    case 8:
                        acwhVar = acwh.SUBSCRIPTION_WINDOW_SAFE_AREA_INSETS;
                        break;
                    case 9:
                        acwhVar = acwh.SUBSCRIPTION_IS_REDUCE_ANIMATIONS_SETTING_ENABLED;
                        break;
                    case 10:
                        acwhVar = acwh.SUBSCRIPTION_FOLDING_DISPLAY_INFO;
                        break;
                    default:
                        acwhVar = null;
                        break;
                }
                if (acwhVar != null) {
                    enumSetNoneOf.add(acwhVar);
                }
            }
        }
        this.a = Sets.b(enumSetNoneOf);
    }

    final boolean a(acwh acwhVar) {
        yzq yzqVar = this.a;
        return yzqVar.isEmpty() || yzqVar.contains(acwhVar);
    }

    final boolean b(Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            if (a((acwh) it.next())) {
                return true;
            }
        }
        return false;
    }
}

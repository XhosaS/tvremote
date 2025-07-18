package defpackage;

import android.os.Bundle;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vrn {
    public static final AtomicInteger a = new AtomicInteger(123051698);
    public final we b = new we();
    public final we c = new we();
    private final String d;

    public vrn(String str) {
        yqw.B(!yqv.c(str), "mapKey must be a non-empty, non-null static String unique to the class using CallbackIdMap.");
        this.d = str;
    }

    public final void a(Bundle bundle) {
        uea.c();
        if (bundle != null) {
            String str = this.d;
            String strConcat = "CallbackIdMap.classes".concat(str);
            yqw.M(bundle.containsKey(strConcat), "CallbackIdMap writes its keys unconditionally. It did not find its state on restore, which suggests state loss.");
            String[] stringArray = bundle.getStringArray(strConcat);
            int[] intArray = bundle.getIntArray("CallbackIdMap.class_ids".concat(str));
            for (int i = 0; i < stringArray.length; i++) {
                try {
                    Integer num = (Integer) this.c.put(Class.forName(stringArray[i]), Integer.valueOf(intArray[i]));
                    if (num != null) {
                        int iIntValue = num.intValue();
                        int i2 = intArray[i];
                        yqw.aj(iIntValue == i2, "Callback ID for class %s was restored with ID %s, but had an existing mapping of %s. Always register for FuturesMixin callbacks and subscribe to SubscriptionMixin callbacks in onCreate()! Do *not* subscribe in a Peer's constructor", stringArray[i], Integer.valueOf(i2), num);
                    }
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public final void b(Bundle bundle) {
        uea.c();
        String str = this.d;
        String strConcat = "CallbackIdMap.classes".concat(str);
        yqw.R(!bundle.containsKey(strConcat), "Bundle already contains key %s. This suggests that two instances of CallbackIdMap were created with the same key in the same Fragment or Activity. This creates state store/restore collisions. Check for bugs where the same mixin is created for a Fragment twice during one lifecycle.", strConcat);
        we weVar = this.c;
        int i = weVar.d;
        String[] strArr = new String[i];
        int[] iArr = new int[i];
        int i2 = 0;
        for (Map.Entry entry : weVar.entrySet()) {
            strArr[i2] = ((Class) entry.getKey()).getName();
            iArr[i2] = ((Integer) entry.getValue()).intValue();
            i2++;
        }
        bundle.putStringArray(strConcat, strArr);
        bundle.putIntArray("CallbackIdMap.class_ids".concat(str), iArr);
    }
}

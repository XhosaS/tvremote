package defpackage;

import j$.util.Objects;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
class mem extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ Object initialValue() {
        boolean z;
        Thread threadCurrentThread = Thread.currentThread();
        WeakHashMap weakHashMap = meq.a;
        synchronized (weakHashMap) {
            Boolean bool = (Boolean) weakHashMap.remove(threadCurrentThread);
            z = true;
            if (bool != null) {
                boolean zBooleanValue = bool.booleanValue();
                if (!zBooleanValue) {
                }
                return Boolean.valueOf(z);
            }
        }
        int i = men.a;
        if (!"Filter".equals(threadCurrentThread.getName())) {
            String name = threadCurrentThread.getName();
            if (!Objects.equals(name, "Instr: com.google.android.apps.common.testing.testrunner.Google3InstrumentationTestRunner") && (name == null || !name.startsWith("SimpleServer ConnectionThread "))) {
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }
}

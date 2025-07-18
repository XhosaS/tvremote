package defpackage;

import dalvik.system.VMStack;

/* compiled from: PG */
/* loaded from: classes2.dex */
class txb extends twt {
    @Override // defpackage.twt
    public tuq a(Class<?> cls, int i) {
        return tuq.a;
    }

    @Override // defpackage.twt
    public String b(Class<? extends ttz<?>> cls) {
        StackTraceElement stackTraceElementA;
        if (txd.a) {
            try {
                if (cls.equals(txd.p())) {
                    return VMStack.getStackClass2().getName();
                }
            } catch (Throwable unused) {
            }
        }
        if (!txd.b || (stackTraceElementA = tym.a(cls, 1)) == null) {
            return null;
        }
        return stackTraceElementA.getClassName();
    }
}

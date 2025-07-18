package defpackage;

import dalvik.system.VMStack;

/* compiled from: PG */
/* loaded from: classes2.dex */
class zgz extends zgq {
    @Override // defpackage.zgq
    public zei a(Class cls, int i) {
        return zei.a;
    }

    @Override // defpackage.zgq
    public String b(Class cls) {
        StackTraceElement stackTraceElementA;
        if (zhb.a) {
            try {
                if (cls.equals(zhb.p())) {
                    return VMStack.getStackClass2().getName();
                }
            } catch (Throwable unused) {
            }
        }
        if (!zhb.b || (stackTraceElementA = zit.a(cls, 1)) == null) {
            return null;
        }
        return stackTraceElementA.getClassName();
    }
}

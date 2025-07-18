package defpackage;

import dalvik.system.VMStack;

/* compiled from: PG */
/* loaded from: classes.dex */
class cei extends cea {
    @Override // defpackage.cea
    public ccc a(Class cls, int i) {
        return ccc.a;
    }

    @Override // defpackage.cea
    public String b(Class cls) {
        if (cek.a) {
            try {
                if (cls.equals(cek.p())) {
                    return VMStack.getStackClass2().getName();
                }
            } catch (Throwable unused) {
            }
        }
        if (!cek.b) {
            return null;
        }
        cfn cfnVar = cfk.a;
        cls.getClass();
        StackTraceElement stackTraceElementA = cfk.a.a(cls);
        if (stackTraceElementA != null) {
            return stackTraceElementA.getClassName();
        }
        return null;
    }
}

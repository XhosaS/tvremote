package defpackage;

import java.security.PrivilegedAction;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aage implements PrivilegedAction {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public aage(aagf aagfVar, String str, int i) {
        this.c = i;
        this.a = str;
        this.b = aagfVar;
    }

    @Override // java.security.PrivilegedAction
    public final /* synthetic */ Object run() {
        if (this.c != 0) {
            return ((Class) this.a).getResourceAsStream((String) this.b);
        }
        ClassLoader classLoader = ((aagf) this.b).a;
        return classLoader != null ? classLoader.getResourceAsStream((String) this.a) : ClassLoader.getSystemResourceAsStream((String) this.a);
    }

    public aage(Class cls, int i) {
        this.c = i;
        this.a = cls;
        this.b = "/android/icumessageformat/ICUConfig.properties";
    }
}

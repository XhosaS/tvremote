package defpackage;

import androidx.window.extensions.layout.WindowLayoutComponent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class byk {
    public static final agpc a;

    static {
        agwj agwjVar = agwi.a;
        new agvq(byl.class).c();
        a = new agpn(new agum() { // from class: byj
            @Override // defpackage.agum
            public final Object a() {
                WindowLayoutComponent windowLayoutComponentA;
                agpc agpcVar = byk.a;
                try {
                    ClassLoader classLoader = byl.class.getClassLoader();
                    byh byhVar = classLoader != null ? new byh(classLoader, new bxk(classLoader)) : null;
                    if (byhVar != null && (windowLayoutComponentA = byhVar.a()) != null) {
                        bxk bxkVar = new bxk(classLoader);
                        int iA = bxl.a.a();
                        return iA >= 9 ? new byz(windowLayoutComponentA, bxkVar) : iA >= 6 ? new byy(windowLayoutComponentA, bxkVar) : iA >= 2 ? new byx(windowLayoutComponentA, bxkVar) : iA == 1 ? new byw(windowLayoutComponentA, bxkVar) : new byu();
                    }
                } catch (Throwable unused) {
                }
                return null;
            }
        });
    }
}

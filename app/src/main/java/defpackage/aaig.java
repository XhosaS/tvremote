package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class aaig {
    public static aamy a(aaih aaihVar, Class cls) {
        return aaihVar.a(new aajj(aaji.class, cls));
    }

    public static Object b(aaih aaihVar, Class cls) {
        return aaihVar.d(new aajj(aaji.class, cls));
    }

    public static Set c(aaih aaihVar, Class cls) {
        aajj aajjVar = new aajj(aaji.class, cls);
        aajl aajlVar = (aajl) aaihVar;
        if (aajlVar.a.contains(aajjVar)) {
            return aajlVar.b.f(aajjVar);
        }
        throw new aaiy(String.format("Attempting to request an undeclared dependency Set<%s>.", aajjVar));
    }
}

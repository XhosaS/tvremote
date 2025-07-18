package defpackage;

import java.util.Collections;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ful implements gyi {
    private final fup a;
    private final gyx b;
    private final Set c;
    private final Set d;

    public ful(fup fupVar) {
        fupVar.getClass();
        this.a = fupVar;
        this.b = gyx.H;
        this.c = hag.a;
        Set setSingleton = Collections.singleton(gyx.Q);
        setSingleton.getClass();
        this.d = setSingleton;
    }

    @Override // defpackage.gzc
    public final int a() {
        return 1073741823;
    }

    @Override // defpackage.gzc
    public final gyx b() {
        return this.b;
    }

    @Override // defpackage.gyi
    public final Object c(agsw agswVar) {
        ahnm ahnmVar = new ahnm(false);
        fup fupVar = this.a;
        fxk fxkVar = new fxk(fqa.a, new fum(ahnmVar, fupVar));
        fxu fxuVar = fupVar.a;
        fxuVar.d(fxkVar);
        fxuVar.d(new fxk(fuk.a, new fun(ahnmVar, fupVar)));
        Object objA = fup.a(ahnmVar, fupVar, agswVar);
        agtg agtgVar = agtg.a;
        if (objA != agtgVar) {
            objA = agpu.a;
        }
        return objA == agtgVar ? objA : agpu.a;
    }

    @Override // defpackage.gyi
    public final Set d() {
        return this.d;
    }

    @Override // defpackage.gyi
    public final Set e() {
        return this.c;
    }

    @Override // defpackage.gyi
    public final int f() {
        return 1;
    }
}

package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class peb implements pdw {
    public Map a;
    public boolean b;
    private final pdw c;
    private uhp d;

    public peb(pdw pdwVar) {
        this.c = pdwVar;
    }

    private final synchronized uhp g() {
        Map map = this.a;
        if (map != null) {
            return sfy.C(map);
        }
        uhp uhpVar = this.d;
        if (uhpVar != null) {
            return uhpVar;
        }
        this.b = false;
        uhp uhpVarC = this.c.c();
        this.d = uhpVarC;
        sfy.K(uhpVarC, new qvj(this, 1), ugk.a);
        return uhpVarC;
    }

    private final synchronized void h() {
        this.a = null;
        this.b = true;
    }

    @Override // defpackage.pdw
    public final uhp a() {
        h();
        return this.c.a();
    }

    @Override // defpackage.pdw
    public final uhp b(Map map) {
        h();
        return this.c.b(map);
    }

    @Override // defpackage.pdw
    public final uhp c() {
        return ufn.i(g(), new oyj(13), ugk.a);
    }

    @Override // defpackage.pdw
    public final uhp d(String str, vvj vvjVar) {
        h();
        return this.c.d(str, vvjVar);
    }

    @Override // defpackage.pdw
    public final uhp e(String str) {
        h();
        return this.c.e(str);
    }
}

package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gqy implements gqw {
    private final gqw a;
    private final Object b = new Object();

    public gqy(gqw gqwVar) {
        this.a = gqwVar;
    }

    @Override // defpackage.gqw
    public final List a(String str) {
        List listA;
        str.getClass();
        synchronized (this.b) {
            listA = this.a.a(str);
        }
        return listA;
    }

    @Override // defpackage.gqw
    public final boolean b(gun gunVar) {
        boolean zB;
        synchronized (this.b) {
            zB = this.a.b(gunVar);
        }
        return zB;
    }

    @Override // defpackage.gqw
    public final cb c(gun gunVar) {
        cb cbVarC;
        synchronized (this.b) {
            cbVarC = this.a.c(gunVar);
        }
        return cbVarC;
    }

    @Override // defpackage.gqw
    public final cb d(gun gunVar) {
        cb cbVarD;
        synchronized (this.b) {
            cbVarD = this.a.d(gunVar);
        }
        return cbVarD;
    }

    @Override // defpackage.gqw
    public final /* synthetic */ cb e(guw guwVar) {
        return fki.ba(this, guwVar);
    }
}

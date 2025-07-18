package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zlv extends zix {
    private final zjo a;

    public zlv(zjo zjoVar) {
        this.a = zjoVar;
    }

    public final int a() {
        return this.a.b();
    }

    public final zlu b() {
        zjo zjoVar = this.a;
        if (zjoVar.b() == 0) {
            return null;
        }
        return zlu.a(zjoVar.f(0));
    }

    public final boolean c() {
        return this.a.b() > 1;
    }

    public final zlu[] d() {
        zjo zjoVar = this.a;
        int iB = zjoVar.b();
        zlu[] zluVarArr = new zlu[iB];
        for (int i = 0; i != iB; i++) {
            zluVarArr[i] = zlu.a(zjoVar.f(i));
        }
        return zluVarArr;
    }

    @Override // defpackage.zix, defpackage.zih
    public final zjh p() {
        return this.a;
    }

    public zlv(zjb zjbVar, zih zihVar) {
        this.a = new zkr(new zlu(zjbVar, zihVar));
    }

    public zlv(zlu[] zluVarArr) {
        this.a = new zkr(zluVarArr);
    }
}

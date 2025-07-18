package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hhm extends avs {
    public hhl g;

    @Override // defpackage.avs, defpackage.azd
    public final int a() {
        hhl hhlVar = this.g;
        if (hhlVar == null) {
            agvy.b("dataRow");
            hhlVar = null;
        }
        return hhlVar.f();
    }

    @Override // defpackage.avs, defpackage.azd
    public final Object b(int i) {
        hhl hhlVar = this.g;
        if (hhlVar == null) {
            agvy.b("dataRow");
            hhlVar = null;
        }
        return hhlVar.g(i);
    }
}

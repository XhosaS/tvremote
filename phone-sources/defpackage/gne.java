package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gne extends gnd {
    private final Object a;

    public gne(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.gnd
    public final gnd a(String str, yjv yjvVar) {
        Object obj = this.a;
        return ((Boolean) yjvVar.a(obj)).booleanValue() ? this : new gnc(obj, str);
    }

    @Override // defpackage.gnd
    public final Object b() {
        return this.a;
    }
}

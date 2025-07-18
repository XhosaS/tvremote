package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bxo extends bxn {
    private final Object a;
    private final String b;
    private final bxg c;
    private final int d;

    public bxo(Object obj, String str, int i, bxg bxgVar) {
        this.a = obj;
        this.b = str;
        this.d = i;
        this.c = bxgVar;
    }

    @Override // defpackage.bxn
    public final bxn a(String str, agux aguxVar) {
        Object obj = this.a;
        return ((Boolean) aguxVar.a(obj)).booleanValue() ? this : new bxm(obj, this.b, str, this.d);
    }

    @Override // defpackage.bxn
    public final Object b() {
        return this.a;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ylp implements ylr {
    private Object a;

    public ylp(Object obj) {
        this.a = obj;
    }

    protected void a(Object obj, Object obj2) {
        throw null;
    }

    protected boolean b(Object obj, Object obj2) {
        return true;
    }

    @Override // defpackage.ylr
    public final void c(ymp ympVar, Object obj) {
        ympVar.getClass();
        Object obj2 = this.a;
        if (b(obj2, obj)) {
            this.a = obj;
            a(obj2, obj);
        }
    }

    @Override // defpackage.ylr
    public final Object d(ymp ympVar) {
        ympVar.getClass();
        return this.a;
    }

    public final String toString() {
        return "ObservableProperty(value=" + this.a + ")";
    }
}

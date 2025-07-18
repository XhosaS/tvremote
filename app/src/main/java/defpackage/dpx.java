package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dpx extends we {
    private int e;

    @Override // defpackage.wx, java.util.Map
    public final void clear() {
        this.e = 0;
        super.clear();
    }

    @Override // defpackage.wx
    public final Object f(int i) {
        this.e = 0;
        return super.f(i);
    }

    @Override // defpackage.wx
    public final Object g(int i, Object obj) {
        this.e = 0;
        return super.g(i, obj);
    }

    @Override // defpackage.wx, java.util.Map
    public final int hashCode() {
        int i = this.e;
        if (i != 0) {
            return i;
        }
        int iHashCode = super.hashCode();
        this.e = iHashCode;
        return iHashCode;
    }

    @Override // defpackage.wx
    public final void j(wx wxVar) {
        this.e = 0;
        super.j(wxVar);
    }

    @Override // defpackage.wx, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.e = 0;
        return super.put(obj, obj2);
    }
}

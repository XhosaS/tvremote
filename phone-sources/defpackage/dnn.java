package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class dnn extends djd {
    public djh a;
    public int e;

    public dnn() {
        super(0, true, 1);
        this.a = djh.b;
        this.e = 0;
    }

    @Override // defpackage.diz
    public final djh b() {
        return this.a;
    }

    @Override // defpackage.diz
    public final void c(djh djhVar) {
        this.a = djhVar;
    }

    public final String toString() {
        return "EmittableLazyList(modifier=" + this.a + ", horizontalAlignment=" + ((Object) drm.a(this.e)) + ", activityOptions=null, children=[\n" + d() + "\n])";
    }
}

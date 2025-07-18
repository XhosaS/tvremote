package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class oag {
    public final nvg[] b;
    public final boolean c;
    public final int d;

    protected oag(nvg[] nvgVarArr, boolean z, int i) {
        this.b = nvgVarArr;
        boolean z2 = false;
        if (nvgVarArr != null && z) {
            z2 = true;
        }
        this.c = z2;
        this.d = i;
    }

    protected abstract void a(nwf nwfVar, kwy kwyVar);
}

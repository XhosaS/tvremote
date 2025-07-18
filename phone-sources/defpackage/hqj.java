package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hqj implements hqf {
    public static final hqj a = new hqj(2, null);
    private final /* synthetic */ int b;

    public hqj(int i) {
        this.b = i;
    }

    @Override // defpackage.hqf
    public final boolean a(Object obj) {
        int i = this.b;
        if (i == 0) {
            return false;
        }
        if (i != 1) {
            return true;
        }
        return obj.toString().startsWith("data:image");
    }

    @Override // defpackage.hqf
    public final cvi e(Object obj, int i, int i2, hll hllVar) {
        int i3 = this.b;
        if (i3 != 0) {
            return i3 != 1 ? new cvi(new hwa(obj), new hqn(obj, 0)) : new cvi(new hwa(obj), new hpm(obj.toString()));
        }
        return null;
    }

    @Deprecated
    public hqj(int i, char[] cArr) {
        this.b = i;
    }
}

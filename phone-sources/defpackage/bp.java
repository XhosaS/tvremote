package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bp implements ho {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public bp(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.ho
    public final /* synthetic */ Object a() {
        if (this.b == 0) {
            return this.a;
        }
        bv bvVar = (bv) this.a;
        Object obj = bvVar.mHost;
        return obj instanceof gu ? ((gu) obj).getActivityResultRegistry() : bvVar.requireActivity().getActivityResultRegistry();
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jcs extends fv {
    final /* synthetic */ jdd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jcs(jdd jddVar, boolean z) {
        super(z);
        this.a = jddVar;
    }

    @Override // defpackage.fv
    public final void b() {
        jdd jddVar = this.a;
        if (jddVar.X) {
            by activity = jddVar.getActivity();
            if (activity != null) {
                activity.finishAndRemoveTask();
            }
            jddVar.startActivity(jbr.V(jddVar.requireContext()));
            return;
        }
        by activity2 = jddVar.getActivity();
        if (activity2 != null) {
            activity2.finishAndRemoveTask();
        }
    }
}

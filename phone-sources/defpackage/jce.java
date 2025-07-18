package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jce extends fv {
    final /* synthetic */ jcm a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jce(jcm jcmVar, boolean z) {
        super(z);
        this.a = jcmVar;
    }

    @Override // defpackage.fv
    public final void b() {
        jcm jcmVar = this.a;
        if (jcmVar.q) {
            by activity = jcmVar.getActivity();
            if (activity != null) {
                activity.finishAndRemoveTask();
            }
            jcmVar.startActivity(jbr.V(jcmVar.requireContext()));
            return;
        }
        by activity2 = jcmVar.getActivity();
        if (activity2 != null) {
            activity2.finishAndRemoveTask();
        }
    }
}

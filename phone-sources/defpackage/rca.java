package defpackage;

import android.support.v7.util.DiffUtil;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rca extends DiffUtil.ItemCallback {
    @Override // android.support.v7.util.DiffUtil.ItemCallback
    public final /* bridge */ /* synthetic */ boolean areContentsTheSame(Object obj, Object obj2) {
        vqv vqvVar = (vqv) obj;
        vqv vqvVar2 = (vqv) obj2;
        vqvVar.getClass();
        vqvVar2.getClass();
        if (vqvVar instanceof vqw) {
            return yks.e((vqw) vqvVar, vqvVar2 instanceof vqw ? (vqw) vqvVar2 : null);
        }
        if (vqvVar instanceof vqx) {
            return yks.e((vqx) vqvVar, vqvVar2 instanceof vqx ? (vqx) vqvVar2 : null);
        }
        throw new yfu();
    }

    @Override // android.support.v7.util.DiffUtil.ItemCallback
    public final /* bridge */ /* synthetic */ boolean areItemsTheSame(Object obj, Object obj2) {
        Integer num;
        vqv vqvVar = (vqv) obj;
        vqv vqvVar2 = (vqv) obj2;
        vqvVar.getClass();
        vqvVar2.getClass();
        if (!(vqvVar instanceof vqw)) {
            if (!(vqvVar instanceof vqx)) {
                throw new yfu();
            }
            if (!(vqvVar2 instanceof vqx)) {
                return false;
            }
            throw null;
        }
        if (!(vqvVar2 instanceof vqw)) {
            return false;
        }
        vqs vqsVar = ((vqw) vqvVar).a;
        vqs vqsVar2 = ((vqw) vqvVar2).a;
        Integer num2 = vqsVar.a;
        if (num2 == null || (num = vqsVar2.a) == null) {
            throw new IllegalArgumentException("Cards must have stable_id to reliably compare them.");
        }
        return yks.e(num2, num);
    }
}

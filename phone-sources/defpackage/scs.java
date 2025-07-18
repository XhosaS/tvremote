package defpackage;

import android.support.v7.util.DiffUtil;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class scs extends DiffUtil.ItemCallback {
    @Override // android.support.v7.util.DiffUtil.ItemCallback
    public final /* bridge */ /* synthetic */ boolean areContentsTheSame(Object obj, Object obj2) {
        scf scfVar = (scf) obj;
        scf scfVar2 = (scf) obj2;
        scfVar.getClass();
        scfVar2.getClass();
        return yks.e(scfVar, scfVar2);
    }

    @Override // android.support.v7.util.DiffUtil.ItemCallback
    public final /* bridge */ /* synthetic */ boolean areItemsTheSame(Object obj, Object obj2) {
        scf scfVar = (scf) obj;
        scf scfVar2 = (scf) obj2;
        scfVar.getClass();
        scfVar2.getClass();
        return scfVar.E == scfVar2.E && scfVar.a() == scfVar2.a();
    }
}

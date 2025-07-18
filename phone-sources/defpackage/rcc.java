package defpackage;

import android.support.v7.util.DiffUtil;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rcc extends DiffUtil.ItemCallback {
    @Override // android.support.v7.util.DiffUtil.ItemCallback
    public final /* bridge */ /* synthetic */ boolean areContentsTheSame(Object obj, Object obj2) {
        vqu vquVar = (vqu) obj;
        vqu vquVar2 = (vqu) obj2;
        vquVar.getClass();
        vquVar2.getClass();
        return yks.e(vquVar, vquVar2);
    }

    @Override // android.support.v7.util.DiffUtil.ItemCallback
    public final /* bridge */ /* synthetic */ boolean areItemsTheSame(Object obj, Object obj2) {
        Integer num;
        vqu vquVar = (vqu) obj;
        vqu vquVar2 = (vqu) obj2;
        vquVar.getClass();
        vquVar2.getClass();
        Integer num2 = vquVar.b;
        if (num2 == null || (num = vquVar2.b) == null) {
            throw new IllegalArgumentException("Card Stacks must have stable_id to reliably compare them.");
        }
        return yks.e(num2, num);
    }
}

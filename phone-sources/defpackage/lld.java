package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lld implements ids, idy, idw {
    private final idr a = new idz(ieg.a);

    @Override // defpackage.idy
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void c(ieg iegVar) {
        this.a.c(iegVar);
    }

    @Override // defpackage.idw
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        kum kumVar = (kum) obj;
        ieg iegVar = (ieg) this.a.a();
        return iegVar.m() && TextUtils.equals(((kum) iegVar.g()).dX(), kumVar.dX());
    }

    @Override // defpackage.ids
    public final void ea(iej iejVar) {
        this.a.ea(iejVar);
    }

    @Override // defpackage.ids
    public final void ee(iej iejVar) {
        this.a.ee(iejVar);
    }
}

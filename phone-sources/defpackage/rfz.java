package defpackage;

import com.google.common.collect.ImmutableList;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rfz extends rdd {
    final /* synthetic */ rga a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rfz(rga rgaVar) {
        super(null, null, null);
        this.a = rgaVar;
    }

    @Override // defpackage.rdd
    public final void c(ImmutableList immutableList) {
        rgb rgbVar = this.a.a;
        rgbVar.c = immutableList;
        sjl.e(new qxp(rgbVar, 7));
    }
}

package defpackage;

import com.google.android.gms.measurement.api.internal.ScionActivityInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
public class krq extends ksg {
    final /* synthetic */ ScionActivityInfo a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    final /* synthetic */ ksp d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public krq(ksp kspVar, ScionActivityInfo scionActivityInfo, String str, String str2) {
        super(kspVar, true);
        this.a = scionActivityInfo;
        this.b = str;
        this.c = str2;
        this.d = kspVar;
    }

    @Override // defpackage.ksg
    public final void a() {
        kqz kqzVar = this.d.f;
        kkk.k(kqzVar);
        kqzVar.setCurrentScreenByScionActivityInfo(this.a, this.b, this.c, this.f);
    }
}

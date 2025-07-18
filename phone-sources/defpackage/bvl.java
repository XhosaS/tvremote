package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bvl extends byr {
    final /* synthetic */ bvp a;
    final /* synthetic */ yjz b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bvl(bvp bvpVar, yjz yjzVar, String str) {
        super(str);
        this.a = bvpVar;
        this.b = yjzVar;
    }

    @Override // defpackage.bvt
    public final bvu e(bvv bvvVar, List list, long j) {
        bvp bvpVar = this.a;
        bvj bvjVar = bvpVar.f;
        bvjVar.a = bvvVar.n();
        bvjVar.b = bvvVar.a();
        bvjVar.c = bvvVar.b();
        if (bvvVar.cA() || bvpVar.a.h == null) {
            bvpVar.d = 0;
            bvu bvuVar = (bvu) this.b.a(bvjVar, new clv(j));
            return new bvk(bvuVar, bvpVar, bvpVar.d, bvuVar, 0);
        }
        bvpVar.e = 0;
        bvu bvuVar2 = (bvu) this.b.a(bvpVar.g, new clv(j));
        return new bvk(bvuVar2, bvpVar, bvpVar.e, bvuVar2, 1);
    }
}

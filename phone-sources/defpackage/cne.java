package defpackage;

import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cne extends ykt implements yjz {
    final /* synthetic */ yjz a;
    final /* synthetic */ int b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cne(Object obj, yjz yjzVar, int i, int i2) {
        super(2);
        this.d = i2;
        this.c = obj;
        this.a = yjzVar;
        this.b = i;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [bkp, java.lang.Object] */
    @Override // defpackage.yjz
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.d == 0) {
            ((Number) obj2).intValue();
            cqv.z(this.c, this.a, (bao) obj, bdi.n(this.b | 1));
            return ygi.a;
        }
        ((Number) obj2).intValue();
        Object obj3 = this.c;
        cbc cbcVar = (cbc) obj3;
        AndroidCompositionLocals_androidKt.a(cbcVar, this.a, (bao) obj, bdi.n(this.b | 1));
        return ygi.a;
    }
}

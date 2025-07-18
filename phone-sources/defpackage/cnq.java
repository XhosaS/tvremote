package defpackage;

import androidx.compose.ui.platform.ComposeView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cnq extends ykt implements yjz {
    final /* synthetic */ int a;
    final /* synthetic */ can b;
    private final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnq(can canVar, int i, int i2) {
        super(2);
        this.c = i2;
        this.b = canVar;
        this.a = i;
    }

    @Override // defpackage.yjz
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        int i = this.c;
        if (i == 0) {
            ((Number) obj2).intValue();
            ((cnr) this.b).a((bao) obj, bdi.n(this.a | 1));
            return ygi.a;
        }
        if (i != 1) {
            ((Number) obj2).intValue();
            ((cny) this.b).a((bao) obj, bdi.n(this.a | 1));
            return ygi.a;
        }
        ((Number) obj2).intValue();
        ((ComposeView) this.b).a((bao) obj, bdi.n(this.a | 1));
        return ygi.a;
    }
}
